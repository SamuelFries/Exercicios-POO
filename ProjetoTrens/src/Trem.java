import java.util.ArrayList;
import java.util.List;

public class Trem {
    private String identificador;
    private List<Locomotiva> locomotivas;
    private List<Vagao> vagoes;

    public Trem(String identificador) {
        this.identificador = identificador;
        this.locomotivas = new ArrayList<>();
        this.vagoes = new ArrayList<>();
    }

    public void adicionarLocomotiva(Locomotiva locomotiva) {
        this.locomotivas.add(locomotiva);
        locomotiva.setReferenciaTrem(identificador);
    }

    public void adicionarVagao(Vagao vagao) {
        this.vagoes.add(vagao);
        vagao.setReferenciaTrem(identificador);
    }

    public void removerUltimoElemento() {
        if (!vagoes.isEmpty()) {
            vagoes.remove(vagoes.size() - 1);
        } else if (!locomotivas.isEmpty()) {
            locomotivas.remove(locomotivas.size() - 1);
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public List<Locomotiva> getLocomotivas() {
        return locomotivas;
    }

    public List<Vagao> getVagoes() {
        return vagoes;
    }
}
