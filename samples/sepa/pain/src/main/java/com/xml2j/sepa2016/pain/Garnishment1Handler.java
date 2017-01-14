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
 * Garnishment1 handler class.
 *
 * @see Garnishment1
 * 
 */
public class Garnishment1Handler extends XMLFragmentHandler<Garnishment1> {
	/**
	 * Proxy for Garnishment1Handler.
	 */
	static class Proxy extends HandlerProxy<Garnishment1> {
		/**
		 * Allocator for Garnishment1Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<Garnishment1> {			
			public XMLFragmentHandler<Garnishment1> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new Garnishment1Handler(
					task
					, reader
					, handler
					, elementName
					, Garnishment1.getAllocator()
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
	
	/** Data setter class for Grnshee element. */
	private class GrnsheeSetter implements DataSetter {
		/** data target. */
		private Garnishment1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrnsheeSetter(Garnishment1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrnshee((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for GrnshmtAdmstr element. */
	private class GrnshmtAdmstrSetter implements DataSetter {
		/** data target. */
		private Garnishment1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public GrnshmtAdmstrSetter(Garnishment1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setGrnshmtAdmstr((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for RmtdAmt element. */
	private class RmtdAmtSetter implements DataSetter {
		/** data target. */
		private Garnishment1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RmtdAmtSetter(Garnishment1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRmtdAmt((ActiveOrHistoricCurrencyAndAmount) data);	
		}
	}	
	/** Data setter class for Tp element. */
	private class TpSetter implements DataSetter {
		/** data target. */
		private Garnishment1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TpSetter(Garnishment1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTp((GarnishmentType1) data);	
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
	public Garnishment1Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, Garnishment1.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "Grnshee" // XML element name
				, doLink("Grnshee") // linking to parent
					? new GrnsheeSetter(this) // ON
					: null // OFF
				, doProcess("Grnshee")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "GrnshmtAdmstr" // XML element name
				, doLink("GrnshmtAdmstr") // linking to parent
					? new GrnshmtAdmstrSetter(this) // ON
					: null // OFF
				, doProcess("GrnshmtAdmstr")) // processing active or not
				);
  
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "RmtdAmt" // XML element name
				, doLink("RmtdAmt") // linking to parent
					? new RmtdAmtSetter(this) // ON
					: null // OFF
				, doProcess("RmtdAmt")) // processing active or not
				);
  
		registerHandler(
			new GarnishmentType1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GarnishmentType1Handler
				, "Tp" // XML element name
				, doLink("Tp") // linking to parent
					? new TpSetter(this) // ON
					: null // OFF
				, doProcess("Tp")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public Garnishment1 getData() {
		return (Garnishment1)super.getData();
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
		if (localName.equals("Dt")) {
			getData().setDt(getValue());
			getContents().reset();
		} else if (localName.equals("FmlyMdclInsrncInd")) {
			getData().setFmlyMdclInsrncInd(getValue());
			getContents().reset();
		} else if (localName.equals("MplyeeTermntnInd")) {
			getData().setMplyeeTermntnInd(getValue());
			getContents().reset();
		} else if (localName.equals("RefNb")) {
			getData().setRefNb(getValue());
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
