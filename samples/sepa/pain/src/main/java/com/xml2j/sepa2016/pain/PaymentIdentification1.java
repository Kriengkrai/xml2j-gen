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
 * PaymentIdentification1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class PaymentIdentification1 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentIdentification1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentIdentification1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentIdentification1.
	 */
	static class Allocator implements TypeAllocator<PaymentIdentification1> {
		/**
		 * method for getting a new instance of type PaymentIdentification1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentIdentification1 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentIdentification1(elementName, parent);
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
	
  	
  
	/** element item for InstrId element. 
	 *  @serial
	 */	
	private String m_instrId = null;
	
	/** element item for EndToEndId element. 
	 *  @serial
	 */	
	private String m_endToEndId = null;
	
	/**
	 * Get the embedded InstrId element.
	 * @return the item.
	 */
	public String getInstrId() {
		return m_instrId;
	}
		
	/**
	 * This method sets (overwrites) the element InstrId.
	 * @param data the item that needs to be added.
	 */
	void setInstrId(String data) {
		m_instrId = data;
	}
		
	/**
	 * Get the embedded EndToEndId element.
	 * @return the item.
	 */
	public String getEndToEndId() {
		return m_endToEndId;
	}
		
	/**
	 * This method sets (overwrites) the element EndToEndId.
	 * @param data the item that needs to be added.
	 */
	void setEndToEndId(String data) {
		m_endToEndId = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_instrId, ((PaymentIdentification1)that).m_instrId))
			return false;
		
		if (!Compare.equals(m_endToEndId, ((PaymentIdentification1)that).m_endToEndId))
			return false;
		
		return true;
	}	

  
  
}
