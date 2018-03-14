package com.sbTech.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class Event {

	private String away;
	private String home;
	private String eventTime;
	private int id;
	private TypeEvent type;	
	
	@XmlElement(name = "Market")
    private List<Market> markets = null;
	
	public Event() {
		
	}
	public Event(String away, String home, String eventTime) {
		super();
		this.away = away;
		this.home = home;
		this.eventTime = eventTime;
	}
	@XmlTransient
	public List<Market> getMarkets() {
		return this.markets;
	}

	public void setMarkets(List<Market> markets) {
		this.markets = markets;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getAway() {
		return away;
	}

	public void setAway(String away) {
		this.away = away;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type.toString();
	}

	public void setType(TypeEvent type) {
		this.type = type;
	}
}


