package hausaufgaben;

public class Variablen {
	public static void main (String[] args) {
	
		double a=50;						//von a wird die Quadratwurzel bestimmt
		double xAlt = a/2;					//initialer L�sungsvorschlag
		
		double xNeu = (xAlt + (a/xAlt))/2;	//Berechnung von x_1
		System.out.println(xNeu);
		
		do {								// Berechnung und Ausgabe von x_i
			xAlt=xNeu;
			xNeu = (xAlt + (a/xAlt))/2;
			System.out.println(xNeu);
		}while (xAlt-xNeu>0.001);			// 2 aufeinanderfolgende Lsg unterscheiden sich um weniger als 0.0001
	}
	// funktioniert einwandfrei
	// ich pers�nlich bevorzuge Zuweisungen mit Leerzeichen dazwischen (f�r eine bessere �bersichtlichkeit)
}