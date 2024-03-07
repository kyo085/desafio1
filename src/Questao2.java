import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se está na lista Fibonacci");
        int entrada = scanner.nextInt();
        acharFibonacci(entrada);

    }
        private static void acharFibonacci (int entrada){

            List<int[]> fibonacci =
                    Stream.iterate(new int[]{0, 1},
                                    arr -> arr[0] <= entrada,
                                    arr -> new int[]{arr[1], arr[0] + arr[1]})
                            .toList();
            boolean numeroNaLista = fibonacci.stream()
                    .anyMatch(pair -> pair[0] == entrada || pair[1] == entrada);

            System.out.println("O número " + entrada + " está na lista? " + numeroNaLista);
        }
    }
