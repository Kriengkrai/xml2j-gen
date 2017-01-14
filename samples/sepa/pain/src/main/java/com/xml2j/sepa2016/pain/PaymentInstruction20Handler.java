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
 * PaymentInstruction20 handler class.
 *
 * @see PaymentInstruction20
 * 
 */
public class PaymentInstruction20Handler extends XMLFragmentHandler<PaymentInstruction20> {
	/**
	 * Proxy for PaymentInstruction20Handler.
	 */
	static class Proxy extends HandlerProxy<PaymentInstruction20> {
		/**
		 * Allocator for PaymentInstruction20Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<PaymentInstruction20> {			
			public XMLFragmentHandler<PaymentInstruction20> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new PaymentInstruction20Handler(
					task
					, reader
					, handler
					, elementName
					, PaymentInstruction20.getAllocator()
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
	
	/** Data setter class for CdtTrfTxInf element. */
	private class CdtTrfTxInfSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtTrfTxInfSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtTrfTxInf((CreditTransferTransaction26) data);	
		}
	}	
	/** Data setter class for ChrgsAcct element. */
	private class ChrgsAcctSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChrgsAcctSetter(PaymentInstruction20Handler pHandler) {
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
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChrgsAcctAgtSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setChrgsAcctAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for Dbtr element. */
	private class DbtrSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtr((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for DbtrAcct element. */
	private class DbtrAcctSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAcctSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtrAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for DbtrAgt element. */
	private class DbtrAgtSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAgtSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for DbtrAgtAcct element. */
	private class DbtrAgtAcctSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAgtAcctSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtrAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for PmtTpInf element. */
	private class PmtTpInfSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtTpInfSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtTpInf((PaymentTypeInformation19) data);	
		}
	}	
	/** Data setter class for UltmtDbtr element. */
	private class UltmtDbtrSetter implements DataSetter {
		/** data target. */
		private PaymentInstruction20Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtDbtrSetter(PaymentInstruction20Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setUltmtDbtr((PartyIdentification43) data);	
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
	public PaymentInstruction20Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, PaymentInstruction20.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CreditTransferTransaction26Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CreditTransferTransaction26Handler
				, "CdtTrfTxInf" // XML element name
				, doLink("CdtTrfTxInf") // linking to parent
					? new CdtTrfTxInfSetter(this) // ON
					: null // OFF
				, doProcess("CdtTrfTxInf")) // processing active or not
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
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "Dbtr" // XML element name
				, doLink("Dbtr") // linking to parent
					? new DbtrSetter(this) // ON
					: null // OFF
				, doProcess("Dbtr")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "DbtrAcct" // XML element name
				, doLink("DbtrAcct") // linking to parent
					? new DbtrAcctSetter(this) // ON
					: null // OFF
				, doProcess("DbtrAcct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "DbtrAgt" // XML element name
				, doLink("DbtrAgt") // linking to parent
					? new DbtrAgtSetter(this) // ON
					: null // OFF
				, doProcess("DbtrAgt")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "DbtrAgtAcct" // XML element name
				, doLink("DbtrAgtAcct") // linking to parent
					? new DbtrAgtAcctSetter(this) // ON
					: null // OFF
				, doProcess("DbtrAgtAcct")) // processing active or not
				);
  
		registerHandler(
			new PaymentTypeInformation19Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentTypeInformation19Handler
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
				, "UltmtDbtr" // XML element name
				, doLink("UltmtDbtr") // linking to parent
					? new UltmtDbtrSetter(this) // ON
					: null // OFF
				, doProcess("UltmtDbtr")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public PaymentInstruction20 getData() {
		return (PaymentInstruction20)super.getData();
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
		} else if (localName.equals("InstrForDbtrAgt")) {
			getData().setInstrForDbtrAgt(getValue());
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
		} else if (localName.equals("PoolgAdjstmntDt")) {
			getData().setPoolgAdjstmntDt(getValue());
			getContents().reset();
		} else if (localName.equals("ReqdExctnDt")) {
			getData().setReqdExctnDt(getValue());
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
