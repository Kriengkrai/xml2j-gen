package com.xml2j.discogs.labels;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: LABELS 
  Generation date: Mon Apr 16 18:56:35 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.StringList;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * LabelType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
@Document (collection = "Labels")
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
	
  	
  
	/** list of images element. 
	 *  @serial
	 */	
	private List<ImagesType> m_imagesList = new ArrayList<ImagesType>();
	
	/** list of id element. 
	 *  @serial
	 */	
	private StringList m_idList = new StringList("id");
	
	/** list of name element. 
	 *  @serial
	 */	
	private StringList m_nameList = new StringList("name");
	
	/** list of contactinfo element. 
	 *  @serial
	 */	
	private StringList m_contactinfoList = new StringList("contactinfo");
	
	/** list of profile element. 
	 *  @serial
	 */	
	private StringList m_profileList = new StringList("profile");
	
	/** list of data_quality element. 
	 *  @serial
	 */	
	private StringList m_data_qualityList = new StringList("data_quality");
	
	/** list of urls element. 
	 *  @serial
	 */	
	private List<UrlsType> m_urlsList = new ArrayList<UrlsType>();
	
	/** list of parentLabel element. 
	 *  @serial
	 */	
	private List<ParentLabelType> m_parentLabelList = new ArrayList<ParentLabelType>();
	
	/** list of sublabels element. 
	 *  @serial
	 */	
	private List<SublabelsType> m_sublabelsList = new ArrayList<SublabelsType>();
	
	/**
	 * Get the embedded list of Images elements.
	 * @return list of items.
	 */
	public List<ImagesType> getImagess() {
		return m_imagesList;
	}
		
	/**
	 * This method adds data to the list of Images.
	 * @param data the item that needs to be added.
	 */
	void setImages(ImagesType data) {
		m_imagesList.add(data);
	}
			
	/**
	 * Get the embedded list of Id elements.
	 * @return list of items.
	 */
	public StringList getIds() {
		return m_idList;
	}
		
	/**
	 * This method adds data to the list of Id.
	 * @param data the item that needs to be added.
	 */
	void setId(String data) {
		m_idList.add(data);
	}
			
	/**
	 * Get the embedded list of Name elements.
	 * @return list of items.
	 */
	public StringList getNames() {
		return m_nameList;
	}
		
	/**
	 * This method adds data to the list of Name.
	 * @param data the item that needs to be added.
	 */
	void setName(String data) {
		m_nameList.add(data);
	}
			
	/**
	 * Get the embedded list of Contactinfo elements.
	 * @return list of items.
	 */
	public StringList getContactinfos() {
		return m_contactinfoList;
	}
		
	/**
	 * This method adds data to the list of Contactinfo.
	 * @param data the item that needs to be added.
	 */
	void setContactinfo(String data) {
		m_contactinfoList.add(data);
	}
			
	/**
	 * Get the embedded list of Profile elements.
	 * @return list of items.
	 */
	public StringList getProfiles() {
		return m_profileList;
	}
		
	/**
	 * This method adds data to the list of Profile.
	 * @param data the item that needs to be added.
	 */
	void setProfile(String data) {
		m_profileList.add(data);
	}
			
	/**
	 * Get the embedded list of Data_quality elements.
	 * @return list of items.
	 */
	public StringList getData_qualitys() {
		return m_data_qualityList;
	}
		
	/**
	 * This method adds data to the list of Data_quality.
	 * @param data the item that needs to be added.
	 */
	void setData_quality(String data) {
		m_data_qualityList.add(data);
	}
		
	/**
	 * Get the embedded list of Urls elements.
	 * @return list of items.
	 */
	public List<UrlsType> getUrlss() {
		return m_urlsList;
	}
		
	/**
	 * This method adds data to the list of Urls.
	 * @param data the item that needs to be added.
	 */
	void setUrls(UrlsType data) {
		m_urlsList.add(data);
	}
		
	/**
	 * Get the embedded list of ParentLabel elements.
	 * @return list of items.
	 */
	public List<ParentLabelType> getParentLabels() {
		return m_parentLabelList;
	}
		
	/**
	 * This method adds data to the list of ParentLabel.
	 * @param data the item that needs to be added.
	 */
	void setParentLabel(ParentLabelType data) {
		m_parentLabelList.add(data);
	}
		
	/**
	 * Get the embedded list of Sublabels elements.
	 * @return list of items.
	 */
	public List<SublabelsType> getSublabelss() {
		return m_sublabelsList;
	}
		
	/**
	 * This method adds data to the list of Sublabels.
	 * @param data the item that needs to be added.
	 */
	void setSublabels(SublabelsType data) {
		m_sublabelsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	LabelType t = (LabelType)that;
	 
		if (!Compare.equals(m_imagesList, t.m_imagesList))
			return false;
		
		if (!Compare.equals(m_idList, t.m_idList))
			return false;
		
		if (!Compare.equals(m_nameList, t.m_nameList))
			return false;
		
		if (!Compare.equals(m_contactinfoList, t.m_contactinfoList))
			return false;
		
		if (!Compare.equals(m_profileList, t.m_profileList))
			return false;
		
		if (!Compare.equals(m_data_qualityList, t.m_data_qualityList))
			return false;
		
		if (!Compare.equals(m_urlsList, t.m_urlsList))
			return false;
		
		if (!Compare.equals(m_parentLabelList, t.m_parentLabelList))
			return false;
		
		if (!Compare.equals(m_sublabelsList, t.m_sublabelsList))
			return false;
		
		return true;
	}	

  
  

	/**
	 * Get 'id' attribute.
	 * @return the item.
	 */
//	public String getId() {
//		return getAttr("id");
//	}

	/**
	 * Set 'id' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
//	public void setId(String data) {
//		setAttr("id", data);
//	}
  
}
