package exception_handling;

public class ArrayOutofBond {

	
	public static void main(String[] args) {
		
		int number [] = {83,4,3,34,53,34,4,3,3,4455,3,4,23};
		
		int n = number.length;
		
		try
		{
			System.out.println(number[100]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array lenght Is 13 !!!!");
		}
		finally
		{
			for(int i=0 ; i<n-1 ; i++ )
			{
				for(int j =0 ; j < n-i-1 ;j++)
				{
					if(number[j] >number[j+1])
					{
						int tem = number[j];
						number[j] = number[j+1];
						number[j+1] = tem;
					}
				}
		    }
			
			System.out.println("Array In Accending Order :");
			for(int a : number )
			{
				System.out.print(a + " ");
			}
	}
		System.out.println("\nExeption Handdling ");
		
	}
}
