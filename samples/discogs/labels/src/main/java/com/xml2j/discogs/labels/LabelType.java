package com.xml2j.discogs.labels;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: LABELS 
  Generation date: Sun Apr 15 13:02:55 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * LabelType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class LabelType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for LabelType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public LabelType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type LabelType.
	 */
	static class Allocator implements TypeAllocator<LabelType> {
		/**
		 * method for getting a new instance of type LabelType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public LabelType newInstance(String elementName, ComplexDataType parent) {
			return new LabelType(elementName, parent);
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
	
  	
  
	/** element item for images element. 
	 *  @serial
	 */	
	private ImagesType m_images = null;
	
	/** element item for id element. 
	 *  @serial
	 */	
	private String m_id = null;
	
	/** element item for name element. 
	 *  @serial
	 */	
	private String m_name = null;
	
	/** element item for contactinfo element. 
	 *  @serial
	 */	
	private String m_contactinfo = null;
	
	/** element item for profile element. 
	 *  @serial
	 */	
	private String m_profile = null;
	
	/** element item for parentLabel element. 
	 *  @serial
	 */	
	private String m_parentLabel = null;
	
	/** element item for data_quality element. 
	 *  @serial
	 */	
	private String m_data_quality = null;
	
	/** element item for urls element. 
	 *  @serial
	 */	
	private UrlsType m_urls = null;
	
	/** element item for sublabels element. 
	 *  @serial
	 */	
	private SublabelsType m_sublabels = null;
	
	/**
	 * Get the embedded Images element.
	 * @return the item.
	 */
	public ImagesType getImages() {
		return m_images;
	}
		
	/**
	 * This method sets (overwrites) the element Images.
	 * @param data the item that needs to be added.
	 */
	void setImages(ImagesType data) {
		m_images = data;
	}
		
	/**
	 * Get the embedded Id element.
	 * @return the item.
	 */
	public String getId() {
		return m_id;
	}
		
	/**
	 * This method sets (overwrites) the element Id.
	 * @param data the item that needs to be added.
	 */
	void setId(String data) {
		m_id = data;
	}
		
	/**
	 * Get the embedded Name element.
	 * @return the item.
	 */
	public String getName() {
		return m_name;
	}
		
	/**
	 * This method sets (overwrites) the element Name.
	 * @param data the item that needs to be added.
	 */
	void setName(String data) {
		m_name = data;
	}
		
	/**
	 * Get the embedded Contactinfo element.
	 * @return the item.
	 */
	public String getContactinfo() {
		return m_contactinfo;
	}
		
	/**
	 * This method sets (overwrites) the element Contactinfo.
	 * @param data the item that needs to be added.
	 */
	void setContactinfo(String data) {
		m_contactinfo = data;
	}
		
	/**
	 * Get the embedded Profile element.
	 * @return the item.
	 */
	public String getProfile() {
		return m_profile;
	}
		
	/**
	 * This method sets (overwrites) the element Profile.
	 * @param data the item that needs to be added.
	 */
	void setProfile(String data) {
		m_profile = data;
	}
		
	/**
	 * Get the embedded ParentLabel element.
	 * @return the item.
	 */
	public String getParentLabel() {
		return m_parentLabel;
	}
		
	/**
	 * This method sets (overwrites) the element ParentLabel.
	 * @param data the item that needs to be added.
	 */
	void setParentLabel(String data) {
		m_parentLabel = data;
	}
		
	/**
	 * Get the embedded Data_quality element.
	 * @return the item.
	 */
	public String getData_quality() {
		return m_data_quality;
	}
		
	/**
	 * This method sets (overwrites) the element Data_quality.
	 * @param data the item that needs to be added.
	 */
	void setData_quality(String data) {
		m_data_quality = data;
	}
		
	/**
	 * Get the embedded Urls element.
	 * @return the item.
	 */
	public UrlsType getUrls() {
		return m_urls;
	}
		
	/**
	 * This method sets (overwrites) the element Urls.
	 * @param data the item that needs to be added.
	 */
	void setUrls(UrlsType data) {
		m_urls = data;
	}
		
	/**
	 * Get the embedded Sublabels element.
	 * @return the item.
	 */
	public SublabelsType getSublabels() {
		return m_sublabels;
	}
		
	/**
	 * This method sets (overwrites) the element Sublabels.
	 * @param data the item that needs to be added.
	 */
	void setSublabels(SublabelsType data) {
		m_sublabels = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	LabelType t = (LabelType)that;
	 
		if (!Compare.equals(m_images, t.m_images))
			return false;
		
		if (!Compare.equals(m_id, t.m_id))
			return false;
		
		if (!Compare.equals(m_name, t.m_name))
			return false;
		
		if (!Compare.equals(m_contactinfo, t.m_contactinfo))
			return false;
		
		if (!Compare.equals(m_profile, t.m_profile))
			return false;
		
		if (!Compare.equals(m_parentLabel, t.m_parentLabel))
			return false;
		
		if (!Compare.equals(m_data_quality, t.m_data_quality))
			return false;
		
		if (!Compare.equals(m_urls, t.m_urls))
			return false;
		
		if (!Compare.equals(m_sublabels, t.m_sublabels))
			return false;
		
		return true;
	}	

  
  
}
