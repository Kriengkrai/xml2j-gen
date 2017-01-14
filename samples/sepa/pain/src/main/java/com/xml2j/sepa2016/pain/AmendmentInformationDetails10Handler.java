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
 * AmendmentInformationDetails10 handler class.
 *
 * @see AmendmentInformationDetails10
 * 
 */
public class AmendmentInformationDetails10Handler extends XMLFragmentHandler<AmendmentInformationDetails10> {
	/**
	 * Proxy for AmendmentInformationDetails10Handler.
	 */
	static class Proxy extends HandlerProxy<AmendmentInformationDetails10> {
		/**
		 * Allocator for AmendmentInformationDetails10Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<AmendmentInformationDetails10> {			
			public XMLFragmentHandler<AmendmentInformationDetails10> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new AmendmentInformationDetails10Handler(
					task
					, reader
					, handler
					, elementName
					, AmendmentInformationDetails10.getAllocator()
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
	
	/** Data setter class for OrgnlCdtrAgt element. */
	private class OrgnlCdtrAgtSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlCdtrAgtSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlCdtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for OrgnlCdtrAgtAcct element. */
	private class OrgnlCdtrAgtAcctSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlCdtrAgtAcctSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlCdtrAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for OrgnlCdtrSchmeId element. */
	private class OrgnlCdtrSchmeIdSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlCdtrSchmeIdSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlCdtrSchmeId((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for OrgnlDbtr element. */
	private class OrgnlDbtrSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlDbtrSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlDbtr((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for OrgnlDbtrAcct element. */
	private class OrgnlDbtrAcctSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlDbtrAcctSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlDbtrAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for OrgnlDbtrAgt element. */
	private class OrgnlDbtrAgtSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlDbtrAgtSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlDbtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for OrgnlDbtrAgtAcct element. */
	private class OrgnlDbtrAgtAcctSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlDbtrAgtAcctSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlDbtrAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for OrgnlFrqcy element. */
	private class OrgnlFrqcySetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlFrqcySetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlFrqcy((Frequency21Choice) data);	
		}
	}	
	/** Data setter class for OrgnlRsn element. */
	private class OrgnlRsnSetter implements DataSetter {
		/** data target. */
		private AmendmentInformationDetails10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlRsnSetter(AmendmentInformationDetails10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlRsn((MandateSetupReason1Choice) data);	
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
	public AmendmentInformationDetails10Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, AmendmentInformationDetails10.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "OrgnlCdtrAgt" // XML element name
				, doLink("OrgnlCdtrAgt") // linking to parent
					? new OrgnlCdtrAgtSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlCdtrAgt")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "OrgnlCdtrAgtAcct" // XML element name
				, doLink("OrgnlCdtrAgtAcct") // linking to parent
					? new OrgnlCdtrAgtAcctSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlCdtrAgtAcct")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "OrgnlCdtrSchmeId" // XML element name
				, doLink("OrgnlCdtrSchmeId") // linking to parent
					? new OrgnlCdtrSchmeIdSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlCdtrSchmeId")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "OrgnlDbtr" // XML element name
				, doLink("OrgnlDbtr") // linking to parent
					? new OrgnlDbtrSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlDbtr")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "OrgnlDbtrAcct" // XML element name
				, doLink("OrgnlDbtrAcct") // linking to parent
					? new OrgnlDbtrAcctSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlDbtrAcct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "OrgnlDbtrAgt" // XML element name
				, doLink("OrgnlDbtrAgt") // linking to parent
					? new OrgnlDbtrAgtSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlDbtrAgt")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "OrgnlDbtrAgtAcct" // XML element name
				, doLink("OrgnlDbtrAgtAcct") // linking to parent
					? new OrgnlDbtrAgtAcctSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlDbtrAgtAcct")) // processing active or not
				);
  
		registerHandler(
			new Frequency21ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Frequency21ChoiceHandler
				, "OrgnlFrqcy" // XML element name
				, doLink("OrgnlFrqcy") // linking to parent
					? new OrgnlFrqcySetter(this) // ON
					: null // OFF
				, doProcess("OrgnlFrqcy")) // processing active or not
				);
  
		registerHandler(
			new MandateSetupReason1ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of MandateSetupReason1ChoiceHandler
				, "OrgnlRsn" // XML element name
				, doLink("OrgnlRsn") // linking to parent
					? new OrgnlRsnSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlRsn")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public AmendmentInformationDetails10 getData() {
		return (AmendmentInformationDetails10)super.getData();
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
		if (localName.equals("OrgnlFnlColltnDt")) {
			getData().setOrgnlFnlColltnDt(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlMndtId")) {
			getData().setOrgnlMndtId(getValue());
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
