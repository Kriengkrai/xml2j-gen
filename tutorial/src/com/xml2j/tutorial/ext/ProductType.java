package com.xml2j.tutorial.ext;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: EXT 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ProductType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ProductType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ProductType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ProductType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ProductType.
	 */
	static class Allocator implements TypeAllocator<ProductType> {
		/**
		 * method for getting a new instance of type ProductType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ProductType newInstance(String elementName, ComplexDataType parent) {
			return new ProductType(elementName, parent);
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
	
  	
  
	/** element item for number element. 
	 *  @serial
	 */	
	private String m_number = null;
	
	/** element item for name element. 
	 *  @serial
	 */	
	private String m_name = null;
	
	/**
	 * Get the embedded Number element.
	 * @return the item.
	 */
	public String getNumber() {
		return m_number;
	}
		
	/**
	 * This method sets (overwrites) the element Number.
	 * @param data the item that needs to be added.
	 */
	void setNumber(String data) {
		m_number = data;
	}
		
	/**
	 * Get the embedded Name element.
	 * @return the item.
	 */
	public String getName() {
		return m_name;
	}
		
	/**
	 * This method sets (overwrites) the element Name.
	 * @param data the item that needs to be added.
	 */
	void setName(String data) {
		m_name = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_number, ((ProductType)that).m_number))
			return false;
		
		if (!Compare.equals(m_name, ((ProductType)that).m_name))
			return false;
		
		return true;
	}	

  
  
}
