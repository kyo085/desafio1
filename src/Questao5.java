import java.util.Scanner;

public class Questao5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma palavra:");
            String entrada = scanner.nextLine();
            String resultado = reverterPalavra(entrada);
            System.out.println("palavra invertida: " + resultado);
        }

        public static String reverterPalavra(String letras) {
            char[] chars = letras.toCharArray();
            int primeiraLetra = 0;
            int ultimaLetra = letras.length() - 1;

            while (primeiraLetra < ultimaLetra) {
                char temp = chars[primeiraLetra];
                chars[primeiraLetra] = chars[ultimaLetra];
                chars[ultimaLetra] = temp;
                primeiraLetra++;
                ultimaLetra--;
            }

            return new String(chars);
        }
    }

