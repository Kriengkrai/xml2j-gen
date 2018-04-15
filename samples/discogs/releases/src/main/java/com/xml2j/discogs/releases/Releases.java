package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sun Apr 15 13:02:55 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * Releases data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class Releases extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Releases.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public Releases(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type Releases.
	 */
	static class Allocator implements TypeAllocator<Releases> {
		/**
		 * method for getting a new instance of type Releases.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public Releases newInstance(String elementName, ComplexDataType parent) {
			return new Releases(elementName, parent);
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
	
  	
  
	/** list of release element. 
	 *  @serial
	 */	
	private List<ReleaseType> m_releaseList = new ArrayList<ReleaseType>();
	
	/**
	 * Get the embedded list of Release elements.
	 * @return list of items.
	 */
	public List<ReleaseType> getReleases() {
		return m_releaseList;
	}
		
	/**
	 * This method adds data to the list of Release.
	 * @param data the item that needs to be added.
	 */
	void setRelease(ReleaseType data) {
		m_releaseList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	Releases t = (Releases)that;
	 
		if (!Compare.equals(m_releaseList, t.m_releaseList))
			return false;
		
		return true;
	}	

  
  
}
