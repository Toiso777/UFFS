package Java.Prog1.Acampamento;
import java.util.Scanner;

public class Acampamento {
    private String nome;
    private int idade;
    private char equipe;
    public Acampamento(String name, int age){
        setNome(name);
        setIdade(age);
        
        
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }

    public void setEquipe(char e){
        this.equipe = e;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public char getEquipe(){
        return equipe;
    }


    public String toString(){
        return "Nome: "+ this.nome + "\nIdade: " + this.idade + "\nEquipe: " +this.equipe+"\n";
    }
    public void definirEquipe(){
        if((this.idade>=6)&&(this.idade<=10)){
            setEquipe('A');
        }
        if((this.idade>=11)&&(this.idade<=20)){
            setEquipe('B');
        }
        if(this.idade>=21){
            setEquipe('C');;
        }
    }
}

class Teste{
    public static void main (String[] args) {
        int i;
        Scanner lendo = new Scanner(System.in);
        Acampamento vet[] = new Acampamento[10];
        for(i=0;i<=10;i++){
            System.out.println("Nome:");
            vet[i].setNome(lendo.nextLine());
            System.out.println("Idade:");
            vet[i].setIdade(lendo.nextInt());
            vet[i].definirEquipe();

        }
        


    }
}
       







