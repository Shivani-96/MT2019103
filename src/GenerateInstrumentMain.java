
public class GenerateInstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInstrumentFactory factory = new SimpleInstrumentFactory();
		InstrumentGenerator generator = new InstrumentGenerator(factory);
		
		Instrument instrument = generator.generateInstrument("GIS");
		System.out.println(instrument);
		
		instrument = generator.generateInstrument("Network Security");
		System.out.println(instrument);
		
		instrument = generator.generateInstrument("Software Testing");
		System.out.println(instrument);
		
		instrument = generator.generateInstrument("DP");
		System.out.println(instrument);
	}

}
