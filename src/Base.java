public class Base {

    public int DISABLED = 0;
    public int ENABLED = 1;
    public int REMOVED = 3;

    private int status = ENABLED;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
