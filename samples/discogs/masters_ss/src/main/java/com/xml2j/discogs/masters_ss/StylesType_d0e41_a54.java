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

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * StylesType_d0e41_a54 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class StylesType_d0e41_a54 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for StylesType_d0e41_a54.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	private StylesType_d0e41_a54(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type StylesType_d0e41_a54.
	 */
	static class Allocator implements TypeAllocator<StylesType_d0e41_a54> {
		/**
		 * method for getting a new instance of type StylesType_d0e41_a54.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public StylesType_d0e41_a54 newInstance(String elementName, ComplexDataType parent) {
			return new StylesType_d0e41_a54(elementName, parent);
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
	
  	
  
	/** list of style element. 
	 *  @serial
	 */	
	private StringList m_styleList = new StringList("style");
		
	/**
	 * Get the embedded list of Style elements.
	 * @return list of items.
	 */
	public StringList getStyles() {
		return m_styleList;
	}
		
	/**
	 * This method adds data to the list of Style.
	 * @param data the item that needs to be added.
	 */
	void setStyle(String data) {
		m_styleList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	StylesType_d0e41_a54 t = (StylesType_d0e41_a54)that;
	 
		if (!Compare.equals(m_styleList, t.m_styleList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from stylesType_d0e41_a54.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_styleList != null) {
			m_styleList.print(out);
		}	
		
	}
}
