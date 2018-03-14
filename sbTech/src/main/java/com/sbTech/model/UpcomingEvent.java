package com.sbTech.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpcomingEvents")
@XmlAccessorType(XmlAccessType.FIELD)
public class UpcomingEvent {
	
	
//	UpcomingEvent() {
//		
//	}
	
	@XmlElement(name = "TennisEvent")
    private List<TennisEvent> tennisEvents = null;
	@XmlElement(name = "FootballEvent")
    private List<FootballEvent> footballEvents = null;
	
	public List<TennisEvent> getTennisEvents() {
		return tennisEvents;
	}
	public void setTennisEvents(List<TennisEvent> tennisEvents) {
		this.tennisEvents = tennisEvents;
	}
	public List<FootballEvent> getFootballEvents() {
		return footballEvents;
	}
	public void setFootballEvents(List<FootballEvent> footballEvents) {
		this.footballEvents = footballEvents;
	}
	
	
}
