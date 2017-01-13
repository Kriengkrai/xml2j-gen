package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: ZOO 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;



/**
 * BirdType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class BirdType extends AnimalType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for BirdType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BirdType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BirdType.
	 */
	static class Allocator extends AnimalType.Allocator {
		/**
		 * method for getting a new instance of type BirdType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AnimalType newInstance(String elementName, ComplexDataType parent) {
			return new BirdType(elementName, parent);
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
	
  	
  
	/** element item for incubation element. 
	 *  @serial
	 */	
	private IncubationType m_incubation = null;
	
	/** element item for name element. 
	 *  @serial
	 */	
	private String m_name = null;
	
	/**
	 * Get the embedded Incubation element.
	 * @return the item.
	 */
	public IncubationType getIncubation() {
		return m_incubation;
	}
		
	/**
	 * This method sets (overwrites) the element Incubation.
	 * @param data the item that needs to be added.
	 */
	void setIncubation(IncubationType data) {
		m_incubation = data;
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
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_incubation, ((BirdType)that).m_incubation))
			return false;
		
		if (!Compare.equals(m_name, ((BirdType)that).m_name))
			return false;
		
		return true;
	}	

  
  
}
