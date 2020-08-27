class TesteSimples{

 public void executar(){

   Atleta atleta = new Atleta();
   atleta.setnome("Piedade Silva");
   atleta.setidade(30);

      System.out.println("Nome = " + atleta.getnome());
         System.out.println("Idade = " + atleta.getidade());
 }

}