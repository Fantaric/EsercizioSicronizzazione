public class Utente implements Runnable{
    
  private String nome;
  private Memoria mem;

  
  public Utente(String nome, Memoria mem) 
  {
    this.nome = nome;
    this.memoria = memoria;
  }



    
    @Override
    public void run()
    {
      for(int i = 0; i < 5; i++)
      {
          int n = (int) (Math.random()*100);
          memo.salvataggio(n);
          int m = (int) (Math.random()*100);
          memo.eliminazione(m);
      }
    }
}
