package vozila;

public class Test {

	public static void main(String[] args) {
		// Kreiranje objekta Avion
        Avion avion = new Avion(1000.0, "Ekonomska klasa");

        // Ispis osnovne cene putarine
        System.out.println("Osnovna cena putarine: " + avion.NaplatiPutarinu());

        // Promena klase aviona na "Biznis klasa"
        avion.setKlasaAviona("Biznis klasa");

        // Ispis cene putarine nakon promene klase
        System.out.println("Nova cena putarine: " + avion.NaplatiPutarinu());

	}

}
