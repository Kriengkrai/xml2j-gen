package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sun Apr 15 13:02:55 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * ReleaseType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
@Document (collection = "Releases")
public class ReleaseType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor for ReleaseType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ReleaseType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}

    private long id = 0L;

    public void setId(long id) {
	    this.id = id;
    }

    /**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ReleaseType.
	 */
	static class Allocator implements TypeAllocator<ReleaseType> {
		/**
		 * method for getting a new instance of type ReleaseType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ReleaseType newInstance(String elementName, ComplexDataType parent) {
			return new ReleaseType(elementName, parent);
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
	
	/** element item for artists element. 
	 *  @serial
	 */	
	private ArtistsType m_artists = null;
	
	/** element item for title element. 
	 *  @serial
	 */	
	private String m_title = null;
	
	/** element item for labels element. 
	 *  @serial
	 */	
	private LabelsType m_labels = null;
	
	/** element item for extraartists element. 
	 *  @serial
	 */	
	private ExtraartistsType m_extraartists = null;
	
	/** element item for formats element. 
	 *  @serial
	 */	
	private FormatsType m_formats = null;
	
	/** element item for genres element. 
	 *  @serial
	 */	
	private GenresType m_genres = null;
	
	/** element item for styles element. 
	 *  @serial
	 */	
	private StylesType m_styles = null;
	
	/** element item for country element. 
	 *  @serial
	 */	
	private String m_country = null;
	
	/** element item for released element. 
	 *  @serial
	 */	
	private String m_released = null;
	
	/** element item for notes element. 
	 *  @serial
	 */	
	private String m_notes = null;
	
	/** element item for master_id element. 
	 *  @serial
	 */	
	private String m_master_id = null;
	
	/** element item for data_quality element. 
	 *  @serial
	 */	
	private String m_data_quality = null;
	
	/** element item for tracklist element. 
	 *  @serial
	 */	
	private TracklistType m_tracklist = null;
	
	/** element item for identifiers element. 
	 *  @serial
	 */	
	private IdentifiersType m_identifiers = null;
	
	/** element item for videos element. 
	 *  @serial
	 */	
	private VideosType m_videos = null;
	
	/** element item for companies element. 
	 *  @serial
	 */	
	private CompaniesType m_companies = null;
	
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
	 * Get the embedded Artists element.
	 * @return the item.
	 */
	public ArtistsType getArtists() {
		return m_artists;
	}
		
	/**
	 * This method sets (overwrites) the element Artists.
	 * @param data the item that needs to be added.
	 */
	void setArtists(ArtistsType data) {
		m_artists = data;
	}
		
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
	 * Get the embedded Labels element.
	 * @return the item.
	 */
	public LabelsType getLabels() {
		return m_labels;
	}
		
	/**
	 * This method sets (overwrites) the element Labels.
	 * @param data the item that needs to be added.
	 */
	void setLabels(LabelsType data) {
		m_labels = data;
	}
		
	/**
	 * Get the embedded Extraartists element.
	 * @return the item.
	 */
	public ExtraartistsType getExtraartists() {
		return m_extraartists;
	}
		
	/**
	 * This method sets (overwrites) the element Extraartists.
	 * @param data the item that needs to be added.
	 */
	void setExtraartists(ExtraartistsType data) {
		m_extraartists = data;
	}
		
	/**
	 * Get the embedded Formats element.
	 * @return the item.
	 */
	public FormatsType getFormats() {
		return m_formats;
	}
		
	/**
	 * This method sets (overwrites) the element Formats.
	 * @param data the item that needs to be added.
	 */
	void setFormats(FormatsType data) {
		m_formats = data;
	}
		
	/**
	 * Get the embedded Genres element.
	 * @return the item.
	 */
	public GenresType getGenres() {
		return m_genres;
	}
		
	/**
	 * This method sets (overwrites) the element Genres.
	 * @param data the item that needs to be added.
	 */
	void setGenres(GenresType data) {
		m_genres = data;
	}
		
	/**
	 * Get the embedded Styles element.
	 * @return the item.
	 */
	public StylesType getStyles() {
		return m_styles;
	}
		
	/**
	 * This method sets (overwrites) the element Styles.
	 * @param data the item that needs to be added.
	 */
	void setStyles(StylesType data) {
		m_styles = data;
	}
		
	/**
	 * Get the embedded Country element.
	 * @return the item.
	 */
	public String getCountry() {
		return m_country;
	}
		
	/**
	 * This method sets (overwrites) the element Country.
	 * @param data the item that needs to be added.
	 */
	void setCountry(String data) {
		m_country = data;
	}
		
	/**
	 * Get the embedded Released element.
	 * @return the item.
	 */
	public String getReleased() {
		return m_released;
	}
		
	/**
	 * This method sets (overwrites) the element Released.
	 * @param data the item that needs to be added.
	 */
	void setReleased(String data) {
		m_released = data;
	}
		
	/**
	 * Get the embedded Notes element.
	 * @return the item.
	 */
	public String getNotes() {
		return m_notes;
	}
		
	/**
	 * This method sets (overwrites) the element Notes.
	 * @param data the item that needs to be added.
	 */
	void setNotes(String data) {
		m_notes = data;
	}
		
	/**
	 * Get the embedded Master_id element.
	 * @return the item.
	 */
	public String getMaster_id() {
		return m_master_id;
	}
		
	/**
	 * This method sets (overwrites) the element Master_id.
	 * @param data the item that needs to be added.
	 */
	void setMaster_id(String data) {
		m_master_id = data;
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
	 * Get the embedded Tracklist element.
	 * @return the item.
	 */
	public TracklistType getTracklist() {
		return m_tracklist;
	}
		
	/**
	 * This method sets (overwrites) the element Tracklist.
	 * @param data the item that needs to be added.
	 */
	void setTracklist(TracklistType data) {
		m_tracklist = data;
	}
		
	/**
	 * Get the embedded Identifiers element.
	 * @return the item.
	 */
	public IdentifiersType getIdentifiers() {
		return m_identifiers;
	}
		
	/**
	 * This method sets (overwrites) the element Identifiers.
	 * @param data the item that needs to be added.
	 */
	void setIdentifiers(IdentifiersType data) {
		m_identifiers = data;
	}
		
	/**
	 * Get the embedded Videos element.
	 * @return the item.
	 */
	public VideosType getVideos() {
		return m_videos;
	}
		
	/**
	 * This method sets (overwrites) the element Videos.
	 * @param data the item that needs to be added.
	 */
	void setVideos(VideosType data) {
		m_videos = data;
	}
		
	/**
	 * Get the embedded Companies element.
	 * @return the item.
	 */
	public CompaniesType getCompanies() {
		return m_companies;
	}
		
	/**
	 * This method sets (overwrites) the element Companies.
	 * @param data the item that needs to be added.
	 */
	void setCompanies(CompaniesType data) {
		m_companies = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ReleaseType t = (ReleaseType)that;
	 
		if (!Compare.equals(m_images, t.m_images))
			return false;
		
		if (!Compare.equals(m_artists, t.m_artists))
			return false;
		
		if (!Compare.equals(m_title, t.m_title))
			return false;
		
		if (!Compare.equals(m_labels, t.m_labels))
			return false;
		
		if (!Compare.equals(m_extraartists, t.m_extraartists))
			return false;
		
		if (!Compare.equals(m_formats, t.m_formats))
			return false;
		
		if (!Compare.equals(m_genres, t.m_genres))
			return false;
		
		if (!Compare.equals(m_styles, t.m_styles))
			return false;
		
		if (!Compare.equals(m_country, t.m_country))
			return false;
		
		if (!Compare.equals(m_released, t.m_released))
			return false;
		
		if (!Compare.equals(m_notes, t.m_notes))
			return false;
		
		if (!Compare.equals(m_master_id, t.m_master_id))
			return false;
		
		if (!Compare.equals(m_data_quality, t.m_data_quality))
			return false;
		
		if (!Compare.equals(m_tracklist, t.m_tracklist))
			return false;
		
		if (!Compare.equals(m_identifiers, t.m_identifiers))
			return false;
		
		if (!Compare.equals(m_videos, t.m_videos))
			return false;
		
		if (!Compare.equals(m_companies, t.m_companies))
			return false;
		
		return true;
	}	

  
  

	/**
	 * Get 'id' attribute.
	 * @return the item.
	 */
	public String getId() {
		return getAttr("id");
	}

	/**
	 * Set 'id' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setId(String data) {
		setAttr("id", data);
	}
  

	/**
	 * Get 'status' attribute.
	 * @return the item.
	 */
	public String getStatus() {
		return getAttr("status");
	}

	/**
	 * Set 'status' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
	public void setStatus(String data) {
		setAttr("status", data);
	}
  
}
