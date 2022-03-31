package actividad1;

import java.util.Arrays;

public class PilaTabla implements Pila{
    private Integer cima;
    private Integer[] tabla;
    private final int VACIA = -1;

    public PilaTabla() {
        cima = -1;
        Integer[] tabla = new Integer[10];
    }

    public PilaTabla(int longitud) {
        cima = -1;
        Integer[] tabla = new Integer[longitud];
    }

    @Override
    public boolean pilaVacia() {
        return cima == VACIA;
    }

    public boolean pilaLlena() {
        return cima == tabla.length;
    }


    /**
     * @return
     */
    public Integer[] aumentarTamaño() {

        if (pilaLlena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        return tabla;
    }

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


    public void apilarElementos(int numero) {
        if (pilaLlena()) {
            aumentarTamaño();
        }
        tabla[cima+1] = numero;
        cima++;
    }

    @Override
    public void desapilarElemento() {
        Integer resultado;
        if (pilaVacia()) {
            System.out.println("Pila vacía");;
        }
        tabla[cima]=0;

    }

    @Override
    public String toString() {
        return "PilaLista{" +
                "cima=" + cima +
                ", tabla=" + Arrays.toString(tabla) +
                '}';
    }

    @Override
    public Integer elementosDePila(){

        return cima+1;
    }
}
