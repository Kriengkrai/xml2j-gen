package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:48 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * DateAndPlaceOfBirth data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class DateAndPlaceOfBirth extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DateAndPlaceOfBirth.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DateAndPlaceOfBirth(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DateAndPlaceOfBirth.
	 */
	static class Allocator implements TypeAllocator<DateAndPlaceOfBirth> {
		/**
		 * method for getting a new instance of type DateAndPlaceOfBirth.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DateAndPlaceOfBirth newInstance(String elementName, ComplexDataType parent) {
			return new DateAndPlaceOfBirth(elementName, parent);
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
	
  	
  
	/** element item for BirthDt element. 
	 *  @serial
	 */	
	private String m_birthDt = null;
	
	/** element item for PrvcOfBirth element. 
	 *  @serial
	 */	
	private String m_prvcOfBirth = null;
	
	/** element item for CityOfBirth element. 
	 *  @serial
	 */	
	private String m_cityOfBirth = null;
	
	/** element item for CtryOfBirth element. 
	 *  @serial
	 */	
	private String m_ctryOfBirth = null;
	
	/**
	 * Get the embedded BirthDt element.
	 * @return the item.
	 */
	public String getBirthDt() {
		return m_birthDt;
	}
		
	/**
	 * This method sets (overwrites) the element BirthDt.
	 * @param data the item that needs to be added.
	 */
	void setBirthDt(String data) {
		m_birthDt = data;
	}
		
	/**
	 * Get the embedded PrvcOfBirth element.
	 * @return the item.
	 */
	public String getPrvcOfBirth() {
		return m_prvcOfBirth;
	}
		
	/**
	 * This method sets (overwrites) the element PrvcOfBirth.
	 * @param data the item that needs to be added.
	 */
	void setPrvcOfBirth(String data) {
		m_prvcOfBirth = data;
	}
		
	/**
	 * Get the embedded CityOfBirth element.
	 * @return the item.
	 */
	public String getCityOfBirth() {
		return m_cityOfBirth;
	}
		
	/**
	 * This method sets (overwrites) the element CityOfBirth.
	 * @param data the item that needs to be added.
	 */
	void setCityOfBirth(String data) {
		m_cityOfBirth = data;
	}
		
	/**
	 * Get the embedded CtryOfBirth element.
	 * @return the item.
	 */
	public String getCtryOfBirth() {
		return m_ctryOfBirth;
	}
		
	/**
	 * This method sets (overwrites) the element CtryOfBirth.
	 * @param data the item that needs to be added.
	 */
	void setCtryOfBirth(String data) {
		m_ctryOfBirth = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_birthDt, ((DateAndPlaceOfBirth)that).m_birthDt))
			return false;
		
		if (!Compare.equals(m_prvcOfBirth, ((DateAndPlaceOfBirth)that).m_prvcOfBirth))
			return false;
		
		if (!Compare.equals(m_cityOfBirth, ((DateAndPlaceOfBirth)that).m_cityOfBirth))
			return false;
		
		if (!Compare.equals(m_ctryOfBirth, ((DateAndPlaceOfBirth)that).m_ctryOfBirth))
			return false;
		
		return true;
	}	

  
  
}
