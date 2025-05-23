package ListasEnlazadas.icse;

public class ListaCircularSimplementeEnlazada {
    private Nodo inicio;

    public ListaCircularSimplementeEnlazada(){
        inicio=null;
    }

    public boolean estaVacio(){
        return inicio==null;
    }
    public int tamaño(){
        int contador=0;

        if (!estaVacio()){
            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=inicio){
                ultimo=ultimo.getSiguiente();

                contador++;
            }
            contador++;
        }

        return contador;
    }

    public void insertarFin(Object dato){
        if (estaVacio()){
            Nodo nuevo=new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio=nuevo;
        }else {
            Nodo nuevo=new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=inicio){
                ultimo=ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }
    }

    public void eliminarFin(){
        if (!estaVacio()){
            Nodo penultimo=inicio;
            while (penultimo.getSiguiente().getSiguiente()!=inicio){
                penultimo=penultimo.getSiguiente();
            }
            penultimo.setSiguiente(inicio);
        }
    }
    public void mostrar(){
        if (!estaVacio()){
            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=inicio){
                System.out.print(ultimo.getDato()+"     ");

                ultimo=ultimo.getSiguiente();
            }
            System.out.print(ultimo.getDato()+"   ");
            System.out.println();
        }
    }

    public void mostrarCircular(int vueltas){
        if (!estaVacio()){
            int contador=0;

            Nodo temp=inicio;
            while (temp!=null && contador<(tamaño()*vueltas)){
                System.out.print(temp.getDato()+"   ");

                temp=temp.getSiguiente();

                contador++;
            }
            System.out.println();
        }
    }
}
