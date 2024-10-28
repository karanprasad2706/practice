package String_Class;

public class Array_String {

	public static void main(String[] args) {
		
		String name = "Kancha Buddyyy";
		System.out.println("Name :"+name);
		
		int count = 0;
		
		char string[] = name.toCharArray();
		
		System.out.println("Duplicate Character in a given String :");
		
		for(int i=0 ; i<string.length ; i++)
		{
			count = 1;
			for(int j= i+1 ; j<string.length ;j++)
			{
				if(string[i] == string[j] && string[i]!= ' ')
				{
					count++;
					string[j]='0';
				}
			}
			
			if (count > 1 && string[i] != '0') {
                System.out.println(string[i] + " appears " + count + " times");
            }
		}
		
	}
}
