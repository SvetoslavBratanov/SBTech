package com.sbTech.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TennisEvent")
@XmlAccessorType (XmlAccessType.FIELD)
public class TennisEvent extends Event{
	
	
	public TennisEvent() {
		super();
	}
	
	public TennisEvent(String away, String home, String eventTime) {
		super(away, home, eventTime);
		this.setType(TypeEvent.Tennis);
	}

	
	
	
}
