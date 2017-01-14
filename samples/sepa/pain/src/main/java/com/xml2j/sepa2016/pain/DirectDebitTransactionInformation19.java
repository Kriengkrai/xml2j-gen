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
 * DirectDebitTransactionInformation19 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class DirectDebitTransactionInformation19 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DirectDebitTransactionInformation19.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DirectDebitTransactionInformation19(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DirectDebitTransactionInformation19.
	 */
	static class Allocator implements TypeAllocator<DirectDebitTransactionInformation19> {
		/**
		 * method for getting a new instance of type DirectDebitTransactionInformation19.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DirectDebitTransactionInformation19 newInstance(String elementName, ComplexDataType parent) {
			return new DirectDebitTransactionInformation19(elementName, parent);
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
	
  	
  
	/** element item for PmtId element. 
	 *  @serial
	 */	
	private PaymentIdentification1 m_pmtId = null;
	
	/** element item for PmtTpInf element. 
	 *  @serial
	 */	
	private PaymentTypeInformation24 m_pmtTpInf = null;
	
	/** element item for InstdAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_instdAmt = null;
	
	/** element item for ChrgBr element. 
	 *  @serial
	 */	
	private String m_chrgBr = null;
	
	/** element item for DrctDbtTx element. 
	 *  @serial
	 */	
	private DirectDebitTransaction8 m_drctDbtTx = null;
	
	/** element item for UltmtCdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtCdtr = null;
	
	/** element item for DbtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_dbtrAgt = null;
	
	/** element item for DbtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_dbtrAgtAcct = null;
	
	/** element item for Dbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_dbtr = null;
	
	/** element item for DbtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_dbtrAcct = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtDbtr = null;
	
	/** element item for InstrForCdtrAgt element. 
	 *  @serial
	 */	
	private String m_instrForCdtrAgt = null;
	
	/** element item for Purp element. 
	 *  @serial
	 */	
	private Purpose2Choice m_purp = null;
	
	/** list of RgltryRptg element. 
	 *  @serial
	 */	
	private List<RegulatoryReporting3> m_rgltryRptgList = new ArrayList<RegulatoryReporting3>();
	
	/** element item for Tax element. 
	 *  @serial
	 */	
	private TaxInformation3 m_tax = null;
	
	/** list of RltdRmtInf element. 
	 *  @serial
	 */	
	private List<RemittanceLocation4> m_rltdRmtInfList = new ArrayList<RemittanceLocation4>();
	
	/** element item for RmtInf element. 
	 *  @serial
	 */	
	private RemittanceInformation11 m_rmtInf = null;
	
	/** list of SplmtryData element. 
	 *  @serial
	 */	
	private List<SupplementaryData1> m_splmtryDataList = new ArrayList<SupplementaryData1>();
	
	/**
	 * Get the embedded PmtId element.
	 * @return the item.
	 */
	public PaymentIdentification1 getPmtId() {
		return m_pmtId;
	}
		
	/**
	 * This method sets (overwrites) the element PmtId.
	 * @param data the item that needs to be added.
	 */
	void setPmtId(PaymentIdentification1 data) {
		m_pmtId = data;
	}
		
	/**
	 * Get the embedded PmtTpInf element.
	 * @return the item.
	 */
	public PaymentTypeInformation24 getPmtTpInf() {
		return m_pmtTpInf;
	}
		
	/**
	 * This method sets (overwrites) the element PmtTpInf.
	 * @param data the item that needs to be added.
	 */
	void setPmtTpInf(PaymentTypeInformation24 data) {
		m_pmtTpInf = data;
	}
		
	/**
	 * Get the embedded InstdAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
		return m_instdAmt;
	}
		
	/**
	 * This method sets (overwrites) the element InstdAmt.
	 * @param data the item that needs to be added.
	 */
	void setInstdAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_instdAmt = data;
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
	 * Get the embedded DrctDbtTx element.
	 * @return the item.
	 */
	public DirectDebitTransaction8 getDrctDbtTx() {
		return m_drctDbtTx;
	}
		
	/**
	 * This method sets (overwrites) the element DrctDbtTx.
	 * @param data the item that needs to be added.
	 */
	void setDrctDbtTx(DirectDebitTransaction8 data) {
		m_drctDbtTx = data;
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
	 * Get the embedded InstrForCdtrAgt element.
	 * @return the item.
	 */
	public String getInstrForCdtrAgt() {
		return m_instrForCdtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element InstrForCdtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setInstrForCdtrAgt(String data) {
		m_instrForCdtrAgt = data;
	}
		
	/**
	 * Get the embedded Purp element.
	 * @return the item.
	 */
	public Purpose2Choice getPurp() {
		return m_purp;
	}
		
	/**
	 * This method sets (overwrites) the element Purp.
	 * @param data the item that needs to be added.
	 */
	void setPurp(Purpose2Choice data) {
		m_purp = data;
	}
		
	/**
	 * Get the embedded list of RgltryRptg elements.
	 * @return list of items.
	 */
	public List<RegulatoryReporting3> getRgltryRptgs() {
		return m_rgltryRptgList;
	}
		
	/**
	 * This method adds data to the list of RgltryRptg.
	 * @param data the item that needs to be added.
	 */
	void setRgltryRptg(RegulatoryReporting3 data) {
		m_rgltryRptgList.add(data);
	}
		
	/**
	 * Get the embedded Tax element.
	 * @return the item.
	 */
	public TaxInformation3 getTax() {
		return m_tax;
	}
		
	/**
	 * This method sets (overwrites) the element Tax.
	 * @param data the item that needs to be added.
	 */
	void setTax(TaxInformation3 data) {
		m_tax = data;
	}
		
	/**
	 * Get the embedded list of RltdRmtInf elements.
	 * @return list of items.
	 */
	public List<RemittanceLocation4> getRltdRmtInfs() {
		return m_rltdRmtInfList;
	}
		
	/**
	 * This method adds data to the list of RltdRmtInf.
	 * @param data the item that needs to be added.
	 */
	void setRltdRmtInf(RemittanceLocation4 data) {
		m_rltdRmtInfList.add(data);
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
  
		if (!Compare.equals(m_pmtId, ((DirectDebitTransactionInformation19)that).m_pmtId))
			return false;
		
		if (!Compare.equals(m_pmtTpInf, ((DirectDebitTransactionInformation19)that).m_pmtTpInf))
			return false;
		
		if (!Compare.equals(m_instdAmt, ((DirectDebitTransactionInformation19)that).m_instdAmt))
			return false;
		
		if (!Compare.equals(m_chrgBr, ((DirectDebitTransactionInformation19)that).m_chrgBr))
			return false;
		
		if (!Compare.equals(m_drctDbtTx, ((DirectDebitTransactionInformation19)that).m_drctDbtTx))
			return false;
		
		if (!Compare.equals(m_ultmtCdtr, ((DirectDebitTransactionInformation19)that).m_ultmtCdtr))
			return false;
		
		if (!Compare.equals(m_dbtrAgt, ((DirectDebitTransactionInformation19)that).m_dbtrAgt))
			return false;
		
		if (!Compare.equals(m_dbtrAgtAcct, ((DirectDebitTransactionInformation19)that).m_dbtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_dbtr, ((DirectDebitTransactionInformation19)that).m_dbtr))
			return false;
		
		if (!Compare.equals(m_dbtrAcct, ((DirectDebitTransactionInformation19)that).m_dbtrAcct))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, ((DirectDebitTransactionInformation19)that).m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_instrForCdtrAgt, ((DirectDebitTransactionInformation19)that).m_instrForCdtrAgt))
			return false;
		
		if (!Compare.equals(m_purp, ((DirectDebitTransactionInformation19)that).m_purp))
			return false;
		
		if (!Compare.equals(m_rgltryRptgList, ((DirectDebitTransactionInformation19)that).m_rgltryRptgList))
			return false;
		
		if (!Compare.equals(m_tax, ((DirectDebitTransactionInformation19)that).m_tax))
			return false;
		
		if (!Compare.equals(m_rltdRmtInfList, ((DirectDebitTransactionInformation19)that).m_rltdRmtInfList))
			return false;
		
		if (!Compare.equals(m_rmtInf, ((DirectDebitTransactionInformation19)that).m_rmtInf))
			return false;
		
		if (!Compare.equals(m_splmtryDataList, ((DirectDebitTransactionInformation19)that).m_splmtryDataList))
			return false;
		
		return true;
	}	

  
  
}
