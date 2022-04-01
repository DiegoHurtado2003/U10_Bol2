package actividad1;

public class Main {

    public static void main(String[] args) {
        /*
         * Este programa consiste en crear una pila que es un objeto
         * que necesita tener dos atributos:
         * La ciam: Que es un indice que empieza en -1 y aumenta cada vez que
         * apilamos un elemento y disminuye cuando desapilamos.
         *
         * Hemos creado una interfaz pila, pues para que algo sea considerado
         * una pila necesita tener los métodos apilar elementos, despilar elementos,
         * devolver el elemto que esté en la cima y el número de elementos que hay en la cima,
         * además del método que nos dice si la pila está vacía.
         *
         * Posteriormente, a raíz de esta interfaz creamos dos clases pilas, una
         * con una lista y otra con arrays. Estas dos clases son bastante similares,
         * pero al ser las listas de longitud variable y los arreglos de longitud
         * fija, deberemos crear métos especiales en la pila con arrays, puesto que
         * deberemos saber si la pila está llena, además de otro método que nos permita
         * aumentar el tamañoi de este array cuando está lleno.
         */


        //Pila array de longitud 2.
        PilaTabla Pila1 = new PilaTabla(2);
        Pila1.apilarElementos(1);
        Pila1.apilarElementos(2);

        //Aquí se aumenta el tamaño automáticamente en 10 posiciones

        Pila1.apilarElementos(4);
        Pila1.apilarElementos(8);
        System.out.println("cima: " + Pila1.getCima());

        //Desapilamos un elemento
        Pila1.desapilarElemento();
        System.out.println("cima tras desapilar un elemento: " + Pila1.getCima());
        //Elemento de la cima
        System.out.println("Elemento en la posición de la cima: " + Pila1.devolverElemento());
        //toString
        System.out.println(Pila1.toString());
        //Cantidad de elementos de la pila
        System.out.println("Cantidad de elementos de la pila: " + Pila1.elementosDePila());



        //Ahora probaremos los métodos de la pila con listas
        PilaLista Pila2 = new PilaLista();
        Pila2.apilarElementos(1);
        Pila2.apilarElementos(2);
        Pila2.apilarElementos(4);
        Pila2.apilarElementos(8);
        Pila2.apilarElementos(16);
        System.out.println("cima: " + Pila2.getCima());

        //Desapilamos un elemento
        Pila2.desapilarElemento();
        System.out.println("cima tras desapilar un elemento: " + Pila2.getCima());
        //Elemento de la cima
        System.out.println("Elemento en la posición de la cima: " + Pila2.devolverElemento());
        //toString
        System.out.println(Pila2.toString());
        //Cantidad de elementos de la pila
        System.out.println("Cantidad de elementos de la pila: " + Pila2.elementosDePila());

    }
}
