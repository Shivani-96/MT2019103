
public class SimpleInstrumentFactory {
	
	public Instrument createInstrument(String subject) {
		Instrument instrument = null;
		if(subject.equalsIgnoreCase("GIS"))
			instrument = new GISInstrument();
		else if(subject.equalsIgnoreCase("DP"))
			instrument = new SoftwareArchitectureInstrument();
		else if(subject.equalsIgnoreCase("Software Testing"))
			instrument = new SoftwareTestingInstrument();
		else if(subject.equalsIgnoreCase("Network Security"))
			instrument = new NetworkSecurityInstrument();
		
		return instrument;
	}
}
