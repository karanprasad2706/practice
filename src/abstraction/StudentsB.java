package abstraction;

public class StudentsB extends Marks{
	
	int m1,m2,m3,m4;

	public StudentsB(int m1, int m2, int m3, int m4) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}

	@Override
	double getPercentage() {
		double avg = (m1+m2+m3+m4)/4;
		return avg;
	}
	
	public static void main(String[] args) {
		
		StudentA a = new StudentA(67,89,98);
		a.getPercentage();
	
		StudentsB b = new StudentsB(78,98,67,98);
		b.getPercentage();
		
		System.out.println("Avarage of Student A :" +a.getPercentage());
		System.out.println("Avarage of Student B :" +b.getPercentage());
	}

}
