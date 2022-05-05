public class ArrayBidimensional {
    public static void main(String[] args) {
        int[][] numeros = new int[2][2];
        numeros[0][0] = 1;
        numeros[0][1] = 10;
        numeros[1][0] = 15;
        numeros[1][1] = 13;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2;j++){
                System.out.printf("Posición: " + i +","+j + " Valor: "+ numeros[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
