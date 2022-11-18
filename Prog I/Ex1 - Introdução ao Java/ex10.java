import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
                matriz[i][j] = leitor.nextInt();
                System.out.println("");
            }
        }
        
        System.out.println("A matriz digitada:\n\n");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
        int total= 0;
        for(int i = 0; i<matriz.length;i++){
            for(int j = 0; j<matriz.length; j++){
                if(i>j){
                    total += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal é: "+ total);


    }
}

