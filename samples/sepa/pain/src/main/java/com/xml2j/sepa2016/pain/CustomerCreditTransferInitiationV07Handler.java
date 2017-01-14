package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:45 CET 2017 

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
 * CustomerCreditTransferInitiationV07 handler class.
 *
 * @see CustomerCreditTransferInitiationV07
 * 
 */
public class CustomerCreditTransferInitiationV07Handler extends XMLFragmentHandler<CustomerCreditTransferInitiationV07> {
	/**
	 * Proxy for CustomerCreditTransferInitiationV07Handler.
	 */
	static class Proxy extends HandlerProxy<CustomerCreditTransferInitiationV07> {
		/**
		 * Allocator for CustomerCreditTransferInitiationV07Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CustomerCreditTransferInitiationV07> {			
			public XMLFragmentHandler<CustomerCreditTransferInitiationV07> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CustomerCreditTransferInitiationV07Handler(
					task
					, reader
					, handler
					, elementName
					, CustomerCreditTransferInitiationV07.getAllocator()
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
		private CustomerCreditTransferInitiationV07Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrpHdrSetter(CustomerCreditTransferInitiationV07Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrpHdr((GroupHeader48) data);	
		}
	}	
	/** Data setter class for PmtInf element. */
	private class PmtInfSetter implements DataSetter {
		/** data target. */
		private CustomerCreditTransferInitiationV07Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtInfSetter(CustomerCreditTransferInitiationV07Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtInf((PaymentInstruction20) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private CustomerCreditTransferInitiationV07Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(CustomerCreditTransferInitiationV07Handler pHandler) {
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
	public CustomerCreditTransferInitiationV07Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CustomerCreditTransferInitiationV07.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new GroupHeader48Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GroupHeader48Handler
				, "GrpHdr" // XML element name
				, doLink("GrpHdr") // linking to parent
					? new GrpHdrSetter(this) // ON
					: null // OFF
				, doProcess("GrpHdr")) // processing active or not
				);
  
		registerHandler(
			new PaymentInstruction20Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentInstruction20Handler
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
	public CustomerCreditTransferInitiationV07 getData() {
		return (CustomerCreditTransferInitiationV07)super.getData();
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
