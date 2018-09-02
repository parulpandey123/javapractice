package music_synthesizer;

public abstract class TuneDecorator implements Tunes{
	
	protected Tunes tune;
	
	public TuneDecorator(Tunes tunes) {
		this.tune = tunes;
		
	}
	
	public void addTuneElement(TuneElement tuneElement) {
		
		tune.addTuneElement(tuneElement);
		
	}
	public void transpose(int interval) {
		
		tune.transpose(interval);
		
	
	}

}
