package actividad1;

import java.util.Arrays;

public class PilaTabla implements Pila {
    private Integer cima;
    private Integer[] tabla = new Integer[1];
    private final int VACIA = -1;


    /**
     * Constructor que inicializa el array con 10 posiciones.
     */
    public PilaTabla() {
        cima = -1;
        Integer[] tabla = new Integer[10];
    }

    /**
     * Constructor de longitud variable
     *
     * @param longitud parametro con el que se inicializa el array dandonos el número de posiciones.
     */
    public PilaTabla(int longitud) {
        cima = -1;
        Integer[] tabla = new Integer[longitud];
    }

    /*
    Getter de cima
     */
    public Integer getCima() {
        return cima;
    }


    /**
     * Método para saber si la pila está vacía
     *
     * @return un boolean que nos confirma si está vacía o no.
     */
    @Override
    public boolean pilaVacia() {
        return cima == VACIA;
    }

    /**
     * Método para saber si la pila está a su capacidad máxima
     *
     * @return un boolean que nos confirma si está llena o no
     */
    public boolean pilaLlena() {
        return (this.tabla.length == cima + 1);
    }


    /**
     * Método para aumentar el tamaño de la lista cuando está llena
     */
    public void aumentarTamano() {

        if (pilaLlena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        } else {
            System.out.println("La pila ya está llena, no se puede aumentar su tamaño.");
        }
    }

    /**
     * Método que nos devuelve el valor que está en la cima
     *
     * @return Devuelve nulo si la pila está vaciá y si no devuelve el valor contenido en la posición cima
     */
    @Override
    public Integer devolverElemento() {
        Integer resultado;
        if (pilaVacia()) {
            resultado = null;
        } else {
            resultado = tabla[cima];
        }

        return resultado;
    }

    /**
     * Método que nos sirve para apilar elementos en la lista (si está llena aumenta su tamaño )
     * Al introducir un número el valor cima aumenta su valor
     *
     * @param numero Este parámetro es el número que introduciremos en la pila
     */
    public void apilarElementos(int numero) {
        if (pilaLlena()) {
            aumentarTamano();
        }
        cima++;
        tabla[cima] = numero;

    }


    /**
     * Este método desapila el elemnto que se encuentre en la cima, cuando la pila está vacía
     * También se actualiza la cima, pues su valor dismunuye
     */
    @Override
    public void desapilarElemento() {

        if (pilaVacia()) {
            System.out.println("Pila vacía, no se pueden desapilar elemntos");
            ;
        } else {
            tabla[cima] = null;
            cima--;
        }

    }

    /**
     * Este método nos imprime los datos de la tabla.
     *
     * @return un string con los datos de la tabla
     */
    @Override
    public String toString() {
        return "PilaTabla{" +
                "cima=" + cima +
                ", tabla=" + Arrays.toString(tabla) +
                '}';
    }

    /**
     * Este método nos dice el número de elemntos que tenemos en la pila
     *
     * @return Como la cima aumenta o disminuye cada vez que se apila o se despila un elemento,
     * si le damos un valor más(Pues empieza en 0) nos da el número de elemntos.
     */
    @Override
    public Integer elementosDePila() {

        return cima + 1;
    }
}
