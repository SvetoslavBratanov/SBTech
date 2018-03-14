package com.sbTech.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "employee")
@XmlAccessorType (XmlAccessType.FIELD)
public class Selection {
	
//	@XmlElement(name="ID")
	private int id;
//	@XmlElement(name="Number")
	private int number;
//	@XmlElement(name="Participant")
	private String participant;
//	@XmlElement(name="OddsDecimal")
	private String oddsDecimal;
//	@XmlElement(name="Description")
	private String description;
	private int marketId;
	
	public Selection() {
		
	}
	
	public Selection(int number, String participant, String oddsDecimal, String description, int marketId) {
		super();
		this.number = number;
		this.participant = participant;
		this.oddsDecimal = oddsDecimal;
		this.description = description;
		this.marketId = marketId;
	}

	public int getId() {
		return id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getParticipant() {
		return participant;
	}

	public void setParticipant(String participant) {
		this.participant = participant;
	}

	public String getOddsDecimal() {
		return oddsDecimal;
	}

	public void setOddsDecimal(String oddsDecimal) {
		this.oddsDecimal = oddsDecimal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMarketId() {
		return marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public void setId(int id) {
		this.id = id;
	}
}
