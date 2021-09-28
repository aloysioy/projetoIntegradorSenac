package Controller;

import Domain.Aluno;
import Domain.Fornecedor;
import Domain.Professor;
import Utils.Escrever;
import Utils.Ler;
import View.MenuPrincipal;

public class Controlador {

    public static void salvarProfessor(Professor professor) {
        Escrever.escreverArquivo("professor.txt", professor.toString());
        System.out.println("Professor cadastrado com sucesso!");
        MenuPrincipal.iniciar();
    }

    public static void salvarAluno(Aluno aluno) {
        Escrever.escreverArquivo("aluno.txt", aluno.toString());
        System.out.println("Aluno cadastrado com sucesso!");
        MenuPrincipal.iniciar();
    }

    public static void salvarFornecedor(Fornecedor fornecedor) {

        Escrever.escreverArquivo("fornecedor.txt", fornecedor.toString());
        System.out.println("Fornecedor cadastrado com sucesso!");
        MenuPrincipal.iniciar();
    }

    public static void listarProfessores(){
        System.out.println("Listagem de Professores:");
        Ler.ler("professor.txt");
        System.out.println("Fim da listagem.");
        MenuPrincipal.iniciar();
    }

    public static void listarAlunos(){
        System.out.println("Listagem de Alunos:");
        Ler.ler("aluno.txt");
        System.out.println("Fim da listagem.");
        MenuPrincipal.iniciar();
    }

    public static void listarFornecedores(){
        System.out.println("Listagem de Fornecedores:");
        Ler.ler("fornecedor.txt");
        System.out.println("Fim da listagem.");
        MenuPrincipal.iniciar();
    }
}
