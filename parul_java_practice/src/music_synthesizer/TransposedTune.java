package music_synthesizer;

import java.util.List;

public class TransposedTune implements Tunes {

	List<TuneElement> tuneElements;

	@Override
	public void addTuneElement(TuneElement tuneElement) {
		this.tuneElements.add(tuneElement);
		
	}

	@Override
	public void transpose(int interval) {
		// TODO Auto-generated method stub
	}

}
