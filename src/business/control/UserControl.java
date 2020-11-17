package business.control;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

public class UserControl {
    ArrayList<String> users;
    
    //construtor a partir de um ArrayList
    public UserControl(ArrayList<String> users){
        this.users = users;
    }

    //contrutor a partir de um arquivo
    public UserControl(String caminhoArquivo) { //caminhoArquivo seria algo do tipo "D:\\arquivo.txt"
        try {
            FileReader abrirArq = new FileReader(caminhoArquivo);
            BufferedReader lerArq = new BufferedReader(abrirArq);

            while (lerArq.ready()) {
                String linha = lerArq.readLine();
                this.users.add(linha);
            }

            abrirArq.close();
            lerArq.close();
        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }

    public void deleteUser(String login){}
}