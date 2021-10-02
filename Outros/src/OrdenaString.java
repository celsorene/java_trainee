import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("aula online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();

        //Collections.sort(palavras,comparador);
        palavras.sort(comparador);
        System.out.println("Ordenadas plavras por tamanho:");
        System.out.println(palavras);
        
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2){
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }

}
