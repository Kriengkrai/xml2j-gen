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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TaxParty2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class TaxParty2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxParty2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxParty2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxParty2.
	 */
	static class Allocator implements TypeAllocator<TaxParty2> {
		/**
		 * method for getting a new instance of type TaxParty2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxParty2 newInstance(String elementName, ComplexDataType parent) {
			return new TaxParty2(elementName, parent);
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
	
  	
  
	/** element item for TaxId element. 
	 *  @serial
	 */	
	private String m_taxId = null;
	
	/** element item for RegnId element. 
	 *  @serial
	 */	
	private String m_regnId = null;
	
	/** element item for TaxTp element. 
	 *  @serial
	 */	
	private String m_taxTp = null;
	
	/** element item for Authstn element. 
	 *  @serial
	 */	
	private TaxAuthorisation1 m_authstn = null;
	
	/**
	 * Get the embedded TaxId element.
	 * @return the item.
	 */
	public String getTaxId() {
		return m_taxId;
	}
		
	/**
	 * This method sets (overwrites) the element TaxId.
	 * @param data the item that needs to be added.
	 */
	void setTaxId(String data) {
		m_taxId = data;
	}
		
	/**
	 * Get the embedded RegnId element.
	 * @return the item.
	 */
	public String getRegnId() {
		return m_regnId;
	}
		
	/**
	 * This method sets (overwrites) the element RegnId.
	 * @param data the item that needs to be added.
	 */
	void setRegnId(String data) {
		m_regnId = data;
	}
		
	/**
	 * Get the embedded TaxTp element.
	 * @return the item.
	 */
	public String getTaxTp() {
		return m_taxTp;
	}
		
	/**
	 * This method sets (overwrites) the element TaxTp.
	 * @param data the item that needs to be added.
	 */
	void setTaxTp(String data) {
		m_taxTp = data;
	}
		
	/**
	 * Get the embedded Authstn element.
	 * @return the item.
	 */
	public TaxAuthorisation1 getAuthstn() {
		return m_authstn;
	}
		
	/**
	 * This method sets (overwrites) the element Authstn.
	 * @param data the item that needs to be added.
	 */
	void setAuthstn(TaxAuthorisation1 data) {
		m_authstn = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_taxId, ((TaxParty2)that).m_taxId))
			return false;
		
		if (!Compare.equals(m_regnId, ((TaxParty2)that).m_regnId))
			return false;
		
		if (!Compare.equals(m_taxTp, ((TaxParty2)that).m_taxTp))
			return false;
		
		if (!Compare.equals(m_authstn, ((TaxParty2)that).m_authstn))
			return false;
		
		return true;
	}	

  
  
}
