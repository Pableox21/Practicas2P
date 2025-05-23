package EjerciciosClase;

public class VectorInvertido {
    public static void main(String[] args) {
        String cadena="L E O N A R D O";
        String invertir=invertido(cadena);
        System.out.println("La cadena invertida es: "+invertir);
    }
    public static String invertido(String cadena){
        if (cadena.isEmpty()){
            return cadena;
        }else{
            return cadena.charAt(cadena.length()-1)+invertido(cadena.substring(0,cadena.length()-1));
        }
    }
}
