package EjerciciosClase;

public class Promedio {
    public static void main(String[] args) {
        int[] vector={1,2,3,4,5,6};
        System.out.println("El promedio es: "+promedioCalculado(vector.length, vector));
    }
    public static float promedioCalculado(int n, int[] vector){
        if (n <= 0) {
            return 0;
        }
            return (vector[n-1]+(promedioCalculado(n-1,vector)*(n-1)))/n;
    }
}
