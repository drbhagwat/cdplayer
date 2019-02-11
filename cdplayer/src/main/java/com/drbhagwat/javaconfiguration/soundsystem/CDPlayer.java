package com.drbhagwat.javaconfiguration.soundsystem;

import com.drbhagwat.javaconfiguration.soundsystem.CompactDisc;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  @Override
  public void play() {
    cd.play();
  }
}
