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
 * InstructionForCreditorAgent1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class InstructionForCreditorAgent1 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for InstructionForCreditorAgent1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public InstructionForCreditorAgent1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type InstructionForCreditorAgent1.
	 */
	static class Allocator implements TypeAllocator<InstructionForCreditorAgent1> {
		/**
		 * method for getting a new instance of type InstructionForCreditorAgent1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public InstructionForCreditorAgent1 newInstance(String elementName, ComplexDataType parent) {
			return new InstructionForCreditorAgent1(elementName, parent);
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
	
  	
  
	/** element item for Cd element. 
	 *  @serial
	 */	
	private String m_cd = null;
	
	/** element item for InstrInf element. 
	 *  @serial
	 */	
	private String m_instrInf = null;
	
	/**
	 * Get the embedded Cd element.
	 * @return the item.
	 */
	public String getCd() {
		return m_cd;
	}
		
	/**
	 * This method sets (overwrites) the element Cd.
	 * @param data the item that needs to be added.
	 */
	void setCd(String data) {
		m_cd = data;
	}
		
	/**
	 * Get the embedded InstrInf element.
	 * @return the item.
	 */
	public String getInstrInf() {
		return m_instrInf;
	}
		
	/**
	 * This method sets (overwrites) the element InstrInf.
	 * @param data the item that needs to be added.
	 */
	void setInstrInf(String data) {
		m_instrInf = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_cd, ((InstructionForCreditorAgent1)that).m_cd))
			return false;
		
		if (!Compare.equals(m_instrInf, ((InstructionForCreditorAgent1)that).m_instrInf))
			return false;
		
		return true;
	}	

  
  
}
