package com.xml2j.tutorial.subst2;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: SUBST2 
  Generation date: Sun Apr 29 12:06:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OpticalCollectionType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class OpticalCollectionType extends ComplexDataType {

	/**
	 * Constructor for OpticalCollectionType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OpticalCollectionType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OpticalCollectionType.
	 */
	static class Allocator implements TypeAllocator<OpticalCollectionType> {
		/**
		 * method for getting a new instance of type OpticalCollectionType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OpticalCollectionType newInstance(String elementName, ComplexDataType parent) {
			return new OpticalCollectionType(elementName, parent);
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
	
  	
  
	/** list of CD element. 
	
	 */	
	private List<CDType> m_cDList = new ArrayList<CDType>();
	
	/**
	 * Get the embedded list of CD elements.
	 * @return list of items.
	 */
	public List<CDType> getCDs() {
		return m_cDList;
	}
		
	/**
	 * This method adds data to the list of CD.
	 * @param data the item that needs to be added.
	 */
	void setCD(CDType data) {
		m_cDList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	OpticalCollectionType t = (OpticalCollectionType)that;
	 
		if (!Compare.equals(m_cDList, t.m_cDList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from OpticalCollectionType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cDList != null) {
			for(CDType l_CD : m_cDList) {
				l_CD.print(out);
			}
		}	
		
	}
}
