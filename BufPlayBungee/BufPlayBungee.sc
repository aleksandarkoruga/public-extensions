// without mul and add.
BufPlayBungee : UGen {
    *ar { arg bufNum, speed = 1 ,pitch = 1.0, position = 0, trigPos=0;
        ^this.multiNew('audio', bufNum, speed, pitch, position, trigPos );
    }
}