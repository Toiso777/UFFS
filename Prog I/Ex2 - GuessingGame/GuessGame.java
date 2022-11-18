package Java.Prog1.GuessGame;
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println ("Estou pensando em um número entre 0 e 9");

        while (true){
            System.out.println ("O número a adivinhar é  " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println ("Player P1 palpitou " + guessp1);
            guessp2 = p2.number;
            System.out.println ("Player P2 palpitou " + guessp2);
            guessp3 = p3.number;
            System.out.println ("Player P3 palpitou " + guessp3);

            if (guessp1 == targetNumber){
                p1isright = true;
            }
            if (guessp2 == targetNumber){
                p2isright = true;
            }
            if (guessp3 == targetNumber){
                p3isright = true;
            }

            if (p1isright || p2isright || p3isright) {
                System.out.println ("Temos um vencedor!");
                System.out.println ("P1 acertou? " + p1isright);
                System.out.println ("P2 acertou? " + p2isright);
                System.out.println ("P3 acertou? " + p3isright);
                System.out.println ("Fim de jogo");
                break;
            }
            else {
                System.out.println ("Os jogadores teão que tentar denovo");
            }
        }
    }
}
