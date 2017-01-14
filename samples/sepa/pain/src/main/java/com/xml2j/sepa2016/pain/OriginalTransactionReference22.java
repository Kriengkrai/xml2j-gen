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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OriginalTransactionReference22 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class OriginalTransactionReference22 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OriginalTransactionReference22.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OriginalTransactionReference22(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OriginalTransactionReference22.
	 */
	static class Allocator implements TypeAllocator<OriginalTransactionReference22> {
		/**
		 * method for getting a new instance of type OriginalTransactionReference22.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OriginalTransactionReference22 newInstance(String elementName, ComplexDataType parent) {
			return new OriginalTransactionReference22(elementName, parent);
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
	
  	
  
	/** element item for IntrBkSttlmAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_intrBkSttlmAmt = null;
	
	/** element item for Amt element. 
	 *  @serial
	 */	
	private AmountType4Choice m_amt = null;
	
	/** element item for IntrBkSttlmDt element. 
	 *  @serial
	 */	
	private String m_intrBkSttlmDt = null;
	
	/** element item for ReqdColltnDt element. 
	 *  @serial
	 */	
	private String m_reqdColltnDt = null;
	
	/** element item for ReqdExctnDt element. 
	 *  @serial
	 */	
	private String m_reqdExctnDt = null;
	
	/** element item for CdtrSchmeId element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_cdtrSchmeId = null;
	
	/** element item for SttlmInf element. 
	 *  @serial
	 */	
	private SettlementInstruction4 m_sttlmInf = null;
	
	/** element item for PmtTpInf element. 
	 *  @serial
	 */	
	private PaymentTypeInformation25 m_pmtTpInf = null;
	
	/** element item for PmtMtd element. 
	 *  @serial
	 */	
	private String m_pmtMtd = null;
	
	/** element item for MndtRltdInf element. 
	 *  @serial
	 */	
	private MandateRelatedInformation10 m_mndtRltdInf = null;
	
	/** element item for RmtInf element. 
	 *  @serial
	 */	
	private RemittanceInformation11 m_rmtInf = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtDbtr = null;
	
	/** element item for Dbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_dbtr = null;
	
	/** element item for DbtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_dbtrAcct = null;
	
	/** element item for DbtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_dbtrAgt = null;
	
	/** element item for DbtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_dbtrAgtAcct = null;
	
	/** element item for CdtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_cdtrAgt = null;
	
	/** element item for CdtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_cdtrAgtAcct = null;
	
	/** element item for Cdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_cdtr = null;
	
	/** element item for CdtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_cdtrAcct = null;
	
	/** element item for UltmtCdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtCdtr = null;
	
	/**
	 * Get the embedded IntrBkSttlmAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getIntrBkSttlmAmt() {
		return m_intrBkSttlmAmt;
	}
		
	/**
	 * This method sets (overwrites) the element IntrBkSttlmAmt.
	 * @param data the item that needs to be added.
	 */
	void setIntrBkSttlmAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_intrBkSttlmAmt = data;
	}
		
	/**
	 * Get the embedded Amt element.
	 * @return the item.
	 */
	public AmountType4Choice getAmt() {
		return m_amt;
	}
		
	/**
	 * This method sets (overwrites) the element Amt.
	 * @param data the item that needs to be added.
	 */
	void setAmt(AmountType4Choice data) {
		m_amt = data;
	}
		
	/**
	 * Get the embedded IntrBkSttlmDt element.
	 * @return the item.
	 */
	public String getIntrBkSttlmDt() {
		return m_intrBkSttlmDt;
	}
		
	/**
	 * This method sets (overwrites) the element IntrBkSttlmDt.
	 * @param data the item that needs to be added.
	 */
	void setIntrBkSttlmDt(String data) {
		m_intrBkSttlmDt = data;
	}
		
	/**
	 * Get the embedded ReqdColltnDt element.
	 * @return the item.
	 */
	public String getReqdColltnDt() {
		return m_reqdColltnDt;
	}
		
	/**
	 * This method sets (overwrites) the element ReqdColltnDt.
	 * @param data the item that needs to be added.
	 */
	void setReqdColltnDt(String data) {
		m_reqdColltnDt = data;
	}
		
	/**
	 * Get the embedded ReqdExctnDt element.
	 * @return the item.
	 */
	public String getReqdExctnDt() {
		return m_reqdExctnDt;
	}
		
	/**
	 * This method sets (overwrites) the element ReqdExctnDt.
	 * @param data the item that needs to be added.
	 */
	void setReqdExctnDt(String data) {
		m_reqdExctnDt = data;
	}
		
	/**
	 * Get the embedded CdtrSchmeId element.
	 * @return the item.
	 */
	public PartyIdentification43 getCdtrSchmeId() {
		return m_cdtrSchmeId;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrSchmeId.
	 * @param data the item that needs to be added.
	 */
	void setCdtrSchmeId(PartyIdentification43 data) {
		m_cdtrSchmeId = data;
	}
		
	/**
	 * Get the embedded SttlmInf element.
	 * @return the item.
	 */
	public SettlementInstruction4 getSttlmInf() {
		return m_sttlmInf;
	}
		
	/**
	 * This method sets (overwrites) the element SttlmInf.
	 * @param data the item that needs to be added.
	 */
	void setSttlmInf(SettlementInstruction4 data) {
		m_sttlmInf = data;
	}
		
	/**
	 * Get the embedded PmtTpInf element.
	 * @return the item.
	 */
	public PaymentTypeInformation25 getPmtTpInf() {
		return m_pmtTpInf;
	}
		
	/**
	 * This method sets (overwrites) the element PmtTpInf.
	 * @param data the item that needs to be added.
	 */
	void setPmtTpInf(PaymentTypeInformation25 data) {
		m_pmtTpInf = data;
	}
		
	/**
	 * Get the embedded PmtMtd element.
	 * @return the item.
	 */
	public String getPmtMtd() {
		return m_pmtMtd;
	}
		
	/**
	 * This method sets (overwrites) the element PmtMtd.
	 * @param data the item that needs to be added.
	 */
	void setPmtMtd(String data) {
		m_pmtMtd = data;
	}
		
	/**
	 * Get the embedded MndtRltdInf element.
	 * @return the item.
	 */
	public MandateRelatedInformation10 getMndtRltdInf() {
		return m_mndtRltdInf;
	}
		
	/**
	 * This method sets (overwrites) the element MndtRltdInf.
	 * @param data the item that needs to be added.
	 */
	void setMndtRltdInf(MandateRelatedInformation10 data) {
		m_mndtRltdInf = data;
	}
		
	/**
	 * Get the embedded RmtInf element.
	 * @return the item.
	 */
	public RemittanceInformation11 getRmtInf() {
		return m_rmtInf;
	}
		
	/**
	 * This method sets (overwrites) the element RmtInf.
	 * @param data the item that needs to be added.
	 */
	void setRmtInf(RemittanceInformation11 data) {
		m_rmtInf = data;
	}
		
	/**
	 * Get the embedded UltmtDbtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getUltmtDbtr() {
		return m_ultmtDbtr;
	}
		
	/**
	 * This method sets (overwrites) the element UltmtDbtr.
	 * @param data the item that needs to be added.
	 */
	void setUltmtDbtr(PartyIdentification43 data) {
		m_ultmtDbtr = data;
	}
		
	/**
	 * Get the embedded Dbtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getDbtr() {
		return m_dbtr;
	}
		
	/**
	 * This method sets (overwrites) the element Dbtr.
	 * @param data the item that needs to be added.
	 */
	void setDbtr(PartyIdentification43 data) {
		m_dbtr = data;
	}
		
	/**
	 * Get the embedded DbtrAcct element.
	 * @return the item.
	 */
	public CashAccount24 getDbtrAcct() {
		return m_dbtrAcct;
	}
		
	/**
	 * This method sets (overwrites) the element DbtrAcct.
	 * @param data the item that needs to be added.
	 */
	void setDbtrAcct(CashAccount24 data) {
		m_dbtrAcct = data;
	}
		
	/**
	 * Get the embedded DbtrAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getDbtrAgt() {
		return m_dbtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element DbtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setDbtrAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_dbtrAgt = data;
	}
		
	/**
	 * Get the embedded DbtrAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getDbtrAgtAcct() {
		return m_dbtrAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element DbtrAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setDbtrAgtAcct(CashAccount24 data) {
		m_dbtrAgtAcct = data;
	}
		
	/**
	 * Get the embedded CdtrAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getCdtrAgt() {
		return m_cdtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_cdtrAgt = data;
	}
		
	/**
	 * Get the embedded CdtrAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getCdtrAgtAcct() {
		return m_cdtrAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAgtAcct(CashAccount24 data) {
		m_cdtrAgtAcct = data;
	}
		
	/**
	 * Get the embedded Cdtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getCdtr() {
		return m_cdtr;
	}
		
	/**
	 * This method sets (overwrites) the element Cdtr.
	 * @param data the item that needs to be added.
	 */
	void setCdtr(PartyIdentification43 data) {
		m_cdtr = data;
	}
		
	/**
	 * Get the embedded CdtrAcct element.
	 * @return the item.
	 */
	public CashAccount24 getCdtrAcct() {
		return m_cdtrAcct;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAcct.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAcct(CashAccount24 data) {
		m_cdtrAcct = data;
	}
		
	/**
	 * Get the embedded UltmtCdtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getUltmtCdtr() {
		return m_ultmtCdtr;
	}
		
	/**
	 * This method sets (overwrites) the element UltmtCdtr.
	 * @param data the item that needs to be added.
	 */
	void setUltmtCdtr(PartyIdentification43 data) {
		m_ultmtCdtr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_intrBkSttlmAmt, ((OriginalTransactionReference22)that).m_intrBkSttlmAmt))
			return false;
		
		if (!Compare.equals(m_amt, ((OriginalTransactionReference22)that).m_amt))
			return false;
		
		if (!Compare.equals(m_intrBkSttlmDt, ((OriginalTransactionReference22)that).m_intrBkSttlmDt))
			return false;
		
		if (!Compare.equals(m_reqdColltnDt, ((OriginalTransactionReference22)that).m_reqdColltnDt))
			return false;
		
		if (!Compare.equals(m_reqdExctnDt, ((OriginalTransactionReference22)that).m_reqdExctnDt))
			return false;
		
		if (!Compare.equals(m_cdtrSchmeId, ((OriginalTransactionReference22)that).m_cdtrSchmeId))
			return false;
		
		if (!Compare.equals(m_sttlmInf, ((OriginalTransactionReference22)that).m_sttlmInf))
			return false;
		
		if (!Compare.equals(m_pmtTpInf, ((OriginalTransactionReference22)that).m_pmtTpInf))
			return false;
		
		if (!Compare.equals(m_pmtMtd, ((OriginalTransactionReference22)that).m_pmtMtd))
			return false;
		
		if (!Compare.equals(m_mndtRltdInf, ((OriginalTransactionReference22)that).m_mndtRltdInf))
			return false;
		
		if (!Compare.equals(m_rmtInf, ((OriginalTransactionReference22)that).m_rmtInf))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, ((OriginalTransactionReference22)that).m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_dbtr, ((OriginalTransactionReference22)that).m_dbtr))
			return false;
		
		if (!Compare.equals(m_dbtrAcct, ((OriginalTransactionReference22)that).m_dbtrAcct))
			return false;
		
		if (!Compare.equals(m_dbtrAgt, ((OriginalTransactionReference22)that).m_dbtrAgt))
			return false;
		
		if (!Compare.equals(m_dbtrAgtAcct, ((OriginalTransactionReference22)that).m_dbtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_cdtrAgt, ((OriginalTransactionReference22)that).m_cdtrAgt))
			return false;
		
		if (!Compare.equals(m_cdtrAgtAcct, ((OriginalTransactionReference22)that).m_cdtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_cdtr, ((OriginalTransactionReference22)that).m_cdtr))
			return false;
		
		if (!Compare.equals(m_cdtrAcct, ((OriginalTransactionReference22)that).m_cdtrAcct))
			return false;
		
		if (!Compare.equals(m_ultmtCdtr, ((OriginalTransactionReference22)that).m_ultmtCdtr))
			return false;
		
		return true;
	}	

  
  
}
