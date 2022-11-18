import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
    
        int i;
        int vetor[]= new int [10];
        Scanner leitor= new Scanner(System.in);
        int maior = 0,menor =0;
        
        for(i=0;i<= vetor.length-1;i++){
            System.out.print("Digite 10 valores : ");
            vetor[i]=leitor.nextInt();
        }
        
        for(i = 0;i<= vetor.length-1;i++){
               
    
                if(vetor[i]>maior){
                    maior= vetor[i];
                }
                if(vetor[i]<menor){
                   menor=vetor[i]; 
                }

            }
        System.out.println("O Menor valor digitado : "+menor);
        System.out.println("O Maior valor digitado : "+maior);
       
        
    }
}
