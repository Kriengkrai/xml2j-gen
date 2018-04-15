package com.xml2j.discogs.artists;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: ARTISTS 
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
 * ArtistType handler class.
 *
 * @see ArtistType
 */
public class ArtistTypeHandler extends XMLFragmentHandler<ArtistType> {
	/**
	 * Proxy for ArtistTypeHandler.
	 */
	static class Proxy extends HandlerProxy<ArtistType> {
		/**
		 * Allocator for ArtistTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ArtistType> {			
			public XMLFragmentHandler<ArtistType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ArtistTypeHandler(
					task
					, reader
					, handler
					, elementName
					, ArtistType.getAllocator()
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
	
	/** Data setter class for aliases element. */
	private class AliasesSetter implements DataSetter {
		/** data target. */
		private ArtistTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AliasesSetter(ArtistTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAliases((AliasesType) data);	
		}
	}	
	/** Data setter class for groups element. */
	private class GroupsSetter implements DataSetter {
		/** data target. */
		private ArtistTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GroupsSetter(ArtistTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGroups((GroupsType) data);	
		}
	}	
	/** Data setter class for images element. */
	private class ImagesSetter implements DataSetter {
		/** data target. */
		private ArtistTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ImagesSetter(ArtistTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setImages((ImagesType) data);	
		}
	}	
	/** Data setter class for members element. */
	private class MembersSetter implements DataSetter {
		/** data target. */
		private ArtistTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public MembersSetter(ArtistTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setMembers((MembersType) data);	
		}
	}	
	/** Data setter class for namevariations element. */
	private class NamevariationsSetter implements DataSetter {
		/** data target. */
		private ArtistTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public NamevariationsSetter(ArtistTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setNamevariations((NamevariationsType) data);	
		}
	}	
	/** Data setter class for urls element. */
	private class UrlsSetter implements DataSetter {
		/** data target. */
		private ArtistTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UrlsSetter(ArtistTypeHandler pHandler) {
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
	public ArtistTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ArtistType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new AliasesTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of aliasesTypeHandler
				, "aliases" // XML element name
				, doLink("aliases") // linking to parent
					? new AliasesSetter(this) // ON
					: null // OFF
				, doProcess("aliases")) // processing active or not
				);
  
		registerHandler(
			new GroupsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of groupsTypeHandler
				, "groups" // XML element name
				, doLink("groups") // linking to parent
					? new GroupsSetter(this) // ON
					: null // OFF
				, doProcess("groups")) // processing active or not
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
			new MembersTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of membersTypeHandler
				, "members" // XML element name
				, doLink("members") // linking to parent
					? new MembersSetter(this) // ON
					: null // OFF
				, doProcess("members")) // processing active or not
				);
  
		registerHandler(
			new NamevariationsTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of namevariationsTypeHandler
				, "namevariations" // XML element name
				, doLink("namevariations") // linking to parent
					? new NamevariationsSetter(this) // ON
					: null // OFF
				, doProcess("namevariations")) // processing active or not
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
	public ArtistType getData() {
		return (ArtistType)super.getData();
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
		} else if (localName.equals("id")) {
			getData().setId(getValue());
			getContents().reset();
		} else if (localName.equals("name")) {
			getData().setName(getValue());
			getContents().reset();
		} else if (localName.equals("profile")) {
			getData().setProfile(getValue());
			getContents().reset();
		} else if (localName.equals("realname")) {
			getData().setRealname(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
