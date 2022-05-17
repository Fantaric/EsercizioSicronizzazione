public class App {
    public static void main(String[] args) throws Exception {
       
        Thread m = new Thread(new Memoria("Usb", 300));
        Thread m1 = new Thread(new Memoria("SSD", 10000));
        
        Utente u1 = new Utente("Pippo", m);
        Utente u2 = new Utente("Minni", m);

        u1.start();
        u2.start();

        u1.join();
        u2.join();
       
        
    }
}
