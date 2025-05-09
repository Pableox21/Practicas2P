package pc;

import Ise.Nodo;

public class Pila extends Cola{
    @Override
    public void eliminar() {
        if (!estaVacia()) {
            Nodo ultimo=primero;
            Nodo penultimo=null;
            while (ultimo.getSiguiente()!=null){
                penultimo=ultimo;
                ultimo=ultimo.getSiguiente();
            }

            penultimo.setSiguiente(null);
        }
    }
}
