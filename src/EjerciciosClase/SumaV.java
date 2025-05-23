package EjerciciosClase;

public class SumaV{
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        int sumaVec = Suma(vector,vector.length);
        System.out.println("1) Suma del vector: " + sumaVec);
    }
    public static int Suma(int vector[], int u) {
        if (u <= 0) {
            return 0;
        } else {
            return vector[u - 1] + Suma(vector, u - 1);
        }
    }


}
