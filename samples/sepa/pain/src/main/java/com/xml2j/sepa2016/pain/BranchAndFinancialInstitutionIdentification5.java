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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * BranchAndFinancialInstitutionIdentification5 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class BranchAndFinancialInstitutionIdentification5 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for BranchAndFinancialInstitutionIdentification5.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BranchAndFinancialInstitutionIdentification5(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BranchAndFinancialInstitutionIdentification5.
	 */
	static class Allocator implements TypeAllocator<BranchAndFinancialInstitutionIdentification5> {
		/**
		 * method for getting a new instance of type BranchAndFinancialInstitutionIdentification5.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public BranchAndFinancialInstitutionIdentification5 newInstance(String elementName, ComplexDataType parent) {
			return new BranchAndFinancialInstitutionIdentification5(elementName, parent);
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
	
  	
  
	/** element item for FinInstnId element. 
	 *  @serial
	 */	
	private FinancialInstitutionIdentification8 m_finInstnId = null;
	
	/** element item for BrnchId element. 
	 *  @serial
	 */	
	private BranchData2 m_brnchId = null;
	
	/**
	 * Get the embedded FinInstnId element.
	 * @return the item.
	 */
	public FinancialInstitutionIdentification8 getFinInstnId() {
		return m_finInstnId;
	}
		
	/**
	 * This method sets (overwrites) the element FinInstnId.
	 * @param data the item that needs to be added.
	 */
	void setFinInstnId(FinancialInstitutionIdentification8 data) {
		m_finInstnId = data;
	}
		
	/**
	 * Get the embedded BrnchId element.
	 * @return the item.
	 */
	public BranchData2 getBrnchId() {
		return m_brnchId;
	}
		
	/**
	 * This method sets (overwrites) the element BrnchId.
	 * @param data the item that needs to be added.
	 */
	void setBrnchId(BranchData2 data) {
		m_brnchId = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_finInstnId, ((BranchAndFinancialInstitutionIdentification5)that).m_finInstnId))
			return false;
		
		if (!Compare.equals(m_brnchId, ((BranchAndFinancialInstitutionIdentification5)that).m_brnchId))
			return false;
		
		return true;
	}	

  
  
}
