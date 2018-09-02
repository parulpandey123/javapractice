package music_synthesizer;

import java.util.Arrays;
import java.util.List;

public class Note {
	
	public String noteName;
	public int noteOctave;
	public String value; 
	
	private static List<String> noteSequence = Arrays.asList("C", "C#", "D", "D#", "E", "F",
																"F#", "G", "G#", "A", "A#", "B");

	public Note(String noteName, int noteOctave, String value) {
		this.noteName = noteName;
		this.noteOctave = noteOctave;
		this.value = value;
	}
	
	public void transposeNote(int interval){
		
		
	}
	
	private static List<String> noteValues = Arrays.asList("");


	public String shiftNode(int interval){

		if(noteSequence.indexOf(noteName)+ interval > noteSequence.size()){
			return noteSequence.get((noteSequence.indexOf(noteName)+ interval) - 
					(noteSequence.size()));
		}
		return noteSequence.get(noteSequence.indexOf(noteName)+ interval);
	}
}
