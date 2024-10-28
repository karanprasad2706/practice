package class_objects;

public class Constructor {

	int id,age;
	String name,contact,blood_group,address,DOB;
	
	Constructor()
	{
		System.out.println("\t\tInfomation of Student\n ");
	}
	
	Constructor(int id,String name,int age,String contact,String blood_group,String address,String DOB)
	{
		this();
		this.id= id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.blood_group = blood_group;
		this.address = address;
		this.DOB = DOB;
		
	}

	public String toString() {
		return "id=" + id + ",\nname=" + name + ", \nage =" +age +", \ncontact=" + contact + ", \nBlood Group="
				+ blood_group + ", \naddress=" + address + ", \nDOB=" + DOB ;
	}
	
	public static void main(String[] args)
	{
		Constructor em = new Constructor(11,"Karan",21,"83772882633","A+","Kalyan","27/06/2003");
		System.out.println(em);
	}
}

