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
 * OriginalPaymentInstruction18 handler class.
 *
 * @see OriginalPaymentInstruction18
 * 
 */
public class OriginalPaymentInstruction18Handler extends XMLFragmentHandler<OriginalPaymentInstruction18> {
	/**
	 * Proxy for OriginalPaymentInstruction18Handler.
	 */
	static class Proxy extends HandlerProxy<OriginalPaymentInstruction18> {
		/**
		 * Allocator for OriginalPaymentInstruction18Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<OriginalPaymentInstruction18> {			
			public XMLFragmentHandler<OriginalPaymentInstruction18> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new OriginalPaymentInstruction18Handler(
					task
					, reader
					, handler
					, elementName
					, OriginalPaymentInstruction18.getAllocator()
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
	
	/** Data setter class for NbOfTxsPerSts element. */
	private class NbOfTxsPerStsSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public NbOfTxsPerStsSetter(OriginalPaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setNbOfTxsPerSts((NumberOfTransactionsPerStatus3) data);	
		}
	}	
	/** Data setter class for StsRsnInf element. */
	private class StsRsnInfSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public StsRsnInfSetter(OriginalPaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setStsRsnInf((StatusReasonInformation9) data);	
		}
	}	
	/** Data setter class for TxInfAndSts element. */
	private class TxInfAndStsSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TxInfAndStsSetter(OriginalPaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTxInfAndSts((PaymentTransaction68) data);	
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
	public OriginalPaymentInstruction18Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, OriginalPaymentInstruction18.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new NumberOfTransactionsPerStatus3Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of NumberOfTransactionsPerStatus3Handler
				, "NbOfTxsPerSts" // XML element name
				, doLink("NbOfTxsPerSts") // linking to parent
					? new NbOfTxsPerStsSetter(this) // ON
					: null // OFF
				, doProcess("NbOfTxsPerSts")) // processing active or not
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
  
		registerHandler(
			new PaymentTransaction68Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentTransaction68Handler
				, "TxInfAndSts" // XML element name
				, doLink("TxInfAndSts") // linking to parent
					? new TxInfAndStsSetter(this) // ON
					: null // OFF
				, doProcess("TxInfAndSts")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public OriginalPaymentInstruction18 getData() {
		return (OriginalPaymentInstruction18)super.getData();
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
		if (localName.equals("OrgnlCtrlSum")) {
			getData().setOrgnlCtrlSum(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlNbOfTxs")) {
			getData().setOrgnlNbOfTxs(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlPmtInfId")) {
			getData().setOrgnlPmtInfId(getValue());
			getContents().reset();
		} else if (localName.equals("PmtInfSts")) {
			getData().setPmtInfSts(getValue());
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
