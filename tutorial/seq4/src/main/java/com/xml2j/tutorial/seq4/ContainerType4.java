package com.xml2j.tutorial.seq4;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: SEQ4 
  Generation date: Sun Apr 29 12:06:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContainerType4 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ContainerType4 extends ComplexDataType {

	/**
	 * Constructor for ContainerType4.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContainerType4(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContainerType4.
	 */
	static class Allocator implements TypeAllocator<ContainerType4> {
		/**
		 * method for getting a new instance of type ContainerType4.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContainerType4 newInstance(String elementName, ComplexDataType parent) {
			return new ContainerType4(elementName, parent);
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
	
	 */	
	private StringList m_firstNameList = new StringList("firstName");
	
	/** list of middleName element. 
	
	 */	
	private StringList m_middleNameList = new StringList("middleName");
	
	/** list of lastName element. 
	
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
      
	 	ContainerType4 t = (ContainerType4)that;
	 
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
	 *  This method prints an XML fragment starting from ContainerType4.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_firstNameList != null) {
			m_firstNameList.print(out);
		}	
		
		if (m_middleNameList != null) {
			m_middleNameList.print(out);
		}	
		
		if (m_lastNameList != null) {
			m_lastNameList.print(out);
		}	
		
	}
}
