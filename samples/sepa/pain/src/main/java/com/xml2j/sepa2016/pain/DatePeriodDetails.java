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
 * DatePeriodDetails data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class DatePeriodDetails extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DatePeriodDetails.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DatePeriodDetails(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DatePeriodDetails.
	 */
	static class Allocator implements TypeAllocator<DatePeriodDetails> {
		/**
		 * method for getting a new instance of type DatePeriodDetails.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DatePeriodDetails newInstance(String elementName, ComplexDataType parent) {
			return new DatePeriodDetails(elementName, parent);
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
	
  	
  
	/** element item for FrDt element. 
	 *  @serial
	 */	
	private String m_frDt = null;
	
	/** element item for ToDt element. 
	 *  @serial
	 */	
	private String m_toDt = null;
	
	/**
	 * Get the embedded FrDt element.
	 * @return the item.
	 */
	public String getFrDt() {
		return m_frDt;
	}
		
	/**
	 * This method sets (overwrites) the element FrDt.
	 * @param data the item that needs to be added.
	 */
	void setFrDt(String data) {
		m_frDt = data;
	}
		
	/**
	 * Get the embedded ToDt element.
	 * @return the item.
	 */
	public String getToDt() {
		return m_toDt;
	}
		
	/**
	 * This method sets (overwrites) the element ToDt.
	 * @param data the item that needs to be added.
	 */
	void setToDt(String data) {
		m_toDt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_frDt, ((DatePeriodDetails)that).m_frDt))
			return false;
		
		if (!Compare.equals(m_toDt, ((DatePeriodDetails)that).m_toDt))
			return false;
		
		return true;
	}	

  
  
}
