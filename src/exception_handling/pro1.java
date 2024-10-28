package exception_handling;

public class pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Running Program");
		try
		{
			int n = 143/0;
			System.out.println("Value OF n"+n);
		}
		catch(Exception eh)
		{
			System.out.println(eh.getMessage());  //it's Return the message in String So have to take in SOP
//			eh.printStackTrace();
//			eh.fillInStackTrace();
		}
		
		System.out.println("Run Ho gya A ");
	}

}
