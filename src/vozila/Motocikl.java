package vozila;

public class Motocikl extends Vozilo {
	
	  private int brojVozaca;

	    public Motocikl(double cenaPutarine, int brojVozaca) {
	        super(cenaPutarine);//umesto super mozemo da koristimo this.cenaputarine=cenaputarine;
	        this.brojVozaca = brojVozaca;}
	    
	    @Override
	    public double NaplatiPutarinu() {
	        if (brojVozaca == 1) {
	            return super.NaplatiPutarinu() * 0.8; // 20% popusta za 1 vozača
	        } else {
	            return super.NaplatiPutarinu() * 0.7; // 30% popusta za više od 1 vozača
	        }
	    }

}
