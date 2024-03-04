/*
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHi!");
        String version = System.getProperty("java.version");
        System.out.println("Running Java Version "+version+"\n");
    }
}
*/
// Solucao do exercicio
public class App{
     public static void main(String args[]){ 
       CadastroProfessores professores = new CadastroProfessores();
       Menu menu = new Menu(professores);
       int opcao;
       do{
         opcao = menu.exibeMenu();
       }while(menu.executaOpcao(opcao));
     }
   }