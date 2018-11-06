package aufgabenblatt2;

class ImmutableRational {

	private int z�hler;
	private int nenner;
	
	ImmutableRational(){
		z�hler = 0;
		nenner = 1;
	}
	
	ImmutableRational(int z�hler,  int nenner) {
		this.z�hler = z�hler;
		this.nenner = nenner;
	}
	
	void printRational() {
		System.out.println(this.z�hler + "/" + this.nenner);
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
	
	void reduce() {
		
		if (nenner == z�hler) {
			nenner = 1;
			z�hler = 1;
		} else {
			nenner = nenner / ggT(nenner, z�hler);
			z�hler = z�hler / ggT(nenner, z�hler);
		}
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
