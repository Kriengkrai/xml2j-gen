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
 * ClearingSystemMemberIdentification2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ClearingSystemMemberIdentification2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ClearingSystemMemberIdentification2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ClearingSystemMemberIdentification2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ClearingSystemMemberIdentification2.
	 */
	static class Allocator implements TypeAllocator<ClearingSystemMemberIdentification2> {
		/**
		 * method for getting a new instance of type ClearingSystemMemberIdentification2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ClearingSystemMemberIdentification2 newInstance(String elementName, ComplexDataType parent) {
			return new ClearingSystemMemberIdentification2(elementName, parent);
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
	
  	
  
	/** element item for ClrSysId element. 
	 *  @serial
	 */	
	private ClearingSystemIdentification2Choice m_clrSysId = null;
	
	/** element item for MmbId element. 
	 *  @serial
	 */	
	private String m_mmbId = null;
	
	/**
	 * Get the embedded ClrSysId element.
	 * @return the item.
	 */
	public ClearingSystemIdentification2Choice getClrSysId() {
		return m_clrSysId;
	}
		
	/**
	 * This method sets (overwrites) the element ClrSysId.
	 * @param data the item that needs to be added.
	 */
	void setClrSysId(ClearingSystemIdentification2Choice data) {
		m_clrSysId = data;
	}
		
	/**
	 * Get the embedded MmbId element.
	 * @return the item.
	 */
	public String getMmbId() {
		return m_mmbId;
	}
		
	/**
	 * This method sets (overwrites) the element MmbId.
	 * @param data the item that needs to be added.
	 */
	void setMmbId(String data) {
		m_mmbId = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_clrSysId, ((ClearingSystemMemberIdentification2)that).m_clrSysId))
			return false;
		
		if (!Compare.equals(m_mmbId, ((ClearingSystemMemberIdentification2)that).m_mmbId))
			return false;
		
		return true;
	}	

  
  
}
