package actividad1;

import java.util.ArrayList;

public class PilaLista implements Pila {
    private final int VACIA = -1;
    private int cima;
    private ArrayList<Integer> tabla = new ArrayList<>();;


    /**
     * Constructor que inicializa la lista.
     */
    public PilaLista() {
        ArrayList<Integer> tabla = new ArrayList<>();
        cima = -1;
    }

    public int getCima() {
        return cima;
    }

    /**
     * Método para saber si la pila está vacía
     *
     * @return un boolean que nos confirma si está vacía o no.
     */
    @Override
    public boolean pilaVacia() {
        return (cima == VACIA);
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
            resultado = cima;
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
        tabla.add(numero);
        cima++;
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
            tabla.set(cima, null);
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
        return "PilaLista{" +
                "indice=" + cima +
                ", pila=" + tabla +
                '}';
    }

    /**
     * Este método nos dice el número de elemntos que tenemos en la pila
     *
     * @return Como la cima aumenta o disminuye cada vez que se apila o se despila un elemento,
     * si le damos un valor más(Pues empieza en 0) nos da el número de elemntos.
     */
    public Integer elementosEnPila() {

        return cima + 1;
    }
}