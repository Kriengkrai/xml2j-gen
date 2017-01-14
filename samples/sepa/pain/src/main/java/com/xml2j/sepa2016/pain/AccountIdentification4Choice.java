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
 * AccountIdentification4Choice data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class AccountIdentification4Choice extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AccountIdentification4Choice.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public AccountIdentification4Choice(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type AccountIdentification4Choice.
	 */
	static class Allocator implements TypeAllocator<AccountIdentification4Choice> {
		/**
		 * method for getting a new instance of type AccountIdentification4Choice.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AccountIdentification4Choice newInstance(String elementName, ComplexDataType parent) {
			return new AccountIdentification4Choice(elementName, parent);
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
	
  	
  
	/** element item for IBAN element. 
	 *  @serial
	 */	
	private String m_iBAN = null;
	
	/** element item for Othr element. 
	 *  @serial
	 */	
	private GenericAccountIdentification1 m_othr = null;
	
	/**
	 * Get the embedded IBAN element.
	 * @return the item.
	 */
	public String getIBAN() {
		return m_iBAN;
	}
		
	/**
	 * This method sets (overwrites) the element IBAN.
	 * @param data the item that needs to be added.
	 */
	void setIBAN(String data) {
		m_iBAN = data;
	}
		
	/**
	 * Get the embedded Othr element.
	 * @return the item.
	 */
	public GenericAccountIdentification1 getOthr() {
		return m_othr;
	}
		
	/**
	 * This method sets (overwrites) the element Othr.
	 * @param data the item that needs to be added.
	 */
	void setOthr(GenericAccountIdentification1 data) {
		m_othr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_iBAN, ((AccountIdentification4Choice)that).m_iBAN))
			return false;
		
		if (!Compare.equals(m_othr, ((AccountIdentification4Choice)that).m_othr))
			return false;
		
		return true;
	}	

  
  
}
