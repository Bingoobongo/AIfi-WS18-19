package vorlesung4;

class CharTest {

	public static void main(String[] args) {
		Character a = new Character ('D');
		Character b = new Character ('d');
		
		int difference = a.compareTo(b);
		if (difference<0) {System.out.println("kleiner");}
		if (difference>0 ) {System.out.println("gr��er");}
		if (difference == 0) {System.out.println("Gleich");}
		}
}
