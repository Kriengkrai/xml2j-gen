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
 * CreditorPaymentActivationRequestStatusReportV05Document handler class.
 *
 * @see CreditorPaymentActivationRequestStatusReportV05Document
 * 
 */
public class CreditorPaymentActivationRequestStatusReportV05DocumentHandler extends XMLFragmentHandler<CreditorPaymentActivationRequestStatusReportV05Document> {
	/**
	 * Proxy for CreditorPaymentActivationRequestStatusReportV05DocumentHandler.
	 */
	static class Proxy extends HandlerProxy<CreditorPaymentActivationRequestStatusReportV05Document> {
		/**
		 * Allocator for CreditorPaymentActivationRequestStatusReportV05DocumentHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CreditorPaymentActivationRequestStatusReportV05Document> {			
			public XMLFragmentHandler<CreditorPaymentActivationRequestStatusReportV05Document> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CreditorPaymentActivationRequestStatusReportV05DocumentHandler(
					task
					, reader
					, handler
					, elementName
					, CreditorPaymentActivationRequestStatusReportV05Document.getAllocator()
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
	
	/** Data setter class for CdtrPmtActvtnReqStsRpt element. */
	private class CdtrPmtActvtnReqStsRptSetter implements DataSetter {
		/** data target. */
		private CreditorPaymentActivationRequestStatusReportV05DocumentHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrPmtActvtnReqStsRptSetter(CreditorPaymentActivationRequestStatusReportV05DocumentHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrPmtActvtnReqStsRpt((CreditorPaymentActivationRequestStatusReportV05) data);	
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
	public CreditorPaymentActivationRequestStatusReportV05DocumentHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CreditorPaymentActivationRequestStatusReportV05Document.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CreditorPaymentActivationRequestStatusReportV05Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CreditorPaymentActivationRequestStatusReportV05Handler
				, "CdtrPmtActvtnReqStsRpt" // XML element name
				, doLink("CdtrPmtActvtnReqStsRpt") // linking to parent
					? new CdtrPmtActvtnReqStsRptSetter(this) // ON
					: null // OFF
				, doProcess("CdtrPmtActvtnReqStsRpt")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public CreditorPaymentActivationRequestStatusReportV05Document getData() {
		return (CreditorPaymentActivationRequestStatusReportV05Document)super.getData();
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
