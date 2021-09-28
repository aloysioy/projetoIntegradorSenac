package Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escrever {

    public static void escreverArquivo(String caminho, String texto) {
        try(
                FileWriter criarArquivo = new FileWriter(caminho, true);
                BufferedWriter escritor = new BufferedWriter(criarArquivo);
                PrintWriter escritorDeArquivo = new PrintWriter(escritor);
        ) {
            escritorDeArquivo.println(texto);
            escritorDeArquivo.flush();

        }catch(IOException e) {
            e.printStackTrace();

        }
    }

}
