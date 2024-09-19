public class Aluno extends Pessoa {

        private double nota1, nota2, nota3, media;

    public  Aluno(){

    }
    public Aluno(String nome, int idade, String cpf, double nota1, double nota2, double nota3) {
        super(nome, idade, cpf);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public void setNota3(double nota3) {
            this.nota3 = nota3;
        }




        public double calcMedia() {
            media = (nota1 + nota2 + nota3) / 3;
            return media;
        }

        public void verificarAprovacao() {
            if (media >= 7) {
                System.out.println("vc ta aprovado"+ media);
            } else if (media >= 5) {
                System.out.println("ta de rec" + media);

            } else {
                System.out.println("reprovado" + media);
            }


        }

        public void detalhes() {
            System.out.println(nome);
            System.out.println(media);
            verificarAprovacao();
        }
    }