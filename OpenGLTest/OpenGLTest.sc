OpenGLTest : UGen {
	*ar { |input, gain, x, y, width=512,height=512,nVectors = 5 , path|

		var file_args = Array.with(path.size, *path.asList.collect(_.ascii));
		var input_args = [input, gain, x,y, width, height, nVectors];
		file_args.postln;
		^this.multiNew('audio', *(input_args++file_args));
	}
	checkInputs {

		^this.checkValidInputs;
	}
}
