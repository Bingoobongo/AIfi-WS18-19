package aufgabenblatt2;

class Rational {
	
	 int z�hler;
	 int nenner;
	
	Rational(){
		z�hler = 0;
		nenner = 1;
	}
	
	Rational(int z�hler,  int nenner) {
		this.z�hler = z�hler;
		this.nenner = nenner;
	}
	
	void printRational() {
		System.out.println(this.z�hler + "/" + this.nenner);
	}
	
	void setZ�hler(int z�hler) {
		this.z�hler = z�hler;
	}
	
	void setNenner(int nenner) {
		this.nenner = nenner;
	}
	
	void negate() {
		this.z�hler *= (-1);
	}
	
	void invert () {
		int help = this.z�hler;
		this.z�hler = this.nenner;
		this.nenner = help;
	}
	
	void toDouble() {
		double komma = (double) this.z�hler / this.nenner;
		System.out.println(komma);
	}
	
	Rational reduce() {
		int nennerNeu;
		int z�hlerNeu;
		
		if (nenner == z�hler) {
			nennerNeu = 1;
			z�hlerNeu = 1;
		}
			nennerNeu = nenner / ggT(nenner, z�hler);
			z�hlerNeu = z�hler / ggT(nenner, z�hler);
			
		
		Rational ret = new Rational(z�hlerNeu, nennerNeu);
		return ret;				
	}
	
	void add(Rational add) {
		if (this.nenner == add.nenner) {
			this.z�hler += add.z�hler;
			
		} else {
			this.nenner *= add.nenner;
			this.z�hler += (this.z�hler * add.nenner + this.nenner * add.z�hler);
		}
	}
	
	private static int ggT(int a, int b) {
		if (a > b) {
			
			int merke = b;
			for (int ii = b; ii > 0; ii--) {
				
				if (a % ii == 0 && merke % ii ==0) {
					b = ii;
					break;
				}
			}
			return b;
			
		} else if (b > a) {
			
			for (int ii = a; ii > 0; ii--) {
				
				int merke = a;
				if (b % ii == 0 &&  merke % ii == 0) {
					a = ii;
					break;
				}
			}
			return a;
		}
		return 1;
	}
}
