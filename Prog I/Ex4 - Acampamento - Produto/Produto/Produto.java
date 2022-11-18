import java.util.Scanner;

public class Produto {
    private String nome;
    private float valor;
    private int qnt;

    public Produto() {

    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setValor(float v) {
        this.valor = v;
    }

    public void setQnt(int q) {
        this.qnt = q;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public int getQnt() {
        return qnt;
    }

    public boolean verificarDisponibilidade(int quant) {
        if (quant > this.qnt) {
            return false;
        } else {
            return true;
        }
    }

    public void addUnidades(int quant) {
        setQnt(this.qnt + quant);
    }

    public void delUnidades(int quant) {
        boolean sera;
        sera = verificarDisponibilidade(quant);
        if (sera == true) {
            setQnt(this.qnt - quant);
            System.out.println("Valor decrementado");
        } else {
            System.out.println("Sem estoque meo!");
        }
    }

    public String toString() {
        return "Nome: " + this.nome + "\nValor " + this.valor + "\nQuantidade: " + this.qnt + "\n";
    }
}

class Teste {
    public static void main(String[] args) {
        int control, ind = 0, cod, quantidade;
        Produto vet[] = new Produto[10];
        Scanner lendo = new Scanner(System.in);
        System.out.println(
                "1 Cadastrar Produto\n 2 – Consultar estoque\n 3 – Remover unidades\n, 4 – Adicionar unidades e 9 - Sair.\n");
        control = lendo.nextInt();
        switch (control) {
            case control == 1:
                vet[ind] = new Produto();
                System.out.print("\nNome: ");
                vet[ind].setNome(lendo.nextLine());
                System.out.print("\nQuantidade: ");
                vet[ind].qnt(lendo.nextInt());
                System.out.print("\nValor: ");
                vet[ind].setValor(lendo.nextFloat());
                ind++;
                break;

            case control == 2:
                System.out.print("\nDigite o código do produto a ser consultado:\n ");
                cod = lendo.nextInt();
                System.out.print(vet[cod].toString());
                break;

            case 3:
                System.out.print("\nDigite o código do produto a ser excluido:\n ");
                cod = lendo.nextInt();
                System.out.print("\nDigite a quantidade que sera excluida:\n ");
                quantidade = lendo.nextInt();
                vet[cod].delUnidades(quantidade);
                break;

            case 4:
                System.out.print("\nDigite o código do produto a ser adicionado:\n ");
                cod = lendo.nextInt();
                System.out.print("\nDigite a quantidade que sera adicionada:\n ");
                quantidade = lendo.nextInt();
                vet[cod].addUnidades(quantidade);
                break;

            case 9:
                System.out.print("Saindo");
                return;
                break;

            default:
                System.out.println("Comando inválido!");
        }

    }

}

    

         

     

         

         

     
                
           
                
                
                
                
                
                
                
                
                

            
                
                
                
                

            
                
                
                
                
                
                

            
                
                
                
                
                
                

            
                
                
                

            
                

    