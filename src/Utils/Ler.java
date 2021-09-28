package Utils;

import java.io.*;

public class Ler {

    public static void ler(String caminho) {
        try {

            FileReader arquivo = new FileReader(caminho);

            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = "";
            while ( ( linha = leitor.readLine() ) != null) {
                System.out.println(linha);
            }
            arquivo.close();
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
