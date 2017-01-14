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
 * TaxRecord1 handler class.
 *
 * @see TaxRecord1
 * 
 */
public class TaxRecord1Handler extends XMLFragmentHandler<TaxRecord1> {
	/**
	 * Proxy for TaxRecord1Handler.
	 */
	static class Proxy extends HandlerProxy<TaxRecord1> {
		/**
		 * Allocator for TaxRecord1Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<TaxRecord1> {			
			public XMLFragmentHandler<TaxRecord1> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new TaxRecord1Handler(
					task
					, reader
					, handler
					, elementName
					, TaxRecord1.getAllocator()
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
	
	/** Data setter class for Prd element. */
	private class PrdSetter implements DataSetter {
		/** data target. */
		private TaxRecord1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PrdSetter(TaxRecord1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPrd((TaxPeriod1) data);	
		}
	}	
	/** Data setter class for TaxAmt element. */
	private class TaxAmtSetter implements DataSetter {
		/** data target. */
		private TaxRecord1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TaxAmtSetter(TaxRecord1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTaxAmt((TaxAmount1) data);	
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
	public TaxRecord1Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, TaxRecord1.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new TaxPeriod1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxPeriod1Handler
				, "Prd" // XML element name
				, doLink("Prd") // linking to parent
					? new PrdSetter(this) // ON
					: null // OFF
				, doProcess("Prd")) // processing active or not
				);
  
		registerHandler(
			new TaxAmount1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxAmount1Handler
				, "TaxAmt" // XML element name
				, doLink("TaxAmt") // linking to parent
					? new TaxAmtSetter(this) // ON
					: null // OFF
				, doProcess("TaxAmt")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public TaxRecord1 getData() {
		return (TaxRecord1)super.getData();
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
		if (localName.equals("AddtlInf")) {
			getData().setAddtlInf(getValue());
			getContents().reset();
		} else if (localName.equals("CertId")) {
			getData().setCertId(getValue());
			getContents().reset();
		} else if (localName.equals("Ctgy")) {
			getData().setCtgy(getValue());
			getContents().reset();
		} else if (localName.equals("CtgyDtls")) {
			getData().setCtgyDtls(getValue());
			getContents().reset();
		} else if (localName.equals("DbtrSts")) {
			getData().setDbtrSts(getValue());
			getContents().reset();
		} else if (localName.equals("FrmsCd")) {
			getData().setFrmsCd(getValue());
			getContents().reset();
		} else if (localName.equals("Tp")) {
			getData().setTp(getValue());
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
