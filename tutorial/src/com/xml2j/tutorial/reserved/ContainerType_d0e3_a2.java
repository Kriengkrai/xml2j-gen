package com.xml2j.tutorial.reserved;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: RESERVED 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContainerType_d0e3_a2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ContainerType_d0e3_a2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ContainerType_d0e3_a2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContainerType_d0e3_a2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContainerType_d0e3_a2.
	 */
	static class Allocator implements TypeAllocator<ContainerType_d0e3_a2> {
		/**
		 * method for getting a new instance of type ContainerType_d0e3_a2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContainerType_d0e3_a2 newInstance(String elementName, ComplexDataType parent) {
			return new ContainerType_d0e3_a2(elementName, parent);
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
	
  	
  
	/** element item for A element. 
	 *  @serial
	 */	
	private AType m_a = null;
	
	/**
	 * Get the embedded A element.
	 * @return the item.
	 */
	public AType getA() {
		return m_a;
	}
		
	/**
	 * This method sets (overwrites) the element A.
	 * @param data the item that needs to be added.
	 */
	void setA(AType data) {
		m_a = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_a, ((ContainerType_d0e3_a2)that).m_a))
			return false;
		
		return true;
	}	

  
  
}
