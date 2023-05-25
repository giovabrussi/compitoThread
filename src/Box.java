/**
 * La classe rappresenta e gestisce un box
 * Simula l'entrata di una monoposto e il pit-stop di una durata da 1 a 5 secondi
 * 
 * @author Giovanni Brussi
 */
public class Box {
    
    /**
     * Il metodo simula un pit-stop, all'entrata della macchina il pit-stop ha una durata da 1 a 5 secondi
     * @param m Monoposto
     */
    public void pitStop(Monoposto m){

        System.out.println("PIT-STOP "+m.getPilota()+" entra nel box per il pit stop");

        try {
            Thread.sleep(1000*((int)((Math.random()*5)+1)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PIT-STOP "+m.getPilota()+" ha finito il pit-stop");

    }


}
