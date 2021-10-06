package Domain;

public class Professor extends PessoaFisica{

    private String codigo;
    private String cadeira;
    private String titular;
    private String anoDeAdmissao;

    public void setCodigo(String codigo) {
        this.codigo = codigo.trim();
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira.trim();
    }

    public void setTitular(String titular) {
        this.titular = titular.trim();
    }

    public void setAnoDeAdmissao(String anoDeAdmissao) {
        this.anoDeAdmissao = anoDeAdmissao.trim();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cadeira='" + cadeira + '\'' +
                ", titular='" + titular + '\'' +
                ", anoDeAdmissao='" + anoDeAdmissao + '\'' +
                '}';
    }

    @Override
    public String toValidate() {
        String message;

        message = super.toValidate();
        if ( codigo.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Código do Professor deve ser preenchido.";
        } else if ( !codigo.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Código do Professor deve conter apenas números.";
        }
        if ( cadeira.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Cadeira do Professor deve ser preenchido.";
        }
        if ( titular.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Titular deve ser preenchido.";
        }
        if ( anoDeAdmissao.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Admissão do Professor deve ser preenchido.";
        } else if ( !anoDeAdmissao.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Admissão do Professor deve conter apenas números.";
        } else if ( anoDeAdmissao.length() == 4) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Admissão do Professor deve conter quatro dígitos.";
        } else if ( Integer.parseInt(anoDeAdmissao) < 2000 ) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Admissão do Professor deve ser maior que 2000.";
        } else if ( Integer.parseInt(anoDeAdmissao) > 2021 ) {
            if (!message.equals("")) { message += "\n"; }
            message += "Ano de Admissão do Professor deve ser menor que 2021.";
        }
        return message;
    }

}
