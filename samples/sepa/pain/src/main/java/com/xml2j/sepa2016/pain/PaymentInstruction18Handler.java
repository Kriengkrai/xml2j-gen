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
 * PaymentInstruction18 handler class.
 *
 * @see PaymentInstruction18
 * 
 */
public class PaymentInstruction18Handler extends XMLFragmentHandler<PaymentInstruction18> {
	/**
	 * Proxy for PaymentInstruction18Handler.
	 */
	static class Proxy extends HandlerProxy<PaymentInstruction18> {
		/**
		 * Allocator for PaymentInstruction18Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<PaymentInstruction18> {			
			public XMLFragmentHandler<PaymentInstruction18> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new PaymentInstruction18Handler(
					task
					, reader
					, handler
					, elementName
					, PaymentInstruction18.getAllocator()
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
	
	/** Data setter class for Cdtr element. */
	private class CdtrSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtr((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for CdtrAcct element. */
	private class CdtrAcctSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAcctSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for CdtrAgt element. */
	private class CdtrAgtSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAgtSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for CdtrAgtAcct element. */
	private class CdtrAgtAcctSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAgtAcctSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for CdtrSchmeId element. */
	private class CdtrSchmeIdSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrSchmeIdSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrSchmeId((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for ChrgsAcct element. */
	private class ChrgsAcctSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChrgsAcctSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setChrgsAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for ChrgsAcctAgt element. */
	private class ChrgsAcctAgtSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChrgsAcctAgtSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setChrgsAcctAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for DrctDbtTxInf element. */
	private class DrctDbtTxInfSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DrctDbtTxInfSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDrctDbtTxInf((DirectDebitTransactionInformation19) data);	
		}
	}	
	/** Data setter class for PmtTpInf element. */
	private class PmtTpInfSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtTpInfSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtTpInf((PaymentTypeInformation24) data);	
		}
	}	
	/** Data setter class for UltmtCdtr element. */
	private class UltmtCdtrSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction18Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtCdtrSetter(PaymentInstruction18Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setUltmtCdtr((PartyIdentification43) data);	
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
	public PaymentInstruction18Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, PaymentInstruction18.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "Cdtr" // XML element name
				, doLink("Cdtr") // linking to parent
					? new CdtrSetter(this) // ON
					: null // OFF
				, doProcess("Cdtr")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "CdtrAcct" // XML element name
				, doLink("CdtrAcct") // linking to parent
					? new CdtrAcctSetter(this) // ON
					: null // OFF
				, doProcess("CdtrAcct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "CdtrAgt" // XML element name
				, doLink("CdtrAgt") // linking to parent
					? new CdtrAgtSetter(this) // ON
					: null // OFF
				, doProcess("CdtrAgt")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "CdtrAgtAcct" // XML element name
				, doLink("CdtrAgtAcct") // linking to parent
					? new CdtrAgtAcctSetter(this) // ON
					: null // OFF
				, doProcess("CdtrAgtAcct")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "CdtrSchmeId" // XML element name
				, doLink("CdtrSchmeId") // linking to parent
					? new CdtrSchmeIdSetter(this) // ON
					: null // OFF
				, doProcess("CdtrSchmeId")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "ChrgsAcct" // XML element name
				, doLink("ChrgsAcct") // linking to parent
					? new ChrgsAcctSetter(this) // ON
					: null // OFF
				, doProcess("ChrgsAcct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "ChrgsAcctAgt" // XML element name
				, doLink("ChrgsAcctAgt") // linking to parent
					? new ChrgsAcctAgtSetter(this) // ON
					: null // OFF
				, doProcess("ChrgsAcctAgt")) // processing active or not
				);
  
		registerHandler(
			new DirectDebitTransactionInformation19Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DirectDebitTransactionInformation19Handler
				, "DrctDbtTxInf" // XML element name
				, doLink("DrctDbtTxInf") // linking to parent
					? new DrctDbtTxInfSetter(this) // ON
					: null // OFF
				, doProcess("DrctDbtTxInf")) // processing active or not
				);
  
		registerHandler(
			new PaymentTypeInformation24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentTypeInformation24Handler
				, "PmtTpInf" // XML element name
				, doLink("PmtTpInf") // linking to parent
					? new PmtTpInfSetter(this) // ON
					: null // OFF
				, doProcess("PmtTpInf")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "UltmtCdtr" // XML element name
				, doLink("UltmtCdtr") // linking to parent
					? new UltmtCdtrSetter(this) // ON
					: null // OFF
				, doProcess("UltmtCdtr")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public PaymentInstruction18 getData() {
		return (PaymentInstruction18)super.getData();
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
		if (localName.equals("BtchBookg")) {
			getData().setBtchBookg(getValue());
			getContents().reset();
		} else if (localName.equals("ChrgBr")) {
			getData().setChrgBr(getValue());
			getContents().reset();
		} else if (localName.equals("CtrlSum")) {
			getData().setCtrlSum(getValue());
			getContents().reset();
		} else if (localName.equals("NbOfTxs")) {
			getData().setNbOfTxs(getValue());
			getContents().reset();
		} else if (localName.equals("PmtInfId")) {
			getData().setPmtInfId(getValue());
			getContents().reset();
		} else if (localName.equals("PmtMtd")) {
			getData().setPmtMtd(getValue());
			getContents().reset();
		} else if (localName.equals("ReqdColltnDt")) {
			getData().setReqdColltnDt(getValue());
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
