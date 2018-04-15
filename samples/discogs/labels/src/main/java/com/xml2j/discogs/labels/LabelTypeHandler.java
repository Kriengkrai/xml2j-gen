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

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLEvent;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * LabelType handler class.
 *
 * @see LabelType
 */
public class LabelTypeHandler extends XMLFragmentHandler<LabelType> {
	/**
	 * Proxy for LabelTypeHandler.
	 */
	static class Proxy extends HandlerProxy<LabelType> {
		/**
		 * Allocator for LabelTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<LabelType> {			
			public XMLFragmentHandler<LabelType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new LabelTypeHandler(
					task
					, reader
					, handler
					, elementName
					, LabelType.getAllocator()
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
	
	/** Data setter class for images element. */
	private class ImagesSetter implements DataSetter {
		/** data target. */
		private LabelTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ImagesSetter(LabelTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setImages((ImagesType) data);	
		}
	}	
	/** Data setter class for sublabels element. */
	private class SublabelsSetter implements DataSetter {
		/** data target. */
		private LabelTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SublabelsSetter(LabelTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setSublabels((SublabelsType) data);	
		}
	}	
	/** Data setter class for urls element. */
	private class UrlsSetter implements DataSetter {
		/** data target. */
		private LabelTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UrlsSetter(LabelTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setUrls((UrlsType) data);	
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
	public LabelTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, LabelType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ImagesTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of imagesTypeHandler
				, "images" // XML element name
				, doLink("images") // linking to parent
					? new ImagesSetter(this) // ON
					: null // OFF
				, doProcess("images")) // processing active or not
				);
  
		registerHandler(
			new SublabelsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of sublabelsTypeHandler
				, "sublabels" // XML element name
				, doLink("sublabels") // linking to parent
					? new SublabelsSetter(this) // ON
					: null // OFF
				, doProcess("sublabels")) // processing active or not
				);
  
		registerHandler(
			new UrlsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of urlsTypeHandler
				, "urls" // XML element name
				, doLink("urls") // linking to parent
					? new UrlsSetter(this) // ON
					: null // OFF
				, doProcess("urls")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public LabelType getData() {
		return (LabelType)super.getData();
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
		
		// collect data from children..
		if (localName.equals("contactinfo")) {
			getData().setContactinfo(getValue());
			getContents().reset();
		} else if (localName.equals("data_quality")) {
			getData().setData_quality(getValue());
			getContents().reset();
		} else if (localName.equals("id")) {
			getData().setId(getValue());
			getContents().reset();
		} else if (localName.equals("name")) {
			getData().setName(getValue());
			getContents().reset();
		} else if (localName.equals("parentLabel")) {
			getData().setParentLabel(getValue());
			getContents().reset();
		} else if (localName.equals("profile")) {
			getData().setProfile(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
