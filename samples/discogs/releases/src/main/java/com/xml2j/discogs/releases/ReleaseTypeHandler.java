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
 * ReleaseType handler class.
 *
 * @see ReleaseType
 */
public class ReleaseTypeHandler extends XMLFragmentHandler<ReleaseType> {
	/**
	 * Proxy for ReleaseTypeHandler.
	 */
	static class Proxy extends HandlerProxy<ReleaseType> {
		/**
		 * Allocator for ReleaseTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ReleaseType> {			
			public XMLFragmentHandler<ReleaseType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ReleaseTypeHandler(
					task
					, reader
					, handler
					, elementName
					, ReleaseType.getAllocator()
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
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ArtistsSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setArtists((ArtistsType) data);	
		}
	}	
	/** Data setter class for companies element. */
	private class CompaniesSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CompaniesSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCompanies((CompaniesType) data);	
		}
	}	
	/** Data setter class for extraartists element. */
	private class ExtraartistsSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ExtraartistsSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setExtraartists((ExtraartistsType) data);	
		}
	}	
	/** Data setter class for formats element. */
	private class FormatsSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public FormatsSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setFormats((FormatsType) data);	
		}
	}	
	/** Data setter class for genres element. */
	private class GenresSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GenresSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGenres((GenresType) data);	
		}
	}	
	/** Data setter class for identifiers element. */
	private class IdentifiersSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IdentifiersSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setIdentifiers((IdentifiersType) data);	
		}
	}	
	/** Data setter class for images element. */
	private class ImagesSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ImagesSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setImages((ImagesType) data);	
		}
	}	
	/** Data setter class for labels element. */
	private class LabelsSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public LabelsSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setLabels((LabelsType) data);	
		}
	}	
	/** Data setter class for styles element. */
	private class StylesSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public StylesSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setStyles((StylesType) data);	
		}
	}	
	/** Data setter class for tracklist element. */
	private class TracklistSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TracklistSetter(ReleaseTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTracklist((TracklistType) data);	
		}
	}	
	/** Data setter class for videos element. */
	private class VideosSetter implements DataSetter {
		/** data target. */
		private ReleaseTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public VideosSetter(ReleaseTypeHandler pHandler) {
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
	public ReleaseTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ReleaseType.Allocator allocator
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
			new CompaniesTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of companiesTypeHandler
				, "companies" // XML element name
				, doLink("companies") // linking to parent
					? new CompaniesSetter(this) // ON
					: null // OFF
				, doProcess("companies")) // processing active or not
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
  
		registerHandler(
			new FormatsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of formatsTypeHandler
				, "formats" // XML element name
				, doLink("formats") // linking to parent
					? new FormatsSetter(this) // ON
					: null // OFF
				, doProcess("formats")) // processing active or not
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
			new IdentifiersTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of identifiersTypeHandler
				, "identifiers" // XML element name
				, doLink("identifiers") // linking to parent
					? new IdentifiersSetter(this) // ON
					: null // OFF
				, doProcess("identifiers")) // processing active or not
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
			new LabelsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of labelsTypeHandler
				, "labels" // XML element name
				, doLink("labels") // linking to parent
					? new LabelsSetter(this) // ON
					: null // OFF
				, doProcess("labels")) // processing active or not
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
			new TracklistTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of tracklistTypeHandler
				, "tracklist" // XML element name
				, doLink("tracklist") // linking to parent
					? new TracklistSetter(this) // ON
					: null // OFF
				, doProcess("tracklist")) // processing active or not
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
	public ReleaseType getData() {
		return (ReleaseType)super.getData();
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
		if (localName.equals("country")) {
			getData().setCountry(getValue());
			getContents().reset();
		} else if (localName.equals("data_quality")) {
			getData().setData_quality(getValue());
			getContents().reset();
		} else if (localName.equals("master_id")) {
			getData().setMaster_id(getValue());
			getContents().reset();
		} else if (localName.equals("notes")) {
			getData().setNotes(getValue());
			getContents().reset();
		} else if (localName.equals("released")) {
			getData().setReleased(getValue());
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
