
public class Instrument {
	String name;
	int easy;
	int moderate;
	int difficult;
	
	public String getName() {
		return name;
	}
	
	public void search() {
		System.out.println("Searching for items of "+name);
	}
	
	public void analyse() {
		System.out.println("Analizing items of "+name);
	}
	
	public void arrange() {
		System.out.println("Arranging items for "+name);
	}
	
	public void print() {
		System.out.println("Printing instrument for "+name);
	}

	@Override
	public String toString() {
		return "Instrument [name=" + name + ", easy=" + easy + ", moderate=" + moderate + ", difficult=" + difficult
				+ "]";
	}
	
	
}
