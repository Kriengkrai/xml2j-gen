package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sat Apr 14 18:02:46 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * VideoType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class VideoType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for VideoType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public VideoType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type VideoType.
	 */
	static class Allocator implements TypeAllocator<VideoType> {
		/**
		 * method for getting a new instance of type VideoType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public VideoType newInstance(String elementName, ComplexDataType parent) {
			return new VideoType(elementName, parent);
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
	
  	
  
	/** element item for title element. 
	 *  @serial
	 */	
	private String m_title = null;
	
	/** element item for description element. 
	 *  @serial
	 */	
	private String m_description = null;
	
	/**
	 * Get the embedded Title element.
	 * @return the item.
	 */
	public String getTitle() {
		return m_title;
	}
		
	/**
	 * This method sets (overwrites) the element Title.
	 * @param data the item that needs to be added.
	 */
	void setTitle(String data) {
		m_title = data;
	}
		
	/**
	 * Get the embedded Description element.
	 * @return the item.
	 */
	public String getDescription() {
		return m_description;
	}
		
	/**
	 * This method sets (overwrites) the element Description.
	 * @param data the item that needs to be added.
	 */
	void setDescription(String data) {
		m_description = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	VideoType t = (VideoType)that;
	 
		if (!Compare.equals(m_title, t.m_title))
			return false;
		
		if (!Compare.equals(m_description, t.m_description))
			return false;
		
		return true;
	}	

  
  

	/**
	 * Get 'duration' attribute.
	 * @return the item.
	 */
	public String getDuration() {
		return getAttr("duration");
	}

	/**
	 * Set 'duration' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setDuration(String data) {
		setAttr("duration", data);
	}
  

	/**
	 * Get 'embed' attribute.
	 * @return the item.
	 */
	public String getEmbed() {
		return getAttr("embed");
	}

	/**
	 * Set 'embed' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setEmbed(String data) {
		setAttr("embed", data);
	}
  

	/**
	 * Get 'src' attribute.
	 * @return the item.
	 */
	public String getSrc() {
		return getAttr("src");
	}

	/**
	 * Set 'src' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setSrc(String data) {
		setAttr("src", data);
	}
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from videoType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_title != null) {
			out.print("\n<title>");
			out.print(m_title);
			out.print("</title>\n");
		}
		
		if (m_description != null) {
			out.print("\n<description>");
			out.print(m_description);
			out.print("</description>\n");
		}
		
	}
}
