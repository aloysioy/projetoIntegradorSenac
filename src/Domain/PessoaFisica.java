package Domain;

public abstract class PessoaFisica {
    protected String nome;
    protected String sobrenome;
    protected String cpf;

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome.trim();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.trim();
    }

    public String toValidate() {
        String message = "";
        if ( nome.equals("")) {
            message += "Nome deve ser preenchido.";
        }
        if ( sobrenome.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Sobrenome deve ser preenchido.";
        }
        if ( cpf.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "CPF deve ser preenchido.";
        } else if ( !cpf.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "CPF deve conter apenas números.";
        }
        return message;
    }
}
