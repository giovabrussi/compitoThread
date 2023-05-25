public class Semaforo {
    private int valore;
    private int nMacchine=0;
    
    public Semaforo(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public synchronized void P(){
        while (valore==0 && nMacchine>1){
            try {
                System.out.println("----------"+Thread.currentThread().getName()+" è in attesa al box----------");
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } 
        }
        nMacchine++;
        valore=0;
    }
      
    public synchronized void V(){
        valore=1;
        nMacchine--;
        notify();
    }
}