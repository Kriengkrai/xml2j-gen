package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:48 CET 2017 

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
 * CreditorPaymentActivationRequestStatusReportV05 handler class.
 *
 * @see CreditorPaymentActivationRequestStatusReportV05
 * 
 */
public class CreditorPaymentActivationRequestStatusReportV05Handler extends XMLFragmentHandler<CreditorPaymentActivationRequestStatusReportV05> {
	/**
	 * Proxy for CreditorPaymentActivationRequestStatusReportV05Handler.
	 */
	static class Proxy extends HandlerProxy<CreditorPaymentActivationRequestStatusReportV05> {
		/**
		 * Allocator for CreditorPaymentActivationRequestStatusReportV05Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CreditorPaymentActivationRequestStatusReportV05> {			
			public XMLFragmentHandler<CreditorPaymentActivationRequestStatusReportV05> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CreditorPaymentActivationRequestStatusReportV05Handler(
					task
					, reader
					, handler
					, elementName
					, CreditorPaymentActivationRequestStatusReportV05.getAllocator()
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
		private CreditorPaymentActivationRequestStatusReportV05Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrpHdrSetter(CreditorPaymentActivationRequestStatusReportV05Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrpHdr((GroupHeader46) data);	
		}
	}	
	/** Data setter class for OrgnlGrpInfAndSts element. */
	private class OrgnlGrpInfAndStsSetter implements DataSetter {
		/** data target. */
		private CreditorPaymentActivationRequestStatusReportV05Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlGrpInfAndStsSetter(CreditorPaymentActivationRequestStatusReportV05Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlGrpInfAndSts((OriginalGroupInformation25) data);	
		}
	}	
	/** Data setter class for OrgnlPmtInfAndSts element. */
	private class OrgnlPmtInfAndStsSetter implements DataSetter {
		/** data target. */
		private CreditorPaymentActivationRequestStatusReportV05Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlPmtInfAndStsSetter(CreditorPaymentActivationRequestStatusReportV05Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlPmtInfAndSts((OriginalPaymentInstruction19) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private CreditorPaymentActivationRequestStatusReportV05Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(CreditorPaymentActivationRequestStatusReportV05Handler pHandler) {
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
	public CreditorPaymentActivationRequestStatusReportV05Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CreditorPaymentActivationRequestStatusReportV05.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new GroupHeader46Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GroupHeader46Handler
				, "GrpHdr" // XML element name
				, doLink("GrpHdr") // linking to parent
					? new GrpHdrSetter(this) // ON
					: null // OFF
				, doProcess("GrpHdr")) // processing active or not
				);
  
		registerHandler(
			new OriginalGroupInformation25Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalGroupInformation25Handler
				, "OrgnlGrpInfAndSts" // XML element name
				, doLink("OrgnlGrpInfAndSts") // linking to parent
					? new OrgnlGrpInfAndStsSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlGrpInfAndSts")) // processing active or not
				);
  
		registerHandler(
			new OriginalPaymentInstruction19Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalPaymentInstruction19Handler
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
	public CreditorPaymentActivationRequestStatusReportV05 getData() {
		return (CreditorPaymentActivationRequestStatusReportV05)super.getData();
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
