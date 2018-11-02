package hausaufgaben;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		double a = 50;
		double x0 = a/2;
		double x1 = a;
		double sqrt_a;
		int i = 1; 
		
		sqrt_a = mySqrt(a, x0, x1, i);
		
		System.out.println("Die Wurzel von a = " + a + " ist ungefähr " + sqrt_a);
		System.out.println("Test mit java Methode Math.sqrt(a) = " + Math.sqrt(a));

	}

	private static double mySqrt(double a, double x0, double x1, int i) {
		do{ 
			if (i > 1) {
				x0 = x1;
			}
            x1 = (x0 + a/x0)/2; 
             System.out.println(x1);
            i++;
           
        }while(Math.abs(x1-x0) > 0.0001); 
		
		return x1;
	
	}
	// funktioniert einwandfrei, das mit der Auslagerung der Methode ist gut
	// das mit dem i ist nicht so sch�n, du k�nntest das i auch erst in der Methode deklarieren 
	// und die Abfrage k�nnte auch lauten x1 != a, so k�nntest du das i ganz weglassen
	// da alle deine Variablen von a abh�ngen k�nntest du auch nur a der Methode �bergeben und die anderen variablen erst dann berechnen
	// trotzdem sehr gut
	
}
