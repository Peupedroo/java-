public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private int tempo ;
    public  Professor(){

    }



    public Professor(String nome, int idade, String CPF, String disciplina, double salario,int tempo) {
        super(nome, idade, CPF);
        this.disciplina = disciplina;
        this.salario = salario;
        this.tempo = tempo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void set

    public void setTempo (int tempo){
        this.tempo  = tempo;
    }
    public String getDisciplina() {
        return disciplina;
    }


    public double getSalario (){
        return salario;
    }

    public double calcSalario (){
        return tempo*salario;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
}
