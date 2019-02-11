package com.drbhagwat.javaconfiguration.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.drbhagwat.automaticconfiguration.soundsystem.CompactDisc;

@Component
public class CDPlayer implements MediaPlayer {  
  private CompactDisc cd;
  
  public CDPlayer(CompactDisc cd) {
	this.cd = cd;
  }

  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
	return new CDPlayer(compactDisc);
  }

  @Override
  public void play() {
  }
}
