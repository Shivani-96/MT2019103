package template;

public abstract class Instrument {
	
	final void prepareInstrument() {
		search();
		analyse();
		arrange();
		print();
	}
	
	abstract void arrange();
	
	void search() {
		System.out.println("Searching for questions");
	}
	
	void analyse() {
		System.out.println("Analysing difficulties of each item");
	}
	
	void print() {
		System.out.println("Printing assessment instrument");
	}
}
