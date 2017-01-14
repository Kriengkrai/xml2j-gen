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
 * OriginalTransactionReference23 handler class.
 *
 * @see OriginalTransactionReference23
 * 
 */
public class OriginalTransactionReference23Handler extends XMLFragmentHandler<OriginalTransactionReference23> {
	/**
	 * Proxy for OriginalTransactionReference23Handler.
	 */
	static class Proxy extends HandlerProxy<OriginalTransactionReference23> {
		/**
		 * Allocator for OriginalTransactionReference23Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<OriginalTransactionReference23> {			
			public XMLFragmentHandler<OriginalTransactionReference23> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new OriginalTransactionReference23Handler(
					task
					, reader
					, handler
					, elementName
					, OriginalTransactionReference23.getAllocator()
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
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AmtSetter(OriginalTransactionReference23Handler pHandler) {
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
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrSetter(OriginalTransactionReference23Handler pHandler) {
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
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAcctSetter(OriginalTransactionReference23Handler pHandler) {
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
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAgtSetter(OriginalTransactionReference23Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for Dbtr element. */
	private class DbtrSetter implements DataSetter {
		/** data target. */
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrSetter(OriginalTransactionReference23Handler pHandler) {
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
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAcctSetter(OriginalTransactionReference23Handler pHandler) {
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
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAgtSetter(OriginalTransactionReference23Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for PmtTpInf element. */
	private class PmtTpInfSetter implements DataSetter {
		/** data target. */
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PmtTpInfSetter(OriginalTransactionReference23Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPmtTpInf((PaymentTypeInformation19) data);	
		}
	}	
	/** Data setter class for RmtInf element. */
	private class RmtInfSetter implements DataSetter {
		/** data target. */
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RmtInfSetter(OriginalTransactionReference23Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRmtInf((RemittanceInformation11) data);	
		}
	}	
	/** Data setter class for UltmtCdtr element. */
	private class UltmtCdtrSetter implements DataSetter {
		/** data target. */
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtCdtrSetter(OriginalTransactionReference23Handler pHandler) {
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
		private OriginalTransactionReference23Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public UltmtDbtrSetter(OriginalTransactionReference23Handler pHandler) {
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
	public OriginalTransactionReference23Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, OriginalTransactionReference23.Allocator allocator
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
	public OriginalTransactionReference23 getData() {
		return (OriginalTransactionReference23)super.getData();
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
		if (localName.equals("PmtMtd")) {
			getData().setPmtMtd(getValue());
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
