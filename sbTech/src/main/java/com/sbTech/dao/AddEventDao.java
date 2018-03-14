package com.sbTech.dao;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sbTech.db_connection.DBConnection;
import com.sbTech.model.TennisEvent;
import com.sbTech.model.UpcomingEvent;

public class AddEventDao {
	
	
	private static final String INSERT_EVENT_SQL = "INSERT INTO events(away,home,EventTime,Type) VALUES (?,?,?,?);";
	
	public void addEvent() throws JAXBException, SQLException {
	
		Connection connection = DBConnection.getInstance().getConnection();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(INSERT_EVENT_SQL, Statement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(UpcomingEvent.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	     
	    //unmarshalling example
	    UpcomingEvent tennisEvents = (UpcomingEvent) jaxbUnmarshaller.unmarshal(new File("C:\\Users\\User\\Desktop\\SBTech\\UpcomingEvents.xml"));
	     
	    for(TennisEvent tennisEvent : tennisEvents.getTennisEvents())
	    {	
	    	try {
				ps.setString(1, tennisEvent.getAway());
				ps.setString(2, tennisEvent.getHome());
				ps.setString(3, tennisEvent.getEventTime());
				ps.setString(4, tennisEvent.getType());
				ps.executeUpdate();
				
			} catch (SQLException e) {
				throw e;
			}
	    }
	}
}
