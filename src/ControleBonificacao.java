public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario g){
        double boni = g.getBonificacao();

        this.soma +=boni;
    }

    public void eita(double a){
        System.out.println(a);
    }

    public double getSoma() {
        return soma;
    }
}
