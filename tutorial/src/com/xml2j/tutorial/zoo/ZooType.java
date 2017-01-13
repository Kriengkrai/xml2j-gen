package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: ZOO 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ZooType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ZooType extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ZooType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ZooType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ZooType.
	 */
	static class Allocator implements TypeAllocator<ZooType> {
		/**
		 * method for getting a new instance of type ZooType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ZooType newInstance(String elementName, ComplexDataType parent) {
			return new ZooType(elementName, parent);
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
	
  	
  
	/** list of animal element. 
	 *  @serial
	 */	
	private List<AnimalType> m_animalList = new ArrayList<AnimalType>();
	
	/**
	 * Get the embedded list of Animal elements.
	 * @return list of items.
	 */
	public List<AnimalType> getAnimals() {
		return m_animalList;
	}
		
	/**
	 * This method adds data to the list of Animal.
	 * @param data the item that needs to be added.
	 */
	void setAnimal(AnimalType data) {
		m_animalList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_animalList, ((ZooType)that).m_animalList))
			return false;
		
		return true;
	}	

  
  
}
