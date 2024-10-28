package Collection;

public class GenericMath<T> {
	
	private T value;
	
	GenericMath(T value)
	{
		this.value = value;
	}
	
	T add(T newvalue)
	{
		if (value instanceof Integer && newvalue instanceof Integer)
		{
			Integer result = (Integer) value + (Integer) newvalue;
			return (T) result;
		}
		else if(value instanceof Double && newvalue instanceof Double)
		{
			Double result = (Double) value + (Double) newvalue;
			return (T) result;
		}
		else if (value instanceof String && newvalue instanceof String)
		{
			String result = (String) value + (String) newvalue;
			return (T) result;
		}
		else
		{
			throw new IllegalArgumentException("Unsupported type of addition");
		}
		
	}
	
	public void display()
	{
		System.out.println("Current Value :"+value);
	}
	
	public static void main(String[] args) {
		
        GenericMath<Integer> math1 = new GenericMath<>(10);
        System.out.println("Addition :"+math1.add(30));
        
        GenericMath<Double> math2 = new GenericMath<>(20.5);
        System.out.println("Addition :"+math2.add(36.67));
        
        GenericMath<String> math3 = new GenericMath<>("Karan");
        System.out.println("Addition :"+math3.add(" Prasad"));
        
	}	
}

		
