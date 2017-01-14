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
 * SupplementaryData1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class SupplementaryData1 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for SupplementaryData1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public SupplementaryData1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type SupplementaryData1.
	 */
	static class Allocator implements TypeAllocator<SupplementaryData1> {
		/**
		 * method for getting a new instance of type SupplementaryData1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public SupplementaryData1 newInstance(String elementName, ComplexDataType parent) {
			return new SupplementaryData1(elementName, parent);
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
	
  	
  
	/** element item for PlcAndNm element. 
	 *  @serial
	 */	
	private String m_plcAndNm = null;
	
	/** element item for Envlp element. 
	 *  @serial
	 */	
	private SupplementaryDataEnvelope1 m_envlp = null;
	
	/**
	 * Get the embedded PlcAndNm element.
	 * @return the item.
	 */
	public String getPlcAndNm() {
		return m_plcAndNm;
	}
		
	/**
	 * This method sets (overwrites) the element PlcAndNm.
	 * @param data the item that needs to be added.
	 */
	void setPlcAndNm(String data) {
		m_plcAndNm = data;
	}
		
	/**
	 * Get the embedded Envlp element.
	 * @return the item.
	 */
	public SupplementaryDataEnvelope1 getEnvlp() {
		return m_envlp;
	}
		
	/**
	 * This method sets (overwrites) the element Envlp.
	 * @param data the item that needs to be added.
	 */
	void setEnvlp(SupplementaryDataEnvelope1 data) {
		m_envlp = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_plcAndNm, ((SupplementaryData1)that).m_plcAndNm))
			return false;
		
		if (!Compare.equals(m_envlp, ((SupplementaryData1)that).m_envlp))
			return false;
		
		return true;
	}	

  
  
}
