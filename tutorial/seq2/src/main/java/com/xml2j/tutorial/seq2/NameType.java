package com.xml2j.tutorial.seq2;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SEQ2 
  Generation date: Sat Apr 14 12:01:31 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * NameType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class NameType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for NameType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public NameType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type NameType.
	 */
	static class Allocator implements TypeAllocator<NameType> {
		/**
		 * method for getting a new instance of type NameType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public NameType newInstance(String elementName, ComplexDataType parent) {
			return new NameType(elementName, parent);
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
	
  	
  
	/** element item for firstName element. 
	 *  @serial
	 */	
	private String m_firstName = null;
	
	/** element item for middleName element. 
	 *  @serial
	 */	
	private String m_middleName = null;
	
	/** element item for lastName element. 
	 *  @serial
	 */	
	private String m_lastName = null;
	
	/**
	 * Get the embedded FirstName element.
	 * @return the item.
	 */
	public String getFirstName() {
		return m_firstName;
	}
		
	/**
	 * This method sets (overwrites) the element FirstName.
	 * @param data the item that needs to be added.
	 */
	void setFirstName(String data) {
		m_firstName = data;
	}
		
	/**
	 * Get the embedded MiddleName element.
	 * @return the item.
	 */
	public String getMiddleName() {
		return m_middleName;
	}
		
	/**
	 * This method sets (overwrites) the element MiddleName.
	 * @param data the item that needs to be added.
	 */
	void setMiddleName(String data) {
		m_middleName = data;
	}
		
	/**
	 * Get the embedded LastName element.
	 * @return the item.
	 */
	public String getLastName() {
		return m_lastName;
	}
		
	/**
	 * This method sets (overwrites) the element LastName.
	 * @param data the item that needs to be added.
	 */
	void setLastName(String data) {
		m_lastName = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	NameType t = (NameType)that;
	 
		if (!Compare.equals(m_firstName, t.m_firstName))
			return false;
		
		if (!Compare.equals(m_middleName, t.m_middleName))
			return false;
		
		if (!Compare.equals(m_lastName, t.m_lastName))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from nameType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_firstName != null) {
			out.print("\n<firstName>");
			out.print(m_firstName);
			out.print("</firstName>\n");
		}
		
		if (m_middleName != null) {
			out.print("\n<middleName>");
			out.print(m_middleName);
			out.print("</middleName>\n");
		}
		
		if (m_lastName != null) {
			out.print("\n<lastName>");
			out.print(m_lastName);
			out.print("</lastName>\n");
		}
		
	}
}
