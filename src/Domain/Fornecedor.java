package Domain;

public class Fornecedor extends PessoaJuridica{

    private String codigo;
    private String email;
    private String telefone;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "codigo='" + codigo + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public String toValidate() {
        String message;

        message = super.toValidate();
        if ( codigo.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Código do Fornecedor deve ser preenchido.";
        } else if ( !codigo.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Código do Fornecedor deve conter apenas números.";
        }
        if ( email.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "E-mail do Fonecedor deve ser preenchido.";
        }
        if ( telefone.equals("")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Telefone do Fornecedor deve ser preenchido.";
        } else if ( !telefone.matches("[0-9]+")) {
            if (!message.equals("")) { message += "\n"; }
            message += "Telefone do Fornecedor deve conter apenas números.";
        }
        return message;
    }

}
