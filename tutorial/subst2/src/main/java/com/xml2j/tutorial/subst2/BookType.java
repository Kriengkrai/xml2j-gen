package com.xml2j.tutorial.subst2;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SUBST2 
  Generation date: Thu Apr 12 19:34:42 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;



/**
 * BookType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class BookType extends LibraryItemType {

	/**
	 * serial version UID 
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
      
	 	BookType t = (BookType)that;
	 
		if (!Compare.equals(m_author, t.m_author))
			return false;
		
		if (!Compare.equals(m_title, t.m_title))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from BookType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_author != null) {
			out.print("\n<author>");
			out.print(m_author);
			out.print("</author>\n");
		}
		
		if (m_title != null) {
			out.print("\n<title>");
			out.print(m_title);
			out.print("</title>\n");
		}
		
	}
}
