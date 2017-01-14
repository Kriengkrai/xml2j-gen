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
 * RegulatoryAuthority2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class RegulatoryAuthority2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for RegulatoryAuthority2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public RegulatoryAuthority2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type RegulatoryAuthority2.
	 */
	static class Allocator implements TypeAllocator<RegulatoryAuthority2> {
		/**
		 * method for getting a new instance of type RegulatoryAuthority2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public RegulatoryAuthority2 newInstance(String elementName, ComplexDataType parent) {
			return new RegulatoryAuthority2(elementName, parent);
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
	
  	
  
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/** element item for Ctry element. 
	 *  @serial
	 */	
	private String m_ctry = null;
	
	/**
	 * Get the embedded Nm element.
	 * @return the item.
	 */
	public String getNm() {
		return m_nm;
	}
		
	/**
	 * This method sets (overwrites) the element Nm.
	 * @param data the item that needs to be added.
	 */
	void setNm(String data) {
		m_nm = data;
	}
		
	/**
	 * Get the embedded Ctry element.
	 * @return the item.
	 */
	public String getCtry() {
		return m_ctry;
	}
		
	/**
	 * This method sets (overwrites) the element Ctry.
	 * @param data the item that needs to be added.
	 */
	void setCtry(String data) {
		m_ctry = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_nm, ((RegulatoryAuthority2)that).m_nm))
			return false;
		
		if (!Compare.equals(m_ctry, ((RegulatoryAuthority2)that).m_ctry))
			return false;
		
		return true;
	}	

  
  
}
