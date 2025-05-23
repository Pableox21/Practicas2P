import Ise.ListaSimplementeEnlazada;
import icse.ListaCircularSimplementeEnlazada;
import ide.ListaDoblementeEnlazada;
import lcde.ListaCircularDoblementeEnlazada;
import ListasEnlazadas.pc.Cola;
import ListasEnlazadas.pc.Pila;

public class Main {
    public static void main(String[] args) {
       /* ListaSimplementeEnlazada listaSimplementeEnlazada=new ListaSimplementeEnlazada();
        System.out.println(listaSimplementeEnlazada.estaVacia());

        //Implementar elementos a nuestra lista
        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);

        //mostramos nuestra lista
        listaSimplementeEnlazada.mostar();

        //eliminar algunos elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        //mostramos nuestra lista
        listaSimplementeEnlazada.mostar();
        */
        /*ListaDoblementeEnlazada listaDoblementeEnlazada=new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacio());

        for (int i=20;i> 0;i--){
            listaDoblementeEnlazada.Insertar(i);
        }

        System.out.println(listaDoblementeEnlazada.estaVacio());
        listaDoblementeEnlazada.mostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();
        listaDoblementeEnlazada.mostrarAtras();

        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada=new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacio());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i=1;i<=12;i++){
            listaCircularSimplementeEnlazada.insertarFin(i);
        }

        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        //listaCircularSimplementeEnlazada.eliminarFin();
        //listaCircularSimplementeEnlazada.eliminarFin();

        //listaCircularSimplementeEnlazada.mostrar();

        listaCircularSimplementeEnlazada.mostrarCircular(2);*/


       /* ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada=new ListaCircularDoblementeEnlazada();

        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
        for (int i=1;i<=5;i++){
            listaCircularDoblementeEnlazada.insertarFinal(i);
        }
        listaCircularDoblementeEnlazada.mostrar();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.mostrar();

        listaCircularDoblementeEnlazada.mostarAdelante(8);
        listaCircularDoblementeEnlazada.mostarAtras(8);

        Cola cola=new Cola();
        System.out.println(cola.estaVacia());

        for (int i = 1; i <=5 ; i++) {
            cola.insertar(i);
        }
        cola.mostar();

        cola.eliminar();
        cola.eliminar();
        cola.mostar();*/

        Pila pila=new Pila();
        System.out.println(pila.estaVacia());

        for (int i = 1; i <=5 ; i++) {
            pila.insertar(i);
        }
        pila.mostar();

        pila.eliminar();
        pila.eliminar();
        pila.eliminar();
        pila.mostar();
    }
}