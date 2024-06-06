import java.util.ArrayList;
import java.util.List;

public class GaragemVagoes {
    private List<Vagao> vagoesDisponiveis;

    public GaragemVagoes() {
        this.vagoesDisponiveis = new ArrayList<>();
    }

    public void listarVagoesDisponiveis() {
        for (Vagao vagao : vagoesDisponiveis) {
            System.out.println("Vagão ID: " + vagao.getIdentificador() + " Capacidade Máxima: " + vagao.getCapacidadeMaxima());
        }
    }

    public void adicionarVagao(Vagao vagao) {
        vagoesDisponiveis.add(vagao);
    }

    public void removerVagao(Vagao vagao) {
        vagoesDisponiveis.remove(vagao);
    }
}
