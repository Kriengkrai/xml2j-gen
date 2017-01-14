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
 * CustomerDirectDebitInitiationV06 handler class.
 *
 * @see CustomerDirectDebitInitiationV06
 * 
 */
public class CustomerDirectDebitInitiationV06Handler extends XMLFragmentHandler<CustomerDirectDebitInitiationV06> {
	/**
	 * Proxy for CustomerDirectDebitInitiationV06Handler.
	 */
	static class Proxy extends HandlerProxy<CustomerDirectDebitInitiationV06> {
		/**
		 * Allocator for CustomerDirectDebitInitiationV06Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CustomerDirectDebitInitiationV06> {			
			public XMLFragmentHandler<CustomerDirectDebitInitiationV06> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CustomerDirectDebitInitiationV06Handler(
					task
					, reader
					, handler
					, elementName
					, CustomerDirectDebitInitiationV06.getAllocator()
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
	
	/** Data setter class for GrpHdr element. */
	private class GrpHdrSetter implements DataSetter {
		/** data target. */
		private CustomerDirectDebitInitiationV06Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrpHdrSetter(CustomerDirectDebitInitiationV06Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrpHdr((GroupHeader55) data);	
		}
	}	
	/** Data setter class for PmtInf element. */
	private class PmtInfSetter implements DataSetter {
		/** data target. */
		private CustomerDirectDebitInitiationV06Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtInfSetter(CustomerDirectDebitInitiationV06Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtInf((PaymentInstruction18) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private CustomerDirectDebitInitiationV06Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(CustomerDirectDebitInitiationV06Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setSplmtryData((SupplementaryData1) data);	
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
	public CustomerDirectDebitInitiationV06Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CustomerDirectDebitInitiationV06.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new GroupHeader55Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GroupHeader55Handler
				, "GrpHdr" // XML element name
				, doLink("GrpHdr") // linking to parent
					? new GrpHdrSetter(this) // ON
					: null // OFF
				, doProcess("GrpHdr")) // processing active or not
				);
  
		registerHandler(
			new PaymentInstruction18Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentInstruction18Handler
				, "PmtInf" // XML element name
				, doLink("PmtInf") // linking to parent
					? new PmtInfSetter(this) // ON
					: null // OFF
				, doProcess("PmtInf")) // processing active or not
				);
  
		registerHandler(
			new SupplementaryData1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of SupplementaryData1Handler
				, "SplmtryData" // XML element name
				, doLink("SplmtryData") // linking to parent
					? new SplmtryDataSetter(this) // ON
					: null // OFF
				, doProcess("SplmtryData")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public CustomerDirectDebitInitiationV06 getData() {
		return (CustomerDirectDebitInitiationV06)super.getData();
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
