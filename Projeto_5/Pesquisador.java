public class Pesquisador extends Professor{
    private int cargaHorariaPesquisa;

    public Pesquisador(String nome, double salarioBase, int cargaHoraria, int cargaHorariaPesquisa) {
        super(nome, salarioBase, cargaHoraria);
        this.cargaHorariaPesquisa = cargaHorariaPesquisa;
    }

    public int getCargaHorariaPesquisa() {
        return cargaHorariaPesquisa;
    }

    public void setCargaHorariaPesquisa(int cargaHorariaPesquisa) {
        this.cargaHorariaPesquisa = cargaHorariaPesquisa;
    }
    

}
