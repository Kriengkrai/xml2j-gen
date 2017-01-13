package com.xml2j.tutorial.seq2;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SEQ2 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContainerType2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ContainerType2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ContainerType2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContainerType2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContainerType2.
	 */
	static class Allocator implements TypeAllocator<ContainerType2> {
		/**
		 * method for getting a new instance of type ContainerType2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContainerType2 newInstance(String elementName, ComplexDataType parent) {
			return new ContainerType2(elementName, parent);
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
	
  	
  
	/** list of name element. 
	 *  @serial
	 */	
	private List<NameType> m_nameList = new ArrayList<NameType>();
	
	/**
	 * Get the embedded list of Name elements.
	 * @return list of items.
	 */
	public List<NameType> getNames() {
		return m_nameList;
	}
		
	/**
	 * This method adds data to the list of Name.
	 * @param data the item that needs to be added.
	 */
	void setName(NameType data) {
		m_nameList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_nameList, ((ContainerType2)that).m_nameList))
			return false;
		
		return true;
	}	

  
  
}
