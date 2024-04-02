public class Professor extends Funcionario{
    private int cargaHoraria;

    public Professor(String nome, double salarioBase, int cargaHoraria) {
        super(nome, salarioBase);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double getSalarioLiquido(){
        double vh = getSalarioBase() / 44;
        double salarioBase = vh * cargaHoraria;
        salarioBase = salarioBase - (salarioBase*0.1);
        return salarioBase;
    }
}