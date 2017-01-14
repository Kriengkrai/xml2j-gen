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
 * PaymentTransaction64 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class PaymentTransaction64 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentTransaction64.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentTransaction64(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentTransaction64.
	 */
	static class Allocator implements TypeAllocator<PaymentTransaction64> {
		/**
		 * method for getting a new instance of type PaymentTransaction64.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentTransaction64 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentTransaction64(elementName, parent);
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
	
  	
  
	/** element item for RvslId element. 
	 *  @serial
	 */	
	private String m_rvslId = null;
	
	/** element item for OrgnlInstrId element. 
	 *  @serial
	 */	
	private String m_orgnlInstrId = null;
	
	/** element item for OrgnlEndToEndId element. 
	 *  @serial
	 */	
	private String m_orgnlEndToEndId = null;
	
	/** element item for OrgnlInstdAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_orgnlInstdAmt = null;
	
	/** element item for RvsdInstdAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_rvsdInstdAmt = null;
	
	/** element item for ChrgBr element. 
	 *  @serial
	 */	
	private String m_chrgBr = null;
	
	/** list of RvslRsnInf element. 
	 *  @serial
	 */	
	private List<PaymentReversalReason7> m_rvslRsnInfList = new ArrayList<PaymentReversalReason7>();
	
	/** element item for OrgnlTxRef element. 
	 *  @serial
	 */	
	private OriginalTransactionReference22 m_orgnlTxRef = null;
	
	/** list of SplmtryData element. 
	 *  @serial
	 */	
	private List<SupplementaryData1> m_splmtryDataList = new ArrayList<SupplementaryData1>();
	
	/**
	 * Get the embedded RvslId element.
	 * @return the item.
	 */
	public String getRvslId() {
		return m_rvslId;
	}
		
	/**
	 * This method sets (overwrites) the element RvslId.
	 * @param data the item that needs to be added.
	 */
	void setRvslId(String data) {
		m_rvslId = data;
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
	 * Get the embedded OrgnlInstdAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getOrgnlInstdAmt() {
		return m_orgnlInstdAmt;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlInstdAmt.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlInstdAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_orgnlInstdAmt = data;
	}
		
	/**
	 * Get the embedded RvsdInstdAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getRvsdInstdAmt() {
		return m_rvsdInstdAmt;
	}
		
	/**
	 * This method sets (overwrites) the element RvsdInstdAmt.
	 * @param data the item that needs to be added.
	 */
	void setRvsdInstdAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_rvsdInstdAmt = data;
	}
		
	/**
	 * Get the embedded ChrgBr element.
	 * @return the item.
	 */
	public String getChrgBr() {
		return m_chrgBr;
	}
		
	/**
	 * This method sets (overwrites) the element ChrgBr.
	 * @param data the item that needs to be added.
	 */
	void setChrgBr(String data) {
		m_chrgBr = data;
	}
		
	/**
	 * Get the embedded list of RvslRsnInf elements.
	 * @return list of items.
	 */
	public List<PaymentReversalReason7> getRvslRsnInfs() {
		return m_rvslRsnInfList;
	}
		
	/**
	 * This method adds data to the list of RvslRsnInf.
	 * @param data the item that needs to be added.
	 */
	void setRvslRsnInf(PaymentReversalReason7 data) {
		m_rvslRsnInfList.add(data);
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
  
		if (!Compare.equals(m_rvslId, ((PaymentTransaction64)that).m_rvslId))
			return false;
		
		if (!Compare.equals(m_orgnlInstrId, ((PaymentTransaction64)that).m_orgnlInstrId))
			return false;
		
		if (!Compare.equals(m_orgnlEndToEndId, ((PaymentTransaction64)that).m_orgnlEndToEndId))
			return false;
		
		if (!Compare.equals(m_orgnlInstdAmt, ((PaymentTransaction64)that).m_orgnlInstdAmt))
			return false;
		
		if (!Compare.equals(m_rvsdInstdAmt, ((PaymentTransaction64)that).m_rvsdInstdAmt))
			return false;
		
		if (!Compare.equals(m_chrgBr, ((PaymentTransaction64)that).m_chrgBr))
			return false;
		
		if (!Compare.equals(m_rvslRsnInfList, ((PaymentTransaction64)that).m_rvslRsnInfList))
			return false;
		
		if (!Compare.equals(m_orgnlTxRef, ((PaymentTransaction64)that).m_orgnlTxRef))
			return false;
		
		if (!Compare.equals(m_splmtryDataList, ((PaymentTransaction64)that).m_splmtryDataList))
			return false;
		
		return true;
	}	

  
  
}
