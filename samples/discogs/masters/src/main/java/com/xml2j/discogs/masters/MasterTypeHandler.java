package com.xml2j.discogs.masters;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS 
  Generation date: Mon Apr 16 18:56:35 CEST 2018 
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
 * MasterType handler class.
 *
 * @see MasterType
 */
public class MasterTypeHandler extends XMLFragmentHandler<MasterType> {
	/**
	 * Proxy for MasterTypeHandler.
	 */
	static class Proxy extends HandlerProxy<MasterType> {
		/**
		 * Allocator for MasterTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<MasterType> {			
			public XMLFragmentHandler<MasterType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new MasterTypeHandler(
					task
					, reader
					, handler
					, elementName
					, MasterType.getAllocator()
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
		private MasterTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ArtistsSetter(MasterTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setArtists((ArtistsType) data);	
		}
	}	
	/** Data setter class for genres element. */
	private class GenresSetter implements DataSetter {
		/** data target. */
		private MasterTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GenresSetter(MasterTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGenres((GenresType) data);	
		}
	}	
	/** Data setter class for images element. */
	private class ImagesSetter implements DataSetter {
		/** data target. */
		private MasterTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ImagesSetter(MasterTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setImages((ImagesType) data);	
		}
	}	
	/** Data setter class for styles element. */
	private class StylesSetter implements DataSetter {
		/** data target. */
		private MasterTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public StylesSetter(MasterTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setStyles((StylesType) data);	
		}
	}	
	/** Data setter class for videos element. */
	private class VideosSetter implements DataSetter {
		/** data target. */
		private MasterTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public VideosSetter(MasterTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setVideos((VideosType) data);	
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
	public MasterTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, MasterType.Allocator allocator
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
			new GenresTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of genresTypeHandler
				, "genres" // XML element name
				, doLink("genres") // linking to parent
					? new GenresSetter(this) // ON
					: null // OFF
				, doProcess("genres")) // processing active or not
				);
  
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
			new StylesTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of stylesTypeHandler
				, "styles" // XML element name
				, doLink("styles") // linking to parent
					? new StylesSetter(this) // ON
					: null // OFF
				, doProcess("styles")) // processing active or not
				);
  
		registerHandler(
			new VideosTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of videosTypeHandler
				, "videos" // XML element name
				, doLink("videos") // linking to parent
					? new VideosSetter(this) // ON
					: null // OFF
				, doProcess("videos")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public MasterType getData() {
		return (MasterType)super.getData();
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
		if (localName.equals("data_quality")) {
			getData().setData_quality(getValue());
			getContents().reset();
		} else if (localName.equals("main_release")) {
			getData().setMain_release(getValue());
			getContents().reset();
		} else if (localName.equals("title")) {
			getData().setTitle(getValue());
			getContents().reset();
		} else if (localName.equals("year")) {
			getData().setYear(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
