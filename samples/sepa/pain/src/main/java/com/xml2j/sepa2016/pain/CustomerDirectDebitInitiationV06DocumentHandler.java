package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:47 CET 2017 

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
 * CustomerDirectDebitInitiationV06Document handler class.
 *
 * @see CustomerDirectDebitInitiationV06Document
 * 
 */
public class CustomerDirectDebitInitiationV06DocumentHandler extends XMLFragmentHandler<CustomerDirectDebitInitiationV06Document> {
	/**
	 * Proxy for CustomerDirectDebitInitiationV06DocumentHandler.
	 */
	static class Proxy extends HandlerProxy<CustomerDirectDebitInitiationV06Document> {
		/**
		 * Allocator for CustomerDirectDebitInitiationV06DocumentHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CustomerDirectDebitInitiationV06Document> {			
			public XMLFragmentHandler<CustomerDirectDebitInitiationV06Document> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CustomerDirectDebitInitiationV06DocumentHandler(
					task
					, reader
					, handler
					, elementName
					, CustomerDirectDebitInitiationV06Document.getAllocator()
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
	
	/** Data setter class for CstmrDrctDbtInitn element. */
	private class CstmrDrctDbtInitnSetter implements DataSetter {
		/** data target. */
		private CustomerDirectDebitInitiationV06DocumentHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CstmrDrctDbtInitnSetter(CustomerDirectDebitInitiationV06DocumentHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCstmrDrctDbtInitn((CustomerDirectDebitInitiationV06) data);	
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
	public CustomerDirectDebitInitiationV06DocumentHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CustomerDirectDebitInitiationV06Document.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CustomerDirectDebitInitiationV06Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CustomerDirectDebitInitiationV06Handler
				, "CstmrDrctDbtInitn" // XML element name
				, doLink("CstmrDrctDbtInitn") // linking to parent
					? new CstmrDrctDbtInitnSetter(this) // ON
					: null // OFF
				, doProcess("CstmrDrctDbtInitn")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public CustomerDirectDebitInitiationV06Document getData() {
		return (CustomerDirectDebitInitiationV06Document)super.getData();
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
