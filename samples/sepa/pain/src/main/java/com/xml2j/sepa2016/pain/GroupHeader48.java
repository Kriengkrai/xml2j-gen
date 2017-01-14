package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:45 CET 2017 

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * GroupHeader48 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class GroupHeader48 extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for GroupHeader48.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public GroupHeader48(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type GroupHeader48.
	 */
	static class Allocator implements TypeAllocator<GroupHeader48> {
		/**
		 * method for getting a new instance of type GroupHeader48.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public GroupHeader48 newInstance(String elementName, ComplexDataType parent) {
			return new GroupHeader48(elementName, parent);
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
	
  	
  
	/** element item for MsgId element. 
	 *  @serial
	 */	
	private String m_msgId = null;
	
	/** element item for CreDtTm element. 
	 *  @serial
	 */	
	private String m_creDtTm = null;
	
	/** list of Authstn element. 
	 *  @serial
	 */	
	private List<Authorisation1Choice> m_authstnList = new ArrayList<Authorisation1Choice>();
	
	/** element item for NbOfTxs element. 
	 *  @serial
	 */	
	private String m_nbOfTxs = null;
	
	/** element item for CtrlSum element. 
	 *  @serial
	 */	
	private String m_ctrlSum = null;
	
	/** element item for InitgPty element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_initgPty = null;
	
	/** element item for FwdgAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_fwdgAgt = null;
	
	/**
	 * Get the embedded MsgId element.
	 * @return the item.
	 */
	public String getMsgId() {
		return m_msgId;
	}
		
	/**
	 * This method sets (overwrites) the element MsgId.
	 * @param data the item that needs to be added.
	 */
	void setMsgId(String data) {
		m_msgId = data;
	}
		
	/**
	 * Get the embedded CreDtTm element.
	 * @return the item.
	 */
	public String getCreDtTm() {
		return m_creDtTm;
	}
		
	/**
	 * This method sets (overwrites) the element CreDtTm.
	 * @param data the item that needs to be added.
	 */
	void setCreDtTm(String data) {
		m_creDtTm = data;
	}
		
	/**
	 * Get the embedded list of Authstn elements.
	 * @return list of items.
	 */
	public List<Authorisation1Choice> getAuthstns() {
		return m_authstnList;
	}
		
	/**
	 * This method adds data to the list of Authstn.
	 * @param data the item that needs to be added.
	 */
	void setAuthstn(Authorisation1Choice data) {
		m_authstnList.add(data);
	}
		
	/**
	 * Get the embedded NbOfTxs element.
	 * @return the item.
	 */
	public String getNbOfTxs() {
		return m_nbOfTxs;
	}
		
	/**
	 * This method sets (overwrites) the element NbOfTxs.
	 * @param data the item that needs to be added.
	 */
	void setNbOfTxs(String data) {
		m_nbOfTxs = data;
	}
		
	/**
	 * Get the embedded CtrlSum element.
	 * @return the item.
	 */
	public String getCtrlSum() {
		return m_ctrlSum;
	}
		
	/**
	 * This method sets (overwrites) the element CtrlSum.
	 * @param data the item that needs to be added.
	 */
	void setCtrlSum(String data) {
		m_ctrlSum = data;
	}
		
	/**
	 * Get the embedded InitgPty element.
	 * @return the item.
	 */
	public PartyIdentification43 getInitgPty() {
		return m_initgPty;
	}
		
	/**
	 * This method sets (overwrites) the element InitgPty.
	 * @param data the item that needs to be added.
	 */
	void setInitgPty(PartyIdentification43 data) {
		m_initgPty = data;
	}
		
	/**
	 * Get the embedded FwdgAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getFwdgAgt() {
		return m_fwdgAgt;
	}
		
	/**
	 * This method sets (overwrites) the element FwdgAgt.
	 * @param data the item that needs to be added.
	 */
	void setFwdgAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_fwdgAgt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_msgId, ((GroupHeader48)that).m_msgId))
			return false;
		
		if (!Compare.equals(m_creDtTm, ((GroupHeader48)that).m_creDtTm))
			return false;
		
		if (!Compare.equals(m_authstnList, ((GroupHeader48)that).m_authstnList))
			return false;
		
		if (!Compare.equals(m_nbOfTxs, ((GroupHeader48)that).m_nbOfTxs))
			return false;
		
		if (!Compare.equals(m_ctrlSum, ((GroupHeader48)that).m_ctrlSum))
			return false;
		
		if (!Compare.equals(m_initgPty, ((GroupHeader48)that).m_initgPty))
			return false;
		
		if (!Compare.equals(m_fwdgAgt, ((GroupHeader48)that).m_fwdgAgt))
			return false;
		
		return true;
	}	

  
  
}
