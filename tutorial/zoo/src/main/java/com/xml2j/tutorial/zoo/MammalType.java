package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: ZOO 
  Generation date: Thu Apr 12 19:34:42 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;



/**
 * MammalType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class MammalType extends AnimalType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for MammalType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public MammalType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type MammalType.
	 */
	static class Allocator extends AnimalType.Allocator {
		/**
		 * method for getting a new instance of type MammalType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AnimalType newInstance(String elementName, ComplexDataType parent) {
			return new MammalType(elementName, parent);
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
	
  	
  
	/** element item for gestation element. 
	 *  @serial
	 */	
	private GestationType m_gestation = null;
	
	/**
	 * Get the embedded Gestation element.
	 * @return the item.
	 */
	public GestationType getGestation() {
		return m_gestation;
	}
		
	/**
	 * This method sets (overwrites) the element Gestation.
	 * @param data the item that needs to be added.
	 */
	void setGestation(GestationType data) {
		m_gestation = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	MammalType t = (MammalType)that;
	 
		if (!Compare.equals(m_gestation, t.m_gestation))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from MammalType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_gestation != null)
			m_gestation.print(out);
		else {
			// out.print("<gestation>null</gestation>");
		}
		
	}
}
