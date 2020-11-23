import java.util.Scanner;
import java.util.ArrayList;

class TelaConsoleMenu {

    Scanner teclado = new Scanner(System.in);
    ArrayList<Atleta> matriculas = new ArrayList<Atleta>(); 

    DAO dao = new DAO();

    public void executar() {
      
      boolean sair = false;
      int op;

      //matriculas = loadAll(); para amanha ou quarta

      while(!sair){

        System.out.println("\nMENU ******");
        System.out.println(" 1 [+] ATLETA");            //ok
        System.out.println(" 2 [+] AVALIACAO");         
        System.out.println("11 [>] LISTAGEM");          //ok
        System.out.println("12 [>] CONSULTA ATLETA");
        System.out.println(" 9 [X] ATLETA");            //ok
        System.out.println(" 0 [X] SAIR");              //ok
        System.out.println("---------------");
        System.out.print("Opcao:_");
        op = teclado.nextInt();

        if(op == 1) {
          this.incluirNovoAtleta();
        }

        if(op == 11) {
          this.listarAtletas();
        }

        if(op == 9) {
          this.removerAtleta();
        }

        if(op == 0) {
          dao.saveAll(matriculas); 
          sair = true;
        }

      }

      System.out.println("fim, ok!");

    }

    private void incluirNovoAtleta(){
      System.out.println("\nNovo Atleta");

      System.out.print("nome_: ");
      String nome = teclado.next();

      System.out.print("idade_: ");
      int idade =  teclado.nextInt();

      Atleta novo = new Atleta();
      novo.setNome(nome);
      novo.setIdade(idade);

      matriculas.add(novo);

    }

    private void listarAtletas(){

      System.out.println("\nListagem de Atletas:");

      if(matriculas.size() > 0) {
        int cont = 1;
        for(Atleta atemp : matriculas) {
          System.out.println(cont++ + ") " + atemp.getNome() + " (" + atemp.getIdade() + ")");
        }
      } else {
        System.out.println("Nenhum atleta matriculado!");
      }

    }



    private void removerAtleta(){

      System.out.println("\nRemover Atleta:");

      //this.listarAtletas();       

      System.out.print("selecione_: ");
      int posicao = teclado.nextInt();

      matriculas.remove(posicao-1);

      System.out.println("removido, ok!");

    }


}
