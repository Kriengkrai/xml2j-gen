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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * FormatType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class FormatType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for FormatType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public FormatType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type FormatType.
	 */
	static class Allocator implements TypeAllocator<FormatType> {
		/**
		 * method for getting a new instance of type FormatType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public FormatType newInstance(String elementName, ComplexDataType parent) {
			return new FormatType(elementName, parent);
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
	
  	
  
	/** element item for descriptions element. 
	 *  @serial
	 */	
	private DescriptionsType m_descriptions = null;
	
	/**
	 * Get the embedded Descriptions element.
	 * @return the item.
	 */
	public DescriptionsType getDescriptions() {
		return m_descriptions;
	}
		
	/**
	 * This method sets (overwrites) the element Descriptions.
	 * @param data the item that needs to be added.
	 */
	void setDescriptions(DescriptionsType data) {
		m_descriptions = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	FormatType t = (FormatType)that;
	 
		if (!Compare.equals(m_descriptions, t.m_descriptions))
			return false;
		
		return true;
	}	

  
  

	/**
	 * Get 'name' attribute.
	 * @return the item.
	 */
	public String getName() {
		return getAttr("name");
	}

	/**
	 * Set 'name' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setName(String data) {
		setAttr("name", data);
	}
  

	/**
	 * Get 'qty' attribute.
	 * @return the item.
	 */
	public String getQty() {
		return getAttr("qty");
	}

	/**
	 * Set 'qty' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setQty(String data) {
		setAttr("qty", data);
	}
  

	/**
	 * Get 'text' attribute.
	 * @return the item.
	 */
	public String getText() {
		return getAttr("text");
	}

	/**
	 * Set 'text' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setText(String data) {
		setAttr("text", data);
	}
  
}
