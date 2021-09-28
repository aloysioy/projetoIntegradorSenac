package Domain;

public class Aluno extends PessoaFisica{

    private String codigo;
    private String turma;
    private String anoDeIngresso;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setAnoDeIngresso(String anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo='" + codigo + '\'' +
                ", turma='" + turma + '\'' +
                ", anoDeIngresso='" + anoDeIngresso + '\'' +
                '}';
    }
}
