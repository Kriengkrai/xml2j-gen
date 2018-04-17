package com.xml2j.discogs.masters_rd;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS_RD 
  Generation date: Tue Apr 17 20:26:13 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * MasterType_d0e5_a1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class MasterType_d0e5_a1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for MasterType_d0e5_a1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	private MasterType_d0e5_a1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type MasterType_d0e5_a1.
	 */
	static class Allocator implements TypeAllocator<MasterType_d0e5_a1> {
		/**
		 * method for getting a new instance of type MasterType_d0e5_a1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public MasterType_d0e5_a1 newInstance(String elementName, ComplexDataType parent) {
			return new MasterType_d0e5_a1(elementName, parent);
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
	
  	
  
	/** element item for main_release element. 
	 *  @serial
	 */	
	private String m_main_release = null;
	
	/** element item for images element. 
	 *  @serial
	 */	
	private ImagesType_d0e9_a6 m_images = null;
	
	/** element item for artists element. 
	 *  @serial
	 */	
	private ArtistsType_d0e21_a26 m_artists = null;
	
	/** element item for genres element. 
	 *  @serial
	 */	
	private GenresType_d0e33_a42 m_genres = null;
	
	/** element item for styles element. 
	 *  @serial
	 */	
	private StylesType_d0e37_a47 m_styles = null;
	
	/** element item for year element. 
	 *  @serial
	 */	
	private String m_year = null;
	
	/** element item for title element. 
	 *  @serial
	 */	
	private String m_title = null;
	
	/** element item for data_quality element. 
	 *  @serial
	 */	
	private String m_data_quality = null;
	
	/** element item for videos element. 
	 *  @serial
	 */	
	private VideosType_d0e44_a59 m_videos = null;
	
	/**
	 * Get the embedded Main_release element.
	 * @return the item.
	 */
	public String getMain_release() {
		return m_main_release;
	}
		
	/**
	 * This method sets (overwrites) the element Main_release.
	 * @param data the item that needs to be added.
	 */
	void setMain_release(String data) {
		m_main_release = data;
	}
		
	/**
	 * Get the embedded Images element.
	 * @return the item.
	 */
	public ImagesType_d0e9_a6 getImages() {
		return m_images;
	}
		
	/**
	 * This method sets (overwrites) the element Images.
	 * @param data the item that needs to be added.
	 */
	void setImages(ImagesType_d0e9_a6 data) {
		m_images = data;
	}
		
	/**
	 * Get the embedded Artists element.
	 * @return the item.
	 */
	public ArtistsType_d0e21_a26 getArtists() {
		return m_artists;
	}
		
	/**
	 * This method sets (overwrites) the element Artists.
	 * @param data the item that needs to be added.
	 */
	void setArtists(ArtistsType_d0e21_a26 data) {
		m_artists = data;
	}
		
	/**
	 * Get the embedded Genres element.
	 * @return the item.
	 */
	public GenresType_d0e33_a42 getGenres() {
		return m_genres;
	}
		
	/**
	 * This method sets (overwrites) the element Genres.
	 * @param data the item that needs to be added.
	 */
	void setGenres(GenresType_d0e33_a42 data) {
		m_genres = data;
	}
		
	/**
	 * Get the embedded Styles element.
	 * @return the item.
	 */
	public StylesType_d0e37_a47 getStyles() {
		return m_styles;
	}
		
	/**
	 * This method sets (overwrites) the element Styles.
	 * @param data the item that needs to be added.
	 */
	void setStyles(StylesType_d0e37_a47 data) {
		m_styles = data;
	}
		
	/**
	 * Get the embedded Year element.
	 * @return the item.
	 */
	public String getYear() {
		return m_year;
	}
		
	/**
	 * This method sets (overwrites) the element Year.
	 * @param data the item that needs to be added.
	 */
	void setYear(String data) {
		m_year = data;
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
	 * Get the embedded Videos element.
	 * @return the item.
	 */
	public VideosType_d0e44_a59 getVideos() {
		return m_videos;
	}
		
	/**
	 * This method sets (overwrites) the element Videos.
	 * @param data the item that needs to be added.
	 */
	void setVideos(VideosType_d0e44_a59 data) {
		m_videos = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	MasterType_d0e5_a1 t = (MasterType_d0e5_a1)that;
	 
		if (!Compare.equals(m_main_release, t.m_main_release))
			return false;
		
		if (!Compare.equals(m_images, t.m_images))
			return false;
		
		if (!Compare.equals(m_artists, t.m_artists))
			return false;
		
		if (!Compare.equals(m_genres, t.m_genres))
			return false;
		
		if (!Compare.equals(m_styles, t.m_styles))
			return false;
		
		if (!Compare.equals(m_year, t.m_year))
			return false;
		
		if (!Compare.equals(m_title, t.m_title))
			return false;
		
		if (!Compare.equals(m_data_quality, t.m_data_quality))
			return false;
		
		if (!Compare.equals(m_videos, t.m_videos))
			return false;
		
		return true;
	}	

  
  

//	/**
//	 * Get 'id' attribute.
//	 * @return the item.
//	 */
//	public String getId() {
//		return getAttr("id");
//	}

//	/**
//	 * Set 'id' attribute.
//	 * 
//	 * Set (overwrite) the attribute data.
//	 * @param data the item that needs to be added.
//	 */
//	public void setId(String data) {
//		setAttr("id", data);
//	}
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from masterType_d0e5_a1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_main_release != null) {
			out.print("\n<main_release>");
			out.print(m_main_release);
			out.print("</main_release>\n");
		}
		
		if (m_images != null) {
			m_images.print(out);
		}	
		
		if (m_artists != null) {
			m_artists.print(out);
		}	
		
		if (m_genres != null) {
			m_genres.print(out);
		}	
		
		if (m_styles != null) {
			m_styles.print(out);
		}	
		
		if (m_year != null) {
			out.print("\n<year>");
			out.print(m_year);
			out.print("</year>\n");
		}
		
		if (m_title != null) {
			out.print("\n<title>");
			out.print(m_title);
			out.print("</title>\n");
		}
		
		if (m_data_quality != null) {
			out.print("\n<data_quality>");
			out.print(m_data_quality);
			out.print("</data_quality>\n");
		}
		
		if (m_videos != null) {
			m_videos.print(out);
		}	
		
	}
}
