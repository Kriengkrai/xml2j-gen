package com.xml2j.tutorial.zoo;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: ZOO 
  Generation date: Sun Apr 29 12:06:43 CEST 2018 
  Author: XML2J-GEN

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
 * MammalZooType handler class.
 *
 * @see MammalZooType
 */
public class MammalZooTypeHandler extends XMLFragmentHandler<MammalZooType> {
	/**
	 * Proxy for MammalZooTypeHandler.
	 */
	static class Proxy extends HandlerProxy<MammalZooType> {
		/**
		 * Allocator for MammalZooTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<MammalZooType> {			
			public XMLFragmentHandler<MammalZooType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new MammalZooTypeHandler(
					task
					, reader
					, handler
					, elementName
					, MammalZooType.getAllocator()
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
	
	/** Data setter class for mammal element. */
	private class MammalSetter implements DataSetter {
		/** data target. */
		private MammalZooTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public MammalSetter(MammalZooTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setMammal((MammalType) data);	
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
	public MammalZooTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, MammalZooType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
	  	// type cat is a derived type from mammal
		registerHandler(
			new CatTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CatTypeHandler
				, "cat" // XML element name
				, doLink("cat") // linking to parent
					? new MammalSetter(this) // ON
					: null // OFF
				, doProcess("cat")) // processing active or not
				);
  
	  	// type dog is a derived type from mammal
		registerHandler(
			new DogTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DogTypeHandler
				, "dog" // XML element name
				, doLink("dog") // linking to parent
					? new MammalSetter(this) // ON
					: null // OFF
				, doProcess("dog")) // processing active or not
				);
  
		registerHandler(
			new MammalTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of MammalTypeHandler
				, "mammal" // XML element name
				, doLink("mammal") // linking to parent
					? new MammalSetter(this) // ON
					: null // OFF
				, doProcess("mammal")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public MammalZooType getData() {
		return (MammalZooType)super.getData();
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
