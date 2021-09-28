package Domain;

public abstract class PessoaFisica {
    private String nome;
    private String sobrenome;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
