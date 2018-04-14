package com.xml2j.tutorial.ext;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: EXT 
  Generation date: Sat Apr 14 12:01:30 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;



/**
 * JeansType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class JeansType extends ProductType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for JeansType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public JeansType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type JeansType.
	 */
	static class Allocator extends ProductType.Allocator {
		/**
		 * method for getting a new instance of type JeansType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ProductType newInstance(String elementName, ComplexDataType parent) {
			return new JeansType(elementName, parent);
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
	
  	
  
	/** element item for width element. 
	 *  @serial
	 */	
	private SizeType m_width = null;
	
	/** element item for length element. 
	 *  @serial
	 */	
	private SizeType m_length = null;
	
	/**
	 * Get the embedded Width element.
	 * @return the item.
	 */
	public SizeType getWidth() {
		return m_width;
	}
		
	/**
	 * This method sets (overwrites) the element Width.
	 * @param data the item that needs to be added.
	 */
	void setWidth(SizeType data) {
		m_width = data;
	}
		
	/**
	 * Get the embedded Length element.
	 * @return the item.
	 */
	public SizeType getLength() {
		return m_length;
	}
		
	/**
	 * This method sets (overwrites) the element Length.
	 * @param data the item that needs to be added.
	 */
	void setLength(SizeType data) {
		m_length = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	JeansType t = (JeansType)that;
	 
		if (!Compare.equals(m_width, t.m_width))
			return false;
		
		if (!Compare.equals(m_length, t.m_length))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from JeansType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_width != null)
			m_width.print(out);
		else {
			// out.print("<width>null</width>");
		}
		
		if (m_length != null)
			m_length.print(out);
		else {
			// out.print("<length>null</length>");
		}
		
	}
}
