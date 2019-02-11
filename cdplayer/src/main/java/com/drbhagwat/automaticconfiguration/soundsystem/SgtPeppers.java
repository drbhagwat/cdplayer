package com.drbhagwat.automaticconfiguration.soundsystem;

import javax.inject.Named;

import org.springframework.beans.factory.BeanNameAware;

@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc, BeanNameAware {
  
  private String title = "Sgt. Pepper's Lonely Hearts Club Band";
  private String artist = "The Beatles";

  @Override
  public void play() {
	System.out.println("Playing " + title + " by " + artist);
  }

  @Override
  public void setBeanName(String beanName) {
	System.out.println("Bean Name is " + beanName);
  }

}
