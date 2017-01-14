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
 * TaxPeriod1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class TaxPeriod1 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxPeriod1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxPeriod1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxPeriod1.
	 */
	static class Allocator implements TypeAllocator<TaxPeriod1> {
		/**
		 * method for getting a new instance of type TaxPeriod1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxPeriod1 newInstance(String elementName, ComplexDataType parent) {
			return new TaxPeriod1(elementName, parent);
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
	
  	
  
	/** element item for Yr element. 
	 *  @serial
	 */	
	private String m_yr = null;
	
	/** element item for Tp element. 
	 *  @serial
	 */	
	private String m_tp = null;
	
	/** element item for FrToDt element. 
	 *  @serial
	 */	
	private DatePeriodDetails m_frToDt = null;
	
	/**
	 * Get the embedded Yr element.
	 * @return the item.
	 */
	public String getYr() {
		return m_yr;
	}
		
	/**
	 * This method sets (overwrites) the element Yr.
	 * @param data the item that needs to be added.
	 */
	void setYr(String data) {
		m_yr = data;
	}
		
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public String getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(String data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded FrToDt element.
	 * @return the item.
	 */
	public DatePeriodDetails getFrToDt() {
		return m_frToDt;
	}
		
	/**
	 * This method sets (overwrites) the element FrToDt.
	 * @param data the item that needs to be added.
	 */
	void setFrToDt(DatePeriodDetails data) {
		m_frToDt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_yr, ((TaxPeriod1)that).m_yr))
			return false;
		
		if (!Compare.equals(m_tp, ((TaxPeriod1)that).m_tp))
			return false;
		
		if (!Compare.equals(m_frToDt, ((TaxPeriod1)that).m_frToDt))
			return false;
		
		return true;
	}	

  
  
}
