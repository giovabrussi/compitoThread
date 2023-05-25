/**
 * La classe rappresenta e gestisce una monoposto
 * Simula una gara composta da 10 giri di pista
 * 
 * @author Giovanni Brussi
 */
public class Monoposto extends Thread {

    /**
     * Numero identificativo della macchina
     */
    private int n;

    /**
     * Nome della scuderia
     */
    private String scuderia;

    /**
     * Nome del pilota
     */
    private String pilota;

    /**
     * Semaforo
     */
    private Semaforo s;

    /**
     * Risorsa condivisa, box
     */
    private Box b;

    
    public Monoposto(int id, String scuderia, String pilota, Semaforo s, Box b) {
        this.n = id;
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.s = s;
        this.b = b;

        setName(pilota);
    }

    

    /**
     * Metodo run che simula una gara da 10 giri di pista
     * La vettura per ogni giro di pista impiega un tempo random da 1 a 4 secondi(simulare con uno Sleep)
     * Ogni 3 giri viene usata la risorsa box per fare il pitstop
     */
    @Override
    public void run(){

        for(int i=0; i<10; i++){

            if(i%3==0 && i>0){
                s.P();
                    b.pitStop(this);
                s.V();
            }

            try {
                Thread.sleep(1000*((int)((Math.random()*4)+1)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("GIRO-"+(i+1)+" Completato da "+pilota);
        }


    }



    /**
     * Restituisce il numero
     * @return numero
     */
    public int getN() {
        return n;
    }



    /**
     * Restituisce la scuderua
     * @return scuderia
     */
    public String getScuderia() {
        return scuderia;
    }



    /**
     * Restituisce il nome del pilota
     * @return nome pilota
     */
    public String getPilota() {
        return pilota;
    }





}
