package com.xml2j.tutorial.seq3;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SEQ3 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * NameType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class NameType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for NameType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public NameType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type NameType.
	 */
	static class Allocator implements TypeAllocator<NameType> {
		/**
		 * method for getting a new instance of type NameType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public NameType newInstance(String elementName, ComplexDataType parent) {
			return new NameType(elementName, parent);
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
	
  	
  
	/** element item for firstName element. 
	 *  @serial
	 */	
	private String m_firstName = null;
	
	/** element item for middleName element. 
	 *  @serial
	 */	
	private String m_middleName = null;
	
	/** element item for lastName element. 
	 *  @serial
	 */	
	private String m_lastName = null;
	
	/**
	 * Get the embedded FirstName element.
	 * @return the item.
	 */
	public String getFirstName() {
		return m_firstName;
	}
		
	/**
	 * This method sets (overwrites) the element FirstName.
	 * @param data the item that needs to be added.
	 */
	void setFirstName(String data) {
		m_firstName = data;
	}
		
	/**
	 * Get the embedded MiddleName element.
	 * @return the item.
	 */
	public String getMiddleName() {
		return m_middleName;
	}
		
	/**
	 * This method sets (overwrites) the element MiddleName.
	 * @param data the item that needs to be added.
	 */
	void setMiddleName(String data) {
		m_middleName = data;
	}
		
	/**
	 * Get the embedded LastName element.
	 * @return the item.
	 */
	public String getLastName() {
		return m_lastName;
	}
		
	/**
	 * This method sets (overwrites) the element LastName.
	 * @param data the item that needs to be added.
	 */
	void setLastName(String data) {
		m_lastName = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_firstName, ((NameType)that).m_firstName))
			return false;
		
		if (!Compare.equals(m_middleName, ((NameType)that).m_middleName))
			return false;
		
		if (!Compare.equals(m_lastName, ((NameType)that).m_lastName))
			return false;
		
		return true;
	}	

  
  
}
