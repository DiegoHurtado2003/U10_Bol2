package actividad1;

import java.util.Arrays;

public interface Pila {

    public default boolean pilaVacia() {
        return false;
    }

    public default Integer devolverElemento() {
        return null;
    }


    public default void apilarElementos() {

    }

    public default void desapilarElemento() {

    }

    public default Integer elementosDePila(){

        return null;
    }
}
