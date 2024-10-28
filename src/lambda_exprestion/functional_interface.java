package lambda_exprestion;




@FunctionalInterface
interface student
{
	void show();
}


public class functional_interface {
	
	public static void main(String[] args) {
		
//		student s = new student()
//				{
//					public void show()
//					{
//						System.out.println("Welcome to first lambda expression");
//					}
//				};	
//				s.show();
		
		student s = () -> System.out.println("Welcome to first lambda expression");
		
		s.show();
	}
}
