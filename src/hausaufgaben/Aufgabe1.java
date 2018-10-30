package hausaufgaben;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		double a = 100;
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
            // System.out.println(x1);
            i++;
           
        }while(Math.abs(x1-x0) > 0.0001); 
		
		return x1;
	
	}

}
