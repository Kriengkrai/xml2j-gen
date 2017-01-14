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
 * ReferredDocumentType4 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ReferredDocumentType4 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ReferredDocumentType4.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ReferredDocumentType4(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ReferredDocumentType4.
	 */
	static class Allocator implements TypeAllocator<ReferredDocumentType4> {
		/**
		 * method for getting a new instance of type ReferredDocumentType4.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ReferredDocumentType4 newInstance(String elementName, ComplexDataType parent) {
			return new ReferredDocumentType4(elementName, parent);
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
	
  	
  
	/** element item for CdOrPrtry element. 
	 *  @serial
	 */	
	private ReferredDocumentType3Choice m_cdOrPrtry = null;
	
	/** element item for Issr element. 
	 *  @serial
	 */	
	private String m_issr = null;
	
	/**
	 * Get the embedded CdOrPrtry element.
	 * @return the item.
	 */
	public ReferredDocumentType3Choice getCdOrPrtry() {
		return m_cdOrPrtry;
	}
		
	/**
	 * This method sets (overwrites) the element CdOrPrtry.
	 * @param data the item that needs to be added.
	 */
	void setCdOrPrtry(ReferredDocumentType3Choice data) {
		m_cdOrPrtry = data;
	}
		
	/**
	 * Get the embedded Issr element.
	 * @return the item.
	 */
	public String getIssr() {
		return m_issr;
	}
		
	/**
	 * This method sets (overwrites) the element Issr.
	 * @param data the item that needs to be added.
	 */
	void setIssr(String data) {
		m_issr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_cdOrPrtry, ((ReferredDocumentType4)that).m_cdOrPrtry))
			return false;
		
		if (!Compare.equals(m_issr, ((ReferredDocumentType4)that).m_issr))
			return false;
		
		return true;
	}	

  
  
}
