package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sat Apr 14 18:02:46 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TracklistType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TracklistType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TracklistType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TracklistType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TracklistType.
	 */
	static class Allocator implements TypeAllocator<TracklistType> {
		/**
		 * method for getting a new instance of type TracklistType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TracklistType newInstance(String elementName, ComplexDataType parent) {
			return new TracklistType(elementName, parent);
		}
	}
	
	/** instance of allocator class for this data class. */
	private static Allocator allocator = new Allocator();
	
	/**
	 * Get Allocator for this data class.
	 * This method is used by the handler class.
	 *
	 * @return instance of Allocator
	 */
	static public Allocator getAllocator() {
		return allocator;
	}
	
  	
  
	/** list of track element. 
	 *  @serial
	 */	
	private List<TrackType> m_trackList = new ArrayList<TrackType>();
	
	/**
	 * Get the embedded list of Track elements.
	 * @return list of items.
	 */
	public List<TrackType> getTracks() {
		return m_trackList;
	}
		
	/**
	 * This method adds data to the list of Track.
	 * @param data the item that needs to be added.
	 */
	void setTrack(TrackType data) {
		m_trackList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TracklistType t = (TracklistType)that;
	 
		if (!Compare.equals(m_trackList, t.m_trackList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from tracklistType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_trackList != null)
			for(TrackType l_track : m_trackList) {
				l_track.print(out);
			}
		else {
			// out.print("<track>null</track>");
		}
		
	}
}
