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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ArtistType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ArtistType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ArtistType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ArtistType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ArtistType.
	 */
	static class Allocator implements TypeAllocator<ArtistType> {
		/**
		 * method for getting a new instance of type ArtistType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ArtistType newInstance(String elementName, ComplexDataType parent) {
			return new ArtistType(elementName, parent);
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
	
  	
  
	/** element item for id element. 
	 *  @serial
	 */	
	private String m_id = null;
	
	/** element item for name element. 
	 *  @serial
	 */	
	private String m_name = null;
	
	/** element item for anv element. 
	 *  @serial
	 */	
	private String m_anv = null;
	
	/** element item for join element. 
	 *  @serial
	 */	
	private String m_join = null;
	
	/** element item for role element. 
	 *  @serial
	 */	
	private String m_role = null;
	
	/** element item for tracks element. 
	 *  @serial
	 */	
	private String m_tracks = null;
	
	/**
	 * Get the embedded Id element.
	 * @return the item.
	 */
	public String getId() {
		return m_id;
	}
		
	/**
	 * This method sets (overwrites) the element Id.
	 * @param data the item that needs to be added.
	 */
	void setId(String data) {
		m_id = data;
	}
		
	/**
	 * Get the embedded Name element.
	 * @return the item.
	 */
	public String getName() {
		return m_name;
	}
		
	/**
	 * This method sets (overwrites) the element Name.
	 * @param data the item that needs to be added.
	 */
	void setName(String data) {
		m_name = data;
	}
		
	/**
	 * Get the embedded Anv element.
	 * @return the item.
	 */
	public String getAnv() {
		return m_anv;
	}
		
	/**
	 * This method sets (overwrites) the element Anv.
	 * @param data the item that needs to be added.
	 */
	void setAnv(String data) {
		m_anv = data;
	}
		
	/**
	 * Get the embedded Join element.
	 * @return the item.
	 */
	public String getJoin() {
		return m_join;
	}
		
	/**
	 * This method sets (overwrites) the element Join.
	 * @param data the item that needs to be added.
	 */
	void setJoin(String data) {
		m_join = data;
	}
		
	/**
	 * Get the embedded Role element.
	 * @return the item.
	 */
	public String getRole() {
		return m_role;
	}
		
	/**
	 * This method sets (overwrites) the element Role.
	 * @param data the item that needs to be added.
	 */
	void setRole(String data) {
		m_role = data;
	}
		
	/**
	 * Get the embedded Tracks element.
	 * @return the item.
	 */
	public String getTracks() {
		return m_tracks;
	}
		
	/**
	 * This method sets (overwrites) the element Tracks.
	 * @param data the item that needs to be added.
	 */
	void setTracks(String data) {
		m_tracks = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ArtistType t = (ArtistType)that;
	 
		if (!Compare.equals(m_id, t.m_id))
			return false;
		
		if (!Compare.equals(m_name, t.m_name))
			return false;
		
		if (!Compare.equals(m_anv, t.m_anv))
			return false;
		
		if (!Compare.equals(m_join, t.m_join))
			return false;
		
		if (!Compare.equals(m_role, t.m_role))
			return false;
		
		if (!Compare.equals(m_tracks, t.m_tracks))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from artistType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_id != null) {
			out.print("\n<id>");
			out.print(m_id);
			out.print("</id>\n");
		}
		
		if (m_name != null) {
			out.print("\n<name>");
			out.print(m_name);
			out.print("</name>\n");
		}
		
		if (m_anv != null) {
			out.print("\n<anv>");
			out.print(m_anv);
			out.print("</anv>\n");
		}
		
		if (m_join != null) {
			out.print("\n<join>");
			out.print(m_join);
			out.print("</join>\n");
		}
		
		if (m_role != null) {
			out.print("\n<role>");
			out.print(m_role);
			out.print("</role>\n");
		}
		
		if (m_tracks != null) {
			out.print("\n<tracks>");
			out.print(m_tracks);
			out.print("</tracks>\n");
		}
		
	}
}
