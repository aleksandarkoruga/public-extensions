PMWave : MultiOutUGen {
	*ar { |in(0), damp(1), time(0.4), speed(0.1), cutoff(0.5), rand1(0.1), rand2(0.1), junction(0.2)  |
		/* TODO */
		^this.multiNew('audio', in, damp, time, speed, cutoff, rand1, rand2, junction);
	}
	 init { | ... theInputs |
      inputs = theInputs
      ^this.initOutputs(2, rate)
  }

}
