package View;

import Controller.Controlador;
import Domain.Aluno;
import Domain.Fornecedor;
import Domain.Professor;

import java.util.Scanner;

public class MenuPersonalizado {

    private static Scanner teclado = new Scanner(System.in);

    public static void cadastrar(String entidade){
        if(entidade.equals("Professor")){
            Professor professor = cadastrarProfessor();
            Controlador.salvarProfessor(professor);
        }else if(entidade.equals("Aluno")){
            Aluno aluno = cadastrarAluno();
            Controlador.salvarAluno(aluno);
        }else{
            Fornecedor fornecedor = cadastrarFornecedor();
            Controlador.salvarFornecedor(fornecedor);
        }
    }

    public static void listar(String entidade){
        if(entidade.equals("Professor")){
            Controlador.listarProfessores();
        }else if(entidade.equals("Aluno")){
            Controlador.listarAlunos();
        }else{
            Controlador.listarFornecedores();
        }
    }

    private static Professor cadastrarProfessor(){

        Professor professor = new Professor();

        System.out.println("Digite o codigo do professor:");
        professor.setCodigo(teclado.nextLine());
        System.out.println("Digite o nome do professor:");
        professor.setNome(teclado.nextLine());
        System.out.println("Digite o sobrenome do professor:");
        professor.setSobrenome(teclado.nextLine());
        System.out.println("Digite o cpf do professor:");
        professor.setCpf(teclado.nextLine());
        System.out.println("Digite a cadeira do professor:");
        professor.setCadeira(teclado.nextLine());
        System.out.println("Digite o titular:");
        professor.setTitular(teclado.nextLine());
        System.out.println("Digite o ano de admissao:");
        professor.setAnoDeAdmissao(teclado.nextLine());

        return professor;
    }

    private static Aluno cadastrarAluno(){

        Aluno aluno = new Aluno();

        System.out.println("Digite o codigo do aluno:");
        aluno.setCodigo(teclado.nextLine());
        System.out.println("Digite o nome do aluno:");
        aluno.setNome(teclado.nextLine());
        System.out.println("Digite o sobrenome do aluno:");
        aluno.setSobrenome(teclado.nextLine());
        System.out.println("Digite o cpf do aluno:");
        aluno.setCpf(teclado.nextLine());
        System.out.println("Digite a turma do aluno:");
        aluno.setTurma(teclado.nextLine());
        System.out.println("Digite o ano de ingresso do aluno:");
        aluno.setAnoDeIngresso(teclado.nextLine());

        return aluno;
    }

    private static Fornecedor cadastrarFornecedor(){

        Fornecedor fornecedor = new Fornecedor();

        System.out.println("Digite o codigo do fornecedor:");
        fornecedor.setCodigo(teclado.nextLine());
        System.out.println("Digite o nome fantasia do fornecedor:");
        fornecedor.setNomeFantasia(teclado.nextLine());
        System.out.println("Digite a razao social do fornecedor:");
        fornecedor.setRazaoSocial(teclado.nextLine());
        System.out.println("Digite o cnpj do fornecedor:");
        fornecedor.setCnpj(teclado.nextLine());
        System.out.println("Digite o email do fornecedor:");
        fornecedor.setEmail(teclado.nextLine());
        System.out.println("Digite o telefone do fornecedor:");
        fornecedor.setTelefone(teclado.nextLine());

        return fornecedor;
    }

}
