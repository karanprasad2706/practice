package String_Class;

public class Duplicate {
		
		public static void main(String[] args) {
			
			String name = "Kancha Buddy";
			System.out.println(name);

			int count = 0;
			for(int i=0 ; i<name.length();i++)
			{
				for(int j=i+1 ;j<name.length();j++)
				{
					if(name.charAt(i) == name.charAt(j))
					{
						count++;
						System.out.println("Duplicate Charaters :"+name.charAt(i)+" "+count);
					}
				}
			}
			
		
		}

	}

