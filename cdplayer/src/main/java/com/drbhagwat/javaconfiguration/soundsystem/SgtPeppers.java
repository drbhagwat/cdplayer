package com.drbhagwat.javaconfiguration.soundsystem;

import org.springframework.context.annotation.Bean;

public class SgtPeppers implements CompactDisc {
  private String title = "Sgt. Pepper's Lonely Hearts Club Band";
  private String artist = "The Beatles";

  @Override
  public void play() {
	System.out.println("Playing " + title + " by " + artist);
  }

  @Bean
  public CompactDisc sgtPeppers() {
	return new SgtPeppers();
  }
}
