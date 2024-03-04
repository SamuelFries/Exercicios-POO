
import java.util.Scanner;

public class Menu {
    private Scanner teclado;
    private CadastroProfessores cadastro;

    public Menu(CadastroProfessores cadastro){
        teclado = new Scanner(System.in);
        this.cadastro = cadastro;
    }
    public Professor entraDadosProfessor(){
        System.out.println("Nome do professor?");
        String nome  = teclado.nextLine();
        System.out.println("Quantos anos de experiencia ele tem?");
        int experiencia  = entraInt();
        Professor professor = new Professor(nome,experiencia);
        return professor;
    }

    public int entraInt(){
        return Integer.parseInt(teclado.nextLine());
    }

    public int exibeMenu(){
        System.out.println("Sistema de cadastramento de professores");
        System.out.println("Opções:");
        System.out.println("<1> - Cadastrar professor");
        System.out.println("<2> - Listar todos professores cadastrados");
        System.out.println("<3> - Apresentar classificação do professor indicado");
        System.out.println("<4> - Fim");
        int opcao = 0;
        while(opcao < 1 || opcao > 4){
            System.out.println("Digite sua opcao:");
            opcao = entraInt();
            if (opcao < 1 || opcao > 4){
                System.out.println("Opcao invalida. Tente novamente.\n");
            }
        }
        return opcao;
    }

    public boolean executaOpcao(int opcao){
        Professor professor;

        switch(opcao){
            case 1 :
                professor = entraDadosProfessor();
                cadastro.cadastraProfessor(professor);
                System.out.println("Professor cadastrado\n");
                return true;
            case 2 :
                System.out.println("\nProfessores cadastrados:");
                Professor[] todos = cadastro.getTodos();
                for(int i=0;i<todos.length;i++){
                    System.out.println(todos[i]);
                }
                System.out.println("\n");
                return true;
            case 3:
                System.out.println("Digite o nome do professor:");
                String nome = teclado.nextLine();
                professor = cadastro.getPorNome(nome);
                if (professor != null){
                    System.out.println("Classificação do professor "+nome+": "+professor.classifica()+"\n");
                }else{
                    System.out.println("Nome não encontrado\n");
                }
                return true;
            case 4:
                System.out.println("Fim");
                return false;
            default:
                System.out.println("Erro inesperado!");
                return false;
        }
    }
}
