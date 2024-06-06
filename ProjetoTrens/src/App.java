import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App{
    private static List<Trem> trens = new ArrayList<>();
    private static GaragemVagoes garagemVagoes = new GaragemVagoes();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("1. Criar um trem");
            System.out.println("2. Editar um trem");
            System.out.println("3. Listar todos os trens");
            System.out.println("4. Desfazer um trem");
            System.out.println("5. Fim");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarTrem(scanner);
                    break;
                case 2:
                    editarTrem(scanner);
                    break;
                case 3:
                    listarTrens();
                    break;
                case 4:
                    desfazerTrem(scanner);
                    break;
                case 5:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void criarTrem(Scanner scanner) {
        System.out.print("Digite o identificador do trem: ");
        String identificadorTrem = scanner.nextLine();
        Trem trem = new Trem(identificadorTrem);

        System.out.print("Digite o identificador da primeira locomotiva: ");
        int identificadorLocomotiva = scanner.nextInt();
        scanner.nextLine();

        Locomotiva locomotiva = new Locomotiva(identificadorLocomotiva, 0, 0);
        trem.adicionarLocomotiva(locomotiva);

        trens.add(trem);
        System.out.println("Trem criado com sucesso.");
    }

    private static void editarTrem(Scanner scanner) {
        System.out.print("Digite o identificador do trem a ser editado: ");
        String identificadorTrem = scanner.nextLine();
        Trem trem = procurarTrem(identificadorTrem);

        if (trem != null) {
            boolean editando = true;

            while (editando) {
                System.out.println("=== Editar Trem ===");
                System.out.println("1. Inserir uma locomotiva");
                System.out.println("2. Inserir um vagão");
                System.out.println("3. Remover o último elemento do trem");
                System.out.println("4. Listar locomotivas livres");
                System.out.println("5. Listar vagões livres");
                System.out.println("6. Encerrar a edição do trem");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o identificador da locomotiva: ");
                        int idLocomotiva = scanner.nextInt();
                        scanner.nextLine();
                        Locomotiva loc = new Locomotiva(idLocomotiva, 0, 0);
                        System.out.println("Locomotiva inserida com sucesso.");
                        break;
                    case 2:
                        System.out.print("Digite o identificador do vagão: ");
                        int idVagao = scanner.nextInt();
                        scanner.nextLine();
                        Vagao vag = new Vagao(idVagao, 0);
                        trem.adicionarVagao(vag);
                        System.out.println("Vagão inserido com sucesso.");
                        break;
                    case 3:
                        trem.removerUltimoElemento();
                        System.out.println("Último elemento removido do trem.");
                        break;
                    case 4:
                        garagemVagoes.listarVagoesDisponiveis();
                        break;
                    case 5:
                        break;
                    case 6:
                        editando = false;
                        System.out.println("Encerrando a edição do trem...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } else {
            System.out.println("Trem não encontrado.");
        }
    }

    private static void listarTrens() {
        if (trens.isEmpty()) {
            System.out.println("Não há trens no pátio.");
        } else {
            System.out.println("=== Trens no Pátio ===");
            for (Trem trem : trens) {
                System.out.println("Identificador do Trem: " + trem.getIdentificador());
            }
        }
    }

    private static void desfazerTrem(Scanner scanner) {
        System.out.print("Digite o identificador do trem a ser desfeito: ");
        String identificadorTrem = scanner.nextLine();
        Trem trem = procurarTrem(identificadorTrem);

        if (trem != null) {
            trens.remove(trem);
            System.out.println("Trem desfeito com sucesso.");
        } else {
            System.out.println("Trem não encontrado.");
        }
    }

    private static Trem procurarTrem(String identificadorTrem) {
        for (Trem trem : trens) {
            if (trem.getIdentificador().equals(identificadorTrem)) {
                return trem;
            }
        }
        return null;
    }
}
