package vozila;

public class Auto extends Vozilo {
	
    private int brojPutnika;

    public Auto(double cenaPutarine, int brojPutnika) {
        super(cenaPutarine);
        this.brojPutnika = brojPutnika;
    }

    @Override
    public double NaplatiPutarinu() {
        return super.NaplatiPutarinu() * (1 + brojPutnika * 0.1); // 10% povećanje za svakog putnika
    }

}
