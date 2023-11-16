package vozila;

public class Avion extends Vozilo {
	
	 private String klasaAviona;

	    public String getKlasaAviona() {
		return klasaAviona;
	}

	public void setKlasaAviona(String klasaAviona) {
		this.klasaAviona = klasaAviona;
	}

		public Avion(double cenaPutarine, String klasaAviona) {
	        super(cenaPutarine);
	        this.klasaAviona = klasaAviona;
	    }

	    @Override
	    public double NaplatiPutarinu() {
	        if (klasaAviona.equals("Ekonomska klasa")) {
	            return super.NaplatiPutarinu() * 0.85; // 15% popusta za ekonomsku klasu
	        } else if (klasaAviona.equals("Biznis klasa")) {
	            return super.NaplatiPutarinu() * 1.25; // 25% povećanje za biznis klasu
	        } else {
          return super.NaplatiPutarinu(); // Nema promene za druge klase aviona
	        }
	    }

}
