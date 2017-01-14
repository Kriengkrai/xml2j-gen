package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:47 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * CustomerPaymentReversalV06 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class CustomerPaymentReversalV06 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CustomerPaymentReversalV06.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CustomerPaymentReversalV06(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CustomerPaymentReversalV06.
	 */
	static class Allocator implements TypeAllocator<CustomerPaymentReversalV06> {
		/**
		 * method for getting a new instance of type CustomerPaymentReversalV06.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CustomerPaymentReversalV06 newInstance(String elementName, ComplexDataType parent) {
			return new CustomerPaymentReversalV06(elementName, parent);
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
	
  	
  
	/** element item for GrpHdr element. 
	 *  @serial
	 */	
	private GroupHeader56 m_grpHdr = null;
	
	/** element item for OrgnlGrpInf element. 
	 *  @serial
	 */	
	private OriginalGroupHeader3 m_orgnlGrpInf = null;
	
	/** list of OrgnlPmtInfAndRvsl element. 
	 *  @serial
	 */	
	private List<OriginalPaymentInstruction16> m_orgnlPmtInfAndRvslList = new ArrayList<OriginalPaymentInstruction16>();
	
	/** list of SplmtryData element. 
	 *  @serial
	 */	
	private List<SupplementaryData1> m_splmtryDataList = new ArrayList<SupplementaryData1>();
	
	/**
	 * Get the embedded GrpHdr element.
	 * @return the item.
	 */
	public GroupHeader56 getGrpHdr() {
		return m_grpHdr;
	}
		
	/**
	 * This method sets (overwrites) the element GrpHdr.
	 * @param data the item that needs to be added.
	 */
	void setGrpHdr(GroupHeader56 data) {
		m_grpHdr = data;
	}
		
	/**
	 * Get the embedded OrgnlGrpInf element.
	 * @return the item.
	 */
	public OriginalGroupHeader3 getOrgnlGrpInf() {
		return m_orgnlGrpInf;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlGrpInf.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlGrpInf(OriginalGroupHeader3 data) {
		m_orgnlGrpInf = data;
	}
		
	/**
	 * Get the embedded list of OrgnlPmtInfAndRvsl elements.
	 * @return list of items.
	 */
	public List<OriginalPaymentInstruction16> getOrgnlPmtInfAndRvsls() {
		return m_orgnlPmtInfAndRvslList;
	}
		
	/**
	 * This method adds data to the list of OrgnlPmtInfAndRvsl.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlPmtInfAndRvsl(OriginalPaymentInstruction16 data) {
		m_orgnlPmtInfAndRvslList.add(data);
	}
		
	/**
	 * Get the embedded list of SplmtryData elements.
	 * @return list of items.
	 */
	public List<SupplementaryData1> getSplmtryDatas() {
		return m_splmtryDataList;
	}
		
	/**
	 * This method adds data to the list of SplmtryData.
	 * @param data the item that needs to be added.
	 */
	void setSplmtryData(SupplementaryData1 data) {
		m_splmtryDataList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_grpHdr, ((CustomerPaymentReversalV06)that).m_grpHdr))
			return false;
		
		if (!Compare.equals(m_orgnlGrpInf, ((CustomerPaymentReversalV06)that).m_orgnlGrpInf))
			return false;
		
		if (!Compare.equals(m_orgnlPmtInfAndRvslList, ((CustomerPaymentReversalV06)that).m_orgnlPmtInfAndRvslList))
			return false;
		
		if (!Compare.equals(m_splmtryDataList, ((CustomerPaymentReversalV06)that).m_splmtryDataList))
			return false;
		
		return true;
	}	

  
  
}
