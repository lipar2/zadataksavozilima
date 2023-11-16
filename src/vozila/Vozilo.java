package vozila;

public abstract class Vozilo {
	
	protected double cenaPutarine;
	
    public Vozilo(double cenaPutarine) {
        this.cenaPutarine = cenaPutarine;
    }
    
    public double NaplatiPutarinu() {
        return cenaPutarine;
    }
}
