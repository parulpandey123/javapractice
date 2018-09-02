package music_synthesizer;

import java.util.ArrayList;
import java.util.List;

public class PhysicalTune implements Tunes{
	
	List<TuneElement> tuneElements = new ArrayList<TuneElement>();

	@Override
	public void addTuneElement(TuneElement tuneElement) {
		
		this.tuneElements.add(tuneElement);
	}

	@Override
	public void transpose(int interval) {
		
		for (TuneElement tuneElement : tuneElements) {
			tuneElement.note.noteName = tuneElement.note.shiftNode(interval);
		}
		
	} 

	@Override
	public String toString() {
	
		String tune = new String("");
		
		for (TuneElement tuneElement : tuneElements) {
			tune = tune + tuneElement.note.noteName + 
					(new Integer(tuneElement.note.noteOctave).toString()) + 
					tuneElement.note.value;
		}
		
		return tune;
	}
}
