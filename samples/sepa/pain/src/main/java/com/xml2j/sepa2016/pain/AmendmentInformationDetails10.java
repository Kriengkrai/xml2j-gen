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
 * AmendmentInformationDetails10 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class AmendmentInformationDetails10 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AmendmentInformationDetails10.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public AmendmentInformationDetails10(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type AmendmentInformationDetails10.
	 */
	static class Allocator implements TypeAllocator<AmendmentInformationDetails10> {
		/**
		 * method for getting a new instance of type AmendmentInformationDetails10.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AmendmentInformationDetails10 newInstance(String elementName, ComplexDataType parent) {
			return new AmendmentInformationDetails10(elementName, parent);
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
	
  	
  
	/** element item for OrgnlMndtId element. 
	 *  @serial
	 */	
	private String m_orgnlMndtId = null;
	
	/** element item for OrgnlCdtrSchmeId element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_orgnlCdtrSchmeId = null;
	
	/** element item for OrgnlCdtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_orgnlCdtrAgt = null;
	
	/** element item for OrgnlCdtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_orgnlCdtrAgtAcct = null;
	
	/** element item for OrgnlDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_orgnlDbtr = null;
	
	/** element item for OrgnlDbtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_orgnlDbtrAcct = null;
	
	/** element item for OrgnlDbtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_orgnlDbtrAgt = null;
	
	/** element item for OrgnlDbtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_orgnlDbtrAgtAcct = null;
	
	/** element item for OrgnlFnlColltnDt element. 
	 *  @serial
	 */	
	private String m_orgnlFnlColltnDt = null;
	
	/** element item for OrgnlFrqcy element. 
	 *  @serial
	 */	
	private Frequency21Choice m_orgnlFrqcy = null;
	
	/** element item for OrgnlRsn element. 
	 *  @serial
	 */	
	private MandateSetupReason1Choice m_orgnlRsn = null;
	
	/**
	 * Get the embedded OrgnlMndtId element.
	 * @return the item.
	 */
	public String getOrgnlMndtId() {
		return m_orgnlMndtId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlMndtId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlMndtId(String data) {
		m_orgnlMndtId = data;
	}
		
	/**
	 * Get the embedded OrgnlCdtrSchmeId element.
	 * @return the item.
	 */
	public PartyIdentification43 getOrgnlCdtrSchmeId() {
		return m_orgnlCdtrSchmeId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlCdtrSchmeId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlCdtrSchmeId(PartyIdentification43 data) {
		m_orgnlCdtrSchmeId = data;
	}
		
	/**
	 * Get the embedded OrgnlCdtrAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getOrgnlCdtrAgt() {
		return m_orgnlCdtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlCdtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlCdtrAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_orgnlCdtrAgt = data;
	}
		
	/**
	 * Get the embedded OrgnlCdtrAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getOrgnlCdtrAgtAcct() {
		return m_orgnlCdtrAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlCdtrAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlCdtrAgtAcct(CashAccount24 data) {
		m_orgnlCdtrAgtAcct = data;
	}
		
	/**
	 * Get the embedded OrgnlDbtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getOrgnlDbtr() {
		return m_orgnlDbtr;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlDbtr.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlDbtr(PartyIdentification43 data) {
		m_orgnlDbtr = data;
	}
		
	/**
	 * Get the embedded OrgnlDbtrAcct element.
	 * @return the item.
	 */
	public CashAccount24 getOrgnlDbtrAcct() {
		return m_orgnlDbtrAcct;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlDbtrAcct.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlDbtrAcct(CashAccount24 data) {
		m_orgnlDbtrAcct = data;
	}
		
	/**
	 * Get the embedded OrgnlDbtrAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getOrgnlDbtrAgt() {
		return m_orgnlDbtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlDbtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_orgnlDbtrAgt = data;
	}
		
	/**
	 * Get the embedded OrgnlDbtrAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getOrgnlDbtrAgtAcct() {
		return m_orgnlDbtrAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlDbtrAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlDbtrAgtAcct(CashAccount24 data) {
		m_orgnlDbtrAgtAcct = data;
	}
		
	/**
	 * Get the embedded OrgnlFnlColltnDt element.
	 * @return the item.
	 */
	public String getOrgnlFnlColltnDt() {
		return m_orgnlFnlColltnDt;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlFnlColltnDt.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlFnlColltnDt(String data) {
		m_orgnlFnlColltnDt = data;
	}
		
	/**
	 * Get the embedded OrgnlFrqcy element.
	 * @return the item.
	 */
	public Frequency21Choice getOrgnlFrqcy() {
		return m_orgnlFrqcy;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlFrqcy.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlFrqcy(Frequency21Choice data) {
		m_orgnlFrqcy = data;
	}
		
	/**
	 * Get the embedded OrgnlRsn element.
	 * @return the item.
	 */
	public MandateSetupReason1Choice getOrgnlRsn() {
		return m_orgnlRsn;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlRsn.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlRsn(MandateSetupReason1Choice data) {
		m_orgnlRsn = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_orgnlMndtId, ((AmendmentInformationDetails10)that).m_orgnlMndtId))
			return false;
		
		if (!Compare.equals(m_orgnlCdtrSchmeId, ((AmendmentInformationDetails10)that).m_orgnlCdtrSchmeId))
			return false;
		
		if (!Compare.equals(m_orgnlCdtrAgt, ((AmendmentInformationDetails10)that).m_orgnlCdtrAgt))
			return false;
		
		if (!Compare.equals(m_orgnlCdtrAgtAcct, ((AmendmentInformationDetails10)that).m_orgnlCdtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_orgnlDbtr, ((AmendmentInformationDetails10)that).m_orgnlDbtr))
			return false;
		
		if (!Compare.equals(m_orgnlDbtrAcct, ((AmendmentInformationDetails10)that).m_orgnlDbtrAcct))
			return false;
		
		if (!Compare.equals(m_orgnlDbtrAgt, ((AmendmentInformationDetails10)that).m_orgnlDbtrAgt))
			return false;
		
		if (!Compare.equals(m_orgnlDbtrAgtAcct, ((AmendmentInformationDetails10)that).m_orgnlDbtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_orgnlFnlColltnDt, ((AmendmentInformationDetails10)that).m_orgnlFnlColltnDt))
			return false;
		
		if (!Compare.equals(m_orgnlFrqcy, ((AmendmentInformationDetails10)that).m_orgnlFrqcy))
			return false;
		
		if (!Compare.equals(m_orgnlRsn, ((AmendmentInformationDetails10)that).m_orgnlRsn))
			return false;
		
		return true;
	}	

  
  
}
