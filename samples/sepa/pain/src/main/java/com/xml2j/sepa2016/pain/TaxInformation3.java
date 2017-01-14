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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TaxInformation3 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class TaxInformation3 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxInformation3.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxInformation3(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxInformation3.
	 */
	static class Allocator implements TypeAllocator<TaxInformation3> {
		/**
		 * method for getting a new instance of type TaxInformation3.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxInformation3 newInstance(String elementName, ComplexDataType parent) {
			return new TaxInformation3(elementName, parent);
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
	
  	
  
	/** element item for Cdtr element. 
	 *  @serial
	 */	
	private TaxParty1 m_cdtr = null;
	
	/** element item for Dbtr element. 
	 *  @serial
	 */	
	private TaxParty2 m_dbtr = null;
	
	/** element item for AdmstnZn element. 
	 *  @serial
	 */	
	private String m_admstnZn = null;
	
	/** element item for RefNb element. 
	 *  @serial
	 */	
	private String m_refNb = null;
	
	/** element item for Mtd element. 
	 *  @serial
	 */	
	private String m_mtd = null;
	
	/** element item for TtlTaxblBaseAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_ttlTaxblBaseAmt = null;
	
	/** element item for TtlTaxAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_ttlTaxAmt = null;
	
	/** element item for Dt element. 
	 *  @serial
	 */	
	private String m_dt = null;
	
	/** element item for SeqNb element. 
	 *  @serial
	 */	
	private String m_seqNb = null;
	
	/** list of Rcrd element. 
	 *  @serial
	 */	
	private List<TaxRecord1> m_rcrdList = new ArrayList<TaxRecord1>();
	
	/**
	 * Get the embedded Cdtr element.
	 * @return the item.
	 */
	public TaxParty1 getCdtr() {
		return m_cdtr;
	}
		
	/**
	 * This method sets (overwrites) the element Cdtr.
	 * @param data the item that needs to be added.
	 */
	void setCdtr(TaxParty1 data) {
		m_cdtr = data;
	}
		
	/**
	 * Get the embedded Dbtr element.
	 * @return the item.
	 */
	public TaxParty2 getDbtr() {
		return m_dbtr;
	}
		
	/**
	 * This method sets (overwrites) the element Dbtr.
	 * @param data the item that needs to be added.
	 */
	void setDbtr(TaxParty2 data) {
		m_dbtr = data;
	}
		
	/**
	 * Get the embedded AdmstnZn element.
	 * @return the item.
	 */
	public String getAdmstnZn() {
		return m_admstnZn;
	}
		
	/**
	 * This method sets (overwrites) the element AdmstnZn.
	 * @param data the item that needs to be added.
	 */
	void setAdmstnZn(String data) {
		m_admstnZn = data;
	}
		
	/**
	 * Get the embedded RefNb element.
	 * @return the item.
	 */
	public String getRefNb() {
		return m_refNb;
	}
		
	/**
	 * This method sets (overwrites) the element RefNb.
	 * @param data the item that needs to be added.
	 */
	void setRefNb(String data) {
		m_refNb = data;
	}
		
	/**
	 * Get the embedded Mtd element.
	 * @return the item.
	 */
	public String getMtd() {
		return m_mtd;
	}
		
	/**
	 * This method sets (overwrites) the element Mtd.
	 * @param data the item that needs to be added.
	 */
	void setMtd(String data) {
		m_mtd = data;
	}
		
	/**
	 * Get the embedded TtlTaxblBaseAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
		return m_ttlTaxblBaseAmt;
	}
		
	/**
	 * This method sets (overwrites) the element TtlTaxblBaseAmt.
	 * @param data the item that needs to be added.
	 */
	void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_ttlTaxblBaseAmt = data;
	}
		
	/**
	 * Get the embedded TtlTaxAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
		return m_ttlTaxAmt;
	}
		
	/**
	 * This method sets (overwrites) the element TtlTaxAmt.
	 * @param data the item that needs to be added.
	 */
	void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_ttlTaxAmt = data;
	}
		
	/**
	 * Get the embedded Dt element.
	 * @return the item.
	 */
	public String getDt() {
		return m_dt;
	}
		
	/**
	 * This method sets (overwrites) the element Dt.
	 * @param data the item that needs to be added.
	 */
	void setDt(String data) {
		m_dt = data;
	}
		
	/**
	 * Get the embedded SeqNb element.
	 * @return the item.
	 */
	public String getSeqNb() {
		return m_seqNb;
	}
		
	/**
	 * This method sets (overwrites) the element SeqNb.
	 * @param data the item that needs to be added.
	 */
	void setSeqNb(String data) {
		m_seqNb = data;
	}
		
	/**
	 * Get the embedded list of Rcrd elements.
	 * @return list of items.
	 */
	public List<TaxRecord1> getRcrds() {
		return m_rcrdList;
	}
		
	/**
	 * This method adds data to the list of Rcrd.
	 * @param data the item that needs to be added.
	 */
	void setRcrd(TaxRecord1 data) {
		m_rcrdList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_cdtr, ((TaxInformation3)that).m_cdtr))
			return false;
		
		if (!Compare.equals(m_dbtr, ((TaxInformation3)that).m_dbtr))
			return false;
		
		if (!Compare.equals(m_admstnZn, ((TaxInformation3)that).m_admstnZn))
			return false;
		
		if (!Compare.equals(m_refNb, ((TaxInformation3)that).m_refNb))
			return false;
		
		if (!Compare.equals(m_mtd, ((TaxInformation3)that).m_mtd))
			return false;
		
		if (!Compare.equals(m_ttlTaxblBaseAmt, ((TaxInformation3)that).m_ttlTaxblBaseAmt))
			return false;
		
		if (!Compare.equals(m_ttlTaxAmt, ((TaxInformation3)that).m_ttlTaxAmt))
			return false;
		
		if (!Compare.equals(m_dt, ((TaxInformation3)that).m_dt))
			return false;
		
		if (!Compare.equals(m_seqNb, ((TaxInformation3)that).m_seqNb))
			return false;
		
		if (!Compare.equals(m_rcrdList, ((TaxInformation3)that).m_rcrdList))
			return false;
		
		return true;
	}	

  
  
}
