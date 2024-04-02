public class Tecnico extends Funcionario{
    private int categoria;

    public Tecnico(String nome, double salarioBase, int categoria) {
        super(nome, salarioBase);
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    @Override
    public double getSalarioLiquido(){
        double salLiq = super.getSalarioLiquido();
        if (categoria > 3){
            salLiq = salLiq * 1.05;
        }
        return salLiq;
    }
    
}
