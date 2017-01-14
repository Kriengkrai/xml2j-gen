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
 * Cheque7 handler class.
 *
 * @see Cheque7
 * 
 */
public class Cheque7Handler extends XMLFragmentHandler<Cheque7> {
	/**
	 * Proxy for Cheque7Handler.
	 */
	static class Proxy extends HandlerProxy<Cheque7> {
		/**
		 * Allocator for Cheque7Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<Cheque7> {			
			public XMLFragmentHandler<Cheque7> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new Cheque7Handler(
					task
					, reader
					, handler
					, elementName
					, Cheque7.getAllocator()
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
	
	/** Data setter class for ChqFr element. */
	private class ChqFrSetter implements DataSetter {
		/** data target. */
		private Cheque7Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChqFrSetter(Cheque7Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setChqFr((NameAndAddress10) data);	
		}
	}	
	/** Data setter class for DlvrTo element. */
	private class DlvrToSetter implements DataSetter {
		/** data target. */
		private Cheque7Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DlvrToSetter(Cheque7Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDlvrTo((NameAndAddress10) data);	
		}
	}	
	/** Data setter class for DlvryMtd element. */
	private class DlvryMtdSetter implements DataSetter {
		/** data target. */
		private Cheque7Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DlvryMtdSetter(Cheque7Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDlvryMtd((ChequeDeliveryMethod1Choice) data);	
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
	public Cheque7Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, Cheque7.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new NameAndAddress10Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of NameAndAddress10Handler
				, "ChqFr" // XML element name
				, doLink("ChqFr") // linking to parent
					? new ChqFrSetter(this) // ON
					: null // OFF
				, doProcess("ChqFr")) // processing active or not
				);
  
		registerHandler(
			new NameAndAddress10Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of NameAndAddress10Handler
				, "DlvrTo" // XML element name
				, doLink("DlvrTo") // linking to parent
					? new DlvrToSetter(this) // ON
					: null // OFF
				, doProcess("DlvrTo")) // processing active or not
				);
  
		registerHandler(
			new ChequeDeliveryMethod1ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ChequeDeliveryMethod1ChoiceHandler
				, "DlvryMtd" // XML element name
				, doLink("DlvryMtd") // linking to parent
					? new DlvryMtdSetter(this) // ON
					: null // OFF
				, doProcess("DlvryMtd")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public Cheque7 getData() {
		return (Cheque7)super.getData();
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
		if (localName.equals("ChqMtrtyDt")) {
			getData().setChqMtrtyDt(getValue());
			getContents().reset();
		} else if (localName.equals("ChqNb")) {
			getData().setChqNb(getValue());
			getContents().reset();
		} else if (localName.equals("ChqTp")) {
			getData().setChqTp(getValue());
			getContents().reset();
		} else if (localName.equals("FrmsCd")) {
			getData().setFrmsCd(getValue());
			getContents().reset();
		} else if (localName.equals("InstrPrty")) {
			getData().setInstrPrty(getValue());
			getContents().reset();
		} else if (localName.equals("MemoFld")) {
			getData().setMemoFld(getValue());
			getContents().reset();
		} else if (localName.equals("PrtLctn")) {
			getData().setPrtLctn(getValue());
			getContents().reset();
		} else if (localName.equals("RgnlClrZone")) {
			getData().setRgnlClrZone(getValue());
			getContents().reset();
		} else if (localName.equals("Sgntr")) {
			getData().setSgntr(getValue());
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
