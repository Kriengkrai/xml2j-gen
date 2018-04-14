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
 * GenericCollectionType handler class.
 *
 * @see GenericCollectionType
 */
public class GenericCollectionTypeHandler extends XMLFragmentHandler<GenericCollectionType> {
	/**
	 * Proxy for GenericCollectionTypeHandler.
	 */
	static class Proxy extends HandlerProxy<GenericCollectionType> {
		/**
		 * Allocator for GenericCollectionTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<GenericCollectionType> {			
			public XMLFragmentHandler<GenericCollectionType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new GenericCollectionTypeHandler(
					task
					, reader
					, handler
					, elementName
					, GenericCollectionType.getAllocator()
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
	
	/** Data setter class for item element. */
	private class ItemSetter implements DataSetter {
		/** data target. */
		private GenericCollectionTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ItemSetter(GenericCollectionTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setItem((LibraryItemType) data);	
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
	public GenericCollectionTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, GenericCollectionType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
	  	// type book is a derived type from item
		registerHandler(
			new BookTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BookTypeHandler
				, "book" // XML element name
				, doLink("book") // linking to parent
					? new ItemSetter(this) // ON
					: null // OFF
				, doProcess("book")) // processing active or not
				);
  
	  	// type CD is a derived type from item
		registerHandler(
			new CDTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CDTypeHandler
				, "CD" // XML element name
				, doLink("CD") // linking to parent
					? new ItemSetter(this) // ON
					: null // OFF
				, doProcess("CD")) // processing active or not
				);
  
		registerHandler(
			new LibraryItemTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of LibraryItemTypeHandler
				, "item" // XML element name
				, doLink("item") // linking to parent
					? new ItemSetter(this) // ON
					: null // OFF
				, doProcess("item")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public GenericCollectionType getData() {
		return (GenericCollectionType)super.getData();
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
