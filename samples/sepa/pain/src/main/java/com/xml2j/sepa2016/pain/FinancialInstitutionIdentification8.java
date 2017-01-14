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
 * FinancialInstitutionIdentification8 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class FinancialInstitutionIdentification8 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for FinancialInstitutionIdentification8.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public FinancialInstitutionIdentification8(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type FinancialInstitutionIdentification8.
	 */
	static class Allocator implements TypeAllocator<FinancialInstitutionIdentification8> {
		/**
		 * method for getting a new instance of type FinancialInstitutionIdentification8.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public FinancialInstitutionIdentification8 newInstance(String elementName, ComplexDataType parent) {
			return new FinancialInstitutionIdentification8(elementName, parent);
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
	
  	
  
	/** element item for BICFI element. 
	 *  @serial
	 */	
	private String m_bICFI = null;
	
	/** element item for ClrSysMmbId element. 
	 *  @serial
	 */	
	private ClearingSystemMemberIdentification2 m_clrSysMmbId = null;
	
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/** element item for PstlAdr element. 
	 *  @serial
	 */	
	private PostalAddress6 m_pstlAdr = null;
	
	/** element item for Othr element. 
	 *  @serial
	 */	
	private GenericFinancialIdentification1 m_othr = null;
	
	/**
	 * Get the embedded BICFI element.
	 * @return the item.
	 */
	public String getBICFI() {
		return m_bICFI;
	}
		
	/**
	 * This method sets (overwrites) the element BICFI.
	 * @param data the item that needs to be added.
	 */
	void setBICFI(String data) {
		m_bICFI = data;
	}
		
	/**
	 * Get the embedded ClrSysMmbId element.
	 * @return the item.
	 */
	public ClearingSystemMemberIdentification2 getClrSysMmbId() {
		return m_clrSysMmbId;
	}
		
	/**
	 * This method sets (overwrites) the element ClrSysMmbId.
	 * @param data the item that needs to be added.
	 */
	void setClrSysMmbId(ClearingSystemMemberIdentification2 data) {
		m_clrSysMmbId = data;
	}
		
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
	 * Get the embedded Othr element.
	 * @return the item.
	 */
	public GenericFinancialIdentification1 getOthr() {
		return m_othr;
	}
		
	/**
	 * This method sets (overwrites) the element Othr.
	 * @param data the item that needs to be added.
	 */
	void setOthr(GenericFinancialIdentification1 data) {
		m_othr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_bICFI, ((FinancialInstitutionIdentification8)that).m_bICFI))
			return false;
		
		if (!Compare.equals(m_clrSysMmbId, ((FinancialInstitutionIdentification8)that).m_clrSysMmbId))
			return false;
		
		if (!Compare.equals(m_nm, ((FinancialInstitutionIdentification8)that).m_nm))
			return false;
		
		if (!Compare.equals(m_pstlAdr, ((FinancialInstitutionIdentification8)that).m_pstlAdr))
			return false;
		
		if (!Compare.equals(m_othr, ((FinancialInstitutionIdentification8)that).m_othr))
			return false;
		
		return true;
	}	

  
  
}
