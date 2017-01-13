package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: ZOO 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

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
 * ZooCollection handler class.
 *
 * @see ZooCollection
 * 
 */
public class ZooCollectionHandler extends XMLFragmentHandler<ZooCollection> {
	/**
	 * Proxy for ZooCollectionHandler.
	 */
	static class Proxy extends HandlerProxy<ZooCollection> {
		/**
		 * Allocator for ZooCollectionHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ZooCollection> {			
			public XMLFragmentHandler<ZooCollection> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ZooCollectionHandler(
					task
					, reader
					, handler
					, elementName
					, ZooCollection.getAllocator()
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
	
	/** Data setter class for birdZoo element. */
	private class BirdZooSetter implements DataSetter {
		/** data target. */
		private ZooCollectionHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public BirdZooSetter(ZooCollectionHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setBirdZoo((BirdZooType) data);	
		}
	}	
	/** Data setter class for mammalZoo element. */
	private class MammalZooSetter implements DataSetter {
		/** data target. */
		private ZooCollectionHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public MammalZooSetter(ZooCollectionHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setMammalZoo((MammalZooType) data);	
		}
	}	
	/** Data setter class for zoo element. */
	private class ZooSetter implements DataSetter {
		/** data target. */
		private ZooCollectionHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ZooSetter(ZooCollectionHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setZoo((ZooType) data);	
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
	public ZooCollectionHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ZooCollection.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new BirdZooTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BirdZooTypeHandler
				, "birdZoo" // XML element name
				, doLink("birdZoo") // linking to parent
					? new BirdZooSetter(this) // ON
					: null // OFF
				, doProcess("birdZoo")) // processing active or not
				);
  
		registerHandler(
			new MammalZooTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of MammalZooTypeHandler
				, "mammalZoo" // XML element name
				, doLink("mammalZoo") // linking to parent
					? new MammalZooSetter(this) // ON
					: null // OFF
				, doProcess("mammalZoo")) // processing active or not
				);
  
		registerHandler(
			new ZooTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ZooTypeHandler
				, "zoo" // XML element name
				, doLink("zoo") // linking to parent
					? new ZooSetter(this) // ON
					: null // OFF
				, doProcess("zoo")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public ZooCollection getData() {
		return (ZooCollection)super.getData();
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
