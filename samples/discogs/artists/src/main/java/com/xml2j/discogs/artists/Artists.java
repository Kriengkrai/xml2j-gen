package com.xml2j.discogs.artists;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: ARTISTS 
  Generation date: Mon Apr 16 18:56:35 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * Artists data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class Artists extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Artists.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public Artists(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type Artists.
	 */
	static class Allocator implements TypeAllocator<Artists> {
		/**
		 * method for getting a new instance of type Artists.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public Artists newInstance(String elementName, ComplexDataType parent) {
			return new Artists(elementName, parent);
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
	
  	
  
	/** list of artist element. 
	 *  @serial
	 */	
	private List<ArtistType> m_artistList = new ArrayList<ArtistType>();
	
	/**
	 * Get the embedded list of Artist elements.
	 * @return list of items.
	 */
	public List<ArtistType> getArtists() {
		return m_artistList;
	}
		
	/**
	 * This method adds data to the list of Artist.
	 * @param data the item that needs to be added.
	 */
	void setArtist(ArtistType data) {
		m_artistList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	Artists t = (Artists)that;
	 
		if (!Compare.equals(m_artistList, t.m_artistList))
			return false;
		
		return true;
	}	

  
  
}
