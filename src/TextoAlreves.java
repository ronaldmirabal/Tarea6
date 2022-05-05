import java.util.Scanner;

public class TextoAlreves {
    public static void main(String[] args) {
        System.out.println("Introduzca una palabra:");
        Scanner scanner = new Scanner(System.in);
        String textoAlrevez = scanner.nextLine();
        System.out.println(reverse(textoAlrevez));

    }

    public static String reverse(String texto) {
        String resultado ="";
        char aux;
        for (int i =0; i< texto.length();i++){
            aux = texto.charAt(i);
            resultado = aux+resultado;
        }
       return  resultado;
    }
}
