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
 * RemittanceLocationDetails1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class RemittanceLocationDetails1 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for RemittanceLocationDetails1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public RemittanceLocationDetails1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type RemittanceLocationDetails1.
	 */
	static class Allocator implements TypeAllocator<RemittanceLocationDetails1> {
		/**
		 * method for getting a new instance of type RemittanceLocationDetails1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public RemittanceLocationDetails1 newInstance(String elementName, ComplexDataType parent) {
			return new RemittanceLocationDetails1(elementName, parent);
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
	
  	
  
	/** element item for Mtd element. 
	 *  @serial
	 */	
	private String m_mtd = null;
	
	/** element item for ElctrncAdr element. 
	 *  @serial
	 */	
	private String m_elctrncAdr = null;
	
	/** element item for PstlAdr element. 
	 *  @serial
	 */	
	private NameAndAddress10 m_pstlAdr = null;
	
	/**
	 * Get the embedded Mtd element.
	 * @return the item.
	 */
	public String getMtd() {
		return m_mtd;
	}
		
	/**
	 * This method sets (overwrites) the element Mtd.
	 * @param data the item that needs to be added.
	 */
	void setMtd(String data) {
		m_mtd = data;
	}
		
	/**
	 * Get the embedded ElctrncAdr element.
	 * @return the item.
	 */
	public String getElctrncAdr() {
		return m_elctrncAdr;
	}
		
	/**
	 * This method sets (overwrites) the element ElctrncAdr.
	 * @param data the item that needs to be added.
	 */
	void setElctrncAdr(String data) {
		m_elctrncAdr = data;
	}
		
	/**
	 * Get the embedded PstlAdr element.
	 * @return the item.
	 */
	public NameAndAddress10 getPstlAdr() {
		return m_pstlAdr;
	}
		
	/**
	 * This method sets (overwrites) the element PstlAdr.
	 * @param data the item that needs to be added.
	 */
	void setPstlAdr(NameAndAddress10 data) {
		m_pstlAdr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_mtd, ((RemittanceLocationDetails1)that).m_mtd))
			return false;
		
		if (!Compare.equals(m_elctrncAdr, ((RemittanceLocationDetails1)that).m_elctrncAdr))
			return false;
		
		if (!Compare.equals(m_pstlAdr, ((RemittanceLocationDetails1)that).m_pstlAdr))
			return false;
		
		return true;
	}	

  
  
}
