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
 * PaymentTransaction69 handler class.
 *
 * @see PaymentTransaction69
 * 
 */
public class PaymentTransaction69Handler extends XMLFragmentHandler<PaymentTransaction69> {
	/**
	 * Proxy for PaymentTransaction69Handler.
	 */
	static class Proxy extends HandlerProxy<PaymentTransaction69> {
		/**
		 * Allocator for PaymentTransaction69Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<PaymentTransaction69> {			
			public XMLFragmentHandler<PaymentTransaction69> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new PaymentTransaction69Handler(
					task
					, reader
					, handler
					, elementName
					, PaymentTransaction69.getAllocator()
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
	
	/** Data setter class for ChrgsInf element. */
	private class ChrgsInfSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction69Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChrgsInfSetter(PaymentTransaction69Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setChrgsInf((Charges2) data);	
		}
	}	
	/** Data setter class for OrgnlTxRef element. */
	private class OrgnlTxRefSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction69Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlTxRefSetter(PaymentTransaction69Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlTxRef((OriginalTransactionReference23) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction69Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(PaymentTransaction69Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setSplmtryData((SupplementaryData1) data);	
		}
	}	
	/** Data setter class for StsRsnInf element. */
	private class StsRsnInfSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction69Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public StsRsnInfSetter(PaymentTransaction69Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setStsRsnInf((StatusReasonInformation9) data);	
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
	public PaymentTransaction69Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, PaymentTransaction69.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new Charges2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Charges2Handler
				, "ChrgsInf" // XML element name
				, doLink("ChrgsInf") // linking to parent
					? new ChrgsInfSetter(this) // ON
					: null // OFF
				, doProcess("ChrgsInf")) // processing active or not
				);
  
		registerHandler(
			new OriginalTransactionReference23Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalTransactionReference23Handler
				, "OrgnlTxRef" // XML element name
				, doLink("OrgnlTxRef") // linking to parent
					? new OrgnlTxRefSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlTxRef")) // processing active or not
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
  
		registerHandler(
			new StatusReasonInformation9Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of StatusReasonInformation9Handler
				, "StsRsnInf" // XML element name
				, doLink("StsRsnInf") // linking to parent
					? new StsRsnInfSetter(this) // ON
					: null // OFF
				, doProcess("StsRsnInf")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public PaymentTransaction69 getData() {
		return (PaymentTransaction69)super.getData();
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
		
		// collect data from children..
		if (localName.equals("AccptncDtTm")) {
			getData().setAccptncDtTm(getValue());
			getContents().reset();
		} else if (localName.equals("AcctSvcrRef")) {
			getData().setAcctSvcrRef(getValue());
			getContents().reset();
		} else if (localName.equals("ClrSysRef")) {
			getData().setClrSysRef(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlEndToEndId")) {
			getData().setOrgnlEndToEndId(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlInstrId")) {
			getData().setOrgnlInstrId(getValue());
			getContents().reset();
		} else if (localName.equals("StsId")) {
			getData().setStsId(getValue());
			getContents().reset();
		} else if (localName.equals("TxSts")) {
			getData().setTxSts(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
				
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
