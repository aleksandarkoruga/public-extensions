FBNeuron : UGen {
	*ar { |variation, frequency, spread, modulation, crossfade|
		/* TODO */
		^this.multiNew('audio', variation, frequency, spread, modulation.clip(0.0,1.0), crossfade.clip(0.0,1.0));
	}
	checkInputs {
		/* TODO */
		^this.checkValidInputs;
	}
}
