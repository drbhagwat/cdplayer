package com.drbhagwat.automaticconfiguration.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages= {"com.drbhagwat.soundsystem"})
@ComponentScan(basePackageClasses= {com.drbhagwat.javaconfiguration.soundsystem.CDPlayer.class})

public class CDPlayerConfig {
}
