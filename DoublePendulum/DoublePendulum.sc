// without mul and add.
DoublePendulum : MultiOutUGen  {
	*ar { arg m1(1.0), m2(1.0), l1(1.0), l2(1.0), k(0.0), t(1.0/44100.0), freq(1.0), d=(1.0);
        ^this.multiNew('audio', m1, m2, l1, l2, k, t, freq, d);
    }

	  init { | ... theInputs |
      inputs = theInputs
      ^this.initOutputs(4, rate)
  }


}