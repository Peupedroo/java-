public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private int tempo ;



    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSalario (double salario){
        this.salario = salario;
    }
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

}
