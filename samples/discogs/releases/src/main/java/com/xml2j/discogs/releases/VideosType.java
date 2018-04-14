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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * VideosType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class VideosType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for VideosType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public VideosType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type VideosType.
	 */
	static class Allocator implements TypeAllocator<VideosType> {
		/**
		 * method for getting a new instance of type VideosType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public VideosType newInstance(String elementName, ComplexDataType parent) {
			return new VideosType(elementName, parent);
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
	private List<VideoType> m_videoList = new ArrayList<VideoType>();
	
	/**
	 * Get the embedded list of Video elements.
	 * @return list of items.
	 */
	public List<VideoType> getVideos() {
		return m_videoList;
	}
		
	/**
	 * This method adds data to the list of Video.
	 * @param data the item that needs to be added.
	 */
	void setVideo(VideoType data) {
		m_videoList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	VideosType t = (VideosType)that;
	 
		if (!Compare.equals(m_videoList, t.m_videoList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from videosType.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_videoList != null)
			for(VideoType l_video : m_videoList) {
				l_video.print(out);
			}
		else {
			// out.print("<video>null</video>");
		}
		
	}
}
