package com.xml2j.tutorial.subst2;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SUBST2 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;



/**
 * BookType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class BookType extends LibraryItemType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for BookType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BookType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BookType.
	 */
	static class Allocator extends LibraryItemType.Allocator {
		/**
		 * method for getting a new instance of type BookType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public LibraryItemType newInstance(String elementName, ComplexDataType parent) {
			return new BookType(elementName, parent);
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
	
  	
  
	/** element item for author element. 
	 *  @serial
	 */	
	private String m_author = null;
	
	/** element item for title element. 
	 *  @serial
	 */	
	private String m_title = null;
	
	/**
	 * Get the embedded Author element.
	 * @return the item.
	 */
	public String getAuthor() {
		return m_author;
	}
		
	/**
	 * This method sets (overwrites) the element Author.
	 * @param data the item that needs to be added.
	 */
	void setAuthor(String data) {
		m_author = data;
	}
		
	/**
	 * Get the embedded Title element.
	 * @return the item.
	 */
	public String getTitle() {
		return m_title;
	}
		
	/**
	 * This method sets (overwrites) the element Title.
	 * @param data the item that needs to be added.
	 */
	void setTitle(String data) {
		m_title = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_author, ((BookType)that).m_author))
			return false;
		
		if (!Compare.equals(m_title, ((BookType)that).m_title))
			return false;
		
		return true;
	}	

  
  
}
