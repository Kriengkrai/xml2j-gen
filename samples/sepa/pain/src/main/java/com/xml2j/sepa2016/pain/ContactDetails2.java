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
 * ContactDetails2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class ContactDetails2 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ContactDetails2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContactDetails2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContactDetails2.
	 */
	static class Allocator implements TypeAllocator<ContactDetails2> {
		/**
		 * method for getting a new instance of type ContactDetails2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContactDetails2 newInstance(String elementName, ComplexDataType parent) {
			return new ContactDetails2(elementName, parent);
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
	
  	
  
	/** element item for NmPrfx element. 
	 *  @serial
	 */	
	private String m_nmPrfx = null;
	
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/** element item for PhneNb element. 
	 *  @serial
	 */	
	private String m_phneNb = null;
	
	/** element item for MobNb element. 
	 *  @serial
	 */	
	private String m_mobNb = null;
	
	/** element item for FaxNb element. 
	 *  @serial
	 */	
	private String m_faxNb = null;
	
	/** element item for EmailAdr element. 
	 *  @serial
	 */	
	private String m_emailAdr = null;
	
	/** element item for Othr element. 
	 *  @serial
	 */	
	private String m_othr = null;
	
	/**
	 * Get the embedded NmPrfx element.
	 * @return the item.
	 */
	public String getNmPrfx() {
		return m_nmPrfx;
	}
		
	/**
	 * This method sets (overwrites) the element NmPrfx.
	 * @param data the item that needs to be added.
	 */
	void setNmPrfx(String data) {
		m_nmPrfx = data;
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
	 * Get the embedded PhneNb element.
	 * @return the item.
	 */
	public String getPhneNb() {
		return m_phneNb;
	}
		
	/**
	 * This method sets (overwrites) the element PhneNb.
	 * @param data the item that needs to be added.
	 */
	void setPhneNb(String data) {
		m_phneNb = data;
	}
		
	/**
	 * Get the embedded MobNb element.
	 * @return the item.
	 */
	public String getMobNb() {
		return m_mobNb;
	}
		
	/**
	 * This method sets (overwrites) the element MobNb.
	 * @param data the item that needs to be added.
	 */
	void setMobNb(String data) {
		m_mobNb = data;
	}
		
	/**
	 * Get the embedded FaxNb element.
	 * @return the item.
	 */
	public String getFaxNb() {
		return m_faxNb;
	}
		
	/**
	 * This method sets (overwrites) the element FaxNb.
	 * @param data the item that needs to be added.
	 */
	void setFaxNb(String data) {
		m_faxNb = data;
	}
		
	/**
	 * Get the embedded EmailAdr element.
	 * @return the item.
	 */
	public String getEmailAdr() {
		return m_emailAdr;
	}
		
	/**
	 * This method sets (overwrites) the element EmailAdr.
	 * @param data the item that needs to be added.
	 */
	void setEmailAdr(String data) {
		m_emailAdr = data;
	}
		
	/**
	 * Get the embedded Othr element.
	 * @return the item.
	 */
	public String getOthr() {
		return m_othr;
	}
		
	/**
	 * This method sets (overwrites) the element Othr.
	 * @param data the item that needs to be added.
	 */
	void setOthr(String data) {
		m_othr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_nmPrfx, ((ContactDetails2)that).m_nmPrfx))
			return false;
		
		if (!Compare.equals(m_nm, ((ContactDetails2)that).m_nm))
			return false;
		
		if (!Compare.equals(m_phneNb, ((ContactDetails2)that).m_phneNb))
			return false;
		
		if (!Compare.equals(m_mobNb, ((ContactDetails2)that).m_mobNb))
			return false;
		
		if (!Compare.equals(m_faxNb, ((ContactDetails2)that).m_faxNb))
			return false;
		
		if (!Compare.equals(m_emailAdr, ((ContactDetails2)that).m_emailAdr))
			return false;
		
		if (!Compare.equals(m_othr, ((ContactDetails2)that).m_othr))
			return false;
		
		return true;
	}	

  
  
}
