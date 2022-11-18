import java.util.Scanner;

public class Apolice{
    int numApolice = 0;
    String nomeSegurado;
    int idade;
    float valorPremio;
    String nomeCidade;
    static int ultimoNumApolice = 0;

    public Apolice(){
        ultimoNumApolice ++;
        this.numApolice = ultimoNumApolice;
    }

   public Apolice(String nomeSegurado, int idade, String nomeCidade, float valorPremio){
        this();
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.nomeCidade = nomeCidade;
        this.valorPremio = valorPremio;
        
   }

   public void imprimir(){
    System.out.print("Apólice:\nNome: "+ this.nomeSegurado + "\nIdade: "+this.idade+"\nNumero da apolice: "+ this.numApolice +"\nNome da cidade: "+ this.nomeCidade+"\nValor da apólice: " + this.valorPremio+"\n");
   }

   public void calculaPremio(){
    if(idade >= 18 && idade <=25) valorPremio+= valorPremio * 0.20;
    else if(idade > 25 && idade<= 36) valorPremio+= valorPremio * 0.15;
    else if(idade > 36) valorPremio+= valorPremio * 0.10;
   }
   


   public void oferecerDesconto(String cidade){
        switch (cidade){
            case "Florianópolis":
            valorPremio -= valorPremio * 0.05;
            break;
            case "Chapecó":
            valorPremio -= valorPremio * 0.06;
            break;
            case "Joaçaba":
            valorPremio -= valorPremio * 0.07;
            break;
            case "Joinville":
            valorPremio -= valorPremio * 0.08;
            break;
        }
    }
    public static void exibeUltimoNum(){
        System.out.println("Ultima apólice: "+ ultimoNumApolice);
    }
   }

   class Teste{

    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        Apolice a = new Apolice();
        System.out.println("Digite o nome do segurado:");
        a.nomeSegurado = leitor.nextLine();
        System.out.println("Digite a cidade do segurado:");
        a.nomeCidade = leitor.nextLine();
        System.out.println("Digite a idade do segurado");
        a.idade = leitor.nextInt();
        System.out.println("Digite o valor do premio do segurado:");
        a.valorPremio = leitor.nextFloat();
        a.calculaPremio();
        a.imprimir();
        a.oferecerDesconto(a.nomeCidade);
        a.imprimir();

        String cidade, nome;
        int idade;
        float premio;
        Scanner lendo = new Scanner(System.in);
        System.out.println("Digite o nome do segurado:");
        nome = lendo.nextLine();
        System.out.println("Digite a cidade do segurado:");
        cidade = lendo.nextLine();
        System.out.println("Digite a idade do segurado");
        idade = lendo.nextInt();
        System.out.println("Digite o valor do premio do segurado:");
        premio = lendo.nextFloat();
        Apolice b = new Apolice(nome, idade,cidade, premio);
        b.calculaPremio();
        b.imprimir();
        b.oferecerDesconto(b.nomeCidade);
        b.imprimir();


    }
   }
   
