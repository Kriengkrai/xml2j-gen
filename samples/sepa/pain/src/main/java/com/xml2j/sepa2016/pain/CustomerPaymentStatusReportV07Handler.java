package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:46 CET 2017 

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
 * CustomerPaymentStatusReportV07 handler class.
 *
 * @see CustomerPaymentStatusReportV07
 * 
 */
public class CustomerPaymentStatusReportV07Handler extends XMLFragmentHandler<CustomerPaymentStatusReportV07> {
	/**
	 * Proxy for CustomerPaymentStatusReportV07Handler.
	 */
	static class Proxy extends HandlerProxy<CustomerPaymentStatusReportV07> {
		/**
		 * Allocator for CustomerPaymentStatusReportV07Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CustomerPaymentStatusReportV07> {			
			public XMLFragmentHandler<CustomerPaymentStatusReportV07> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CustomerPaymentStatusReportV07Handler(
					task
					, reader
					, handler
					, elementName
					, CustomerPaymentStatusReportV07.getAllocator()
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
		private CustomerPaymentStatusReportV07Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrpHdrSetter(CustomerPaymentStatusReportV07Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrpHdr((GroupHeader52) data);	
		}
	}	
	/** Data setter class for OrgnlGrpInfAndSts element. */
	private class OrgnlGrpInfAndStsSetter implements DataSetter {
		/** data target. */
		private CustomerPaymentStatusReportV07Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlGrpInfAndStsSetter(CustomerPaymentStatusReportV07Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlGrpInfAndSts((OriginalGroupHeader1) data);	
		}
	}	
	/** Data setter class for OrgnlPmtInfAndSts element. */
	private class OrgnlPmtInfAndStsSetter implements DataSetter {
		/** data target. */
		private CustomerPaymentStatusReportV07Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlPmtInfAndStsSetter(CustomerPaymentStatusReportV07Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlPmtInfAndSts((OriginalPaymentInstruction18) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private CustomerPaymentStatusReportV07Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(CustomerPaymentStatusReportV07Handler pHandler) {
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
	public CustomerPaymentStatusReportV07Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CustomerPaymentStatusReportV07.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new GroupHeader52Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GroupHeader52Handler
				, "GrpHdr" // XML element name
				, doLink("GrpHdr") // linking to parent
					? new GrpHdrSetter(this) // ON
					: null // OFF
				, doProcess("GrpHdr")) // processing active or not
				);
  
		registerHandler(
			new OriginalGroupHeader1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalGroupHeader1Handler
				, "OrgnlGrpInfAndSts" // XML element name
				, doLink("OrgnlGrpInfAndSts") // linking to parent
					? new OrgnlGrpInfAndStsSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlGrpInfAndSts")) // processing active or not
				);
  
		registerHandler(
			new OriginalPaymentInstruction18Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalPaymentInstruction18Handler
				, "OrgnlPmtInfAndSts" // XML element name
				, doLink("OrgnlPmtInfAndSts") // linking to parent
					? new OrgnlPmtInfAndStsSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlPmtInfAndSts")) // processing active or not
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
	public CustomerPaymentStatusReportV07 getData() {
		return (CustomerPaymentStatusReportV07)super.getData();
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
