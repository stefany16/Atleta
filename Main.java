class Main {
  public static void main(String[] args) throws Exception {
    

    //TesteSimples teste = new TesteSimples();
    TestUnitario tu = new TestUnitario();  
    tu.executarAll();

    TelaConsoleMenu tela = new TelaConsoleMenu();
    tela.executar();




    
    System.out.println("\nimcmonitor, fim!");
  }
}