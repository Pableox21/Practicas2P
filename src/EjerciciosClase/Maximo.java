package EjerciciosClase;

public class Maximo {
    public static void main(String[] args) {
        int[] vector={2,5,4,1,8};
        System.out.println(Calculador(vector,0,vector[0]));
    }
    public static int Calculador(int[] vector,int n, int max){
        if (n== vector.length){
            return max;
        }
        if (vector[n]>max){
            max=vector[n];
        }
        return Calculador(vector, n+1, max);
    }
}
