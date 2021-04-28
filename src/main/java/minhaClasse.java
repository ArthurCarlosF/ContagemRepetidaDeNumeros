import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class minhaClasse{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //insira sua solução aqui
        String palavra;
        String frase="";
        ArrayList<String> dicionario= new ArrayList<>();
        String linha="";
        SortedMap<Integer, Integer> lista = new TreeMap<>();
        int numero=0;
        boolean primeiro=true;
        int quant=100;
        while(((linha=br.readLine())!=null)&&(quant>0)) {
            StringTokenizer st = new StringTokenizer(linha);
            while (st.hasMoreTokens()) {
                palavra = st.nextToken();
                numero=(Integer.parseInt(palavra));


            }
            quant--;
           // System.out.println(quant);
            if(primeiro){
                quant=numero;
                primeiro=false;
            }else {

                if (lista.containsKey(numero)) {
                    int repeticoes = lista.get(numero);
                    repeticoes++;
                    //   System.out.println(repeticoes);
                    lista.put(numero, repeticoes);
                } else {
                    lista.put(numero, 1);
                }

            }
        }
        for(SortedMap.Entry<Integer,Integer> entry : lista.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            // System.out.println(key + " => " + value);
            System.out.printf("%d aparece %d vez(es)\n",key,value);
        }
    }

    }


