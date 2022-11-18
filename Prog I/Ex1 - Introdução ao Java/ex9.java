public class ex9 {
    public static void main(String[] args) {
        int array[] = new int[100]; 
        int soma = 0, i=0, y=0, media = 0;
        System.out.println("Números radomicos: ");
            for (i=0; i<array.length; i++) {
                 array[i] = 1 + (int) (Math.random() * 100); // Gera números aleatórios com limite 100.
                 System.out.println(array[i]); // Saída, são gerados 100 números.
            }
            while(y < i){
                soma = array[y] + soma;
                y++;
            }
            media = soma / i;
            System.out.println("Média dos números: " + media);
            y = 0;
            while(y < i){
                if(array[y]< media){
                    System.out.println(array[y]+" está abaixo da média");
                }
                y++;
            }
            
    }

}
