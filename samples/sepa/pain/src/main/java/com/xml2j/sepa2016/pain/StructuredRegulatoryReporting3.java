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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * StructuredRegulatoryReporting3 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class StructuredRegulatoryReporting3 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for StructuredRegulatoryReporting3.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public StructuredRegulatoryReporting3(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type StructuredRegulatoryReporting3.
	 */
	static class Allocator implements TypeAllocator<StructuredRegulatoryReporting3> {
		/**
		 * method for getting a new instance of type StructuredRegulatoryReporting3.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public StructuredRegulatoryReporting3 newInstance(String elementName, ComplexDataType parent) {
			return new StructuredRegulatoryReporting3(elementName, parent);
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
	private String m_tp = null;
	
	/** element item for Dt element. 
	 *  @serial
	 */	
	private String m_dt = null;
	
	/** element item for Ctry element. 
	 *  @serial
	 */	
	private String m_ctry = null;
	
	/** element item for Cd element. 
	 *  @serial
	 */	
	private String m_cd = null;
	
	/** element item for Amt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_amt = null;
	
	/** list of Inf element. 
	 *  @serial
	 */	
	private StringList m_infList = new StringList("Inf");
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public String getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(String data) {
		m_tp = data;
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
	 * Get the embedded Ctry element.
	 * @return the item.
	 */
	public String getCtry() {
		return m_ctry;
	}
		
	/**
	 * This method sets (overwrites) the element Ctry.
	 * @param data the item that needs to be added.
	 */
	void setCtry(String data) {
		m_ctry = data;
	}
		
	/**
	 * Get the embedded Cd element.
	 * @return the item.
	 */
	public String getCd() {
		return m_cd;
	}
		
	/**
	 * This method sets (overwrites) the element Cd.
	 * @param data the item that needs to be added.
	 */
	void setCd(String data) {
		m_cd = data;
	}
		
	/**
	 * Get the embedded Amt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getAmt() {
		return m_amt;
	}
		
	/**
	 * This method sets (overwrites) the element Amt.
	 * @param data the item that needs to be added.
	 */
	void setAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_amt = data;
	}
			
	/**
	 * Get the embedded list of Inf elements.
	 * @return list of items.
	 */
	public StringList getInfs() {
		return m_infList;
	}
		
	/**
	 * This method adds data to the list of Inf.
	 * @param data the item that needs to be added.
	 */
	void setInf(String data) {
		m_infList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_tp, ((StructuredRegulatoryReporting3)that).m_tp))
			return false;
		
		if (!Compare.equals(m_dt, ((StructuredRegulatoryReporting3)that).m_dt))
			return false;
		
		if (!Compare.equals(m_ctry, ((StructuredRegulatoryReporting3)that).m_ctry))
			return false;
		
		if (!Compare.equals(m_cd, ((StructuredRegulatoryReporting3)that).m_cd))
			return false;
		
		if (!Compare.equals(m_amt, ((StructuredRegulatoryReporting3)that).m_amt))
			return false;
		
		if (!Compare.equals(m_infList, ((StructuredRegulatoryReporting3)that).m_infList))
			return false;
		
		return true;
	}	

  
  
}
