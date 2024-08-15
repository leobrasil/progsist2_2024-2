import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorLivros {

    public static void main(String[] args) {
        try {
            String livros[] = LeitorLivros.leLivros("caminho");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String[] leLivros(String path)throws Exception{
        Path arq_livros = Paths.get("/workspaces/progsist2_2024-2/lab1/livros.txt");
        String aux[] = Files.readAllLines(arq_livros).toArray(new String[0]);

        return aux;
    }
}
