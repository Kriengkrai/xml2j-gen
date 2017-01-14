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
 * AmountType4Choice data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 * 
 */
public class AmountType4Choice extends ComplexDataType {

	/**
	 * default serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AmountType4Choice.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public AmountType4Choice(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type AmountType4Choice.
	 */
	static class Allocator implements TypeAllocator<AmountType4Choice> {
		/**
		 * method for getting a new instance of type AmountType4Choice.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AmountType4Choice newInstance(String elementName, ComplexDataType parent) {
			return new AmountType4Choice(elementName, parent);
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
	
  	
  
	/** element item for InstdAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_instdAmt = null;
	
	/** element item for EqvtAmt element. 
	 *  @serial
	 */	
	private EquivalentAmount2 m_eqvtAmt = null;
	
	/**
	 * Get the embedded InstdAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
		return m_instdAmt;
	}
		
	/**
	 * This method sets (overwrites) the element InstdAmt.
	 * @param data the item that needs to be added.
	 */
	void setInstdAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_instdAmt = data;
	}
		
	/**
	 * Get the embedded EqvtAmt element.
	 * @return the item.
	 */
	public EquivalentAmount2 getEqvtAmt() {
		return m_eqvtAmt;
	}
		
	/**
	 * This method sets (overwrites) the element EqvtAmt.
	 * @param data the item that needs to be added.
	 */
	void setEqvtAmt(EquivalentAmount2 data) {
		m_eqvtAmt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
  
		if (!Compare.equals(m_instdAmt, ((AmountType4Choice)that).m_instdAmt))
			return false;
		
		if (!Compare.equals(m_eqvtAmt, ((AmountType4Choice)that).m_eqvtAmt))
			return false;
		
		return true;
	}	

  
  
}
