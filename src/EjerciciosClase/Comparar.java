package EjerciciosClase;

public class Comparar {
    public static void main(String[] args) {
        int[] vectorA={1,2,3,4,5,6};
        int[] vectorB={1,2,3,4,5,6};
        if (Comparador(vectorA,vectorB,0)){
            System.out.println("Es igual");
        }else {
            System.out.println("No igual");
        }
    }
    public static boolean Comparador(int vectorA[],int vectorB[], int n){
        if(n==vectorA.length && n==vectorB.length){
            return true;
        }
        if (n>=vectorA.length || n>=vectorB.length){
            return false;
        }
        if (vectorA[n]!=vectorB[n]){
            return false;
        }
        return Comparador(vectorA,vectorB,n+1);
    }
}
