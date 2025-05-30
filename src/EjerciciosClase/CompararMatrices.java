package EjerciciosClase;

public class CompararMatrices {
    public static void main(String[] args) {
        int[][][] matrizA = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };
        int[][][] matrizB = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };
        if (Comparar(matrizA,matrizB,0,0,0)){
            System.out.println("Iguales");
        }else {
            System.out.println("No son iguales");
        }
    }

    public static boolean Comparar(int[][][] matrizA, int[][][] matrizB,int row, int colum, int z){
        if (row==matrizA.length-1 && colum==matrizA.length-1 && z==matrizA.length){
            return true;
        }
        if (colum==2){
            return Comparar(matrizA,matrizB,row+1,0,0);
        }
        if (z==2){
            return Comparar(matrizA,matrizB,row,colum+1,0);
        }
        if (matrizA[row][colum][z] != matrizB[row][colum][z]){
            return false;
        }
        return Comparar(matrizA,matrizB,row,colum,z+1);
    }
}
