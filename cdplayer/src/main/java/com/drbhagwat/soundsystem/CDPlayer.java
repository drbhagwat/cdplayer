package com.drbhagwat.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  @Autowired
  private CompactDisc cd;
  
  public CDPlayer(CompactDisc cd) {
	this.cd = cd;
  }  

  public CompactDisc getCd() {
    return cd;
  }

  public void setCd(CompactDisc cd) {
    this.cd = cd;
  }


  @Override
  public void play() {
	cd.play();
  }
}