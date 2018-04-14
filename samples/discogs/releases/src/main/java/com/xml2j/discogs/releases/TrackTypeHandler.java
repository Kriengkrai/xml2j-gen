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
 * TrackType handler class.
 *
 * @see TrackType
 */
public class TrackTypeHandler extends XMLFragmentHandler<TrackType> {
	/**
	 * Proxy for TrackTypeHandler.
	 */
	static class Proxy extends HandlerProxy<TrackType> {
		/**
		 * Allocator for TrackTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<TrackType> {			
			public XMLFragmentHandler<TrackType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new TrackTypeHandler(
					task
					, reader
					, handler
					, elementName
					, TrackType.getAllocator()
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
	
	/** Data setter class for artists element. */
	private class ArtistsSetter implements DataSetter {
		/** data target. */
		private TrackTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ArtistsSetter(TrackTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setArtists((ArtistsType) data);	
		}
	}	
	/** Data setter class for extraartists element. */
	private class ExtraartistsSetter implements DataSetter {
		/** data target. */
		private TrackTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ExtraartistsSetter(TrackTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setExtraartists((ExtraartistsType) data);	
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
	public TrackTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, TrackType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ArtistsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of artistsTypeHandler
				, "artists" // XML element name
				, doLink("artists") // linking to parent
					? new ArtistsSetter(this) // ON
					: null // OFF
				, doProcess("artists")) // processing active or not
				);
  
		registerHandler(
			new ExtraartistsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of extraartistsTypeHandler
				, "extraartists" // XML element name
				, doLink("extraartists") // linking to parent
					? new ExtraartistsSetter(this) // ON
					: null // OFF
				, doProcess("extraartists")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public TrackType getData() {
		return (TrackType)super.getData();
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
		if (localName.equals("duration")) {
			getData().setDuration(getValue());
			getContents().reset();
		} else if (localName.equals("position")) {
			getData().setPosition(getValue());
			getContents().reset();
		} else if (localName.equals("title")) {
			getData().setTitle(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
				
			// return control to parent handler..
			this.deactivate();
			
			// get content of this item..
			getData().setContent(this.getValue());
			
			// attach data to parent (if parent data setter is found)..
			DataSetter setter = getParentDataSetter();
			if (setter != null) {
				setter.set(getData());
			} 
			
			// process data if required..
			if (doProcess()) {
				process(XMLEvent.END);
			}
		}
		
	}	
}
