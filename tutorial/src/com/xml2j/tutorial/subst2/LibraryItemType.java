package com.xml2j.tutorial.subst2;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SUBST2 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * LibraryItemType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class LibraryItemType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for LibraryItemType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public LibraryItemType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type LibraryItemType.
	 */
	static class Allocator implements TypeAllocator<LibraryItemType> {
		/**
		 * method for getting a new instance of type LibraryItemType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public LibraryItemType newInstance(String elementName, ComplexDataType parent) {
			return new LibraryItemType(elementName, parent);
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
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_id, ((LibraryItemType)that).m_id))
			return false;
		
		return true;
	}	

  
  
}
