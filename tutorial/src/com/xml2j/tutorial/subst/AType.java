package com.xml2j.tutorial.subst;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SUBST 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * AType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class AType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public AType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type AType.
	 */
	static class Allocator implements TypeAllocator<AType> {
		/**
		 * method for getting a new instance of type AType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AType newInstance(String elementName, ComplexDataType parent) {
			return new AType(elementName, parent);
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
	
  	
  
	/** element item for aelement element. 
	 *  @serial
	 */	
	private String m_aelement = null;
	
	/** element item for containedA element. 
	 *  @serial
	 */	
	private AContainedType m_containedA = null;
	
	/**
	 * Get the embedded Aelement element.
	 * @return the item.
	 */
	public String getAelement() {
		return m_aelement;
	}
		
	/**
	 * This method sets (overwrites) the element Aelement.
	 * @param data the item that needs to be added.
	 */
	void setAelement(String data) {
		m_aelement = data;
	}
		
	/**
	 * Get the embedded ContainedA element.
	 * @return the item.
	 */
	public AContainedType getContainedA() {
		return m_containedA;
	}
		
	/**
	 * This method sets (overwrites) the element ContainedA.
	 * @param data the item that needs to be added.
	 */
	void setContainedA(AContainedType data) {
		m_containedA = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_aelement, ((AType)that).m_aelement))
			return false;
		
		if (!Compare.equals(m_containedA, ((AType)that).m_containedA))
			return false;
		
		return true;
	}	

  
  
}
