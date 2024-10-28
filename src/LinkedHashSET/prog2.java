package LinkedHashSET;

import java.util.*;

public class prog2 {
    
    private int id;
    private String name;

    public prog2(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		prog2 other = (prog2) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
    
    @Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

    
    public String toString() {
        return "[id=" + id + ", name=" + name + "]";
    }

    
    
    public static void main(String[] args) {
        Set<prog2> s = new LinkedHashSet<>();

        s.add(new prog2(1, "Kancha"));
        s.add(new prog2(2, "China"));
        s.add(new prog2(3, "Mogamboo"));
        s.add(new prog2(4, "Kala"));
        s.add(new prog2(4, "Kala"));  // This duplicate will not be added

        for (prog2 st : s) {
            System.out.println(st);
        }
        
        System.out.println(s.size());

        prog2 search = new prog2(2, "China");
        System.out.println(s.contains(search));
        
        if (s.contains(search)) {
            System.out.println("Student Is Present In Set");
        } else {
            System.out.println("Not Present In Set");
        }
        
        System.out.println(s.remove(search));
        
        for (prog2 st : s) {
            System.out.println(st);
        }
    }
}
