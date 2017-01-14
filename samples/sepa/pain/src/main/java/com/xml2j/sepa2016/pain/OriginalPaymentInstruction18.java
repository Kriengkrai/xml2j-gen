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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OriginalPaymentInstruction18 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class OriginalPaymentInstruction18 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OriginalPaymentInstruction18.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OriginalPaymentInstruction18(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OriginalPaymentInstruction18.
	 */
	static class Allocator implements TypeAllocator<OriginalPaymentInstruction18> {
		/**
		 * method for getting a new instance of type OriginalPaymentInstruction18.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OriginalPaymentInstruction18 newInstance(String elementName, ComplexDataType parent) {
			return new OriginalPaymentInstruction18(elementName, parent);
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
	
  	
  
	/** element item for OrgnlPmtInfId element. 
	 *  @serial
	 */	
	private String m_orgnlPmtInfId = null;
	
	/** element item for OrgnlNbOfTxs element. 
	 *  @serial
	 */	
	private String m_orgnlNbOfTxs = null;
	
	/** element item for OrgnlCtrlSum element. 
	 *  @serial
	 */	
	private String m_orgnlCtrlSum = null;
	
	/** element item for PmtInfSts element. 
	 *  @serial
	 */	
	private String m_pmtInfSts = null;
	
	/** list of StsRsnInf element. 
	 *  @serial
	 */	
	private List<StatusReasonInformation9> m_stsRsnInfList = new ArrayList<StatusReasonInformation9>();
	
	/** list of NbOfTxsPerSts element. 
	 *  @serial
	 */	
	private List<NumberOfTransactionsPerStatus3> m_nbOfTxsPerStsList = new ArrayList<NumberOfTransactionsPerStatus3>();
	
	/** list of TxInfAndSts element. 
	 *  @serial
	 */	
	private List<PaymentTransaction68> m_txInfAndStsList = new ArrayList<PaymentTransaction68>();
	
	/**
	 * Get the embedded OrgnlPmtInfId element.
	 * @return the item.
	 */
	public String getOrgnlPmtInfId() {
		return m_orgnlPmtInfId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlPmtInfId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlPmtInfId(String data) {
		m_orgnlPmtInfId = data;
	}
		
	/**
	 * Get the embedded OrgnlNbOfTxs element.
	 * @return the item.
	 */
	public String getOrgnlNbOfTxs() {
		return m_orgnlNbOfTxs;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlNbOfTxs.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlNbOfTxs(String data) {
		m_orgnlNbOfTxs = data;
	}
		
	/**
	 * Get the embedded OrgnlCtrlSum element.
	 * @return the item.
	 */
	public String getOrgnlCtrlSum() {
		return m_orgnlCtrlSum;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlCtrlSum.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlCtrlSum(String data) {
		m_orgnlCtrlSum = data;
	}
		
	/**
	 * Get the embedded PmtInfSts element.
	 * @return the item.
	 */
	public String getPmtInfSts() {
		return m_pmtInfSts;
	}
		
	/**
	 * This method sets (overwrites) the element PmtInfSts.
	 * @param data the item that needs to be added.
	 */
	void setPmtInfSts(String data) {
		m_pmtInfSts = data;
	}
		
	/**
	 * Get the embedded list of StsRsnInf elements.
	 * @return list of items.
	 */
	public List<StatusReasonInformation9> getStsRsnInfs() {
		return m_stsRsnInfList;
	}
		
	/**
	 * This method adds data to the list of StsRsnInf.
	 * @param data the item that needs to be added.
	 */
	void setStsRsnInf(StatusReasonInformation9 data) {
		m_stsRsnInfList.add(data);
	}
		
	/**
	 * Get the embedded list of NbOfTxsPerSts elements.
	 * @return list of items.
	 */
	public List<NumberOfTransactionsPerStatus3> getNbOfTxsPerStss() {
		return m_nbOfTxsPerStsList;
	}
		
	/**
	 * This method adds data to the list of NbOfTxsPerSts.
	 * @param data the item that needs to be added.
	 */
	void setNbOfTxsPerSts(NumberOfTransactionsPerStatus3 data) {
		m_nbOfTxsPerStsList.add(data);
	}
		
	/**
	 * Get the embedded list of TxInfAndSts elements.
	 * @return list of items.
	 */
	public List<PaymentTransaction68> getTxInfAndStss() {
		return m_txInfAndStsList;
	}
		
	/**
	 * This method adds data to the list of TxInfAndSts.
	 * @param data the item that needs to be added.
	 */
	void setTxInfAndSts(PaymentTransaction68 data) {
		m_txInfAndStsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_orgnlPmtInfId, ((OriginalPaymentInstruction18)that).m_orgnlPmtInfId))
			return false;
		
		if (!Compare.equals(m_orgnlNbOfTxs, ((OriginalPaymentInstruction18)that).m_orgnlNbOfTxs))
			return false;
		
		if (!Compare.equals(m_orgnlCtrlSum, ((OriginalPaymentInstruction18)that).m_orgnlCtrlSum))
			return false;
		
		if (!Compare.equals(m_pmtInfSts, ((OriginalPaymentInstruction18)that).m_pmtInfSts))
			return false;
		
		if (!Compare.equals(m_stsRsnInfList, ((OriginalPaymentInstruction18)that).m_stsRsnInfList))
			return false;
		
		if (!Compare.equals(m_nbOfTxsPerStsList, ((OriginalPaymentInstruction18)that).m_nbOfTxsPerStsList))
			return false;
		
		if (!Compare.equals(m_txInfAndStsList, ((OriginalPaymentInstruction18)that).m_txInfAndStsList))
			return false;
		
		return true;
	}	

  
  
}
