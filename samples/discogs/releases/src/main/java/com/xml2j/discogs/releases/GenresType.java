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

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * GenresType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class GenresType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for GenresType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public GenresType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type GenresType.
	 */
	static class Allocator implements TypeAllocator<GenresType> {
		/**
		 * method for getting a new instance of type GenresType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public GenresType newInstance(String elementName, ComplexDataType parent) {
			return new GenresType(elementName, parent);
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
	
  	
  
	/** list of genre element. 
	 *  @serial
	 */	
	private StringList m_genreList = new StringList("genre");
		
	/**
	 * Get the embedded list of Genre elements.
	 * @return list of items.
	 */
	public StringList getGenres() {
		return m_genreList;
	}
		
	/**
	 * This method adds data to the list of Genre.
	 * @param data the item that needs to be added.
	 */
	void setGenre(String data) {
		m_genreList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	GenresType t = (GenresType)that;
	 
		if (!Compare.equals(m_genreList, t.m_genreList))
			return false;
		
		return true;
	}	

  
  
}
