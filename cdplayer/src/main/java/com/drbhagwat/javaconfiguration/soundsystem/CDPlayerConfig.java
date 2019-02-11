package com.drbhagwat.javaconfiguration.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
  @Bean
  public CDPlayer cdPlayer() {
    return new CDPlayer(sgtPeppers());
  }
  
  @Bean
  public CompactDisc sgtPeppers() {
    return new SgtPeppers();
  }
  
}
