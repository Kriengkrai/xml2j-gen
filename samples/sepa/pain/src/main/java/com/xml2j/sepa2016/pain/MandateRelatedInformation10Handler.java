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
 * MandateRelatedInformation10 handler class.
 *
 * @see MandateRelatedInformation10
 * 
 */
public class MandateRelatedInformation10Handler extends XMLFragmentHandler<MandateRelatedInformation10> {
	/**
	 * Proxy for MandateRelatedInformation10Handler.
	 */
	static class Proxy extends HandlerProxy<MandateRelatedInformation10> {
		/**
		 * Allocator for MandateRelatedInformation10Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<MandateRelatedInformation10> {			
			public XMLFragmentHandler<MandateRelatedInformation10> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new MandateRelatedInformation10Handler(
					task
					, reader
					, handler
					, elementName
					, MandateRelatedInformation10.getAllocator()
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
	
	/** Data setter class for AmdmntInfDtls element. */
	private class AmdmntInfDtlsSetter implements DataSetter {
		/** data target. */
		private MandateRelatedInformation10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AmdmntInfDtlsSetter(MandateRelatedInformation10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAmdmntInfDtls((AmendmentInformationDetails10) data);	
		}
	}	
	/** Data setter class for Frqcy element. */
	private class FrqcySetter implements DataSetter {
		/** data target. */
		private MandateRelatedInformation10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public FrqcySetter(MandateRelatedInformation10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setFrqcy((Frequency21Choice) data);	
		}
	}	
	/** Data setter class for Rsn element. */
	private class RsnSetter implements DataSetter {
		/** data target. */
		private MandateRelatedInformation10Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RsnSetter(MandateRelatedInformation10Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRsn((MandateSetupReason1Choice) data);	
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
	public MandateRelatedInformation10Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, MandateRelatedInformation10.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new AmendmentInformationDetails10Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of AmendmentInformationDetails10Handler
				, "AmdmntInfDtls" // XML element name
				, doLink("AmdmntInfDtls") // linking to parent
					? new AmdmntInfDtlsSetter(this) // ON
					: null // OFF
				, doProcess("AmdmntInfDtls")) // processing active or not
				);
  
		registerHandler(
			new Frequency21ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Frequency21ChoiceHandler
				, "Frqcy" // XML element name
				, doLink("Frqcy") // linking to parent
					? new FrqcySetter(this) // ON
					: null // OFF
				, doProcess("Frqcy")) // processing active or not
				);
  
		registerHandler(
			new MandateSetupReason1ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of MandateSetupReason1ChoiceHandler
				, "Rsn" // XML element name
				, doLink("Rsn") // linking to parent
					? new RsnSetter(this) // ON
					: null // OFF
				, doProcess("Rsn")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public MandateRelatedInformation10 getData() {
		return (MandateRelatedInformation10)super.getData();
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
		if (localName.equals("AmdmntInd")) {
			getData().setAmdmntInd(getValue());
			getContents().reset();
		} else if (localName.equals("DtOfSgntr")) {
			getData().setDtOfSgntr(getValue());
			getContents().reset();
		} else if (localName.equals("ElctrncSgntr")) {
			getData().setElctrncSgntr(getValue());
			getContents().reset();
		} else if (localName.equals("FnlColltnDt")) {
			getData().setFnlColltnDt(getValue());
			getContents().reset();
		} else if (localName.equals("FrstColltnDt")) {
			getData().setFrstColltnDt(getValue());
			getContents().reset();
		} else if (localName.equals("MndtId")) {
			getData().setMndtId(getValue());
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
