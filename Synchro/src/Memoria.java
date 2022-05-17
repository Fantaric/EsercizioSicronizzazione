public class Memoria {
    
    private String nome;
    private int capienza;
    private int capLibera;




    public Memoria(String nome, int capienza) 
    {
        this.nome = nome;
        this.capienza = capienza;
        this.capLibera = capienza;
    }



    public synchronized void eliminazione(int mem)
    {
        if (this.capLibera + mem <= this.capienza)
            this.capLibera += mem;
    }

    public synchronized void salvataggio(int mem)
    {
        if (mem < this.capLibera)
            this.capLibera -= mem;
            System.out.print("Salvataggio di "+ spazio + " dati");
            System.out.println("Memoria disponibile: " +getCapLibera());
    } 

    public synchronized void formattazione()
    {
        this.capLibera = capienza;
    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapienza() {
        return this.capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public int getCapLibera() {
        return this.capLibera;
    }

    public void setCapLibera(int capLibera) {
        this.capLibera = capLibera;
    }

}
