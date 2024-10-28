package lambda_exprestion;

//@FunctionalInterface
//interface add
//{
//	void sum(int a , int b);
//	
//}

@FunctionalInterface
interface add
{
	int sum(int a , int b);
	
}


public class Labda_Expression {

	public static void main(String[] args) {
		
//		add a = (f,g) -> 
//		{
//			System.out.println("Addition ::"+(f+g));
//			System.out.println("Addition ::"+(f+g));
//		};
//		a.sum(22,34);
		
		add a = (k,p) ->
		{
			return k+p;
		};
		System.out.println("Addition ::"+a.sum(200,982));
		
	}
}
