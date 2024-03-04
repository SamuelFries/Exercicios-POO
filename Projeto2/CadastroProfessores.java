import java.util.Arrays;

public class CadastroProfessores {
    public static final int MAX_PROFESSOR = 100;
    private Professor[] professores;
    private int proxLivre;

    public CadastroProfessores(){
        professores = new Professor[MAX_PROFESSOR];
        proxLivre = 0;
    }

    public boolean cadastraProfessor(Professor professor){
        if (proxLivre == MAX_PROFESSOR){
            return false;
        }
        professores[proxLivre] = professor;
        proxLivre++;
        return true;
    }

    public Professor[] getTodos(){
        return Arrays.copyOf(professores, proxLivre);
    }

    public Professor getPorNome(String nome){
        for(int i=0;i<proxLivre;i++){
            if (professores[i].getNome().equals(nome)){
                return professores[i];
            }
        }
        return null;
    }
}
