package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:45 CET 2017 

******************************************************************************/

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * PaymentInstruction20 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
@Document (collection="PaymentInstructions")
@CompoundIndex(name = "pmnt_idx", def = "{'msgId': 1, 'm_pmtInfId': 1}", unique = true)
public class PaymentInstruction20 extends ComplexDataType {

	@Id
	long pmtInfId;
	public void setKeyPmtInfId(long pmnInfId) {
		this.pmtInfId = pmnInfId;
	}	
	public long getPmntInstrId() {
		return this.pmtInfId;
	}

	@Indexed
	private long msgId;
	public void setKeyMsgId(long msgId) {
		this.msgId = msgId; 
	}
	public long getKeyMsgId() {
		return this.msgId;
	}

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentInstruction20.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentInstruction20(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentInstruction20.
	 */
	static class Allocator implements TypeAllocator<PaymentInstruction20> {
		/**
		 * method for getting a new instance of type PaymentInstruction20.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentInstruction20 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentInstruction20(elementName, parent);
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
	
  	
  
	/** element item for PmtInfId element. 
	 *  @serial
	 */	
	private String m_pmtInfId = null;
	
	/** element item for PmtMtd element. 
	 *  @serial
	 */	
	private String m_pmtMtd = null;
	
	/** element item for BtchBookg element. 
	 *  @serial
	 */	
	private String m_btchBookg = null;
	
	/** element item for NbOfTxs element. 
	 *  @serial
	 */	
	private String m_nbOfTxs = null;
	
	/** element item for CtrlSum element. 
	 *  @serial
	 */	
	private String m_ctrlSum = null;
	
	/** element item for PmtTpInf element. 
	 *  @serial
	 */	
	private PaymentTypeInformation19 m_pmtTpInf = null;
	
	/** element item for ReqdExctnDt element. 
	 *  @serial
	 */	
	private String m_reqdExctnDt = null;
	
	/** element item for PoolgAdjstmntDt element. 
	 *  @serial
	 */	
	private String m_poolgAdjstmntDt = null;
	
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
	
	/** element item for InstrForDbtrAgt element. 
	 *  @serial
	 */	
	private String m_instrForDbtrAgt = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtDbtr = null;
	
	/** element item for ChrgBr element. 
	 *  @serial
	 */	
	private String m_chrgBr = null;
	
	/** element item for ChrgsAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_chrgsAcct = null;
	
	/** element item for ChrgsAcctAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_chrgsAcctAgt = null;
	
	/** list of CdtTrfTxInf element. 
	 *  @serial
	 */	
	private List<CreditTransferTransaction26> m_cdtTrfTxInfList = new ArrayList<CreditTransferTransaction26>();
	
	/**
	 * Get the embedded PmtInfId element.
	 * @return the item.
	 */
	public String getPmtInfId() {
		return m_pmtInfId;
	}
		
	/**
	 * This method sets (overwrites) the element PmtInfId.
	 * @param data the item that needs to be added.
	 */
	void setPmtInfId(String data) {
		m_pmtInfId = data;
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
	 * Get the embedded BtchBookg element.
	 * @return the item.
	 */
	public String getBtchBookg() {
		return m_btchBookg;
	}
		
	/**
	 * This method sets (overwrites) the element BtchBookg.
	 * @param data the item that needs to be added.
	 */
	void setBtchBookg(String data) {
		m_btchBookg = data;
	}
		
	/**
	 * Get the embedded NbOfTxs element.
	 * @return the item.
	 */
	public String getNbOfTxs() {
		return m_nbOfTxs;
	}
		
	/**
	 * This method sets (overwrites) the element NbOfTxs.
	 * @param data the item that needs to be added.
	 */
	void setNbOfTxs(String data) {
		m_nbOfTxs = data;
	}
		
	/**
	 * Get the embedded CtrlSum element.
	 * @return the item.
	 */
	public String getCtrlSum() {
		return m_ctrlSum;
	}
		
	/**
	 * This method sets (overwrites) the element CtrlSum.
	 * @param data the item that needs to be added.
	 */
	void setCtrlSum(String data) {
		m_ctrlSum = data;
	}
		
	/**
	 * Get the embedded PmtTpInf element.
	 * @return the item.
	 */
	public PaymentTypeInformation19 getPmtTpInf() {
		return m_pmtTpInf;
	}
		
	/**
	 * This method sets (overwrites) the element PmtTpInf.
	 * @param data the item that needs to be added.
	 */
	void setPmtTpInf(PaymentTypeInformation19 data) {
		m_pmtTpInf = data;
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
	 * Get the embedded PoolgAdjstmntDt element.
	 * @return the item.
	 */
	public String getPoolgAdjstmntDt() {
		return m_poolgAdjstmntDt;
	}
		
	/**
	 * This method sets (overwrites) the element PoolgAdjstmntDt.
	 * @param data the item that needs to be added.
	 */
	void setPoolgAdjstmntDt(String data) {
		m_poolgAdjstmntDt = data;
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
	 * Get the embedded InstrForDbtrAgt element.
	 * @return the item.
	 */
	public String getInstrForDbtrAgt() {
		return m_instrForDbtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element InstrForDbtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setInstrForDbtrAgt(String data) {
		m_instrForDbtrAgt = data;
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
	 * Get the embedded ChrgsAcct element.
	 * @return the item.
	 */
	public CashAccount24 getChrgsAcct() {
		return m_chrgsAcct;
	}
		
	/**
	 * This method sets (overwrites) the element ChrgsAcct.
	 * @param data the item that needs to be added.
	 */
	void setChrgsAcct(CashAccount24 data) {
		m_chrgsAcct = data;
	}
		
	/**
	 * Get the embedded ChrgsAcctAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getChrgsAcctAgt() {
		return m_chrgsAcctAgt;
	}
		
	/**
	 * This method sets (overwrites) the element ChrgsAcctAgt.
	 * @param data the item that needs to be added.
	 */
	void setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_chrgsAcctAgt = data;
	}
		
	/**
	 * Get the embedded list of CdtTrfTxInf elements.
	 * @return list of items.
	 */
	public List<CreditTransferTransaction26> getCdtTrfTxInfs() {
		return m_cdtTrfTxInfList;
	}
		
	/**
	 * This method adds data to the list of CdtTrfTxInf.
	 * @param data the item that needs to be added.
	 */
	void setCdtTrfTxInf(CreditTransferTransaction26 data) {
		m_cdtTrfTxInfList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_pmtInfId, ((PaymentInstruction20)that).m_pmtInfId))
			return false;
		
		if (!Compare.equals(m_pmtMtd, ((PaymentInstruction20)that).m_pmtMtd))
			return false;
		
		if (!Compare.equals(m_btchBookg, ((PaymentInstruction20)that).m_btchBookg))
			return false;
		
		if (!Compare.equals(m_nbOfTxs, ((PaymentInstruction20)that).m_nbOfTxs))
			return false;
		
		if (!Compare.equals(m_ctrlSum, ((PaymentInstruction20)that).m_ctrlSum))
			return false;
		
		if (!Compare.equals(m_pmtTpInf, ((PaymentInstruction20)that).m_pmtTpInf))
			return false;
		
		if (!Compare.equals(m_reqdExctnDt, ((PaymentInstruction20)that).m_reqdExctnDt))
			return false;
		
		if (!Compare.equals(m_poolgAdjstmntDt, ((PaymentInstruction20)that).m_poolgAdjstmntDt))
			return false;
		
		if (!Compare.equals(m_dbtr, ((PaymentInstruction20)that).m_dbtr))
			return false;
		
		if (!Compare.equals(m_dbtrAcct, ((PaymentInstruction20)that).m_dbtrAcct))
			return false;
		
		if (!Compare.equals(m_dbtrAgt, ((PaymentInstruction20)that).m_dbtrAgt))
			return false;
		
		if (!Compare.equals(m_dbtrAgtAcct, ((PaymentInstruction20)that).m_dbtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_instrForDbtrAgt, ((PaymentInstruction20)that).m_instrForDbtrAgt))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, ((PaymentInstruction20)that).m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_chrgBr, ((PaymentInstruction20)that).m_chrgBr))
			return false;
		
		if (!Compare.equals(m_chrgsAcct, ((PaymentInstruction20)that).m_chrgsAcct))
			return false;
		
		if (!Compare.equals(m_chrgsAcctAgt, ((PaymentInstruction20)that).m_chrgsAcctAgt))
			return false;
		
		if (!Compare.equals(m_cdtTrfTxInfList, ((PaymentInstruction20)that).m_cdtTrfTxInfList))
			return false;
		
		return true;
	}	

  
  
}
