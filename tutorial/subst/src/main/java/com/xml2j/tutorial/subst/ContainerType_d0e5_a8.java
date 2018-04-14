package com.xml2j.tutorial.subst;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SUBST 
  Generation date: Sat Apr 14 12:01:31 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContainerType_d0e5_a8 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ContainerType_d0e5_a8 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ContainerType_d0e5_a8.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContainerType_d0e5_a8(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContainerType_d0e5_a8.
	 */
	static class Allocator implements TypeAllocator<ContainerType_d0e5_a8> {
		/**
		 * method for getting a new instance of type ContainerType_d0e5_a8.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContainerType_d0e5_a8 newInstance(String elementName, ComplexDataType parent) {
			return new ContainerType_d0e5_a8(elementName, parent);
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
	
  	
  
	/** list of A element. 
	 *  @serial
	 */	
	private List<AType> m_aList = new ArrayList<AType>();
	
	/**
	 * Get the embedded list of A elements.
	 * @return list of items.
	 */
	public List<AType> getAs() {
		return m_aList;
	}
		
	/**
	 * This method adds data to the list of A.
	 * @param data the item that needs to be added.
	 */
	void setA(AType data) {
		m_aList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ContainerType_d0e5_a8 t = (ContainerType_d0e5_a8)that;
	 
		if (!Compare.equals(m_aList, t.m_aList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from containerType_d0e5_a8.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_aList != null)
			for(AType l_A : m_aList) {
				l_A.print(out);
			}
		else {
			// out.print("<A>null</A>");
		}
		
	}
}
