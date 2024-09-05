import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("vc deseja entrar no menu se sim digite S");
        String j = sc2.next();

        if(j.equalsIgnoreCase("S")) {
            String repetir ;
            do {
                System.out.println("informe sua idade ");
                p.setIdade(sc.nextInt());
                System.out.println(p.getIdade());


                System.out.println("informe o seu nome ");
                p.setNome(sc2.next());
                System.out.println(p.getNome());

                System.out.println("informe seu salario");
                p.setSalario(sc.nextInt());
                System.out.println("seu salario e " + p.getSalario());

                System.out.println("seus dados fornecidos foram");
                System.out.println("nome"+p.getNome());
                System.out.println("idade"+p.getIdade());
                System.out.println("salario"+p.getSalario());

                System.out.println("se quiser continuar digite C");
                repetir = sc.next();





            } while (repetir.equalsIgnoreCase("C"));

        }
        else{
            System.out.println("vc nao escolheu nada xau");
        }





    }
}