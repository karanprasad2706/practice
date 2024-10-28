package methods;

public class return_not_or_with_argumnets {
	
	static int add(int a,int b, int c)
	{
		return a+b+c;
	}
	
	static double cude(double r)
	{
		double pi=3.14;
		
		return pi*r*r;
		
	}
	
	static String name()
	{
		String name = "Karan";
		return name;
	}
	
	static char alph()
	{
		char alph = 'A';
		return alph;
	}
	
	static int arrayMin(int arr[])
	{
		int min = arr[0];
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	
	static int arrayMax(int arr[])
	{
		int max = arr[0];
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	static boolean yes(int age)
	{
		if(age>18)
		{
			return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition Of 3 number = "+add(10,20,30));
		System.out.println("Area of Circle = "+cude(14));
		System.out.println("Name :"+name());
		System.out.println("Blood Group :"+alph());
		
		int arr[] = {23,444,555,433,443,3233,4544,4223};
		System.out.println("Min value of Array :"+arrayMin(arr));
		System.out.println("Max value of Array :"+arrayMax(arr));
		System.out.println("Age is Valide or Not :"+yes(32));
		
	}

}
