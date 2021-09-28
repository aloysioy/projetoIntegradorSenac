package Domain;

public class Professor extends PessoaFisica{

    private String codigo;
    private String cadeira;
    private String titular;
    private String anoDeAdmissao;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setAnoDeAdmissao(String anoDeAdmissao) {
        this.anoDeAdmissao = anoDeAdmissao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "codigo='" + codigo + '\'' +
                ", cadeira='" + cadeira + '\'' +
                ", titular='" + titular + '\'' +
                ", anoDeAdmissao='" + anoDeAdmissao + '\'' +
                '}';
    }
}
