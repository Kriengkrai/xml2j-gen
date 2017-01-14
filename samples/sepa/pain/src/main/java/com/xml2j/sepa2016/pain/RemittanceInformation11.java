package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:48 CET 2017 

******************************************************************************/

import com.xml2j.util.StringList;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * RemittanceInformation11 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class RemittanceInformation11 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for RemittanceInformation11.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public RemittanceInformation11(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type RemittanceInformation11.
	 */
	static class Allocator implements TypeAllocator<RemittanceInformation11> {
		/**
		 * method for getting a new instance of type RemittanceInformation11.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public RemittanceInformation11 newInstance(String elementName, ComplexDataType parent) {
			return new RemittanceInformation11(elementName, parent);
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
	
  	
  
	/** list of Ustrd element. 
	 *  @serial
	 */	
	private StringList m_ustrdList = new StringList("Ustrd");
	
	/** list of Strd element. 
	 *  @serial
	 */	
	private List<StructuredRemittanceInformation13> m_strdList = new ArrayList<StructuredRemittanceInformation13>();
		
	/**
	 * Get the embedded list of Ustrd elements.
	 * @return list of items.
	 */
	public StringList getUstrds() {
		return m_ustrdList;
	}
		
	/**
	 * This method adds data to the list of Ustrd.
	 * @param data the item that needs to be added.
	 */
	void setUstrd(String data) {
		m_ustrdList.add(data);
	}
		
	/**
	 * Get the embedded list of Strd elements.
	 * @return list of items.
	 */
	public List<StructuredRemittanceInformation13> getStrds() {
		return m_strdList;
	}
		
	/**
	 * This method adds data to the list of Strd.
	 * @param data the item that needs to be added.
	 */
	void setStrd(StructuredRemittanceInformation13 data) {
		m_strdList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_ustrdList, ((RemittanceInformation11)that).m_ustrdList))
			return false;
		
		if (!Compare.equals(m_strdList, ((RemittanceInformation11)that).m_strdList))
			return false;
		
		return true;
	}	

  
  
}
