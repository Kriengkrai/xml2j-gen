package com.xml2j.tutorial.choice;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: CHOICE 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * BType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class BType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for BType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BType.
	 */
	static class Allocator implements TypeAllocator<BType> {
		/**
		 * method for getting a new instance of type BType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public BType newInstance(String elementName, ComplexDataType parent) {
			return new BType(elementName, parent);
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
	
  	
  
	/** element item for childOfB element. 
	 *  @serial
	 */	
	private String m_childOfB = null;
	
	/**
	 * Get the embedded ChildOfB element.
	 * @return the item.
	 */
	public String getChildOfB() {
		return m_childOfB;
	}
		
	/**
	 * This method sets (overwrites) the element ChildOfB.
	 * @param data the item that needs to be added.
	 */
	void setChildOfB(String data) {
		m_childOfB = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_childOfB, ((BType)that).m_childOfB))
			return false;
		
		return true;
	}	

  
  
}
