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
 * CreditorReferenceInformation2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class CreditorReferenceInformation2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CreditorReferenceInformation2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CreditorReferenceInformation2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CreditorReferenceInformation2.
	 */
	static class Allocator implements TypeAllocator<CreditorReferenceInformation2> {
		/**
		 * method for getting a new instance of type CreditorReferenceInformation2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CreditorReferenceInformation2 newInstance(String elementName, ComplexDataType parent) {
			return new CreditorReferenceInformation2(elementName, parent);
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
	
  	
  
	/** element item for Tp element. 
	 *  @serial
	 */	
	private CreditorReferenceType2 m_tp = null;
	
	/** element item for Ref element. 
	 *  @serial
	 */	
	private String m_ref = null;
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public CreditorReferenceType2 getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(CreditorReferenceType2 data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded Ref element.
	 * @return the item.
	 */
	public String getRef() {
		return m_ref;
	}
		
	/**
	 * This method sets (overwrites) the element Ref.
	 * @param data the item that needs to be added.
	 */
	void setRef(String data) {
		m_ref = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_tp, ((CreditorReferenceInformation2)that).m_tp))
			return false;
		
		if (!Compare.equals(m_ref, ((CreditorReferenceInformation2)that).m_ref))
			return false;
		
		return true;
	}	

  
  
}
