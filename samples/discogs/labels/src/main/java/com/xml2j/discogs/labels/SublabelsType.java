package com.xml2j.discogs.labels;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: LABELS 
  Generation date: Sun Apr 15 13:02:55 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * SublabelsType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class SublabelsType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for SublabelsType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public SublabelsType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type SublabelsType.
	 */
	static class Allocator implements TypeAllocator<SublabelsType> {
		/**
		 * method for getting a new instance of type SublabelsType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public SublabelsType newInstance(String elementName, ComplexDataType parent) {
			return new SublabelsType(elementName, parent);
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
	
  	
  
	/** list of label element. 
	 *  @serial
	 */	
	private StringList m_labelList = new StringList("label");
		
	/**
	 * Get the embedded list of Label elements.
	 * @return list of items.
	 */
	public StringList getLabels() {
		return m_labelList;
	}
		
	/**
	 * This method adds data to the list of Label.
	 * @param data the item that needs to be added.
	 */
	void setLabel(String data) {
		m_labelList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	SublabelsType t = (SublabelsType)that;
	 
		if (!Compare.equals(m_labelList, t.m_labelList))
			return false;
		
		return true;
	}	

  
  
}
