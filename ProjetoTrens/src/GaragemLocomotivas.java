import java.util.ArrayList;
import java.util.List;

public class GaragemLocomotivas {
    private List<Locomotiva> locomotivas;

    public GaragemLocomotivas() {
        this.locomotivas = new ArrayList<>();
    }

    public void adicionarLocomotiva(Locomotiva locomotiva) {
        this.locomotivas.add(locomotiva);
    }

    public boolean removerLocomotiva(Locomotiva locomotiva) {
        return this.locomotivas.remove(locomotiva);
    }

    public List<Locomotiva> listarLocomotivas() {
        return this.locomotivas;
    }
}