
WarpP : MultiOutUGen {
	*ar	{ arg numChannels = 1, bufnum = 0, pointer = 0, freqScale = 1,
		windowSize = 0.2, envbufnum = -1, overlaps = 8, windowRandRatio = 0.0, interp = 1, prob = 1,
		mul = 1, add = 0;
		^this.multiNew('audio', numChannels, bufnum, pointer, freqScale,
			windowSize, envbufnum, overlaps, windowRandRatio, interp, prob).madd(mul, add)
	}

	init { arg argNumChannels ... theInputs;
		inputs = theInputs;
		^this.initOutputs(argNumChannels, rate)
	}

	argNamesInputsOffset { ^2 }

}