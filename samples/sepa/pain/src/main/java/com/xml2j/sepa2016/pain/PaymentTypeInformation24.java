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
 * PaymentTypeInformation24 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class PaymentTypeInformation24 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentTypeInformation24.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentTypeInformation24(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentTypeInformation24.
	 */
	static class Allocator implements TypeAllocator<PaymentTypeInformation24> {
		/**
		 * method for getting a new instance of type PaymentTypeInformation24.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentTypeInformation24 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentTypeInformation24(elementName, parent);
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
	
  	
  
	/** element item for InstrPrty element. 
	 *  @serial
	 */	
	private String m_instrPrty = null;
	
	/** element item for SvcLvl element. 
	 *  @serial
	 */	
	private ServiceLevel8Choice m_svcLvl = null;
	
	/** element item for LclInstrm element. 
	 *  @serial
	 */	
	private LocalInstrument2Choice m_lclInstrm = null;
	
	/** element item for SeqTp element. 
	 *  @serial
	 */	
	private String m_seqTp = null;
	
	/** element item for CtgyPurp element. 
	 *  @serial
	 */	
	private CategoryPurpose1Choice m_ctgyPurp = null;
	
	/**
	 * Get the embedded InstrPrty element.
	 * @return the item.
	 */
	public String getInstrPrty() {
		return m_instrPrty;
	}
		
	/**
	 * This method sets (overwrites) the element InstrPrty.
	 * @param data the item that needs to be added.
	 */
	void setInstrPrty(String data) {
		m_instrPrty = data;
	}
		
	/**
	 * Get the embedded SvcLvl element.
	 * @return the item.
	 */
	public ServiceLevel8Choice getSvcLvl() {
		return m_svcLvl;
	}
		
	/**
	 * This method sets (overwrites) the element SvcLvl.
	 * @param data the item that needs to be added.
	 */
	void setSvcLvl(ServiceLevel8Choice data) {
		m_svcLvl = data;
	}
		
	/**
	 * Get the embedded LclInstrm element.
	 * @return the item.
	 */
	public LocalInstrument2Choice getLclInstrm() {
		return m_lclInstrm;
	}
		
	/**
	 * This method sets (overwrites) the element LclInstrm.
	 * @param data the item that needs to be added.
	 */
	void setLclInstrm(LocalInstrument2Choice data) {
		m_lclInstrm = data;
	}
		
	/**
	 * Get the embedded SeqTp element.
	 * @return the item.
	 */
	public String getSeqTp() {
		return m_seqTp;
	}
		
	/**
	 * This method sets (overwrites) the element SeqTp.
	 * @param data the item that needs to be added.
	 */
	void setSeqTp(String data) {
		m_seqTp = data;
	}
		
	/**
	 * Get the embedded CtgyPurp element.
	 * @return the item.
	 */
	public CategoryPurpose1Choice getCtgyPurp() {
		return m_ctgyPurp;
	}
		
	/**
	 * This method sets (overwrites) the element CtgyPurp.
	 * @param data the item that needs to be added.
	 */
	void setCtgyPurp(CategoryPurpose1Choice data) {
		m_ctgyPurp = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_instrPrty, ((PaymentTypeInformation24)that).m_instrPrty))
			return false;
		
		if (!Compare.equals(m_svcLvl, ((PaymentTypeInformation24)that).m_svcLvl))
			return false;
		
		if (!Compare.equals(m_lclInstrm, ((PaymentTypeInformation24)that).m_lclInstrm))
			return false;
		
		if (!Compare.equals(m_seqTp, ((PaymentTypeInformation24)that).m_seqTp))
			return false;
		
		if (!Compare.equals(m_ctgyPurp, ((PaymentTypeInformation24)that).m_ctgyPurp))
			return false;
		
		return true;
	}	

  
  
}
