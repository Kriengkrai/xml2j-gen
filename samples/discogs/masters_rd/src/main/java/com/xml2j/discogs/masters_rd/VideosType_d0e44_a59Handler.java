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

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * VideosType_d0e44_a59 handler class.
 *
 * @see VideosType_d0e44_a59
 */
public class VideosType_d0e44_a59Handler extends XMLFragmentHandler<VideosType_d0e44_a59> {
	/**
	 * Proxy for VideosType_d0e44_a59Handler.
	 */
	static class Proxy extends HandlerProxy<VideosType_d0e44_a59> {
		/**
		 * Allocator for VideosType_d0e44_a59Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<VideosType_d0e44_a59> {			
			public XMLFragmentHandler<VideosType_d0e44_a59> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new VideosType_d0e44_a59Handler(
					task
					, reader
					, handler
					, elementName
					, VideosType_d0e44_a59.getAllocator()
					, setter
					, doProcess);
			}
		}
		
		/**
		 * Constructor for Proxy.
		 *
		 * @param task the XML parser task
		 * @param reader the XML reader
		 * @param parentH the parent XML handler class
		 * @param elementName the name of the XML Element (tag).
		 * @param pSetter the setter for the parent data
		 * @param doProcess indicates whether processing is active for this handler instance
		 */
		public Proxy(ParserTask task, XMLReader reader, XMLFragmentHandler<?> parentH, String elementName,
				DataSetter pSetter, boolean doProcess) {
			super(task, reader, parentH, elementName, pSetter, new Allocator(), doProcess);
		}
	}
	
	/** Data setter class for video element. */
	private class VideoSetter implements DataSetter {
		/** data target. */
		private VideosType_d0e44_a59Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public VideoSetter(VideosType_d0e44_a59Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setVideo((VideoType_d0e47_a61) data);	
		}
	}


	/**
	 * Constructor for handler class.
	 *
	 * @param reader the XML reader
	 * @param parentH the parent XML handler class
	 * @param elementName the name of the XML Element (tag)
	 * @param allocator the allocator for the data type
	 * @param pSetter the setter for the parent data
	 * @param doProcess indicates whether processing is active for this handler instance
	 */
	public VideosType_d0e44_a59Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, VideosType_d0e44_a59.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new VideoType_d0e47_a61Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of videoType_d0e47_a61Handler
				, "video" // XML element name
				, doLink("video") // linking to parent
					? new VideoSetter(this) // ON
					: null // OFF
				, doProcess("video")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public VideosType_d0e44_a59 getData() {
		return (VideosType_d0e44_a59)super.getData();
	}




	/**
	 * This method is called by the XML parser on an end of element event.
	 *
	 * If the localName == 'the name of the element that this handler handles' control is
	 * passed back to the parent handler (future events go there) and the data of
	 * the children of this handler is attached to the data associated to this handler.	
	 * 
	 * The data that is collected is connected to the parent data only if a parentDataSetter
	 * if found (getParentDataSetter()).
	 *
	 * If processing is enabled for a handler, the processor is called.
	 */
	@Override
	public void endElement(String uri, String localName, String name)
		throws SAXException {
		if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
