package Domain;

public abstract class PessoaJuridica {

    protected String nomeFantasia;
    protected String cnpj;
    protected String razaoSocial;

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String toValidate() {
        String message = "";
        if ( nomeFantasia.equals("")) {
            message += "Nome Fantasia deve ser preenchido.";
        }
        if ( razaoSocial.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Razão Social deve ser preenchido.";
        }
        if ( cnpj.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "CNPJ deve ser preenchido.";
        } else if ( !cnpj.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "CNPJ deve conter apenas números.";
        }
        return message;
    }
}
