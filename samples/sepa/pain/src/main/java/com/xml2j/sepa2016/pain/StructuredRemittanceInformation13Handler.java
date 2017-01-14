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
 * StructuredRemittanceInformation13 handler class.
 *
 * @see StructuredRemittanceInformation13
 * 
 */
public class StructuredRemittanceInformation13Handler extends XMLFragmentHandler<StructuredRemittanceInformation13> {
	/**
	 * Proxy for StructuredRemittanceInformation13Handler.
	 */
	static class Proxy extends HandlerProxy<StructuredRemittanceInformation13> {
		/**
		 * Allocator for StructuredRemittanceInformation13Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<StructuredRemittanceInformation13> {			
			public XMLFragmentHandler<StructuredRemittanceInformation13> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new StructuredRemittanceInformation13Handler(
					task
					, reader
					, handler
					, elementName
					, StructuredRemittanceInformation13.getAllocator()
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
	
	/** Data setter class for CdtrRefInf element. */
	private class CdtrRefInfSetter implements DataSetter {
		/** data target. */
		private StructuredRemittanceInformation13Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrRefInfSetter(StructuredRemittanceInformation13Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrRefInf((CreditorReferenceInformation2) data);	
		}
	}	
	/** Data setter class for GrnshmtRmt element. */
	private class GrnshmtRmtSetter implements DataSetter {
		/** data target. */
		private StructuredRemittanceInformation13Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrnshmtRmtSetter(StructuredRemittanceInformation13Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrnshmtRmt((Garnishment1) data);	
		}
	}	
	/** Data setter class for Invcee element. */
	private class InvceeSetter implements DataSetter {
		/** data target. */
		private StructuredRemittanceInformation13Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InvceeSetter(StructuredRemittanceInformation13Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInvcee((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for Invcr element. */
	private class InvcrSetter implements DataSetter {
		/** data target. */
		private StructuredRemittanceInformation13Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InvcrSetter(StructuredRemittanceInformation13Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInvcr((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for RfrdDocAmt element. */
	private class RfrdDocAmtSetter implements DataSetter {
		/** data target. */
		private StructuredRemittanceInformation13Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RfrdDocAmtSetter(StructuredRemittanceInformation13Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRfrdDocAmt((RemittanceAmount2) data);	
		}
	}	
	/** Data setter class for RfrdDocInf element. */
	private class RfrdDocInfSetter implements DataSetter {
		/** data target. */
		private StructuredRemittanceInformation13Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RfrdDocInfSetter(StructuredRemittanceInformation13Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRfrdDocInf((ReferredDocumentInformation7) data);	
		}
	}	
	/** Data setter class for TaxRmt element. */
	private class TaxRmtSetter implements DataSetter {
		/** data target. */
		private StructuredRemittanceInformation13Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TaxRmtSetter(StructuredRemittanceInformation13Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTaxRmt((TaxInformation4) data);	
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
	public StructuredRemittanceInformation13Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, StructuredRemittanceInformation13.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CreditorReferenceInformation2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CreditorReferenceInformation2Handler
				, "CdtrRefInf" // XML element name
				, doLink("CdtrRefInf") // linking to parent
					? new CdtrRefInfSetter(this) // ON
					: null // OFF
				, doProcess("CdtrRefInf")) // processing active or not
				);
  
		registerHandler(
			new Garnishment1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Garnishment1Handler
				, "GrnshmtRmt" // XML element name
				, doLink("GrnshmtRmt") // linking to parent
					? new GrnshmtRmtSetter(this) // ON
					: null // OFF
				, doProcess("GrnshmtRmt")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "Invcee" // XML element name
				, doLink("Invcee") // linking to parent
					? new InvceeSetter(this) // ON
					: null // OFF
				, doProcess("Invcee")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "Invcr" // XML element name
				, doLink("Invcr") // linking to parent
					? new InvcrSetter(this) // ON
					: null // OFF
				, doProcess("Invcr")) // processing active or not
				);
  
		registerHandler(
			new RemittanceAmount2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of RemittanceAmount2Handler
				, "RfrdDocAmt" // XML element name
				, doLink("RfrdDocAmt") // linking to parent
					? new RfrdDocAmtSetter(this) // ON
					: null // OFF
				, doProcess("RfrdDocAmt")) // processing active or not
				);
  
		registerHandler(
			new ReferredDocumentInformation7Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ReferredDocumentInformation7Handler
				, "RfrdDocInf" // XML element name
				, doLink("RfrdDocInf") // linking to parent
					? new RfrdDocInfSetter(this) // ON
					: null // OFF
				, doProcess("RfrdDocInf")) // processing active or not
				);
  
		registerHandler(
			new TaxInformation4Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxInformation4Handler
				, "TaxRmt" // XML element name
				, doLink("TaxRmt") // linking to parent
					? new TaxRmtSetter(this) // ON
					: null // OFF
				, doProcess("TaxRmt")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public StructuredRemittanceInformation13 getData() {
		return (StructuredRemittanceInformation13)super.getData();
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
		if (localName.equals("AddtlRmtInf")) {
			getData().setAddtlRmtInf(getValue());
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
