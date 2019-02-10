package com.drbhagwat.cdplayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.drbhagwat.soundsystem.CDPlayerConfig;
import com.drbhagwat.soundsystem.CompactDisc;
import com.drbhagwat.soundsystem.MediaPlayer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
  
  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  
  @Inject
  private CompactDisc cd;
  
  @Autowired
  private MediaPlayer mediaPlayer;

  @Test
  public void cdShouldNotBeNull(){
	assertNotNull(cd);
  }

  @Test
  public void play(){
	mediaPlayer.play();
	assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band"+ " by The Beatles\r\n", systemOutRule.getLog());
  }
}
