package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    private static Scanner teclado = new Scanner(System.in);

    public static void iniciar() {

        int opcao = 0;

        menuPrincipal();
        opcao = selecionaOpcao();

        switch(opcao) {
            case 1:
                MenuCadastros.iniciar("Professor");
                break;
            case 2:
                MenuCadastros.iniciar("Aluno");
                break;
            case 3:
                MenuCadastros.iniciar("Fornecedor");
                break;
            case 4:
                sistemaEncerrado();
                System.exit(0);
            default:
                opcaoErrada();
                iniciar();
                break;
        }
    }

    private static void menuPrincipal() {
        System.out.println("================================");
        System.out.println("======= Sistema EducaTec =======");
        System.out.println("================================");
        System.out.println("============= Menu =============");
        System.out.println("======== 1- Professor ==========");
        System.out.println("======== 2- Aluno ==============");
        System.out.println("======== 3- Fornecedor =========");
        System.out.println("======== 4- Sair ===============");
    }

    private static void opcaoErrada() {
        System.out.println();
        System.out.println("======= Opcao Incorreta ========");
        System.out.println();
    }

    private static void sistemaEncerrado() {
        System.out.println();
        System.out.println("===== Encerrando Sistema =======");
        System.out.println();
    }

    private static int selecionaOpcao(){
        System.out.println("Opcao Desejada:");
        try {
            return Integer.parseInt(teclado.nextLine());
        }catch(InputMismatchException e) {
            return 0;
        }catch(NumberFormatException f) {
            return 0;
        }
    }
}
