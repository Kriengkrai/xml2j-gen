package com.xml2j.tutorial.seq1;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SEQ1 
  Generation date: Sat Apr 14 12:01:31 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContainerType1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ContainerType1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ContainerType1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContainerType1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContainerType1.
	 */
	static class Allocator implements TypeAllocator<ContainerType1> {
		/**
		 * method for getting a new instance of type ContainerType1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContainerType1 newInstance(String elementName, ComplexDataType parent) {
			return new ContainerType1(elementName, parent);
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
	
  	
  
	/** list of firstName element. 
	 *  @serial
	 */	
	private StringList m_firstNameList = new StringList("firstName");
	
	/** list of middleName element. 
	 *  @serial
	 */	
	private StringList m_middleNameList = new StringList("middleName");
	
	/** list of lastName element. 
	 *  @serial
	 */	
	private StringList m_lastNameList = new StringList("lastName");
		
	/**
	 * Get the embedded list of FirstName elements.
	 * @return list of items.
	 */
	public StringList getFirstNames() {
		return m_firstNameList;
	}
		
	/**
	 * This method adds data to the list of FirstName.
	 * @param data the item that needs to be added.
	 */
	void setFirstName(String data) {
		m_firstNameList.add(data);
	}
			
	/**
	 * Get the embedded list of MiddleName elements.
	 * @return list of items.
	 */
	public StringList getMiddleNames() {
		return m_middleNameList;
	}
		
	/**
	 * This method adds data to the list of MiddleName.
	 * @param data the item that needs to be added.
	 */
	void setMiddleName(String data) {
		m_middleNameList.add(data);
	}
			
	/**
	 * Get the embedded list of LastName elements.
	 * @return list of items.
	 */
	public StringList getLastNames() {
		return m_lastNameList;
	}
		
	/**
	 * This method adds data to the list of LastName.
	 * @param data the item that needs to be added.
	 */
	void setLastName(String data) {
		m_lastNameList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ContainerType1 t = (ContainerType1)that;
	 
		if (!Compare.equals(m_firstNameList, t.m_firstNameList))
			return false;
		
		if (!Compare.equals(m_middleNameList, t.m_middleNameList))
			return false;
		
		if (!Compare.equals(m_lastNameList, t.m_lastNameList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from ContainerType1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_firstNameList != null)
			m_firstNameList.print(out);
		else {
			// out.print("<firstName>null</firstName>");
		}
		
		if (m_middleNameList != null)
			m_middleNameList.print(out);
		else {
			// out.print("<middleName>null</middleName>");
		}
		
		if (m_lastNameList != null)
			m_lastNameList.print(out);
		else {
			// out.print("<lastName>null</lastName>");
		}
		
	}
}
