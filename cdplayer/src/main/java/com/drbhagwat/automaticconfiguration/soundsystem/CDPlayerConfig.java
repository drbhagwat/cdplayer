package com.drbhagwat.automaticconfiguration.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses= {com.drbhagwat.automaticconfiguration.soundsystem.CDPlayer.class})
public class CDPlayerConfig {
}
