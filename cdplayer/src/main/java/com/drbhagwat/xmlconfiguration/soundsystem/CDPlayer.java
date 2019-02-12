package com.drbhagwat.xmlconfiguration.soundsystem;

import com.drbhagwat.xmlconfiguration.soundsystem.CompactDisc;

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
