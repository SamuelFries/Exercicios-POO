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