package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sat Apr 14 18:02:46 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * LabelsType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class LabelsType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for LabelsType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public LabelsType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type LabelsType.
	 */
	static class Allocator implements TypeAllocator<LabelsType> {
		/**
		 * method for getting a new instance of type LabelsType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public LabelsType newInstance(String elementName, ComplexDataType parent) {
			return new LabelsType(elementName, parent);
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
	
  	
  
	/** list of label element. 
	 *  @serial
	 */	
	private List<LabelType> m_labelList = new ArrayList<LabelType>();
	
	/**
	 * Get the embedded list of Label elements.
	 * @return list of items.
	 */
	public List<LabelType> getLabels() {
		return m_labelList;
	}
		
	/**
	 * This method adds data to the list of Label.
	 * @param data the item that needs to be added.
	 */
	void setLabel(LabelType data) {
		m_labelList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	LabelsType t = (LabelsType)that;
	 
		if (!Compare.equals(m_labelList, t.m_labelList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from labelsType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_labelList != null)
			for(LabelType l_label : m_labelList) {
				l_label.print(out);
			}
		else {
			// out.print("<label>null</label>");
		}
		
	}
}
