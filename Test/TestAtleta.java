class TestAtleta{

public void testNome() throws Exception {


    Atleta atleta = new Atleta();
    String nome;

    nome = "ABCD";
    atleta.setNome(nome);
    if (!atleta.getNome().equals(nome))
      throw new Exception("[erro] falha manipulando NOME valor " + nome);

    nome = " ";
    atleta.setNome(nome);
    if (!atleta.getNome().equals(nome))
      throw new Exception("[erro] falha manipulando NOME valor " + nome);

    nome = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    atleta.setNome(nome);
    if (!atleta.getNome().equals(nome))
      throw new Exception("[erro] falha manipulando NOME valor " + nome);

  }

  public void testIdade() throws Exception {

    Atleta atleta = new Atleta();
    int idade;

    idade = 10;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      throw new Exception("[erro] falha manipulando IDADE valor " + idade);

    idade = 99999;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      System.out.println("[erro] falha manipulando IDADE valor " + idade);

    idade = -9;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      System.out.println("[erro] falha manipulando IDADE valor " + idade);

    idade = 0;
    atleta.setIdade(idade);
    if (atleta.getIdade() != idade)
      System.out.println("[erro] falha manipulando IDADE valor " + idade);

   }
  }