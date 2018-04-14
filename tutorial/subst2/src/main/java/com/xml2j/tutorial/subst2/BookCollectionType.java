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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * BookCollectionType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class BookCollectionType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for BookCollectionType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BookCollectionType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BookCollectionType.
	 */
	static class Allocator implements TypeAllocator<BookCollectionType> {
		/**
		 * method for getting a new instance of type BookCollectionType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public BookCollectionType newInstance(String elementName, ComplexDataType parent) {
			return new BookCollectionType(elementName, parent);
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
	
  	
  
	/** list of book element. 
	 *  @serial
	 */	
	private List<BookType> m_bookList = new ArrayList<BookType>();
	
	/**
	 * Get the embedded list of Book elements.
	 * @return list of items.
	 */
	public List<BookType> getBooks() {
		return m_bookList;
	}
		
	/**
	 * This method adds data to the list of Book.
	 * @param data the item that needs to be added.
	 */
	void setBook(BookType data) {
		m_bookList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	BookCollectionType t = (BookCollectionType)that;
	 
		if (!Compare.equals(m_bookList, t.m_bookList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from BookCollectionType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_bookList != null)
			for(BookType l_book : m_bookList) {
				l_book.print(out);
			}
		else {
			// out.print("<book>null</book>");
		}
		
	}
}
