import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emprestimo e = new Emprestimo();

        String a;
        String b;
        double retornar;

        System.out.println("vc quer calcular os juros digite S");
        a = sc.nextLine();
        if (a.equalsIgnoreCase("S")){
            do {
                System.out.println("digite quantos dias vc usou");
                e.setTempo(sc.nextInt());

                System.out.println("digite qual o valor do emprestimo ");
                e.setValorEmprestimo(sc.nextDouble());

                System.out.println("qual e a taxa de juros");
                e.setTaxaJuros(sc.nextDouble());

                retornar = e.calcJuros();
                System.out.println(retornar);


            System.out.println("se quiser continuar ");
            a = sc.nextLine();



            }while(a.equalsIgnoreCase("A"));
        }
    }
}