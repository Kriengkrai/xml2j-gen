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
 * PartyIdentification43 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class PartyIdentification43 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PartyIdentification43.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PartyIdentification43(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PartyIdentification43.
	 */
	static class Allocator implements TypeAllocator<PartyIdentification43> {
		/**
		 * method for getting a new instance of type PartyIdentification43.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PartyIdentification43 newInstance(String elementName, ComplexDataType parent) {
			return new PartyIdentification43(elementName, parent);
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
	
  	
  
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/** element item for PstlAdr element. 
	 *  @serial
	 */	
	private PostalAddress6 m_pstlAdr = null;
	
	/** element item for Id element. 
	 *  @serial
	 */	
	private Party11Choice m_id = null;
	
	/** element item for CtryOfRes element. 
	 *  @serial
	 */	
	private String m_ctryOfRes = null;
	
	/** element item for CtctDtls element. 
	 *  @serial
	 */	
	private ContactDetails2 m_ctctDtls = null;
	
	/**
	 * Get the embedded Nm element.
	 * @return the item.
	 */
	public String getNm() {
		return m_nm;
	}
		
	/**
	 * This method sets (overwrites) the element Nm.
	 * @param data the item that needs to be added.
	 */
	void setNm(String data) {
		m_nm = data;
	}
		
	/**
	 * Get the embedded PstlAdr element.
	 * @return the item.
	 */
	public PostalAddress6 getPstlAdr() {
		return m_pstlAdr;
	}
		
	/**
	 * This method sets (overwrites) the element PstlAdr.
	 * @param data the item that needs to be added.
	 */
	void setPstlAdr(PostalAddress6 data) {
		m_pstlAdr = data;
	}
		
	/**
	 * Get the embedded Id element.
	 * @return the item.
	 */
	public Party11Choice getId() {
		return m_id;
	}
		
	/**
	 * This method sets (overwrites) the element Id.
	 * @param data the item that needs to be added.
	 */
	void setId(Party11Choice data) {
		m_id = data;
	}
		
	/**
	 * Get the embedded CtryOfRes element.
	 * @return the item.
	 */
	public String getCtryOfRes() {
		return m_ctryOfRes;
	}
		
	/**
	 * This method sets (overwrites) the element CtryOfRes.
	 * @param data the item that needs to be added.
	 */
	void setCtryOfRes(String data) {
		m_ctryOfRes = data;
	}
		
	/**
	 * Get the embedded CtctDtls element.
	 * @return the item.
	 */
	public ContactDetails2 getCtctDtls() {
		return m_ctctDtls;
	}
		
	/**
	 * This method sets (overwrites) the element CtctDtls.
	 * @param data the item that needs to be added.
	 */
	void setCtctDtls(ContactDetails2 data) {
		m_ctctDtls = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_nm, ((PartyIdentification43)that).m_nm))
			return false;
		
		if (!Compare.equals(m_pstlAdr, ((PartyIdentification43)that).m_pstlAdr))
			return false;
		
		if (!Compare.equals(m_id, ((PartyIdentification43)that).m_id))
			return false;
		
		if (!Compare.equals(m_ctryOfRes, ((PartyIdentification43)that).m_ctryOfRes))
			return false;
		
		if (!Compare.equals(m_ctctDtls, ((PartyIdentification43)that).m_ctctDtls))
			return false;
		
		return true;
	}	

  
  
}
