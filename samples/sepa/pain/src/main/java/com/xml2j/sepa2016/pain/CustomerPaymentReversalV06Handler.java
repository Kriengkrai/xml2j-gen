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
 * CustomerPaymentReversalV06 handler class.
 *
 * @see CustomerPaymentReversalV06
 * 
 */
public class CustomerPaymentReversalV06Handler extends XMLFragmentHandler<CustomerPaymentReversalV06> {
	/**
	 * Proxy for CustomerPaymentReversalV06Handler.
	 */
	static class Proxy extends HandlerProxy<CustomerPaymentReversalV06> {
		/**
		 * Allocator for CustomerPaymentReversalV06Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CustomerPaymentReversalV06> {			
			public XMLFragmentHandler<CustomerPaymentReversalV06> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CustomerPaymentReversalV06Handler(
					task
					, reader
					, handler
					, elementName
					, CustomerPaymentReversalV06.getAllocator()
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
		private CustomerPaymentReversalV06Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrpHdrSetter(CustomerPaymentReversalV06Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrpHdr((GroupHeader56) data);	
		}
	}	
	/** Data setter class for OrgnlGrpInf element. */
	private class OrgnlGrpInfSetter implements DataSetter {
		/** data target. */
		private CustomerPaymentReversalV06Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlGrpInfSetter(CustomerPaymentReversalV06Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlGrpInf((OriginalGroupHeader3) data);	
		}
	}	
	/** Data setter class for OrgnlPmtInfAndRvsl element. */
	private class OrgnlPmtInfAndRvslSetter implements DataSetter {
		/** data target. */
		private CustomerPaymentReversalV06Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlPmtInfAndRvslSetter(CustomerPaymentReversalV06Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlPmtInfAndRvsl((OriginalPaymentInstruction16) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private CustomerPaymentReversalV06Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(CustomerPaymentReversalV06Handler pHandler) {
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
	public CustomerPaymentReversalV06Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CustomerPaymentReversalV06.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new GroupHeader56Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GroupHeader56Handler
				, "GrpHdr" // XML element name
				, doLink("GrpHdr") // linking to parent
					? new GrpHdrSetter(this) // ON
					: null // OFF
				, doProcess("GrpHdr")) // processing active or not
				);
  
		registerHandler(
			new OriginalGroupHeader3Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalGroupHeader3Handler
				, "OrgnlGrpInf" // XML element name
				, doLink("OrgnlGrpInf") // linking to parent
					? new OrgnlGrpInfSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlGrpInf")) // processing active or not
				);
  
		registerHandler(
			new OriginalPaymentInstruction16Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalPaymentInstruction16Handler
				, "OrgnlPmtInfAndRvsl" // XML element name
				, doLink("OrgnlPmtInfAndRvsl") // linking to parent
					? new OrgnlPmtInfAndRvslSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlPmtInfAndRvsl")) // processing active or not
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
	public CustomerPaymentReversalV06 getData() {
		return (CustomerPaymentReversalV06)super.getData();
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
