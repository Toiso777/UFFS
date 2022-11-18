public class Tweet {
    private String autor;
    protected String msg;
    private int data;
    public String hash;

    public String getAutor() {
        return autor;
    }

    public int getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public String getHash() {
        return hash;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void retweet() {
        System.out.println("\nNome: " + this.getAutor() + "\nMensagem: " + this.getMsg() + "\nData: " + this.getData()
                + "\nHash: " + this.getHash() + "\n");

    }
}

class Teste {
    public static void main(String[] args) {
        Tweet a = new Tweet();
        a.setAutor("Nícolas");
        a.setMsg("puts");
        a.setData(2);
        a.setHash("hash?");
        a.retweet();

    }
}