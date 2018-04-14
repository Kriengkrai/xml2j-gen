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
 * ZooType handler class.
 *
 * @see ZooType
 */
public class ZooTypeHandler extends XMLFragmentHandler<ZooType> {
	/**
	 * Proxy for ZooTypeHandler.
	 */
	static class Proxy extends HandlerProxy<ZooType> {
		/**
		 * Allocator for ZooTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ZooType> {			
			public XMLFragmentHandler<ZooType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ZooTypeHandler(
					task
					, reader
					, handler
					, elementName
					, ZooType.getAllocator()
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
	
	/** Data setter class for animal element. */
	private class AnimalSetter implements DataSetter {
		/** data target. */
		private ZooTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AnimalSetter(ZooTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAnimal((AnimalType) data);	
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
	public ZooTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ZooType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new AnimalTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of AnimalTypeHandler
				, "animal" // XML element name
				, doLink("animal") // linking to parent
					? new AnimalSetter(this) // ON
					: null // OFF
				, doProcess("animal")) // processing active or not
				);
  
	  	// type bird is a derived type from animal
		registerHandler(
			new BirdTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BirdTypeHandler
				, "bird" // XML element name
				, doLink("bird") // linking to parent
					? new AnimalSetter(this) // ON
					: null // OFF
				, doProcess("bird")) // processing active or not
				);
  
	  	// type cat is a derived type from animal
		registerHandler(
			new CatTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CatTypeHandler
				, "cat" // XML element name
				, doLink("cat") // linking to parent
					? new AnimalSetter(this) // ON
					: null // OFF
				, doProcess("cat")) // processing active or not
				);
  
	  	// type dog is a derived type from animal
		registerHandler(
			new DogTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DogTypeHandler
				, "dog" // XML element name
				, doLink("dog") // linking to parent
					? new AnimalSetter(this) // ON
					: null // OFF
				, doProcess("dog")) // processing active or not
				);
  
	  	// type mammal is a derived type from animal
		registerHandler(
			new MammalTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of MammalTypeHandler
				, "mammal" // XML element name
				, doLink("mammal") // linking to parent
					? new AnimalSetter(this) // ON
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
	public ZooType getData() {
		return (ZooType)super.getData();
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
