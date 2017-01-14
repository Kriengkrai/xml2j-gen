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

import com.xml2j.util.StringList;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * StructuredRemittanceInformation13 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class StructuredRemittanceInformation13 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for StructuredRemittanceInformation13.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public StructuredRemittanceInformation13(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type StructuredRemittanceInformation13.
	 */
	static class Allocator implements TypeAllocator<StructuredRemittanceInformation13> {
		/**
		 * method for getting a new instance of type StructuredRemittanceInformation13.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public StructuredRemittanceInformation13 newInstance(String elementName, ComplexDataType parent) {
			return new StructuredRemittanceInformation13(elementName, parent);
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
	
  	
  
	/** list of RfrdDocInf element. 
	 *  @serial
	 */	
	private List<ReferredDocumentInformation7> m_rfrdDocInfList = new ArrayList<ReferredDocumentInformation7>();
	
	/** element item for RfrdDocAmt element. 
	 *  @serial
	 */	
	private RemittanceAmount2 m_rfrdDocAmt = null;
	
	/** element item for CdtrRefInf element. 
	 *  @serial
	 */	
	private CreditorReferenceInformation2 m_cdtrRefInf = null;
	
	/** element item for Invcr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_invcr = null;
	
	/** element item for Invcee element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_invcee = null;
	
	/** element item for TaxRmt element. 
	 *  @serial
	 */	
	private TaxInformation4 m_taxRmt = null;
	
	/** element item for GrnshmtRmt element. 
	 *  @serial
	 */	
	private Garnishment1 m_grnshmtRmt = null;
	
	/** list of AddtlRmtInf element. 
	 *  @serial
	 */	
	private StringList m_addtlRmtInfList = new StringList("AddtlRmtInf");
	
	/**
	 * Get the embedded list of RfrdDocInf elements.
	 * @return list of items.
	 */
	public List<ReferredDocumentInformation7> getRfrdDocInfs() {
		return m_rfrdDocInfList;
	}
		
	/**
	 * This method adds data to the list of RfrdDocInf.
	 * @param data the item that needs to be added.
	 */
	void setRfrdDocInf(ReferredDocumentInformation7 data) {
		m_rfrdDocInfList.add(data);
	}
		
	/**
	 * Get the embedded RfrdDocAmt element.
	 * @return the item.
	 */
	public RemittanceAmount2 getRfrdDocAmt() {
		return m_rfrdDocAmt;
	}
		
	/**
	 * This method sets (overwrites) the element RfrdDocAmt.
	 * @param data the item that needs to be added.
	 */
	void setRfrdDocAmt(RemittanceAmount2 data) {
		m_rfrdDocAmt = data;
	}
		
	/**
	 * Get the embedded CdtrRefInf element.
	 * @return the item.
	 */
	public CreditorReferenceInformation2 getCdtrRefInf() {
		return m_cdtrRefInf;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrRefInf.
	 * @param data the item that needs to be added.
	 */
	void setCdtrRefInf(CreditorReferenceInformation2 data) {
		m_cdtrRefInf = data;
	}
		
	/**
	 * Get the embedded Invcr element.
	 * @return the item.
	 */
	public PartyIdentification43 getInvcr() {
		return m_invcr;
	}
		
	/**
	 * This method sets (overwrites) the element Invcr.
	 * @param data the item that needs to be added.
	 */
	void setInvcr(PartyIdentification43 data) {
		m_invcr = data;
	}
		
	/**
	 * Get the embedded Invcee element.
	 * @return the item.
	 */
	public PartyIdentification43 getInvcee() {
		return m_invcee;
	}
		
	/**
	 * This method sets (overwrites) the element Invcee.
	 * @param data the item that needs to be added.
	 */
	void setInvcee(PartyIdentification43 data) {
		m_invcee = data;
	}
		
	/**
	 * Get the embedded TaxRmt element.
	 * @return the item.
	 */
	public TaxInformation4 getTaxRmt() {
		return m_taxRmt;
	}
		
	/**
	 * This method sets (overwrites) the element TaxRmt.
	 * @param data the item that needs to be added.
	 */
	void setTaxRmt(TaxInformation4 data) {
		m_taxRmt = data;
	}
		
	/**
	 * Get the embedded GrnshmtRmt element.
	 * @return the item.
	 */
	public Garnishment1 getGrnshmtRmt() {
		return m_grnshmtRmt;
	}
		
	/**
	 * This method sets (overwrites) the element GrnshmtRmt.
	 * @param data the item that needs to be added.
	 */
	void setGrnshmtRmt(Garnishment1 data) {
		m_grnshmtRmt = data;
	}
			
	/**
	 * Get the embedded list of AddtlRmtInf elements.
	 * @return list of items.
	 */
	public StringList getAddtlRmtInfs() {
		return m_addtlRmtInfList;
	}
		
	/**
	 * This method adds data to the list of AddtlRmtInf.
	 * @param data the item that needs to be added.
	 */
	void setAddtlRmtInf(String data) {
		m_addtlRmtInfList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_rfrdDocInfList, ((StructuredRemittanceInformation13)that).m_rfrdDocInfList))
			return false;
		
		if (!Compare.equals(m_rfrdDocAmt, ((StructuredRemittanceInformation13)that).m_rfrdDocAmt))
			return false;
		
		if (!Compare.equals(m_cdtrRefInf, ((StructuredRemittanceInformation13)that).m_cdtrRefInf))
			return false;
		
		if (!Compare.equals(m_invcr, ((StructuredRemittanceInformation13)that).m_invcr))
			return false;
		
		if (!Compare.equals(m_invcee, ((StructuredRemittanceInformation13)that).m_invcee))
			return false;
		
		if (!Compare.equals(m_taxRmt, ((StructuredRemittanceInformation13)that).m_taxRmt))
			return false;
		
		if (!Compare.equals(m_grnshmtRmt, ((StructuredRemittanceInformation13)that).m_grnshmtRmt))
			return false;
		
		if (!Compare.equals(m_addtlRmtInfList, ((StructuredRemittanceInformation13)that).m_addtlRmtInfList))
			return false;
		
		return true;
	}	

  
  
}
