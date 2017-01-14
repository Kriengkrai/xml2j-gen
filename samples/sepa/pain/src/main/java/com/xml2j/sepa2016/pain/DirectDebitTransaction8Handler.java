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
 * DirectDebitTransaction8 handler class.
 *
 * @see DirectDebitTransaction8
 * 
 */
public class DirectDebitTransaction8Handler extends XMLFragmentHandler<DirectDebitTransaction8> {
	/**
	 * Proxy for DirectDebitTransaction8Handler.
	 */
	static class Proxy extends HandlerProxy<DirectDebitTransaction8> {
		/**
		 * Allocator for DirectDebitTransaction8Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<DirectDebitTransaction8> {			
			public XMLFragmentHandler<DirectDebitTransaction8> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new DirectDebitTransaction8Handler(
					task
					, reader
					, handler
					, elementName
					, DirectDebitTransaction8.getAllocator()
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
	
	/** Data setter class for CdtrSchmeId element. */
	private class CdtrSchmeIdSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransaction8Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrSchmeIdSetter(DirectDebitTransaction8Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrSchmeId((PartyIdentification43) data);	
		}
	}	
	/** Data setter class for MndtRltdInf element. */
	private class MndtRltdInfSetter implements DataSetter {
		/** data target. */
		private DirectDebitTransaction8Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public MndtRltdInfSetter(DirectDebitTransaction8Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setMndtRltdInf((MandateRelatedInformation10) data);	
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
	public DirectDebitTransaction8Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, DirectDebitTransaction8.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "CdtrSchmeId" // XML element name
				, doLink("CdtrSchmeId") // linking to parent
					? new CdtrSchmeIdSetter(this) // ON
					: null // OFF
				, doProcess("CdtrSchmeId")) // processing active or not
				);
  
		registerHandler(
			new MandateRelatedInformation10Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of MandateRelatedInformation10Handler
				, "MndtRltdInf" // XML element name
				, doLink("MndtRltdInf") // linking to parent
					? new MndtRltdInfSetter(this) // ON
					: null // OFF
				, doProcess("MndtRltdInf")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public DirectDebitTransaction8 getData() {
		return (DirectDebitTransaction8)super.getData();
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
		if (localName.equals("PreNtfctnDt")) {
			getData().setPreNtfctnDt(getValue());
			getContents().reset();
		} else if (localName.equals("PreNtfctnId")) {
			getData().setPreNtfctnId(getValue());
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
