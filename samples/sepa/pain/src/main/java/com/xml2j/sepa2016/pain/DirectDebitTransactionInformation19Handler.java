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
 * DirectDebitTransactionInformation19 handler class.
 *
 * @see DirectDebitTransactionInformation19
 * 
 */
public class DirectDebitTransactionInformation19Handler extends XMLFragmentHandler<DirectDebitTransactionInformation19> {
	/**
	 * Proxy for DirectDebitTransactionInformation19Handler.
	 */
	static class Proxy extends HandlerProxy<DirectDebitTransactionInformation19> {
		/**
		 * Allocator for DirectDebitTransactionInformation19Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<DirectDebitTransactionInformation19> {			
			public XMLFragmentHandler<DirectDebitTransactionInformation19> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new DirectDebitTransactionInformation19Handler(
					task
					, reader
					, handler
					, elementName
					, DirectDebitTransactionInformation19.getAllocator()
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
	
	/** Data setter class for Dbtr element. */
	private class DbtrSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrSetter(DirectDebitTransactionInformation19Handler pHandler) {
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
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAcctSetter(DirectDebitTransactionInformation19Handler pHandler) {
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
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAgtSetter(DirectDebitTransactionInformation19Handler pHandler) {
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
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAgtAcctSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtrAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for DrctDbtTx element. */
	private class DrctDbtTxSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DrctDbtTxSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDrctDbtTx((DirectDebitTransaction8) data);	
		}
	}	
	/** Data setter class for InstdAmt element. */
	private class InstdAmtSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InstdAmtSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInstdAmt((ActiveOrHistoricCurrencyAndAmount) data);	
		}
	}	
	/** Data setter class for PmtId element. */
	private class PmtIdSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtIdSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtId((PaymentIdentification1) data);	
		}
	}	
	/** Data setter class for PmtTpInf element. */
	private class PmtTpInfSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtTpInfSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtTpInf((PaymentTypeInformation24) data);	
		}
	}	
	/** Data setter class for Purp element. */
	private class PurpSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PurpSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPurp((Purpose2Choice) data);	
		}
	}	
	/** Data setter class for RgltryRptg element. */
	private class RgltryRptgSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RgltryRptgSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRgltryRptg((RegulatoryReporting3) data);	
		}
	}	
	/** Data setter class for RltdRmtInf element. */
	private class RltdRmtInfSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RltdRmtInfSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRltdRmtInf((RemittanceLocation4) data);	
		}
	}	
	/** Data setter class for RmtInf element. */
	private class RmtInfSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RmtInfSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRmtInf((RemittanceInformation11) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setSplmtryData((SupplementaryData1) data);	
		}
	}	
	/** Data setter class for Tax element. */
	private class TaxSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TaxSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTax((TaxInformation3) data);	
		}
	}	
	/** Data setter class for UltmtCdtr element. */
	private class UltmtCdtrSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtCdtrSetter(DirectDebitTransactionInformation19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setUltmtCdtr((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for UltmtDbtr element. */
	private class UltmtDbtrSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransactionInformation19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtDbtrSetter(DirectDebitTransactionInformation19Handler pHandler) {
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
	public DirectDebitTransactionInformation19Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, DirectDebitTransactionInformation19.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
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
			new DirectDebitTransaction8Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DirectDebitTransaction8Handler
				, "DrctDbtTx" // XML element name
				, doLink("DrctDbtTx") // linking to parent
					? new DrctDbtTxSetter(this) // ON
					: null // OFF
				, doProcess("DrctDbtTx")) // processing active or not
				);
  
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "InstdAmt" // XML element name
				, doLink("InstdAmt") // linking to parent
					? new InstdAmtSetter(this) // ON
					: null // OFF
				, doProcess("InstdAmt")) // processing active or not
				);
  
		registerHandler(
			new PaymentIdentification1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentIdentification1Handler
				, "PmtId" // XML element name
				, doLink("PmtId") // linking to parent
					? new PmtIdSetter(this) // ON
					: null // OFF
				, doProcess("PmtId")) // processing active or not
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
			new Purpose2ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Purpose2ChoiceHandler
				, "Purp" // XML element name
				, doLink("Purp") // linking to parent
					? new PurpSetter(this) // ON
					: null // OFF
				, doProcess("Purp")) // processing active or not
				);
  
		registerHandler(
			new RegulatoryReporting3Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of RegulatoryReporting3Handler
				, "RgltryRptg" // XML element name
				, doLink("RgltryRptg") // linking to parent
					? new RgltryRptgSetter(this) // ON
					: null // OFF
				, doProcess("RgltryRptg")) // processing active or not
				);
  
		registerHandler(
			new RemittanceLocation4Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of RemittanceLocation4Handler
				, "RltdRmtInf" // XML element name
				, doLink("RltdRmtInf") // linking to parent
					? new RltdRmtInfSetter(this) // ON
					: null // OFF
				, doProcess("RltdRmtInf")) // processing active or not
				);
  
		registerHandler(
			new RemittanceInformation11Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of RemittanceInformation11Handler
				, "RmtInf" // XML element name
				, doLink("RmtInf") // linking to parent
					? new RmtInfSetter(this) // ON
					: null // OFF
				, doProcess("RmtInf")) // processing active or not
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
			new TaxInformation3Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxInformation3Handler
				, "Tax" // XML element name
				, doLink("Tax") // linking to parent
					? new TaxSetter(this) // ON
					: null // OFF
				, doProcess("Tax")) // processing active or not
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
	public DirectDebitTransactionInformation19 getData() {
		return (DirectDebitTransactionInformation19)super.getData();
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
		if (localName.equals("ChrgBr")) {
			getData().setChrgBr(getValue());
			getContents().reset();
		} else if (localName.equals("InstrForCdtrAgt")) {
			getData().setInstrForCdtrAgt(getValue());
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
