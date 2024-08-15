//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   /*
        int hora = 40;
        int trabalho = 15;
        int salario;

        salario = hora * trabalho;

        System.out.println("seu salario ficou em R$ " + salario);

    */
      /*  int vari1 = 40;
        int vari2 = 42;
        boolean  res ;

        res = vari1 < vari2;
        if( res == true){
            System.out.println(vari1 + "e maior que " + vari2);
        }




       */

       /*int nota1 = 7;
       int nota2 = 8;
       int nota3 = 6;
       double media ;
       media = (nota1 + nota2 + nota3)/ 3;

       if (media >= 7 ){
           System.out.printf("vc esta aprovado e sua media foi e  %.2f ", media);
       }
       else if (media < 4) {
           System.out.printf("vc esta aprovado e sua media foi e  %.2f ", media, );

       }
       else {
           System.out.println("vc ta na final ");
       }


        */

        int salario;
        double imposto1;
        double imposto2;
        double impostos3;
        double salario_real1;
        double salario_real2;
        double salario_real3;
        double salario_digitavel = 2550.1;

        imposto1 = salario_digitavel * 0.05;
        salario_real1 = salario_digitavel * 1.05;

        imposto2 = salario_digitavel * 0.1;
        salario_real2 = salario_digitavel * 1.1;

        impostos3 = salario_digitavel * 0.2;
        salario_real3 = salario_digitavel * 1.2;


        if (salario_digitavel < 900 ){
            System.out.println("com o seu salario vc nao paga imposto");
        } else if (salario_digitavel < 1500 ) {
            System.out.println("o imposoto foi de "+ imposto1);
            System.out.println("e seu salario ficou "+  salario_real1);

        } else if (salario_digitavel < 2500) {
            System.out.println("o seu imposto ficou" + imposto2);
            System.out.println("o seu salario real ficou "+ salario_real2);
        }
        else if (salario_digitavel > 2501) {
            System.out.println("o seu imposto ficou" + impostos3);
            System.out.println("o seu salario real ficou "+ salario_real3);
        }
    }
}


