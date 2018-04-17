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
 * ArtistsType_d0e21_a26 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ArtistsType_d0e21_a26 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ArtistsType_d0e21_a26.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	private ArtistsType_d0e21_a26(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ArtistsType_d0e21_a26.
	 */
	static class Allocator implements TypeAllocator<ArtistsType_d0e21_a26> {
		/**
		 * method for getting a new instance of type ArtistsType_d0e21_a26.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ArtistsType_d0e21_a26 newInstance(String elementName, ComplexDataType parent) {
			return new ArtistsType_d0e21_a26(elementName, parent);
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
	
  	
  
	/** list of artist element. 
	 *  @serial
	 */	
	private List<ArtistType_d0e24_a27> m_artistList = new ArrayList<ArtistType_d0e24_a27>();
	
	/**
	 * Get the embedded list of Artist elements.
	 * @return list of items.
	 */
	public List<ArtistType_d0e24_a27> getArtists() {
		return m_artistList;
	}
		
	/**
	 * This method adds data to the list of Artist.
	 * @param data the item that needs to be added.
	 */
	void setArtist(ArtistType_d0e24_a27 data) {
		m_artistList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ArtistsType_d0e21_a26 t = (ArtistsType_d0e21_a26)that;
	 
		if (!Compare.equals(m_artistList, t.m_artistList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from artistsType_d0e21_a26.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_artistList != null) {
			for(ArtistType_d0e24_a27 l_artist : m_artistList) {
				l_artist.print(out);
			}
		}	
		
	}
}
