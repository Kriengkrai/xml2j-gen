package com.xml2j.tutorial.choice;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: CHOICE 
  Generation date: Sun Apr 29 12:06:42 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContainerType_d0e5_a6 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ContainerType_d0e5_a6 extends ComplexDataType {

	/**
	 * Constructor for ContainerType_d0e5_a6.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContainerType_d0e5_a6(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContainerType_d0e5_a6.
	 */
	static class Allocator implements TypeAllocator<ContainerType_d0e5_a6> {
		/**
		 * method for getting a new instance of type ContainerType_d0e5_a6.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContainerType_d0e5_a6 newInstance(String elementName, ComplexDataType parent) {
			return new ContainerType_d0e5_a6(elementName, parent);
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
	
	 */	
	private List<AType> m_aList = new ArrayList<AType>();
	
	/** list of B element. 
	
	 */	
	private List<BType> m_bList = new ArrayList<BType>();
	
	/** list of C element. 
	
	 */	
	private List<CType> m_cList = new ArrayList<CType>();
	
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
	 * Get the embedded list of B elements.
	 * @return list of items.
	 */
	public List<BType> getBs() {
		return m_bList;
	}
		
	/**
	 * This method adds data to the list of B.
	 * @param data the item that needs to be added.
	 */
	void setB(BType data) {
		m_bList.add(data);
	}
		
	/**
	 * Get the embedded list of C elements.
	 * @return list of items.
	 */
	public List<CType> getCs() {
		return m_cList;
	}
		
	/**
	 * This method adds data to the list of C.
	 * @param data the item that needs to be added.
	 */
	void setC(CType data) {
		m_cList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ContainerType_d0e5_a6 t = (ContainerType_d0e5_a6)that;
	 
		if (!Compare.equals(m_aList, t.m_aList))
			return false;
		
		if (!Compare.equals(m_bList, t.m_bList))
			return false;
		
		if (!Compare.equals(m_cList, t.m_cList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from containerType_d0e5_a6.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_aList != null) {
			for(AType l_A : m_aList) {
				l_A.print(out);
			}
		}	
		
		if (m_bList != null) {
			for(BType l_B : m_bList) {
				l_B.print(out);
			}
		}	
		
		if (m_cList != null) {
			for(CType l_C : m_cList) {
				l_C.print(out);
			}
		}	
		
	}
}
