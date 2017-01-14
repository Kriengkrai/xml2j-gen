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
 * CreditTransferTransaction26 handler class.
 *
 * @see CreditTransferTransaction26
 * 
 */
public class CreditTransferTransaction26Handler extends XMLFragmentHandler<CreditTransferTransaction26> {
	/**
	 * Proxy for CreditTransferTransaction26Handler.
	 */
	static class Proxy extends HandlerProxy<CreditTransferTransaction26> {
		/**
		 * Allocator for CreditTransferTransaction26Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CreditTransferTransaction26> {			
			public XMLFragmentHandler<CreditTransferTransaction26> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CreditTransferTransaction26Handler(
					task
					, reader
					, handler
					, elementName
					, CreditTransferTransaction26.getAllocator()
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
	
	/** Data setter class for Amt element. */
	private class AmtSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AmtSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAmt((AmountType4Choice) data);	
		}
	}	
	/** Data setter class for Cdtr element. */
	private class CdtrSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAcctSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAgtSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAgtAcctSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for ChqInstr element. */
	private class ChqInstrSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChqInstrSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setChqInstr((Cheque7) data);	
		}
	}	
	/** Data setter class for InstrForCdtrAgt element. */
	private class InstrForCdtrAgtSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InstrForCdtrAgtSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInstrForCdtrAgt((InstructionForCreditorAgent1) data);	
		}
	}	
	/** Data setter class for IntrmyAgt1 element. */
	private class IntrmyAgt1Setter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IntrmyAgt1Setter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setIntrmyAgt1((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for IntrmyAgt1Acct element. */
	private class IntrmyAgt1AcctSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IntrmyAgt1AcctSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setIntrmyAgt1Acct((CashAccount24) data);	
		}
	}	
	/** Data setter class for IntrmyAgt2 element. */
	private class IntrmyAgt2Setter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IntrmyAgt2Setter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setIntrmyAgt2((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for IntrmyAgt2Acct element. */
	private class IntrmyAgt2AcctSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IntrmyAgt2AcctSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setIntrmyAgt2Acct((CashAccount24) data);	
		}
	}	
	/** Data setter class for IntrmyAgt3 element. */
	private class IntrmyAgt3Setter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IntrmyAgt3Setter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setIntrmyAgt3((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for IntrmyAgt3Acct element. */
	private class IntrmyAgt3AcctSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IntrmyAgt3AcctSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setIntrmyAgt3Acct((CashAccount24) data);	
		}
	}	
	/** Data setter class for PmtId element. */
	private class PmtIdSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtIdSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtTpInfSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtTpInf((PaymentTypeInformation19) data);	
		}
	}	
	/** Data setter class for Purp element. */
	private class PurpSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PurpSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RgltryRptgSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RltdRmtInfSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RmtInfSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TaxSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtCdtrSetter(CreditTransferTransaction26Handler pHandler) {
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
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtDbtrSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setUltmtDbtr((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for XchgRateInf element. */
	private class XchgRateInfSetter implements DataSetter {
		/** data target. */
		private CreditTransferTransaction26Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public XchgRateInfSetter(CreditTransferTransaction26Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setXchgRateInf((ExchangeRate1) data);	
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
	public CreditTransferTransaction26Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CreditTransferTransaction26.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new AmountType4ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of AmountType4ChoiceHandler
				, "Amt" // XML element name
				, doLink("Amt") // linking to parent
					? new AmtSetter(this) // ON
					: null // OFF
				, doProcess("Amt")) // processing active or not
				);
  
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
			new Cheque7Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Cheque7Handler
				, "ChqInstr" // XML element name
				, doLink("ChqInstr") // linking to parent
					? new ChqInstrSetter(this) // ON
					: null // OFF
				, doProcess("ChqInstr")) // processing active or not
				);
  
		registerHandler(
			new InstructionForCreditorAgent1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of InstructionForCreditorAgent1Handler
				, "InstrForCdtrAgt" // XML element name
				, doLink("InstrForCdtrAgt") // linking to parent
					? new InstrForCdtrAgtSetter(this) // ON
					: null // OFF
				, doProcess("InstrForCdtrAgt")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "IntrmyAgt1" // XML element name
				, doLink("IntrmyAgt1") // linking to parent
					? new IntrmyAgt1Setter(this) // ON
					: null // OFF
				, doProcess("IntrmyAgt1")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "IntrmyAgt1Acct" // XML element name
				, doLink("IntrmyAgt1Acct") // linking to parent
					? new IntrmyAgt1AcctSetter(this) // ON
					: null // OFF
				, doProcess("IntrmyAgt1Acct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "IntrmyAgt2" // XML element name
				, doLink("IntrmyAgt2") // linking to parent
					? new IntrmyAgt2Setter(this) // ON
					: null // OFF
				, doProcess("IntrmyAgt2")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "IntrmyAgt2Acct" // XML element name
				, doLink("IntrmyAgt2Acct") // linking to parent
					? new IntrmyAgt2AcctSetter(this) // ON
					: null // OFF
				, doProcess("IntrmyAgt2Acct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "IntrmyAgt3" // XML element name
				, doLink("IntrmyAgt3") // linking to parent
					? new IntrmyAgt3Setter(this) // ON
					: null // OFF
				, doProcess("IntrmyAgt3")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "IntrmyAgt3Acct" // XML element name
				, doLink("IntrmyAgt3Acct") // linking to parent
					? new IntrmyAgt3AcctSetter(this) // ON
					: null // OFF
				, doProcess("IntrmyAgt3Acct")) // processing active or not
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
  
		registerHandler(
			new ExchangeRate1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ExchangeRate1Handler
				, "XchgRateInf" // XML element name
				, doLink("XchgRateInf") // linking to parent
					? new XchgRateInfSetter(this) // ON
					: null // OFF
				, doProcess("XchgRateInf")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public CreditTransferTransaction26 getData() {
		return (CreditTransferTransaction26)super.getData();
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
		} else if (localName.equals("InstrForDbtrAgt")) {
			getData().setInstrForDbtrAgt(getValue());
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
