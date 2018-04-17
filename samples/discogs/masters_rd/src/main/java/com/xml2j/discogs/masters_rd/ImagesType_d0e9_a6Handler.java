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
 * ImagesType_d0e9_a6 handler class.
 *
 * @see ImagesType_d0e9_a6
 */
public class ImagesType_d0e9_a6Handler extends XMLFragmentHandler<ImagesType_d0e9_a6> {
	/**
	 * Proxy for ImagesType_d0e9_a6Handler.
	 */
	static class Proxy extends HandlerProxy<ImagesType_d0e9_a6> {
		/**
		 * Allocator for ImagesType_d0e9_a6Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ImagesType_d0e9_a6> {			
			public XMLFragmentHandler<ImagesType_d0e9_a6> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ImagesType_d0e9_a6Handler(
					task
					, reader
					, handler
					, elementName
					, ImagesType_d0e9_a6.getAllocator()
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
	
	/** Data setter class for image element. */
	private class ImageSetter implements DataSetter {
		/** data target. */
		private ImagesType_d0e9_a6Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ImageSetter(ImagesType_d0e9_a6Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setImage((ImageType_d0e12_a7) data);	
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
	public ImagesType_d0e9_a6Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ImagesType_d0e9_a6.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ImageType_d0e12_a7Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of imageType_d0e12_a7Handler
				, "image" // XML element name
				, doLink("image") // linking to parent
					? new ImageSetter(this) // ON
					: null // OFF
				, doProcess("image")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public ImagesType_d0e9_a6 getData() {
		return (ImagesType_d0e9_a6)super.getData();
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
