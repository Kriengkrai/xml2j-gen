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
 * CompanyType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CompanyType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CompanyType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CompanyType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CompanyType.
	 */
	static class Allocator implements TypeAllocator<CompanyType> {
		/**
		 * method for getting a new instance of type CompanyType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CompanyType newInstance(String elementName, ComplexDataType parent) {
			return new CompanyType(elementName, parent);
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
	
  	
  
	/** element item for id element. 
	 *  @serial
	 */	
	private String m_id = null;
	
	/** element item for name element. 
	 *  @serial
	 */	
	private String m_name = null;
	
	/** element item for catno element. 
	 *  @serial
	 */	
	private String m_catno = null;
	
	/** element item for entity_type element. 
	 *  @serial
	 */	
	private String m_entity_type = null;
	
	/** element item for entity_type_name element. 
	 *  @serial
	 */	
	private String m_entity_type_name = null;
	
	/** element item for resource_url element. 
	 *  @serial
	 */	
	private String m_resource_url = null;
	
	/**
	 * Get the embedded Id element.
	 * @return the item.
	 */
	public String getId() {
		return m_id;
	}
		
	/**
	 * This method sets (overwrites) the element Id.
	 * @param data the item that needs to be added.
	 */
	void setId(String data) {
		m_id = data;
	}
		
	/**
	 * Get the embedded Name element.
	 * @return the item.
	 */
	public String getName() {
		return m_name;
	}
		
	/**
	 * This method sets (overwrites) the element Name.
	 * @param data the item that needs to be added.
	 */
	void setName(String data) {
		m_name = data;
	}
		
	/**
	 * Get the embedded Catno element.
	 * @return the item.
	 */
	public String getCatno() {
		return m_catno;
	}
		
	/**
	 * This method sets (overwrites) the element Catno.
	 * @param data the item that needs to be added.
	 */
	void setCatno(String data) {
		m_catno = data;
	}
		
	/**
	 * Get the embedded Entity_type element.
	 * @return the item.
	 */
	public String getEntity_type() {
		return m_entity_type;
	}
		
	/**
	 * This method sets (overwrites) the element Entity_type.
	 * @param data the item that needs to be added.
	 */
	void setEntity_type(String data) {
		m_entity_type = data;
	}
		
	/**
	 * Get the embedded Entity_type_name element.
	 * @return the item.
	 */
	public String getEntity_type_name() {
		return m_entity_type_name;
	}
		
	/**
	 * This method sets (overwrites) the element Entity_type_name.
	 * @param data the item that needs to be added.
	 */
	void setEntity_type_name(String data) {
		m_entity_type_name = data;
	}
		
	/**
	 * Get the embedded Resource_url element.
	 * @return the item.
	 */
	public String getResource_url() {
		return m_resource_url;
	}
		
	/**
	 * This method sets (overwrites) the element Resource_url.
	 * @param data the item that needs to be added.
	 */
	void setResource_url(String data) {
		m_resource_url = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CompanyType t = (CompanyType)that;
	 
		if (!Compare.equals(m_id, t.m_id))
			return false;
		
		if (!Compare.equals(m_name, t.m_name))
			return false;
		
		if (!Compare.equals(m_catno, t.m_catno))
			return false;
		
		if (!Compare.equals(m_entity_type, t.m_entity_type))
			return false;
		
		if (!Compare.equals(m_entity_type_name, t.m_entity_type_name))
			return false;
		
		if (!Compare.equals(m_resource_url, t.m_resource_url))
			return false;
		
		return true;
	}	

  
  
}
