package com.xml2j.tutorial.subst;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: SUBST 
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
 * ContainerType_d0e5_a8 handler class.
 *
 * @see ContainerType_d0e5_a8
 */
public class ContainerType_d0e5_a8Handler extends XMLFragmentHandler<ContainerType_d0e5_a8> {
	/**
	 * Proxy for ContainerType_d0e5_a8Handler.
	 */
	static class Proxy extends HandlerProxy<ContainerType_d0e5_a8> {
		/**
		 * Allocator for ContainerType_d0e5_a8Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ContainerType_d0e5_a8> {			
			public XMLFragmentHandler<ContainerType_d0e5_a8> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ContainerType_d0e5_a8Handler(
					task
					, reader
					, handler
					, elementName
					, ContainerType_d0e5_a8.getAllocator()
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
	
	/** Data setter class for A element. */
	private class ASetter implements DataSetter {
		/** data target. */
		private ContainerType_d0e5_a8Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ASetter(ContainerType_d0e5_a8Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setA((AType) data);	
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
	public ContainerType_d0e5_a8Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ContainerType_d0e5_a8.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ATypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ATypeHandler
				, "A" // XML element name
				, doLink("A") // linking to parent
					? new ASetter(this) // ON
					: null // OFF
				, doProcess("A")) // processing active or not
				);
  
	  	// type B is a derived type from A
		registerHandler(
			new BTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BTypeHandler
				, "B" // XML element name
				, doLink("B") // linking to parent
					? new ASetter(this) // ON
					: null // OFF
				, doProcess("B")) // processing active or not
				);
  
	  	// type C is a derived type from A
		registerHandler(
			new CTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CTypeHandler
				, "C" // XML element name
				, doLink("C") // linking to parent
					? new ASetter(this) // ON
					: null // OFF
				, doProcess("C")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public ContainerType_d0e5_a8 getData() {
		return (ContainerType_d0e5_a8)super.getData();
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
