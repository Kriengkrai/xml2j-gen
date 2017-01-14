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
 * RemittanceAmount2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class RemittanceAmount2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for RemittanceAmount2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public RemittanceAmount2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type RemittanceAmount2.
	 */
	static class Allocator implements TypeAllocator<RemittanceAmount2> {
		/**
		 * method for getting a new instance of type RemittanceAmount2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public RemittanceAmount2 newInstance(String elementName, ComplexDataType parent) {
			return new RemittanceAmount2(elementName, parent);
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
	
  	
  
	/** element item for DuePyblAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_duePyblAmt = null;
	
	/** list of DscntApldAmt element. 
	 *  @serial
	 */	
	private List<DiscountAmountAndType1> m_dscntApldAmtList = new ArrayList<DiscountAmountAndType1>();
	
	/** element item for CdtNoteAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_cdtNoteAmt = null;
	
	/** list of TaxAmt element. 
	 *  @serial
	 */	
	private List<TaxAmountAndType1> m_taxAmtList = new ArrayList<TaxAmountAndType1>();
	
	/** list of AdjstmntAmtAndRsn element. 
	 *  @serial
	 */	
	private List<DocumentAdjustment1> m_adjstmntAmtAndRsnList = new ArrayList<DocumentAdjustment1>();
	
	/** element item for RmtdAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_rmtdAmt = null;
	
	/**
	 * Get the embedded DuePyblAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getDuePyblAmt() {
		return m_duePyblAmt;
	}
		
	/**
	 * This method sets (overwrites) the element DuePyblAmt.
	 * @param data the item that needs to be added.
	 */
	void setDuePyblAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_duePyblAmt = data;
	}
		
	/**
	 * Get the embedded list of DscntApldAmt elements.
	 * @return list of items.
	 */
	public List<DiscountAmountAndType1> getDscntApldAmts() {
		return m_dscntApldAmtList;
	}
		
	/**
	 * This method adds data to the list of DscntApldAmt.
	 * @param data the item that needs to be added.
	 */
	void setDscntApldAmt(DiscountAmountAndType1 data) {
		m_dscntApldAmtList.add(data);
	}
		
	/**
	 * Get the embedded CdtNoteAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getCdtNoteAmt() {
		return m_cdtNoteAmt;
	}
		
	/**
	 * This method sets (overwrites) the element CdtNoteAmt.
	 * @param data the item that needs to be added.
	 */
	void setCdtNoteAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_cdtNoteAmt = data;
	}
		
	/**
	 * Get the embedded list of TaxAmt elements.
	 * @return list of items.
	 */
	public List<TaxAmountAndType1> getTaxAmts() {
		return m_taxAmtList;
	}
		
	/**
	 * This method adds data to the list of TaxAmt.
	 * @param data the item that needs to be added.
	 */
	void setTaxAmt(TaxAmountAndType1 data) {
		m_taxAmtList.add(data);
	}
		
	/**
	 * Get the embedded list of AdjstmntAmtAndRsn elements.
	 * @return list of items.
	 */
	public List<DocumentAdjustment1> getAdjstmntAmtAndRsns() {
		return m_adjstmntAmtAndRsnList;
	}
		
	/**
	 * This method adds data to the list of AdjstmntAmtAndRsn.
	 * @param data the item that needs to be added.
	 */
	void setAdjstmntAmtAndRsn(DocumentAdjustment1 data) {
		m_adjstmntAmtAndRsnList.add(data);
	}
		
	/**
	 * Get the embedded RmtdAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
		return m_rmtdAmt;
	}
		
	/**
	 * This method sets (overwrites) the element RmtdAmt.
	 * @param data the item that needs to be added.
	 */
	void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_rmtdAmt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_duePyblAmt, ((RemittanceAmount2)that).m_duePyblAmt))
			return false;
		
		if (!Compare.equals(m_dscntApldAmtList, ((RemittanceAmount2)that).m_dscntApldAmtList))
			return false;
		
		if (!Compare.equals(m_cdtNoteAmt, ((RemittanceAmount2)that).m_cdtNoteAmt))
			return false;
		
		if (!Compare.equals(m_taxAmtList, ((RemittanceAmount2)that).m_taxAmtList))
			return false;
		
		if (!Compare.equals(m_adjstmntAmtAndRsnList, ((RemittanceAmount2)that).m_adjstmntAmtAndRsnList))
			return false;
		
		if (!Compare.equals(m_rmtdAmt, ((RemittanceAmount2)that).m_rmtdAmt))
			return false;
		
		return true;
	}	

  
  
}
