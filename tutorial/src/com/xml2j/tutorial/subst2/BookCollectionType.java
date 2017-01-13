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
 * 
 */
public class BookCollectionType extends ComplexDataType {

	/**
	 * default serial version UID 
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
  
		if (!Compare.equals(m_bookList, ((BookCollectionType)that).m_bookList))
			return false;
		
		return true;
	}	

  
  
}
