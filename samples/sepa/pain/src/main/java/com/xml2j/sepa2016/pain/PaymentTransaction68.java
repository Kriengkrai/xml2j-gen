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
 * PaymentTransaction68 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class PaymentTransaction68 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentTransaction68.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentTransaction68(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentTransaction68.
	 */
	static class Allocator implements TypeAllocator<PaymentTransaction68> {
		/**
		 * method for getting a new instance of type PaymentTransaction68.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentTransaction68 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentTransaction68(elementName, parent);
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
	
  	
  
	/** element item for StsId element. 
	 *  @serial
	 */	
	private String m_stsId = null;
	
	/** element item for OrgnlInstrId element. 
	 *  @serial
	 */	
	private String m_orgnlInstrId = null;
	
	/** element item for OrgnlEndToEndId element. 
	 *  @serial
	 */	
	private String m_orgnlEndToEndId = null;
	
	/** element item for TxSts element. 
	 *  @serial
	 */	
	private String m_txSts = null;
	
	/** list of StsRsnInf element. 
	 *  @serial
	 */	
	private List<StatusReasonInformation9> m_stsRsnInfList = new ArrayList<StatusReasonInformation9>();
	
	/** list of ChrgsInf element. 
	 *  @serial
	 */	
	private List<Charges2> m_chrgsInfList = new ArrayList<Charges2>();
	
	/** element item for AccptncDtTm element. 
	 *  @serial
	 */	
	private String m_accptncDtTm = null;
	
	/** element item for AcctSvcrRef element. 
	 *  @serial
	 */	
	private String m_acctSvcrRef = null;
	
	/** element item for ClrSysRef element. 
	 *  @serial
	 */	
	private String m_clrSysRef = null;
	
	/** element item for OrgnlTxRef element. 
	 *  @serial
	 */	
	private OriginalTransactionReference22 m_orgnlTxRef = null;
	
	/** list of SplmtryData element. 
	 *  @serial
	 */	
	private List<SupplementaryData1> m_splmtryDataList = new ArrayList<SupplementaryData1>();
	
	/**
	 * Get the embedded StsId element.
	 * @return the item.
	 */
	public String getStsId() {
		return m_stsId;
	}
		
	/**
	 * This method sets (overwrites) the element StsId.
	 * @param data the item that needs to be added.
	 */
	void setStsId(String data) {
		m_stsId = data;
	}
		
	/**
	 * Get the embedded OrgnlInstrId element.
	 * @return the item.
	 */
	public String getOrgnlInstrId() {
		return m_orgnlInstrId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlInstrId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlInstrId(String data) {
		m_orgnlInstrId = data;
	}
		
	/**
	 * Get the embedded OrgnlEndToEndId element.
	 * @return the item.
	 */
	public String getOrgnlEndToEndId() {
		return m_orgnlEndToEndId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlEndToEndId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlEndToEndId(String data) {
		m_orgnlEndToEndId = data;
	}
		
	/**
	 * Get the embedded TxSts element.
	 * @return the item.
	 */
	public String getTxSts() {
		return m_txSts;
	}
		
	/**
	 * This method sets (overwrites) the element TxSts.
	 * @param data the item that needs to be added.
	 */
	void setTxSts(String data) {
		m_txSts = data;
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
	 * Get the embedded list of ChrgsInf elements.
	 * @return list of items.
	 */
	public List<Charges2> getChrgsInfs() {
		return m_chrgsInfList;
	}
		
	/**
	 * This method adds data to the list of ChrgsInf.
	 * @param data the item that needs to be added.
	 */
	void setChrgsInf(Charges2 data) {
		m_chrgsInfList.add(data);
	}
		
	/**
	 * Get the embedded AccptncDtTm element.
	 * @return the item.
	 */
	public String getAccptncDtTm() {
		return m_accptncDtTm;
	}
		
	/**
	 * This method sets (overwrites) the element AccptncDtTm.
	 * @param data the item that needs to be added.
	 */
	void setAccptncDtTm(String data) {
		m_accptncDtTm = data;
	}
		
	/**
	 * Get the embedded AcctSvcrRef element.
	 * @return the item.
	 */
	public String getAcctSvcrRef() {
		return m_acctSvcrRef;
	}
		
	/**
	 * This method sets (overwrites) the element AcctSvcrRef.
	 * @param data the item that needs to be added.
	 */
	void setAcctSvcrRef(String data) {
		m_acctSvcrRef = data;
	}
		
	/**
	 * Get the embedded ClrSysRef element.
	 * @return the item.
	 */
	public String getClrSysRef() {
		return m_clrSysRef;
	}
		
	/**
	 * This method sets (overwrites) the element ClrSysRef.
	 * @param data the item that needs to be added.
	 */
	void setClrSysRef(String data) {
		m_clrSysRef = data;
	}
		
	/**
	 * Get the embedded OrgnlTxRef element.
	 * @return the item.
	 */
	public OriginalTransactionReference22 getOrgnlTxRef() {
		return m_orgnlTxRef;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlTxRef.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlTxRef(OriginalTransactionReference22 data) {
		m_orgnlTxRef = data;
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
  
		if (!Compare.equals(m_stsId, ((PaymentTransaction68)that).m_stsId))
			return false;
		
		if (!Compare.equals(m_orgnlInstrId, ((PaymentTransaction68)that).m_orgnlInstrId))
			return false;
		
		if (!Compare.equals(m_orgnlEndToEndId, ((PaymentTransaction68)that).m_orgnlEndToEndId))
			return false;
		
		if (!Compare.equals(m_txSts, ((PaymentTransaction68)that).m_txSts))
			return false;
		
		if (!Compare.equals(m_stsRsnInfList, ((PaymentTransaction68)that).m_stsRsnInfList))
			return false;
		
		if (!Compare.equals(m_chrgsInfList, ((PaymentTransaction68)that).m_chrgsInfList))
			return false;
		
		if (!Compare.equals(m_accptncDtTm, ((PaymentTransaction68)that).m_accptncDtTm))
			return false;
		
		if (!Compare.equals(m_acctSvcrRef, ((PaymentTransaction68)that).m_acctSvcrRef))
			return false;
		
		if (!Compare.equals(m_clrSysRef, ((PaymentTransaction68)that).m_clrSysRef))
			return false;
		
		if (!Compare.equals(m_orgnlTxRef, ((PaymentTransaction68)that).m_orgnlTxRef))
			return false;
		
		if (!Compare.equals(m_splmtryDataList, ((PaymentTransaction68)that).m_splmtryDataList))
			return false;
		
		return true;
	}	

  
  
}
