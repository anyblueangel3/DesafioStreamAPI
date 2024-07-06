import java.util.*;
import java.util.stream.Collectors;

public class DesafioStreamAPI {
    List<Integer> numeros;

    public DesafioStreamAPI() {
        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    }

    private void exibirEmOrdemAlfabetica() {                    //Desafio 1
        String result = numeros.stream()
                .map(String::valueOf)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(" "));
        System.out.println("Em ordem alfabética: " + result);
    }

    private void imprimirSomaDeNumerosPares() {                //Desafio 2
        int soma = numeros.stream().filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Soma de todos números pares da lista: " + soma);
    }

    private void VerificarSeNumerosSaoPositivos() {             // Desafio 3
        boolean saoPositivos = numeros.stream().allMatch(n -> n > 0);
        System.out.println("Todos números são positivos? " + saoPositivos);
    }

    private void removerImpares() {                             //Desafio 4
        List<Integer> paresRemovidos = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(paresRemovidos);
    }

    private void  calcularMediaMaioresQueCinco() {              //Desafio 5
        System.out.println("Média dos maiores que 5: " +
                numeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(n -> n)
                .average().orElse(0));
    }

    private void verificarSeExisteMaiorQueDez() {               //Desafio 6
        boolean temMaiorQueDez = numeros.stream().anyMatch(n -> n > 10);
        if (temMaiorQueDez) System.out.println("Tem maior que dez.");
        else System.out.println("Não tem maior que dez.");
    }

    private void encontrarSegundoMaior() {                      //Desafio 7
        Integer segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Segundo maior: " + segundoMaior);
    }

    private void somarDigitos() {                               //Desafio 8
        int soma = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(String::chars)
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Soma dos dígitos da lista: " + soma);
    }

    private void numerosDistintos() {                           // Desafio 9
        Set<Integer> numerosUnicos = new HashSet<>(numeros);
        if (numerosUnicos.size() == numeros.size()) {
            System.out.println("Todos distintos.");
        } else {
            System.out.println("Há repetições.");
        }
    }

    private void multiplosDeTresOuCinco() {                     //Desafio 10
        List<Integer> multiplosTresCinco = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println("Multiplos de três e cinco: " + multiplosTresCinco);
    }

    private void somarQuadrados() {                             //Desafio 11
        int soma = numeros.stream().map(n -> n * n).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos quadrados: " + soma);
    }

    private void encontrarProduto() {                           //Desafio 12
        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Produto de todos os número da lista: " + produto);
    }

    public static void main(String[] args) {

        DesafioStreamAPI dSA = new DesafioStreamAPI();

        System.out.print(" Desafio: 1 ");
        dSA.exibirEmOrdemAlfabetica();              // desafio-1

        System.out.print(" Desafio: 2 ");
        dSA.imprimirSomaDeNumerosPares();           // desafio-2

        System.out.print(" Desafio: 3 ");
        dSA.VerificarSeNumerosSaoPositivos();       // desafio-3

        System.out.print(" Desafio: 4 ");
        dSA.removerImpares();                       // desafio-4

        System.out.print(" Desafio: 5 ");
        dSA.calcularMediaMaioresQueCinco();         // desafio-5

        System.out.print(" Desafio: 6 ");
        dSA.verificarSeExisteMaiorQueDez();         // desafio-6

        System.out.print(" Desafio: 7 ");
        dSA.encontrarSegundoMaior();                // desafio-7

        System.out.print(" Desafio: 8 ");
        dSA.somarDigitos();                         // desafio-8

        System.out.print(" Desafio: 9 ");
        dSA.numerosDistintos();                     // desafio-9

        System.out.print(" Desafio:10 ");
        dSA.multiplosDeTresOuCinco();               // desafio-10

        System.out.print(" Desafio:11 ");
        dSA.somarQuadrados();                       // desafio-11

        System.out.print(" Desafio:12 ");
        dSA.encontrarProduto();                     // desafio-12

        System.out.print(" Desafio:13 ");
        dSA.filtrarEntreCincoEDez();                // desafio-13

        System.out.print(" Desafio:14 ");
        dSA.encontrarMaiorPrimo();                  // desafio-14

        System.out.print(" Desafio:15 ");
        dSA.verificarSeTemUmNegativo();             // desafio-15

        System.out.print(" Desafio:16 ");
        dSA.agruparEmParesEImpares();               // desafio-16

        System.out.print(" Desafio:17 ");
        dSA.filtraPrimosDaLista();                  // desafio-17

        System.out.print(" Desafio:18 ");
        dSA.verificaSeNumerosDaListaSaoIguais();    // desafio-18

        System.out.print(" Desafio:19 ");
        dSA.somaDivisiveisTresECinco();             // desafio-19

    }

    private void filtrarEntreCincoEDez() {
        List<Integer> filtrado = numeros.stream().filter(n -> n > 5 && n < 10).toList();
        System.out.println("Numeros menores que 5 e maiores que 10: " + filtrado);
    }

    private void encontrarMaiorPrimo() {
        //TODO
    } // desafio-14

    private void verificarSeTemUmNegativo(
            //TODO
    ) {}; // desafio-15

    private void agruparEmParesEImpares() {
        //TODO
    }; // desafio-16

    private void filtraPrimosDaLista() {
        //TODO
    }; // desafio-17

    private void verificaSeNumerosDaListaSaoIguais() {
        //TODO
    }; // desafio-18

    private void somaDivisiveisTresECinco() {
        //TODO
    }; // desafio-19

}
