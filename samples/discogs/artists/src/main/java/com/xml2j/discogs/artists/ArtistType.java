package com.xml2j.discogs.artists;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: ARTISTS 
  Generation date: Mon Apr 16 18:56:35 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * ArtistType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
@Document (collection = "Artists")
public class ArtistType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ArtistType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ArtistType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ArtistType.
	 */
	static class Allocator implements TypeAllocator<ArtistType> {
		/**
		 * method for getting a new instance of type ArtistType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ArtistType newInstance(String elementName, ComplexDataType parent) {
			return new ArtistType(elementName, parent);
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
	
	/** element item for realname element. 
	 *  @serial
	 */	
	private String m_realname = null;
	
	/** element item for profile element. 
	 *  @serial
	 */	
	private String m_profile = null;
	
	/** element item for data_quality element. 
	 *  @serial
	 */	
	private String m_data_quality = null;
	
	/** element item for urls element. 
	 *  @serial
	 */	
	private UrlsType m_urls = null;
	
	/** element item for namevariations element. 
	 *  @serial
	 */	
	private NamevariationsType m_namevariations = null;
	
	/** element item for aliases element. 
	 *  @serial
	 */	
	private AliasesType m_aliases = null;
	
	/** element item for members element. 
	 *  @serial
	 */	
	private MembersType m_members = null;
	
	/** element item for groups element. 
	 *  @serial
	 */	
	private GroupsType m_groups = null;
	
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
	 * Get the embedded Realname element.
	 * @return the item.
	 */
	public String getRealname() {
		return m_realname;
	}
		
	/**
	 * This method sets (overwrites) the element Realname.
	 * @param data the item that needs to be added.
	 */
	void setRealname(String data) {
		m_realname = data;
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
	 * Get the embedded Namevariations element.
	 * @return the item.
	 */
	public NamevariationsType getNamevariations() {
		return m_namevariations;
	}
		
	/**
	 * This method sets (overwrites) the element Namevariations.
	 * @param data the item that needs to be added.
	 */
	void setNamevariations(NamevariationsType data) {
		m_namevariations = data;
	}
		
	/**
	 * Get the embedded Aliases element.
	 * @return the item.
	 */
	public AliasesType getAliases() {
		return m_aliases;
	}
		
	/**
	 * This method sets (overwrites) the element Aliases.
	 * @param data the item that needs to be added.
	 */
	void setAliases(AliasesType data) {
		m_aliases = data;
	}
		
	/**
	 * Get the embedded Members element.
	 * @return the item.
	 */
	public MembersType getMembers() {
		return m_members;
	}
		
	/**
	 * This method sets (overwrites) the element Members.
	 * @param data the item that needs to be added.
	 */
	void setMembers(MembersType data) {
		m_members = data;
	}
		
	/**
	 * Get the embedded Groups element.
	 * @return the item.
	 */
	public GroupsType getGroups() {
		return m_groups;
	}
		
	/**
	 * This method sets (overwrites) the element Groups.
	 * @param data the item that needs to be added.
	 */
	void setGroups(GroupsType data) {
		m_groups = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ArtistType t = (ArtistType)that;
	 
		if (!Compare.equals(m_images, t.m_images))
			return false;
		
		if (!Compare.equals(m_id, t.m_id))
			return false;
		
		if (!Compare.equals(m_name, t.m_name))
			return false;
		
		if (!Compare.equals(m_realname, t.m_realname))
			return false;
		
		if (!Compare.equals(m_profile, t.m_profile))
			return false;
		
		if (!Compare.equals(m_data_quality, t.m_data_quality))
			return false;
		
		if (!Compare.equals(m_urls, t.m_urls))
			return false;
		
		if (!Compare.equals(m_namevariations, t.m_namevariations))
			return false;
		
		if (!Compare.equals(m_aliases, t.m_aliases))
			return false;
		
		if (!Compare.equals(m_members, t.m_members))
			return false;
		
		if (!Compare.equals(m_groups, t.m_groups))
			return false;
		
		return true;
	}	

  
  
}
