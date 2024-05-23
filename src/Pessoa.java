public class Pessoa {

    private Integer codigo;
    private String nome;
    private String endereco;
    private Integer idade;

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() < 11 ){
            throw new RuntimeException("Cpf menor que 11 caracteres");
        }
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade < 0){
            throw new ArithmeticException("Idade não pode ser menor que zero");
        } else if(idade > 120){
            throw new ArithmeticException("Idade não pode ser maior que 120");
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Código: "+codigo+ "" +
                "\n"+ "Nome: "+nome+"" +
                "\n"+"Endereço: "+endereco+"" +
                "\n"+"Idade: "+idade+"\n";
    }
}
