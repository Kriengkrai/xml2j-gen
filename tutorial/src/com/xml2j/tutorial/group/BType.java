package com.xml2j.tutorial.group;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: GROUP 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * BType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class BType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for BType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BType.
	 */
	static class Allocator implements TypeAllocator<BType> {
		/**
		 * method for getting a new instance of type BType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public BType newInstance(String elementName, ComplexDataType parent) {
			return new BType(elementName, parent);
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
	
  	
  
	/** list of description element. 
	 *  @serial
	 */	
	private StringList m_descriptionList = new StringList("description");
	
	/** list of comment element. 
	 *  @serial
	 */	
	private StringList m_commentList = new StringList("comment");
	
	/** element item for second element. 
	 *  @serial
	 */	
	private String m_second = null;
		
	/**
	 * Get the embedded list of Description elements.
	 * @return list of items.
	 */
	public StringList getDescriptions() {
		return m_descriptionList;
	}
		
	/**
	 * This method adds data to the list of Description.
	 * @param data the item that needs to be added.
	 */
	void setDescription(String data) {
		m_descriptionList.add(data);
	}
			
	/**
	 * Get the embedded list of Comment elements.
	 * @return list of items.
	 */
	public StringList getComments() {
		return m_commentList;
	}
		
	/**
	 * This method adds data to the list of Comment.
	 * @param data the item that needs to be added.
	 */
	void setComment(String data) {
		m_commentList.add(data);
	}
		
	/**
	 * Get the embedded Second element.
	 * @return the item.
	 */
	public String getSecond() {
		return m_second;
	}
		
	/**
	 * This method sets (overwrites) the element Second.
	 * @param data the item that needs to be added.
	 */
	void setSecond(String data) {
		m_second = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_descriptionList, ((BType)that).m_descriptionList))
			return false;
		
		if (!Compare.equals(m_commentList, ((BType)that).m_commentList))
			return false;
		
		if (!Compare.equals(m_second, ((BType)that).m_second))
			return false;
		
		return true;
	}	

  
  
}
