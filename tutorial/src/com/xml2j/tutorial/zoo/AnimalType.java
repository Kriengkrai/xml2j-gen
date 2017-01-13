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

import com.xml2j.xml.core.TypeAllocator;



/**
 * AnimalType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class AnimalType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AnimalType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public AnimalType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type AnimalType.
	 */
	static class Allocator implements TypeAllocator<AnimalType> {
		/**
		 * method for getting a new instance of type AnimalType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AnimalType newInstance(String elementName, ComplexDataType parent) {
			return new AnimalType(elementName, parent);
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
	
  	
  
	/** element item for sex element. 
	 *  @serial
	 */	
	private String m_sex = null;
	
	/** element item for age element. 
	 *  @serial
	 */	
	private AgeType m_age = null;
	
	/**
	 * Get the embedded Sex element.
	 * @return the item.
	 */
	public String getSex() {
		return m_sex;
	}
		
	/**
	 * This method sets (overwrites) the element Sex.
	 * @param data the item that needs to be added.
	 */
	void setSex(String data) {
		m_sex = data;
	}
		
	/**
	 * Get the embedded Age element.
	 * @return the item.
	 */
	public AgeType getAge() {
		return m_age;
	}
		
	/**
	 * This method sets (overwrites) the element Age.
	 * @param data the item that needs to be added.
	 */
	void setAge(AgeType data) {
		m_age = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_sex, ((AnimalType)that).m_sex))
			return false;
		
		if (!Compare.equals(m_age, ((AnimalType)that).m_age))
			return false;
		
		return true;
	}	

  
  
}
