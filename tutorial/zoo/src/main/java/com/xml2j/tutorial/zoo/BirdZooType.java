package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: ZOO 
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
 * BirdZooType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class BirdZooType extends ComplexDataType {

	/**
	 * Constructor for BirdZooType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BirdZooType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BirdZooType.
	 */
	static class Allocator implements TypeAllocator<BirdZooType> {
		/**
		 * method for getting a new instance of type BirdZooType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public BirdZooType newInstance(String elementName, ComplexDataType parent) {
			return new BirdZooType(elementName, parent);
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
	
  	
  
	/** list of bird element. 
	
	 */	
	private List<BirdType> m_birdList = new ArrayList<BirdType>();
	
	/**
	 * Get the embedded list of Bird elements.
	 * @return list of items.
	 */
	public List<BirdType> getBirds() {
		return m_birdList;
	}
		
	/**
	 * This method adds data to the list of Bird.
	 * @param data the item that needs to be added.
	 */
	void setBird(BirdType data) {
		m_birdList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	BirdZooType t = (BirdZooType)that;
	 
		if (!Compare.equals(m_birdList, t.m_birdList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from BirdZooType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_birdList != null) {
			for(BirdType l_bird : m_birdList) {
				l_bird.print(out);
			}
		}	
		
	}
}
