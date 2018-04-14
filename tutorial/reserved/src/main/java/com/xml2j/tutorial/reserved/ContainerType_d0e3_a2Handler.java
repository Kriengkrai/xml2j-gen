package com.xml2j.tutorial.reserved;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RESERVED 
  Generation date: Sat Apr 14 12:01:30 CEST 2018 
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
 * ContainerType_d0e3_a2 handler class.
 *
 * @see ContainerType_d0e3_a2
 */
public class ContainerType_d0e3_a2Handler extends XMLFragmentHandler<ContainerType_d0e3_a2> {
	/**
	 * Proxy for ContainerType_d0e3_a2Handler.
	 */
	static class Proxy extends HandlerProxy<ContainerType_d0e3_a2> {
		/**
		 * Allocator for ContainerType_d0e3_a2Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ContainerType_d0e3_a2> {			
			public XMLFragmentHandler<ContainerType_d0e3_a2> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ContainerType_d0e3_a2Handler(
					task
					, reader
					, handler
					, elementName
					, ContainerType_d0e3_a2.getAllocator()
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
		private ContainerType_d0e3_a2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ASetter(ContainerType_d0e3_a2Handler pHandler) {
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
	public ContainerType_d0e3_a2Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ContainerType_d0e3_a2.Allocator allocator
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
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public ContainerType_d0e3_a2 getData() {
		return (ContainerType_d0e3_a2)super.getData();
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
