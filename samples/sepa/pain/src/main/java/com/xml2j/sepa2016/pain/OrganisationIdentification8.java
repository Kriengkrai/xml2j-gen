package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:48 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OrganisationIdentification8 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class OrganisationIdentification8 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OrganisationIdentification8.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OrganisationIdentification8(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OrganisationIdentification8.
	 */
	static class Allocator implements TypeAllocator<OrganisationIdentification8> {
		/**
		 * method for getting a new instance of type OrganisationIdentification8.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OrganisationIdentification8 newInstance(String elementName, ComplexDataType parent) {
			return new OrganisationIdentification8(elementName, parent);
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
	
  	
  
	/** element item for AnyBIC element. 
	 *  @serial
	 */	
	private String m_anyBIC = null;
	
	/** list of Othr element. 
	 *  @serial
	 */	
	private List<GenericOrganisationIdentification1> m_othrList = new ArrayList<GenericOrganisationIdentification1>();
	
	/**
	 * Get the embedded AnyBIC element.
	 * @return the item.
	 */
	public String getAnyBIC() {
		return m_anyBIC;
	}
		
	/**
	 * This method sets (overwrites) the element AnyBIC.
	 * @param data the item that needs to be added.
	 */
	void setAnyBIC(String data) {
		m_anyBIC = data;
	}
		
	/**
	 * Get the embedded list of Othr elements.
	 * @return list of items.
	 */
	public List<GenericOrganisationIdentification1> getOthrs() {
		return m_othrList;
	}
		
	/**
	 * This method adds data to the list of Othr.
	 * @param data the item that needs to be added.
	 */
	void setOthr(GenericOrganisationIdentification1 data) {
		m_othrList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_anyBIC, ((OrganisationIdentification8)that).m_anyBIC))
			return false;
		
		if (!Compare.equals(m_othrList, ((OrganisationIdentification8)that).m_othrList))
			return false;
		
		return true;
	}	

  
  
}
