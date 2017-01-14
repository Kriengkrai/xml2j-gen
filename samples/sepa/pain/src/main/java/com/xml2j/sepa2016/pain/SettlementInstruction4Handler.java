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
 * SettlementInstruction4 handler class.
 *
 * @see SettlementInstruction4
 * 
 */
public class SettlementInstruction4Handler extends XMLFragmentHandler<SettlementInstruction4> {
	/**
	 * Proxy for SettlementInstruction4Handler.
	 */
	static class Proxy extends HandlerProxy<SettlementInstruction4> {
		/**
		 * Allocator for SettlementInstruction4Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<SettlementInstruction4> {			
			public XMLFragmentHandler<SettlementInstruction4> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new SettlementInstruction4Handler(
					task
					, reader
					, handler
					, elementName
					, SettlementInstruction4.getAllocator()
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
	
	/** Data setter class for ClrSys element. */
	private class ClrSysSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ClrSysSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setClrSys((ClearingSystemIdentification3Choice) data);	
		}
	}	
	/** Data setter class for InstdRmbrsmntAgt element. */
	private class InstdRmbrsmntAgtSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InstdRmbrsmntAgtSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInstdRmbrsmntAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for InstdRmbrsmntAgtAcct element. */
	private class InstdRmbrsmntAgtAcctSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InstdRmbrsmntAgtAcctSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInstdRmbrsmntAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for InstgRmbrsmntAgt element. */
	private class InstgRmbrsmntAgtSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InstgRmbrsmntAgtSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInstgRmbrsmntAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for InstgRmbrsmntAgtAcct element. */
	private class InstgRmbrsmntAgtAcctSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InstgRmbrsmntAgtAcctSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInstgRmbrsmntAgtAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for SttlmAcct element. */
	private class SttlmAcctSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SttlmAcctSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setSttlmAcct((CashAccount24) data);	
		}
	}	
	/** Data setter class for ThrdRmbrsmntAgt element. */
	private class ThrdRmbrsmntAgtSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ThrdRmbrsmntAgtSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setThrdRmbrsmntAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for ThrdRmbrsmntAgtAcct element. */
	private class ThrdRmbrsmntAgtAcctSetter implements DataSetter {
		/** data target. */
		private SettlementInstruction4Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ThrdRmbrsmntAgtAcctSetter(SettlementInstruction4Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setThrdRmbrsmntAgtAcct((CashAccount24) data);	
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
	public SettlementInstruction4Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, SettlementInstruction4.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ClearingSystemIdentification3ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ClearingSystemIdentification3ChoiceHandler
				, "ClrSys" // XML element name
				, doLink("ClrSys") // linking to parent
					? new ClrSysSetter(this) // ON
					: null // OFF
				, doProcess("ClrSys")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "InstdRmbrsmntAgt" // XML element name
				, doLink("InstdRmbrsmntAgt") // linking to parent
					? new InstdRmbrsmntAgtSetter(this) // ON
					: null // OFF
				, doProcess("InstdRmbrsmntAgt")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "InstdRmbrsmntAgtAcct" // XML element name
				, doLink("InstdRmbrsmntAgtAcct") // linking to parent
					? new InstdRmbrsmntAgtAcctSetter(this) // ON
					: null // OFF
				, doProcess("InstdRmbrsmntAgtAcct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "InstgRmbrsmntAgt" // XML element name
				, doLink("InstgRmbrsmntAgt") // linking to parent
					? new InstgRmbrsmntAgtSetter(this) // ON
					: null // OFF
				, doProcess("InstgRmbrsmntAgt")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "InstgRmbrsmntAgtAcct" // XML element name
				, doLink("InstgRmbrsmntAgtAcct") // linking to parent
					? new InstgRmbrsmntAgtAcctSetter(this) // ON
					: null // OFF
				, doProcess("InstgRmbrsmntAgtAcct")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "SttlmAcct" // XML element name
				, doLink("SttlmAcct") // linking to parent
					? new SttlmAcctSetter(this) // ON
					: null // OFF
				, doProcess("SttlmAcct")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "ThrdRmbrsmntAgt" // XML element name
				, doLink("ThrdRmbrsmntAgt") // linking to parent
					? new ThrdRmbrsmntAgtSetter(this) // ON
					: null // OFF
				, doProcess("ThrdRmbrsmntAgt")) // processing active or not
				);
  
		registerHandler(
			new CashAccount24Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CashAccount24Handler
				, "ThrdRmbrsmntAgtAcct" // XML element name
				, doLink("ThrdRmbrsmntAgtAcct") // linking to parent
					? new ThrdRmbrsmntAgtAcctSetter(this) // ON
					: null // OFF
				, doProcess("ThrdRmbrsmntAgtAcct")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public SettlementInstruction4 getData() {
		return (SettlementInstruction4)super.getData();
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
		if (localName.equals("SttlmMtd")) {
			getData().setSttlmMtd(getValue());
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
