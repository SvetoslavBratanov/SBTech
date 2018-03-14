package com.sbTech.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

//@XmlRootElement(name = "Market")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Market {

//	@XmlElement(name="ID")
	private int id;
//	@XmlElement(name="Name")
	private String name;
//	@XmlElement(name="Number")
	private int number;
	private int eventId;

	@XmlElement(name = "Selection")
	private List<Selection> selections = null;
	
	public Market() {
		
	}

	public Market(String name, int number, int eventId) {
		super();
		this.name = name;
		this.number = number;
		this.eventId = eventId;
	}
	
	@XmlTransient
	public List<Selection> getSelections() {
		return selections;
	}

	public void setSelections(List<Selection> selections) {
		this.selections = selections;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getEventId() {
		return eventId;
	}

}
