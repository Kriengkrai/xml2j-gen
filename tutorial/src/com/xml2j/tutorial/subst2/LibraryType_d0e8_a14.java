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

import com.xml2j.xml.core.TypeAllocator;



/**
 * LibraryType_d0e8_a14 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class LibraryType_d0e8_a14 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for LibraryType_d0e8_a14.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public LibraryType_d0e8_a14(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type LibraryType_d0e8_a14.
	 */
	static class Allocator implements TypeAllocator<LibraryType_d0e8_a14> {
		/**
		 * method for getting a new instance of type LibraryType_d0e8_a14.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public LibraryType_d0e8_a14 newInstance(String elementName, ComplexDataType parent) {
			return new LibraryType_d0e8_a14(elementName, parent);
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
	
  	
  
	/** element item for books element. 
	 *  @serial
	 */	
	private BookCollectionType m_books = null;
	
	/** element item for cds element. 
	 *  @serial
	 */	
	private OpticalCollectionType m_cds = null;
	
	/** element item for miscellaneousItems element. 
	 *  @serial
	 */	
	private GenericCollectionType m_miscellaneousItems = null;
	
	/**
	 * Get the embedded Books element.
	 * @return the item.
	 */
	public BookCollectionType getBooks() {
		return m_books;
	}
		
	/**
	 * This method sets (overwrites) the element Books.
	 * @param data the item that needs to be added.
	 */
	void setBooks(BookCollectionType data) {
		m_books = data;
	}
		
	/**
	 * Get the embedded Cds element.
	 * @return the item.
	 */
	public OpticalCollectionType getCds() {
		return m_cds;
	}
		
	/**
	 * This method sets (overwrites) the element Cds.
	 * @param data the item that needs to be added.
	 */
	void setCds(OpticalCollectionType data) {
		m_cds = data;
	}
		
	/**
	 * Get the embedded MiscellaneousItems element.
	 * @return the item.
	 */
	public GenericCollectionType getMiscellaneousItems() {
		return m_miscellaneousItems;
	}
		
	/**
	 * This method sets (overwrites) the element MiscellaneousItems.
	 * @param data the item that needs to be added.
	 */
	void setMiscellaneousItems(GenericCollectionType data) {
		m_miscellaneousItems = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_books, ((LibraryType_d0e8_a14)that).m_books))
			return false;
		
		if (!Compare.equals(m_cds, ((LibraryType_d0e8_a14)that).m_cds))
			return false;
		
		if (!Compare.equals(m_miscellaneousItems, ((LibraryType_d0e8_a14)that).m_miscellaneousItems))
			return false;
		
		return true;
	}	

  
  
}
