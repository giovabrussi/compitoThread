public class App {
    public static void main(String[] args) throws Exception {
        Semaforo s = new Semaforo(1);
        Box b = new Box();

        Monoposto m1 = new Monoposto(1, "Ferrari", "Leclerc", s, b);
        Monoposto m2 = new Monoposto(2, "RedBull", "Verstappen", s, b);
        Monoposto m3 = new Monoposto(3, "Ferrari", "Sainz", s, b);

        System.out.println("Gara iniziata");

        m1.start();
        m2.start();
        m3.start();
        
        m1.join();
        m2.join();
        m3.join();

        System.out.println("Gara terminata");
        
    }
}
