package wrapper_class;

public class wrapper1 {
	
	public static void main(String[] args) {
		
		
		String name = "Java";
		
		int i = 56 ;  //datatype
		
		//boxing : converting a datatypes value into a it's wrapper class object 
		
		Integer id = i; //object
		System.out.println(id.getClass());
		
		//unboxing : convert a class object calss into datatype 
		
		System.out.println(id);
		
		int z = id;
		
		System.out.println(id.compareTo(34));
		System.out.println(id.doubleValue());
		System.out.println(id.floatValue());
		
		
		String n1 = new String("69");
		String n2 = new String("69");
		System.out.println(n1.getClass()+" : "+(n1+n2)+"\n");
		
		Integer n11 = Integer.parseInt(n1);
		Integer n22 = Integer.parseInt(n2);
		System.out.println(n11.getClass()+"\n Additiin :"+(n11+n22));
		
		Byte b11 = Byte.parseByte(n1);
		Byte b22 = Byte.parseByte(n2);
		System.out.println(b11.getClass()+"\n Additiin :"+(b11+b22));
		
		Double d11 = Double.parseDouble(n1);
		Double d22 = Double.parseDouble(n2);
		System.out.println(d11.getClass()+"\n Additiin :"+(d11+d22));
		
		Float f11 = Float.parseFloat(n1);
		Float f22 = Float.parseFloat(n2);
		System.out.println(f11.getClass()+"\n Additiin :"+(f11+f22));
		
		Short s11 = Short.parseShort(n1);
		Short s22 = Short.parseShort(n2);
		System.out.println(s11.getClass()+"\n Additiin :"+(s11+s22));
		
	}

}
