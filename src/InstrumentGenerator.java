
public class InstrumentGenerator {
	SimpleInstrumentFactory factory;
	
	public InstrumentGenerator(SimpleInstrumentFactory factory) {
		this.factory = factory;
	}
	
	public Instrument generateInstrument(String subject) {
		Instrument instrument = factory.createInstrument(subject);
		
		instrument.search();
		instrument.analyse();
		instrument.arrange();
		instrument.print();
		
		return instrument;
	}
}
