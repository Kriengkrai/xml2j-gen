package com.xml2j.tutorial.ext;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: EXT 
  Generation date: Sun Apr 29 12:06:42 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ProductContainerType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ProductContainerType extends ComplexDataType {

	/**
	 * Constructor for ProductContainerType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ProductContainerType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ProductContainerType.
	 */
	static class Allocator implements TypeAllocator<ProductContainerType> {
		/**
		 * method for getting a new instance of type ProductContainerType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ProductContainerType newInstance(String elementName, ComplexDataType parent) {
			return new ProductContainerType(elementName, parent);
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
	
  	
  
	/** list of Product element. 
	
	 */	
	private List<ProductType> m_productList = new ArrayList<ProductType>();
	
	/**
	 * Get the embedded list of Product elements.
	 * @return list of items.
	 */
	public List<ProductType> getProducts() {
		return m_productList;
	}
		
	/**
	 * This method adds data to the list of Product.
	 * @param data the item that needs to be added.
	 */
	void setProduct(ProductType data) {
		m_productList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ProductContainerType t = (ProductContainerType)that;
	 
		if (!Compare.equals(m_productList, t.m_productList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from ProductContainerType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_productList != null) {
			for(ProductType l_Product : m_productList) {
				l_Product.print(out);
			}
		}	
		
	}
}
