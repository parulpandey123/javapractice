package music_synthesizer;

import java.beans.FeatureDescriptor;

public class Synthesizer {
	
	public static void main(String[] args)throws java.lang.Exception {
		
		Tunes frereJaques = new PhysicalTune();
		
		//Tunes frereJaques  = new PhysicalTuneDecorator(new PhysicalTune());
		
		//Tunes transposedfrereJaques = new PhysicalTuneDecorator(new TransposedTune());
		
		Tunes transposedfrereJaques = frereJaques;
		
				
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER )));
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.D, 4, NoteValue.QUARTER )));
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER )));
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER )));
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER )));
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.D, 4, NoteValue.QUARTER )));
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER )));
		frereJaques .addTuneElement(new TuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER )));
		
		/*newTune.addTuneElement(tuneElement);
		physicalTune.addTuneElement(tuneElement);
		composedTune.addTuneElement(tuneElement);*/
		
		 System.out.println("The tune is            " + frereJaques.toString());
	
		 transposedfrereJaques.transpose(1);
		 
		 System.out.println("The transposed tune is " + frereJaques.toString());
	}

}
