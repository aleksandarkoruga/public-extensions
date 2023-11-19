RubberBandBuiltIn : UGen {
	*ar { |input, pitch, time, phase, step|
		/* TODO */
		^this.multiNew('audio', input, pitch, time, phase, step);
	}
	checkInputs {
		/* TODO */
		^this.checkValidInputs;
	}
}
