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
 * Garnishment1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class Garnishment1 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Garnishment1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public Garnishment1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type Garnishment1.
	 */
	static class Allocator implements TypeAllocator<Garnishment1> {
		/**
		 * method for getting a new instance of type Garnishment1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public Garnishment1 newInstance(String elementName, ComplexDataType parent) {
			return new Garnishment1(elementName, parent);
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
	
  	
  
	/** element item for Tp element. 
	 *  @serial
	 */	
	private GarnishmentType1 m_tp = null;
	
	/** element item for Grnshee element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_grnshee = null;
	
	/** element item for GrnshmtAdmstr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_grnshmtAdmstr = null;
	
	/** element item for RefNb element. 
	 *  @serial
	 */	
	private String m_refNb = null;
	
	/** element item for Dt element. 
	 *  @serial
	 */	
	private String m_dt = null;
	
	/** element item for RmtdAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_rmtdAmt = null;
	
	/** element item for FmlyMdclInsrncInd element. 
	 *  @serial
	 */	
	private String m_fmlyMdclInsrncInd = null;
	
	/** element item for MplyeeTermntnInd element. 
	 *  @serial
	 */	
	private String m_mplyeeTermntnInd = null;
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public GarnishmentType1 getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(GarnishmentType1 data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded Grnshee element.
	 * @return the item.
	 */
	public PartyIdentification43 getGrnshee() {
		return m_grnshee;
	}
		
	/**
	 * This method sets (overwrites) the element Grnshee.
	 * @param data the item that needs to be added.
	 */
	void setGrnshee(PartyIdentification43 data) {
		m_grnshee = data;
	}
		
	/**
	 * Get the embedded GrnshmtAdmstr element.
	 * @return the item.
	 */
	public PartyIdentification43 getGrnshmtAdmstr() {
		return m_grnshmtAdmstr;
	}
		
	/**
	 * This method sets (overwrites) the element GrnshmtAdmstr.
	 * @param data the item that needs to be added.
	 */
	void setGrnshmtAdmstr(PartyIdentification43 data) {
		m_grnshmtAdmstr = data;
	}
		
	/**
	 * Get the embedded RefNb element.
	 * @return the item.
	 */
	public String getRefNb() {
		return m_refNb;
	}
		
	/**
	 * This method sets (overwrites) the element RefNb.
	 * @param data the item that needs to be added.
	 */
	void setRefNb(String data) {
		m_refNb = data;
	}
		
	/**
	 * Get the embedded Dt element.
	 * @return the item.
	 */
	public String getDt() {
		return m_dt;
	}
		
	/**
	 * This method sets (overwrites) the element Dt.
	 * @param data the item that needs to be added.
	 */
	void setDt(String data) {
		m_dt = data;
	}
		
	/**
	 * Get the embedded RmtdAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
		return m_rmtdAmt;
	}
		
	/**
	 * This method sets (overwrites) the element RmtdAmt.
	 * @param data the item that needs to be added.
	 */
	void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_rmtdAmt = data;
	}
		
	/**
	 * Get the embedded FmlyMdclInsrncInd element.
	 * @return the item.
	 */
	public String getFmlyMdclInsrncInd() {
		return m_fmlyMdclInsrncInd;
	}
		
	/**
	 * This method sets (overwrites) the element FmlyMdclInsrncInd.
	 * @param data the item that needs to be added.
	 */
	void setFmlyMdclInsrncInd(String data) {
		m_fmlyMdclInsrncInd = data;
	}
		
	/**
	 * Get the embedded MplyeeTermntnInd element.
	 * @return the item.
	 */
	public String getMplyeeTermntnInd() {
		return m_mplyeeTermntnInd;
	}
		
	/**
	 * This method sets (overwrites) the element MplyeeTermntnInd.
	 * @param data the item that needs to be added.
	 */
	void setMplyeeTermntnInd(String data) {
		m_mplyeeTermntnInd = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_tp, ((Garnishment1)that).m_tp))
			return false;
		
		if (!Compare.equals(m_grnshee, ((Garnishment1)that).m_grnshee))
			return false;
		
		if (!Compare.equals(m_grnshmtAdmstr, ((Garnishment1)that).m_grnshmtAdmstr))
			return false;
		
		if (!Compare.equals(m_refNb, ((Garnishment1)that).m_refNb))
			return false;
		
		if (!Compare.equals(m_dt, ((Garnishment1)that).m_dt))
			return false;
		
		if (!Compare.equals(m_rmtdAmt, ((Garnishment1)that).m_rmtdAmt))
			return false;
		
		if (!Compare.equals(m_fmlyMdclInsrncInd, ((Garnishment1)that).m_fmlyMdclInsrncInd))
			return false;
		
		if (!Compare.equals(m_mplyeeTermntnInd, ((Garnishment1)that).m_mplyeeTermntnInd))
			return false;
		
		return true;
	}	

  
  
}
