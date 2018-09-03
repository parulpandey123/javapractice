package music_synthesizer;

import java.util.Arrays;
import java.util.List;

public class NoteName {
	
	
	/*enum NoteName {
	C("C"),
	CSHARP("C#"),
	D("D"),
	DSHARP("D#"),
	E("E"),
	F("F"),
	FSHARP("F#"),
	G("G"),
	GSHARP("G#"),
	A("A"),
	ASHARP("A#"),
	B("B");
	
	private final String representation;
	NoteName(String representation) {
		this.representation = representation;
	}
	
	private String representation() {
		return representation;
	}
	
	public String toString() {
		return representation;
	}
}

enum NoteValue {
	WHOLE("1"),
	HALF("1/2"),
	QUARTER("1/4"),
	EIGHTH("1/8"),
	SIXTEENTH("1/16");
	
	private final String representation;
	NoteValue(String representation) {
		this.representation = representation;
	}
	
	private String representation() {
		return representation;
	}
	
	public String toString() {
		return representation;
	}
}
*/

	private static List<String> noteSequence = Arrays.asList("C", "C#", "D", "D#", "E", "F",
												"F#", "G", "G#", "A", "A#", "B");

	public static final String C = "C";
	public static final String CHash  = "C#";
	public static final String D = "D";
	public static final String DHash = "D#";
	public static final String E = "E";
	public static final String F = "F";
	public static final String FHash = "F#";
	public static final String G = "G";
	public static final String GHash = "G#";
	public static final String A = "A";
	public static final String AHash = "A#";
	public static final String B = "B";
	
}
