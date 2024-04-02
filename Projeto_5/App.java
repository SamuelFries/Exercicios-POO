public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario("Ze", 1000.0);
        System.out.println(f);

        Tecnico t = new Tecnico("Amigo do Ze", 1000, 5);
        System.out.println(t);

        Professor p = new Professor("Outro amigo do Ze",1000,22);
        System.out.println(p);
    }
}
