package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCadastros {

    private static Scanner teclado = new Scanner(System.in);

    public static void iniciar(String entidade){
        int opcao = 0;

        menuCadastros(entidade);
        opcao = selecionaOpcao();

        switch(opcao) {
            case 1:
                MenuPersonalizado.cadastrar(entidade);
                break;
            case 2:
                MenuPersonalizado.listar(entidade);
                break;
            case 3:
                MenuPrincipal.iniciar();
                break;
            default:
                opcaoErrada();
                iniciar(entidade);
                break;
        }
    }

    private static void menuCadastros(String entidade) {
        System.out.println("-> " + entidade);
        System.out.println("======== 1- Cadastrar ==========");
        System.out.println("======== 2- Listar =============");
        System.out.println("======== 3- Voltar =============");
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

    private static void opcaoErrada() {
        System.out.println();
        System.out.println("======= Opcao Incorreta ========");
        System.out.println();
    }
}
