package com.drbhagwat.xmlconfiguration.soundsystem;

import java.util.List;

public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	private List<String> tracks = null;

	public SgtPeppers(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public SgtPeppers() {
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		
		for (String track : tracks) {
			System.out.println("-Track " + track);
		}
	}
}
