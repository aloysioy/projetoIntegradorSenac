package Domain;

public class Aluno extends PessoaFisica{

    private String codigo;
    private String turma;
    private String anoDeIngresso;

    public void setCodigo(String codigo) {
        this.codigo = codigo.trim();
    }

    public void setTurma(String turma) {
        this.turma = turma.trim();
    }

    public void setAnoDeIngresso(String anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso.trim();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", turma='" + turma + '\'' +
                ", anoDeIngresso='" + anoDeIngresso + '\'' +
                '}';
    }

    @Override
    public String toValidate() {
        String message;

        message = super.toValidate();
        if ( codigo.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Código do Aluno deve ser preenchido.";
        } else if ( !codigo.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Código do Aluno deve conter apenas números.";
        }
        if ( turma.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Turma do Aluno deve ser preenchido.";
        }
        if ( anoDeIngresso.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Ingresso do Aluno deve ser preenchido.";
        } else if ( !anoDeIngresso.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Ingresso do Aluno deve conter apenas números.";
        } else if ( anoDeIngresso.length() == 4) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Ingresso do Aluno deve conter quatro dígitos.";
        } else if ( Integer.parseInt(anoDeIngresso) < 2000 ) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Ingresso do Aluno deve ser maior que 2000.";
        } else if ( Integer.parseInt(anoDeIngresso) > 2021 ) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Ingresso do Aluno deve ser menor que 2021.";
        }
        return message;
    }
}
