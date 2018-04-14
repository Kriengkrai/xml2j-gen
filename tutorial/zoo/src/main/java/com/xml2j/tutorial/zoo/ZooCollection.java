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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ZooCollection data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ZooCollection extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ZooCollection.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ZooCollection(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ZooCollection.
	 */
	static class Allocator implements TypeAllocator<ZooCollection> {
		/**
		 * method for getting a new instance of type ZooCollection.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ZooCollection newInstance(String elementName, ComplexDataType parent) {
			return new ZooCollection(elementName, parent);
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
	
  	
  
	/** list of zoo element. 
	 *  @serial
	 */	
	private List<ZooType> m_zooList = new ArrayList<ZooType>();
	
	/** list of birdZoo element. 
	 *  @serial
	 */	
	private List<BirdZooType> m_birdZooList = new ArrayList<BirdZooType>();
	
	/** list of mammalZoo element. 
	 *  @serial
	 */	
	private List<MammalZooType> m_mammalZooList = new ArrayList<MammalZooType>();
	
	/**
	 * Get the embedded list of Zoo elements.
	 * @return list of items.
	 */
	public List<ZooType> getZoos() {
		return m_zooList;
	}
		
	/**
	 * This method adds data to the list of Zoo.
	 * @param data the item that needs to be added.
	 */
	void setZoo(ZooType data) {
		m_zooList.add(data);
	}
		
	/**
	 * Get the embedded list of BirdZoo elements.
	 * @return list of items.
	 */
	public List<BirdZooType> getBirdZoos() {
		return m_birdZooList;
	}
		
	/**
	 * This method adds data to the list of BirdZoo.
	 * @param data the item that needs to be added.
	 */
	void setBirdZoo(BirdZooType data) {
		m_birdZooList.add(data);
	}
		
	/**
	 * Get the embedded list of MammalZoo elements.
	 * @return list of items.
	 */
	public List<MammalZooType> getMammalZoos() {
		return m_mammalZooList;
	}
		
	/**
	 * This method adds data to the list of MammalZoo.
	 * @param data the item that needs to be added.
	 */
	void setMammalZoo(MammalZooType data) {
		m_mammalZooList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ZooCollection t = (ZooCollection)that;
	 
		if (!Compare.equals(m_zooList, t.m_zooList))
			return false;
		
		if (!Compare.equals(m_birdZooList, t.m_birdZooList))
			return false;
		
		if (!Compare.equals(m_mammalZooList, t.m_mammalZooList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from ZooCollection.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_zooList != null)
			for(ZooType l_zoo : m_zooList) {
				l_zoo.print(out);
			}
		else {
			// out.print("<zoo>null</zoo>");
		}
		
		if (m_birdZooList != null)
			for(BirdZooType l_birdZoo : m_birdZooList) {
				l_birdZoo.print(out);
			}
		else {
			// out.print("<birdZoo>null</birdZoo>");
		}
		
		if (m_mammalZooList != null)
			for(MammalZooType l_mammalZoo : m_mammalZooList) {
				l_mammalZoo.print(out);
			}
		else {
			// out.print("<mammalZoo>null</mammalZoo>");
		}
		
	}
}
