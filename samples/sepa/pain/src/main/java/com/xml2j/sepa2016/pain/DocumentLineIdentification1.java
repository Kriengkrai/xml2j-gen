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
 * DocumentLineIdentification1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class DocumentLineIdentification1 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DocumentLineIdentification1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DocumentLineIdentification1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DocumentLineIdentification1.
	 */
	static class Allocator implements TypeAllocator<DocumentLineIdentification1> {
		/**
		 * method for getting a new instance of type DocumentLineIdentification1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DocumentLineIdentification1 newInstance(String elementName, ComplexDataType parent) {
			return new DocumentLineIdentification1(elementName, parent);
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
	private DocumentLineType1 m_tp = null;
	
	/** element item for Nb element. 
	 *  @serial
	 */	
	private String m_nb = null;
	
	/** element item for RltdDt element. 
	 *  @serial
	 */	
	private String m_rltdDt = null;
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public DocumentLineType1 getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(DocumentLineType1 data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded Nb element.
	 * @return the item.
	 */
	public String getNb() {
		return m_nb;
	}
		
	/**
	 * This method sets (overwrites) the element Nb.
	 * @param data the item that needs to be added.
	 */
	void setNb(String data) {
		m_nb = data;
	}
		
	/**
	 * Get the embedded RltdDt element.
	 * @return the item.
	 */
	public String getRltdDt() {
		return m_rltdDt;
	}
		
	/**
	 * This method sets (overwrites) the element RltdDt.
	 * @param data the item that needs to be added.
	 */
	void setRltdDt(String data) {
		m_rltdDt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_tp, ((DocumentLineIdentification1)that).m_tp))
			return false;
		
		if (!Compare.equals(m_nb, ((DocumentLineIdentification1)that).m_nb))
			return false;
		
		if (!Compare.equals(m_rltdDt, ((DocumentLineIdentification1)that).m_rltdDt))
			return false;
		
		return true;
	}	

  
  
}
