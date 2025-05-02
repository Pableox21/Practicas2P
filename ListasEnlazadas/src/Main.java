import Ise.ListaSimplementeEnlazada;
import icse.ListaCircularSimplementeEnlazada;
import ide.ListaDoblementeEnlazada;

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
         */
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

        listaCircularSimplementeEnlazada.mostrarCircular(2);
    }
}