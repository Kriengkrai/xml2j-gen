package com.xml2j.discogs.masters_ss;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS_SS 
  Generation date: Tue Apr 17 20:26:13 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * MastersType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class MastersType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for MastersType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	private MastersType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type MastersType.
	 */
	static class Allocator implements TypeAllocator<MastersType> {
		/**
		 * method for getting a new instance of type MastersType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public MastersType newInstance(String elementName, ComplexDataType parent) {
			return new MastersType(elementName, parent);
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
	
  	
  
	/** list of master element. 
	 *  @serial
	 */	
	private List<MasterType_d0e61_a82> m_masterList = new ArrayList<MasterType_d0e61_a82>();
	
	/**
	 * Get the embedded list of Master elements.
	 * @return list of items.
	 */
	public List<MasterType_d0e61_a82> getMasters() {
		return m_masterList;
	}
		
	/**
	 * This method adds data to the list of Master.
	 * @param data the item that needs to be added.
	 */
	void setMaster(MasterType_d0e61_a82 data) {
		m_masterList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	MastersType t = (MastersType)that;
	 
		if (!Compare.equals(m_masterList, t.m_masterList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from MastersType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_masterList != null) {
			for(MasterType_d0e61_a82 l_master : m_masterList) {
				l_master.print(out);
			}
		}	
		
	}
}
