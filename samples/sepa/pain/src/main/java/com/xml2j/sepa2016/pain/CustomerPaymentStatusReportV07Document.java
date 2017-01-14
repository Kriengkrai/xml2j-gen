package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:46 CET 2017 

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * CustomerPaymentStatusReportV07Document data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class CustomerPaymentStatusReportV07Document extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CustomerPaymentStatusReportV07Document.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CustomerPaymentStatusReportV07Document(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CustomerPaymentStatusReportV07Document.
	 */
	static class Allocator implements TypeAllocator<CustomerPaymentStatusReportV07Document> {
		/**
		 * method for getting a new instance of type CustomerPaymentStatusReportV07Document.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CustomerPaymentStatusReportV07Document newInstance(String elementName, ComplexDataType parent) {
			return new CustomerPaymentStatusReportV07Document(elementName, parent);
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
	
  	
  
	/** element item for CstmrPmtStsRpt element. 
	 *  @serial
	 */	
	private CustomerPaymentStatusReportV07 m_cstmrPmtStsRpt = null;
	
	/**
	 * Get the embedded CstmrPmtStsRpt element.
	 * @return the item.
	 */
	public CustomerPaymentStatusReportV07 getCstmrPmtStsRpt() {
		return m_cstmrPmtStsRpt;
	}
		
	/**
	 * This method sets (overwrites) the element CstmrPmtStsRpt.
	 * @param data the item that needs to be added.
	 */
	void setCstmrPmtStsRpt(CustomerPaymentStatusReportV07 data) {
		m_cstmrPmtStsRpt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_cstmrPmtStsRpt, ((CustomerPaymentStatusReportV07Document)that).m_cstmrPmtStsRpt))
			return false;
		
		return true;
	}	

  
  
}
