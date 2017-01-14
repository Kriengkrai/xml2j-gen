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
 * CustomerDirectDebitInitiationV06 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class CustomerDirectDebitInitiationV06 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CustomerDirectDebitInitiationV06.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CustomerDirectDebitInitiationV06(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CustomerDirectDebitInitiationV06.
	 */
	static class Allocator implements TypeAllocator<CustomerDirectDebitInitiationV06> {
		/**
		 * method for getting a new instance of type CustomerDirectDebitInitiationV06.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CustomerDirectDebitInitiationV06 newInstance(String elementName, ComplexDataType parent) {
			return new CustomerDirectDebitInitiationV06(elementName, parent);
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
	private GroupHeader55 m_grpHdr = null;
	
	/** list of PmtInf element. 
	 *  @serial
	 */	
	private List<PaymentInstruction18> m_pmtInfList = new ArrayList<PaymentInstruction18>();
	
	/** list of SplmtryData element. 
	 *  @serial
	 */	
	private List<SupplementaryData1> m_splmtryDataList = new ArrayList<SupplementaryData1>();
	
	/**
	 * Get the embedded GrpHdr element.
	 * @return the item.
	 */
	public GroupHeader55 getGrpHdr() {
		return m_grpHdr;
	}
		
	/**
	 * This method sets (overwrites) the element GrpHdr.
	 * @param data the item that needs to be added.
	 */
	void setGrpHdr(GroupHeader55 data) {
		m_grpHdr = data;
	}
		
	/**
	 * Get the embedded list of PmtInf elements.
	 * @return list of items.
	 */
	public List<PaymentInstruction18> getPmtInfs() {
		return m_pmtInfList;
	}
		
	/**
	 * This method adds data to the list of PmtInf.
	 * @param data the item that needs to be added.
	 */
	void setPmtInf(PaymentInstruction18 data) {
		m_pmtInfList.add(data);
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
  
		if (!Compare.equals(m_grpHdr, ((CustomerDirectDebitInitiationV06)that).m_grpHdr))
			return false;
		
		if (!Compare.equals(m_pmtInfList, ((CustomerDirectDebitInitiationV06)that).m_pmtInfList))
			return false;
		
		if (!Compare.equals(m_splmtryDataList, ((CustomerDirectDebitInitiationV06)that).m_splmtryDataList))
			return false;
		
		return true;
	}	

  
  
}
