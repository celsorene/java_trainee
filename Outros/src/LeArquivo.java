import java.io.File;
import java.util.Scanner;

//buscando conteudo de arquivo ".txt"
public class LeArquivo {

    public static void main(String[] args) {

        //and - e
        /*if (1==1 && 2==2){
            System.out.println("Teste comparacao 'and' !");
        }
        
        //or - ou
        if (1==1 || 2==2){
            System.out.println("Teste comparacao 'or' !");
        }*/
        
        try {
            File file = new File("C:/outros/teste.txt");
            Scanner scanner = new Scanner(file);
            StringBuffer sb = new StringBuffer();
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine() + "\n" );
            }
            System.out.println(sb);
          	scanner.close();
        }
        catch(Exception e){
                System.out.println(e.getMessage());                
        }
        
    }
    
}
