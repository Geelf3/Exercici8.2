
import java.util.ArrayList;
import java.util.Iterator;

public class CotxeTui {

	public static void main(String[] args) {
		// 1: Create the ArrayList
		ArrayList<Cotxe> llistaCotxes = new ArrayList<Cotxe>(5);

		// 2: add 5 cars with the given params in the exercise.
		llistaCotxes.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		llistaCotxes.add(new Cotxe("Dacia", "Sadero", 1200, 4));
		llistaCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		llistaCotxes.add(new Cotxe("Opel", "Insignia", 2200, 4));
		llistaCotxes.add(new Cotxe("Seat", "Ibiza", 1600, 4));

		// 3: quina potencia fiscal té el cotxe en la posició 2.
		llistaCotxes.get(2).getPotenciaFiscal();

		// 4: Add 2 cars given by the exercise
		llistaCotxes.add(new Cotxe("Hyundai", "Atos", 1500, 3));
		llistaCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));

		// 5: We try to add a duplicate
		if (llistaCotxes.add(new Cotxe("Hyundai", "Atos", 1500, 3))) {
			System.out.println("Si que es poden afegir duplicats.");
		};
		
		// 6: We try to insert a car in the 1rs position
		llistaCotxes.add(1, new Cotxe("Audi", "A8", 4600, 8));

		// 7: replace a given car by one we already have in the Array.
		llistaCotxes.set(4, new Cotxe("Seat", "Mii", 1000, 3));
		System.out.println("Amb el set no substitueix sinó que afegeix. Suposo que fent un "
				+ "remove y despres un set aconseguiriem el resultat desitjat.");

		// 8: which position has the "Ford Focus"?
		for (int i = 0; i < llistaCotxes.size(); i++) {
			if (llistaCotxes.get(i).getMarca() == "Ford" && llistaCotxes.get(i).getModel() == "Focus") {
				System.out.println("El Ford Focus esta a la posició: " + i);
			} 
		}
		
		// 9: Print all the information from all the objects, including pot.fiscal.
		// a) Using the standard loop
		System.out.println("\nAmb el for standard");
		System.out.println("Llistat de cotxes amb les seves dades: ");
		for (int i = 0; i < llistaCotxes.size(); i++) {
			Cotxe cotxe =  llistaCotxes.get(i);
			System.out.println(" MARCA: " + cotxe.getMarca() + 
					"\n MODEL: " + cotxe.getModel() + 
					"\n CILINDRADA: " + cotxe.getCilindrada() + 
					"\n CILINDRES: " + cotxe.getCilindres() + 
					"\n POT. FISCAL: " + cotxe.calculaPotFis() + 
					"\n -------------");
		}
		
		// b) Print it using for each
		System.out.println("\nAmb el for each:\n ");
		for (Cotxe cotxe : llistaCotxes) {
			System.out.println(" MARCA: " + llistaCotxes.get(llistaCotxes.indexOf(cotxe)).getMarca() + 
					"\n MODEL: " + llistaCotxes.get(llistaCotxes.indexOf(cotxe)).getModel() + 
					"\n CILINDRADA: " + llistaCotxes.get(llistaCotxes.indexOf(cotxe)).getCilindrada() + 
					"\n CILINDRES: " + llistaCotxes.get(llistaCotxes.indexOf(cotxe)).getCilindres() + 
					"\n POT. FISCAL: " + llistaCotxes.get(llistaCotxes.indexOf(cotxe)).calculaPotFis() + 
					"\n -------------");
		}
		
		// c) Print it using iterator
		System.out.println("\nAmb l'iterator:\n ");
		Iterator<Cotxe> llista = llistaCotxes.iterator();
        while (llista.hasNext()) {
        	Cotxe cotxe = llista.next();
        	System.out.println(" MARCA: " + cotxe.getMarca() + 
        			"\n MODEL: " + cotxe.getModel() + 
					"\n CILINDRADA: " + cotxe.getCilindrada() + 
					"\n CILINDRES: " + cotxe.getCilindres() + 
					"\n POT. FISCAL: " + cotxe.calculaPotFis() + 
					"\n -------------");
        	
        }
	}

}
