public class Emprestimo {
    private double valorEmprestimo, taxaJuros;
    double calculo;
    private int tempo;

    public  void setValorEmprestimo(double valorEmprestimo){
        this.valorEmprestimo = valorEmprestimo;
    }
    public void setTaxaJuros (double taxaJuros){
        this.taxaJuros = taxaJuros;
    }
    public void setTempo (int tempo){
        this.tempo = tempo;
    }
    public double calcJuros (){

        if (tempo > 5) {

            calculo = valorEmprestimo * (tempo-5) * (taxaJuros / 100)*1.01;

        } else if (tempo <= 5) {
            calculo = valorEmprestimo* tempo;

        }return calculo;
    }

}
