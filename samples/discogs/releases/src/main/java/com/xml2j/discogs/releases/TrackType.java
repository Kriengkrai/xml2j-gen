package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sun Apr 15 13:02:55 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TrackType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TrackType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TrackType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TrackType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TrackType.
	 */
	static class Allocator implements TypeAllocator<TrackType> {
		/**
		 * method for getting a new instance of type TrackType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TrackType newInstance(String elementName, ComplexDataType parent) {
			return new TrackType(elementName, parent);
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
	
  	
  
	/** element item for position element. 
	 *  @serial
	 */	
	private String m_position = null;
	
	/** element item for title element. 
	 *  @serial
	 */	
	private String m_title = null;
	
	/** element item for duration element. 
	 *  @serial
	 */	
	private String m_duration = null;
	
	/** element item for artists element. 
	 *  @serial
	 */	
	private ArtistsType m_artists = null;
	
	/** element item for extraartists element. 
	 *  @serial
	 */	
	private ExtraartistsType m_extraartists = null;
	
	/**
	 * Get the embedded Position element.
	 * @return the item.
	 */
	public String getPosition() {
		return m_position;
	}
		
	/**
	 * This method sets (overwrites) the element Position.
	 * @param data the item that needs to be added.
	 */
	void setPosition(String data) {
		m_position = data;
	}
		
	/**
	 * Get the embedded Title element.
	 * @return the item.
	 */
	public String getTitle() {
		return m_title;
	}
		
	/**
	 * This method sets (overwrites) the element Title.
	 * @param data the item that needs to be added.
	 */
	void setTitle(String data) {
		m_title = data;
	}
		
	/**
	 * Get the embedded Duration element.
	 * @return the item.
	 */
	public String getDuration() {
		return m_duration;
	}
		
	/**
	 * This method sets (overwrites) the element Duration.
	 * @param data the item that needs to be added.
	 */
	void setDuration(String data) {
		m_duration = data;
	}
		
	/**
	 * Get the embedded Artists element.
	 * @return the item.
	 */
	public ArtistsType getArtists() {
		return m_artists;
	}
		
	/**
	 * This method sets (overwrites) the element Artists.
	 * @param data the item that needs to be added.
	 */
	void setArtists(ArtistsType data) {
		m_artists = data;
	}
		
	/**
	 * Get the embedded Extraartists element.
	 * @return the item.
	 */
	public ExtraartistsType getExtraartists() {
		return m_extraartists;
	}
		
	/**
	 * This method sets (overwrites) the element Extraartists.
	 * @param data the item that needs to be added.
	 */
	void setExtraartists(ExtraartistsType data) {
		m_extraartists = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TrackType t = (TrackType)that;
	 
		if (!Compare.equals(m_position, t.m_position))
			return false;
		
		if (!Compare.equals(m_title, t.m_title))
			return false;
		
		if (!Compare.equals(m_duration, t.m_duration))
			return false;
		
		if (!Compare.equals(m_artists, t.m_artists))
			return false;
		
		if (!Compare.equals(m_extraartists, t.m_extraartists))
			return false;
		
		return true;
	}	

  
  
}
