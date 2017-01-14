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
 * TaxInformation3 handler class.
 *
 * @see TaxInformation3
 * 
 */
public class TaxInformation3Handler extends XMLFragmentHandler<TaxInformation3> {
	/**
	 * Proxy for TaxInformation3Handler.
	 */
	static class Proxy extends HandlerProxy<TaxInformation3> {
		/**
		 * Allocator for TaxInformation3Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<TaxInformation3> {			
			public XMLFragmentHandler<TaxInformation3> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new TaxInformation3Handler(
					task
					, reader
					, handler
					, elementName
					, TaxInformation3.getAllocator()
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
		private TaxInformation3Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrSetter(TaxInformation3Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtr((TaxParty1) data);	
		}
	}	
	/** Data setter class for Dbtr element. */
	private class DbtrSetter implements DataSetter {
		/** data target. */
		private TaxInformation3Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrSetter(TaxInformation3Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtr((TaxParty2) data);	
		}
	}	
	/** Data setter class for Rcrd element. */
	private class RcrdSetter implements DataSetter {
		/** data target. */
		private TaxInformation3Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RcrdSetter(TaxInformation3Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRcrd((TaxRecord1) data);	
		}
	}	
	/** Data setter class for TtlTaxAmt element. */
	private class TtlTaxAmtSetter implements DataSetter {
		/** data target. */
		private TaxInformation3Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TtlTaxAmtSetter(TaxInformation3Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTtlTaxAmt((ActiveOrHistoricCurrencyAndAmount) data);	
		}
	}	
	/** Data setter class for TtlTaxblBaseAmt element. */
	private class TtlTaxblBaseAmtSetter implements DataSetter {
		/** data target. */
		private TaxInformation3Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TtlTaxblBaseAmtSetter(TaxInformation3Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTtlTaxblBaseAmt((ActiveOrHistoricCurrencyAndAmount) data);	
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
	public TaxInformation3Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, TaxInformation3.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new TaxParty1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxParty1Handler
				, "Cdtr" // XML element name
				, doLink("Cdtr") // linking to parent
					? new CdtrSetter(this) // ON
					: null // OFF
				, doProcess("Cdtr")) // processing active or not
				);
  
		registerHandler(
			new TaxParty2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxParty2Handler
				, "Dbtr" // XML element name
				, doLink("Dbtr") // linking to parent
					? new DbtrSetter(this) // ON
					: null // OFF
				, doProcess("Dbtr")) // processing active or not
				);
  
		registerHandler(
			new TaxRecord1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxRecord1Handler
				, "Rcrd" // XML element name
				, doLink("Rcrd") // linking to parent
					? new RcrdSetter(this) // ON
					: null // OFF
				, doProcess("Rcrd")) // processing active or not
				);
  
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "TtlTaxAmt" // XML element name
				, doLink("TtlTaxAmt") // linking to parent
					? new TtlTaxAmtSetter(this) // ON
					: null // OFF
				, doProcess("TtlTaxAmt")) // processing active or not
				);
  
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "TtlTaxblBaseAmt" // XML element name
				, doLink("TtlTaxblBaseAmt") // linking to parent
					? new TtlTaxblBaseAmtSetter(this) // ON
					: null // OFF
				, doProcess("TtlTaxblBaseAmt")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public TaxInformation3 getData() {
		return (TaxInformation3)super.getData();
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
		if (localName.equals("AdmstnZn")) {
			getData().setAdmstnZn(getValue());
			getContents().reset();
		} else if (localName.equals("Dt")) {
			getData().setDt(getValue());
			getContents().reset();
		} else if (localName.equals("Mtd")) {
			getData().setMtd(getValue());
			getContents().reset();
		} else if (localName.equals("RefNb")) {
			getData().setRefNb(getValue());
			getContents().reset();
		} else if (localName.equals("SeqNb")) {
			getData().setSeqNb(getValue());
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
