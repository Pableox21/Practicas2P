package EjerciciosClase;

public class Arbol {
    public static void main(String[] args) {
        Arbol edades=new Arbol();
        edades.insertar(20);
        edades.insertar(17);
        edades.insertar(22);
        edades.insertar(40);
        edades.insertar(70);
        edades.insertar(33);
        edades.insertar(21);
        edades.insertar(39);

        edades.print();
    }
    Nodo raiz;
    public Arbol(){
        this.raiz=null;
    }
    public void insertar(int data){
        this.raiz=insertarREcursiviad(this.raiz,data);
    }
    public Nodo insertarREcursiviad(Nodo actual, int data){
        if (actual==null){
            return new Nodo(data);
        }
        if (data<actual.data) {
            actual.left=insertarREcursiviad(actual.left,data);
        } else if (data>= actual.data) {
            actual.rigth=insertarREcursiviad(actual.rigth,data);
        }
        return actual;
    }

    public void print(){
        System.out.println("IMPRIMIR EDADES EN ORDEN");
        printRecursividad(this.raiz);
        System.out.println();;

    }

    public static void printRecursividad(Nodo actual){
        if (actual!=null){
            printRecursividad(actual.left);
            System.out.print(actual.data+" ");
            printRecursividad(actual.rigth);
        }
    }

    class Nodo{
        Nodo left, rigth;
        int data;

        public Nodo(int data) {
            this.left = null;
            this.rigth = null;
            this.data = data;
        }

    }
}
