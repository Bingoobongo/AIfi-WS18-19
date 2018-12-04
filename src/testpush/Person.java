package testpush;

public class Person {

	String name;
	  static int alter=10;
	  
	
	
	Person(String name, int alter){
		
		Person.alter=alter;
		this.name=name;
	}
	
	public  String toString(){
		
	return name+""+alter;
		
		
	}
		
		public static int werdeAlt(){
			
			alter = alter+1;
			
			return alter;
		
			
		}
	
	
	public static void main(String args[]){
		
		werdeAlt();
		Person p1 = new Person("Mike ist ",+ 17);
		Person p2 = new Person("Lucy ist  ", +(alter) );
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
	}
	
	
}


