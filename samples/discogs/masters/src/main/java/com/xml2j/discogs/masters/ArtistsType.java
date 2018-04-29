package com.xml2j.discogs.masters;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS 
  Generation date: Mon Apr 16 18:56:35 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ArtistsType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ArtistsType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ArtistsType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ArtistsType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ArtistsType.
	 */
	static class Allocator implements TypeAllocator<ArtistsType> {
		/**
		 * method for getting a new instance of type ArtistsType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ArtistsType newInstance(String elementName, ComplexDataType parent) {
			return new ArtistsType(elementName, parent);
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
      
	 	ArtistsType t = (ArtistsType)that;
	 
		if (!Compare.equals(m_artistList, t.m_artistList))
			return false;
		
		return true;
	}	

  
  
}