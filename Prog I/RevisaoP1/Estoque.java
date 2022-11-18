public class Estoque {
    String nome;
    int id;
    int qnt;

    Estoque(String nome, int id) {
        this.setNome(nome);
        this.setId(id);
        this.setQnt(0);
    }

    Estoque(String nome, int id, int qnt) {
        this.setNome(nome);
        this.setId(id);
        this.setQnt(qnt);
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQnt() {
        return this.qnt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void retiraEstoque(int qnt) {
        this.qnt = this.qnt - qnt;

    }

    public void adicionaEstoque(int qnt) {
        if (qnt < 0) {
            return;
        } else {
            this.qnt += qnt;
        }
    }

    public String toString() {
        return "\nNome: " + this.getNome() + "\nid: " + this.getId() + "\nqnt: " + this.getQnt() + "\n";

    }

    public static void main(String[] args) {
        Estoque a = new Estoque("Material", 5, 10);
        System.out.println(a.toString());
        a.adicionaEstoque(3);
        System.out.println(a.toString());
        a.retiraEstoque(10);
        System.out.println(a.toString());

    }

}