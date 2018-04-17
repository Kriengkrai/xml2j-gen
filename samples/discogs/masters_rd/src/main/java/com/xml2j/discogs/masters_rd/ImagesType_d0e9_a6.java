package com.xml2j.discogs.masters_rd;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS_RD 
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
 * ImagesType_d0e9_a6 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ImagesType_d0e9_a6 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ImagesType_d0e9_a6.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	private ImagesType_d0e9_a6(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ImagesType_d0e9_a6.
	 */
	static class Allocator implements TypeAllocator<ImagesType_d0e9_a6> {
		/**
		 * method for getting a new instance of type ImagesType_d0e9_a6.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ImagesType_d0e9_a6 newInstance(String elementName, ComplexDataType parent) {
			return new ImagesType_d0e9_a6(elementName, parent);
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
	
  	
  
	/** list of image element. 
	 *  @serial
	 */	
	private List<ImageType_d0e12_a7> m_imageList = new ArrayList<ImageType_d0e12_a7>();
	
	/**
	 * Get the embedded list of Image elements.
	 * @return list of items.
	 */
	public List<ImageType_d0e12_a7> getImages() {
		return m_imageList;
	}
		
	/**
	 * This method adds data to the list of Image.
	 * @param data the item that needs to be added.
	 */
	void setImage(ImageType_d0e12_a7 data) {
		m_imageList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ImagesType_d0e9_a6 t = (ImagesType_d0e9_a6)that;
	 
		if (!Compare.equals(m_imageList, t.m_imageList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from imagesType_d0e9_a6.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_imageList != null) {
			for(ImageType_d0e12_a7 l_image : m_imageList) {
				l_image.print(out);
			}
		}	
		
	}
}
