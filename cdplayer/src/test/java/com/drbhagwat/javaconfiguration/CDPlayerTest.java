package com.drbhagwat.javaconfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.drbhagwat.javaconfiguration.soundsystem.CDPlayerConfig;
import com.drbhagwat.javaconfiguration.soundsystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  private CDPlayerConfig cdPlayerConfig = new CDPlayerConfig();

  @Autowired
  private MediaPlayer mediaPlayer;

  @Test
  public void cdShouldNotBeNull() {
    assertNotNull(cdPlayerConfig.cdPlayer());
  }

  @Test
  public void play() {
    mediaPlayer.play();
    assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles\r\n", systemOutRule.getLog());
  }

}
