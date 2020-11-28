package template;

public class InstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GISInstrument gisInstrument = new GISInstrument();
		NSInstrument nsInstrument = new NSInstrument();
		STInstrument stInstrument = new STInstrument();
		SAInstrument saInstrument = new SAInstrument();
		
		gisInstrument.prepareInstrument();
		nsInstrument.prepareInstrument();
		stInstrument.prepareInstrument();
		saInstrument.prepareInstrument();
	}

}
