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



/**
 * ShirtType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ShirtType extends ProductType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ShirtType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ShirtType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ShirtType.
	 */
	static class Allocator extends ProductType.Allocator {
		/**
		 * method for getting a new instance of type ShirtType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ProductType newInstance(String elementName, ComplexDataType parent) {
			return new ShirtType(elementName, parent);
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
	
  	
  
	/** element item for size element. 
	 *  @serial
	 */	
	private SizeType m_size = null;
	
	/** element item for fit element. 
	 *  @serial
	 */	
	private String m_fit = null;
	
	/**
	 * Get the embedded Size element.
	 * @return the item.
	 */
	public SizeType getSize() {
		return m_size;
	}
		
	/**
	 * This method sets (overwrites) the element Size.
	 * @param data the item that needs to be added.
	 */
	void setSize(SizeType data) {
		m_size = data;
	}
		
	/**
	 * Get the embedded Fit element.
	 * @return the item.
	 */
	public String getFit() {
		return m_fit;
	}
		
	/**
	 * This method sets (overwrites) the element Fit.
	 * @param data the item that needs to be added.
	 */
	void setFit(String data) {
		m_fit = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_size, ((ShirtType)that).m_size))
			return false;
		
		if (!Compare.equals(m_fit, ((ShirtType)that).m_fit))
			return false;
		
		return true;
	}	

  
  
}
