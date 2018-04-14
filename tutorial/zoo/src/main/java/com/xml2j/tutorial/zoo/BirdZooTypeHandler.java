package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: ZOO 
  Generation date: Sat Apr 14 12:01:31 CEST 2018 
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
 * BirdZooType handler class.
 *
 * @see BirdZooType
 */
public class BirdZooTypeHandler extends XMLFragmentHandler<BirdZooType> {
	/**
	 * Proxy for BirdZooTypeHandler.
	 */
	static class Proxy extends HandlerProxy<BirdZooType> {
		/**
		 * Allocator for BirdZooTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<BirdZooType> {			
			public XMLFragmentHandler<BirdZooType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new BirdZooTypeHandler(
					task
					, reader
					, handler
					, elementName
					, BirdZooType.getAllocator()
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
	
	/** Data setter class for bird element. */
	private class BirdSetter implements DataSetter {
		/** data target. */
		private BirdZooTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public BirdSetter(BirdZooTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setBird((BirdType) data);	
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
	public BirdZooTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, BirdZooType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new BirdTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BirdTypeHandler
				, "bird" // XML element name
				, doLink("bird") // linking to parent
					? new BirdSetter(this) // ON
					: null // OFF
				, doProcess("bird")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public BirdZooType getData() {
		return (BirdZooType)super.getData();
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
