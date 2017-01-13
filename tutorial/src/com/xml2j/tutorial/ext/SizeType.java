package com.xml2j.tutorial.ext;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: EXT 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * SizeType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class SizeType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for SizeType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public SizeType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type SizeType.
	 */
	static class Allocator implements TypeAllocator<SizeType> {
		/**
		 * method for getting a new instance of type SizeType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public SizeType newInstance(String elementName, ComplexDataType parent) {
			return new SizeType(elementName, parent);
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
	
  	
  
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		return true;
	}	

  
  

	/**
	 * Get 'system' attribute.
	 * @return the item.
	 */
	public String getSystem() {
		return getAttr("system");
	}

	/**
	 * Set 'system' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setSystem(String data) {
		setAttr("system", data);
	}
  
}
