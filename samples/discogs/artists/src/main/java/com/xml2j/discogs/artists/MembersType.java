package com.xml2j.discogs.artists;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: ARTISTS 
  Generation date: Sun Apr 15 13:02:55 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * MembersType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class MembersType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for MembersType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public MembersType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type MembersType.
	 */
	static class Allocator implements TypeAllocator<MembersType> {
		/**
		 * method for getting a new instance of type MembersType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public MembersType newInstance(String elementName, ComplexDataType parent) {
			return new MembersType(elementName, parent);
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
	
  	
  
	/** list of id element. 
	 *  @serial
	 */	
	private StringList m_idList = new StringList("id");
	
	/** list of name element. 
	 *  @serial
	 */	
	private StringList m_nameList = new StringList("name");
		
	/**
	 * Get the embedded list of Id elements.
	 * @return list of items.
	 */
	public StringList getIds() {
		return m_idList;
	}
		
	/**
	 * This method adds data to the list of Id.
	 * @param data the item that needs to be added.
	 */
	void setId(String data) {
		m_idList.add(data);
	}
			
	/**
	 * Get the embedded list of Name elements.
	 * @return list of items.
	 */
	public StringList getNames() {
		return m_nameList;
	}
		
	/**
	 * This method adds data to the list of Name.
	 * @param data the item that needs to be added.
	 */
	void setName(String data) {
		m_nameList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	MembersType t = (MembersType)that;
	 
		if (!Compare.equals(m_idList, t.m_idList))
			return false;
		
		if (!Compare.equals(m_nameList, t.m_nameList))
			return false;
		
		return true;
	}	

  
  
}
