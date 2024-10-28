package abstraction;

public class Parentscall extends Parent{
	
	

	public static void main(String[] args) {
		
		subclass1 s1 = new subclass1();
		s1.message();

		subclass2 s2 = new subclass2();
		s2.message();
	}
	@Override
	void message() {
		// TODO Auto-generated method stub
		
	}


}
