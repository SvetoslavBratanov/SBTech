package com.sbTech.model;

public class FootballEvent extends Event {

	public FootballEvent() {

	}

	public FootballEvent(String away, String home, String eventTime) {
		super(away, home, eventTime);
		this.setType(TypeEvent.Football);
	}

}
