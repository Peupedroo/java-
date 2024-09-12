public class Emprestimo {
    private double valorEmprestimo, taxaJuros;
    private int tempo;
    private double calculo;

    public void setValorEmprestado(double valorEmprestado){
        this.valorEmprestimo = valorEmprestado;
    }
    public void setTaxaJuros(double taxaJuros){
        this.taxaJuros = taxaJuros;
    }
    public void setTempo (int tempo){
        this.tempo = tempo;
    }


    public double getCalculo(){
        return calculo;
    }
    public double calcJuros() {
        if (tempo > 5) {
            // Adicionar juros ao valor total do empréstimo
            calculo = valorEmprestimo + (valorEmprestimo + (valorEmprestimo * (tempo - 5) * (taxaJuros / 100)));
        } else {
            // Calcular apenas o valor do empréstimo sem juros
            calculo = valorEmprestimo * tempo;
        }
        return calculo;
    }
}
