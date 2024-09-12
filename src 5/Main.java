//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emprestimo e = new Emprestimo();

        String pergunta;
        String pergunta2;
        String pergunta3;

        double print;

        System.out.println("vc quer entrar no programa ");
        pergunta = sc.nextLine();

        if (pergunta.equalsIgnoreCase("S")){
            do {

                System.out.println("valor do emprestimo ");
                e.setValorEmprestado(sc.nextDouble());

                System.out.println("quanto tempo vc utilizou ");
                e.setTempo(sc.nextInt());

                sc.nextLine();



                System.out.println("quantos juros");
                e.setTaxaJuros(sc.nextDouble());

                print = e.calcJuros();
                System.out.println(print);

                System.out.println("vc quer continuar sim ou nao");
                pergunta3 = sc.nextLine();


            }while (pergunta3.equalsIgnoreCase("S"));
        }else
        {
            System.out.println("vc nao entrou no programa ");
        }

    }
}