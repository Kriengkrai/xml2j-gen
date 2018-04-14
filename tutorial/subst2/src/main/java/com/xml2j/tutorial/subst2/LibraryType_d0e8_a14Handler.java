package com.xml2j.tutorial.subst2;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SUBST2 
  Generation date: Thu Apr 12 19:34:42 CEST 2018 
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
 * LibraryType_d0e8_a14 handler class.
 *
 * @see LibraryType_d0e8_a14
 */
public class LibraryType_d0e8_a14Handler extends XMLFragmentHandler<LibraryType_d0e8_a14> {
	/**
	 * Proxy for LibraryType_d0e8_a14Handler.
	 */
	static class Proxy extends HandlerProxy<LibraryType_d0e8_a14> {
		/**
		 * Allocator for LibraryType_d0e8_a14Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<LibraryType_d0e8_a14> {			
			public XMLFragmentHandler<LibraryType_d0e8_a14> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new LibraryType_d0e8_a14Handler(
					task
					, reader
					, handler
					, elementName
					, LibraryType_d0e8_a14.getAllocator()
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
	
	/** Data setter class for books element. */
	private class BooksSetter implements DataSetter {
		/** data target. */
		private LibraryType_d0e8_a14Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public BooksSetter(LibraryType_d0e8_a14Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setBooks((BookCollectionType) data);	
		}
	}	
	/** Data setter class for cds element. */
	private class CdsSetter implements DataSetter {
		/** data target. */
		private LibraryType_d0e8_a14Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdsSetter(LibraryType_d0e8_a14Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCds((OpticalCollectionType) data);	
		}
	}	
	/** Data setter class for miscellaneousItems element. */
	private class MiscellaneousItemsSetter implements DataSetter {
		/** data target. */
		private LibraryType_d0e8_a14Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public MiscellaneousItemsSetter(LibraryType_d0e8_a14Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setMiscellaneousItems((GenericCollectionType) data);	
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
	public LibraryType_d0e8_a14Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, LibraryType_d0e8_a14.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new BookCollectionTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BookCollectionTypeHandler
				, "books" // XML element name
				, doLink("books") // linking to parent
					? new BooksSetter(this) // ON
					: null // OFF
				, doProcess("books")) // processing active or not
				);
  
		registerHandler(
			new OpticalCollectionTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OpticalCollectionTypeHandler
				, "cds" // XML element name
				, doLink("cds") // linking to parent
					? new CdsSetter(this) // ON
					: null // OFF
				, doProcess("cds")) // processing active or not
				);
  
		registerHandler(
			new GenericCollectionTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GenericCollectionTypeHandler
				, "miscellaneousItems" // XML element name
				, doLink("miscellaneousItems") // linking to parent
					? new MiscellaneousItemsSetter(this) // ON
					: null // OFF
				, doProcess("miscellaneousItems")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public LibraryType_d0e8_a14 getData() {
		return (LibraryType_d0e8_a14)super.getData();
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
