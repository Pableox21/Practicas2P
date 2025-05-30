package EjerciciosClase;

public class MaximoMatrices {
    public static void main(String[] args) {
        int[][][] matriz = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };
        System.out.println(Maximo(matriz,0,0,0,matriz[0][0][0]));
    }
    public static int Maximo(int[][][] matriz,int row, int columna,int z , int max){
        if (row==matriz.length-1 && columna==matriz.length-1 && z==matriz.length){
            if (matriz[row][columna][z]>max){
                max=matriz[row][columna][z];
            }
            return max;
        }
        if (columna==2){
            return Maximo(matriz,row+1,0,0,max);
        }
        if (z==2){
            return Maximo(matriz,row,columna+1,0,max);
        }
        if (matriz[row][columna][z]>max){
            max=matriz[row][columna][z];
        }
        return Maximo(matriz, row, columna, z+1, max);
    }
}
