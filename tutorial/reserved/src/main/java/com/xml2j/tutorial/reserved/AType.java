package com.xml2j.tutorial.reserved;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RESERVED 
  Generation date: Sat Apr 14 12:01:30 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * AType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class AType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for AType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public AType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type AType.
	 */
	static class Allocator implements TypeAllocator<AType> {
		/**
		 * method for getting a new instance of type AType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public AType newInstance(String elementName, ComplexDataType parent) {
			return new AType(elementName, parent);
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
	
  	
  
	/** element item for int element. 
	 *  @serial
	 */	
	private String m_int = null;
	
	/** element item for long element. 
	 *  @serial
	 */	
	private String m_long = null;
	
	/** element item for short element. 
	 *  @serial
	 */	
	private String m_short = null;
	
	/** element item for try element. 
	 *  @serial
	 */	
	private String m_try = null;
	
	/** element item for catch element. 
	 *  @serial
	 */	
	private String m_catch = null;
	
	/** element item for while element. 
	 *  @serial
	 */	
	private String m_while = null;
	
	/** element item for do element. 
	 *  @serial
	 */	
	private String m_do = null;
	
	/** element item for finally element. 
	 *  @serial
	 */	
	private String m_finally = null;
	
	/** element item for final element. 
	 *  @serial
	 */	
	private String m_final = null;
	
	/**
	 * Get the embedded Int element.
	 * @return the item.
	 */
	public String getInt() {
		return m_int;
	}
		
	/**
	 * This method sets (overwrites) the element Int.
	 * @param data the item that needs to be added.
	 */
	void setInt(String data) {
		m_int = data;
	}
		
	/**
	 * Get the embedded Long element.
	 * @return the item.
	 */
	public String getLong() {
		return m_long;
	}
		
	/**
	 * This method sets (overwrites) the element Long.
	 * @param data the item that needs to be added.
	 */
	void setLong(String data) {
		m_long = data;
	}
		
	/**
	 * Get the embedded Short element.
	 * @return the item.
	 */
	public String getShort() {
		return m_short;
	}
		
	/**
	 * This method sets (overwrites) the element Short.
	 * @param data the item that needs to be added.
	 */
	void setShort(String data) {
		m_short = data;
	}
		
	/**
	 * Get the embedded Try element.
	 * @return the item.
	 */
	public String getTry() {
		return m_try;
	}
		
	/**
	 * This method sets (overwrites) the element Try.
	 * @param data the item that needs to be added.
	 */
	void setTry(String data) {
		m_try = data;
	}
		
	/**
	 * Get the embedded Catch element.
	 * @return the item.
	 */
	public String getCatch() {
		return m_catch;
	}
		
	/**
	 * This method sets (overwrites) the element Catch.
	 * @param data the item that needs to be added.
	 */
	void setCatch(String data) {
		m_catch = data;
	}
		
	/**
	 * Get the embedded While element.
	 * @return the item.
	 */
	public String getWhile() {
		return m_while;
	}
		
	/**
	 * This method sets (overwrites) the element While.
	 * @param data the item that needs to be added.
	 */
	void setWhile(String data) {
		m_while = data;
	}
		
	/**
	 * Get the embedded Do element.
	 * @return the item.
	 */
	public String getDo() {
		return m_do;
	}
		
	/**
	 * This method sets (overwrites) the element Do.
	 * @param data the item that needs to be added.
	 */
	void setDo(String data) {
		m_do = data;
	}
		
	/**
	 * Get the embedded Finally element.
	 * @return the item.
	 */
	public String getFinally() {
		return m_finally;
	}
		
	/**
	 * This method sets (overwrites) the element Finally.
	 * @param data the item that needs to be added.
	 */
	void setFinally(String data) {
		m_finally = data;
	}
		
	/**
	 * Get the embedded Final element.
	 * @return the item.
	 */
	public String getFinal() {
		return m_final;
	}
		
	/**
	 * This method sets (overwrites) the element Final.
	 * @param data the item that needs to be added.
	 */
	void setFinal(String data) {
		m_final = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	AType t = (AType)that;
	 
		if (!Compare.equals(m_int, t.m_int))
			return false;
		
		if (!Compare.equals(m_long, t.m_long))
			return false;
		
		if (!Compare.equals(m_short, t.m_short))
			return false;
		
		if (!Compare.equals(m_try, t.m_try))
			return false;
		
		if (!Compare.equals(m_catch, t.m_catch))
			return false;
		
		if (!Compare.equals(m_while, t.m_while))
			return false;
		
		if (!Compare.equals(m_do, t.m_do))
			return false;
		
		if (!Compare.equals(m_finally, t.m_finally))
			return false;
		
		if (!Compare.equals(m_final, t.m_final))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from AType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_int != null) {
			out.print("\n<int>");
			out.print(m_int);
			out.print("</int>\n");
		}
		
		if (m_long != null) {
			out.print("\n<long>");
			out.print(m_long);
			out.print("</long>\n");
		}
		
		if (m_short != null) {
			out.print("\n<short>");
			out.print(m_short);
			out.print("</short>\n");
		}
		
		if (m_try != null) {
			out.print("\n<try>");
			out.print(m_try);
			out.print("</try>\n");
		}
		
		if (m_catch != null) {
			out.print("\n<catch>");
			out.print(m_catch);
			out.print("</catch>\n");
		}
		
		if (m_while != null) {
			out.print("\n<while>");
			out.print(m_while);
			out.print("</while>\n");
		}
		
		if (m_do != null) {
			out.print("\n<do>");
			out.print(m_do);
			out.print("</do>\n");
		}
		
		if (m_finally != null) {
			out.print("\n<finally>");
			out.print(m_finally);
			out.print("</finally>\n");
		}
		
		if (m_final != null) {
			out.print("\n<final>");
			out.print(m_final);
			out.print("</final>\n");
		}
		
	}
}
