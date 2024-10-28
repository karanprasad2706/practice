package abstraction;

public class StudentA extends Marks{
	
	int m1,m2,m3;
	
	public StudentA(int m1, int m2, int m3) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	double getPercentage() {
		
		double avg = (m1+m2+m3)/3;
		return avg;
	}

}
