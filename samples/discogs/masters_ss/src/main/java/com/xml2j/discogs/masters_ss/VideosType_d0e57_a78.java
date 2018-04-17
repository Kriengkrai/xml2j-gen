package com.xml2j.discogs.masters_ss;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS_SS 
  Generation date: Tue Apr 17 20:26:13 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * VideosType_d0e57_a78 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class VideosType_d0e57_a78 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for VideosType_d0e57_a78.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	private VideosType_d0e57_a78(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type VideosType_d0e57_a78.
	 */
	static class Allocator implements TypeAllocator<VideosType_d0e57_a78> {
		/**
		 * method for getting a new instance of type VideosType_d0e57_a78.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public VideosType_d0e57_a78 newInstance(String elementName, ComplexDataType parent) {
			return new VideosType_d0e57_a78(elementName, parent);
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
	
  	
  
	/** list of video element. 
	 *  @serial
	 */	
	private List<VideoType_d0e49_a66> m_videoList = new ArrayList<VideoType_d0e49_a66>();
	
	/**
	 * Get the embedded list of Video elements.
	 * @return list of items.
	 */
	public List<VideoType_d0e49_a66> getVideos() {
		return m_videoList;
	}
		
	/**
	 * This method adds data to the list of Video.
	 * @param data the item that needs to be added.
	 */
	void setVideo(VideoType_d0e49_a66 data) {
		m_videoList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	VideosType_d0e57_a78 t = (VideosType_d0e57_a78)that;
	 
		if (!Compare.equals(m_videoList, t.m_videoList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from videosType_d0e57_a78.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_videoList != null) {
			for(VideoType_d0e49_a66 l_video : m_videoList) {
				l_video.print(out);
			}
		}	
		
	}
}
