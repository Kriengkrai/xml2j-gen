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
 * FinancialInstitutionIdentification8 handler class.
 *
 * @see FinancialInstitutionIdentification8
 * 
 */
public class FinancialInstitutionIdentification8Handler extends XMLFragmentHandler<FinancialInstitutionIdentification8> {
	/**
	 * Proxy for FinancialInstitutionIdentification8Handler.
	 */
	static class Proxy extends HandlerProxy<FinancialInstitutionIdentification8> {
		/**
		 * Allocator for FinancialInstitutionIdentification8Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<FinancialInstitutionIdentification8> {			
			public XMLFragmentHandler<FinancialInstitutionIdentification8> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new FinancialInstitutionIdentification8Handler(
					task
					, reader
					, handler
					, elementName
					, FinancialInstitutionIdentification8.getAllocator()
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
	
	/** Data setter class for ClrSysMmbId element. */
	private class ClrSysMmbIdSetter implements DataSetter {
		/** data target. */
		private FinancialInstitutionIdentification8Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ClrSysMmbIdSetter(FinancialInstitutionIdentification8Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setClrSysMmbId((ClearingSystemMemberIdentification2) data);	
		}
	}	
	/** Data setter class for Othr element. */
	private class OthrSetter implements DataSetter {
		/** data target. */
		private FinancialInstitutionIdentification8Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OthrSetter(FinancialInstitutionIdentification8Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOthr((GenericFinancialIdentification1) data);	
		}
	}	
	/** Data setter class for PstlAdr element. */
	private class PstlAdrSetter implements DataSetter {
		/** data target. */
		private FinancialInstitutionIdentification8Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PstlAdrSetter(FinancialInstitutionIdentification8Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setPstlAdr((PostalAddress6) data);	
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
	public FinancialInstitutionIdentification8Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, FinancialInstitutionIdentification8.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ClearingSystemMemberIdentification2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ClearingSystemMemberIdentification2Handler
				, "ClrSysMmbId" // XML element name
				, doLink("ClrSysMmbId") // linking to parent
					? new ClrSysMmbIdSetter(this) // ON
					: null // OFF
				, doProcess("ClrSysMmbId")) // processing active or not
				);
  
		registerHandler(
			new GenericFinancialIdentification1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GenericFinancialIdentification1Handler
				, "Othr" // XML element name
				, doLink("Othr") // linking to parent
					? new OthrSetter(this) // ON
					: null // OFF
				, doProcess("Othr")) // processing active or not
				);
  
		registerHandler(
			new PostalAddress6Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PostalAddress6Handler
				, "PstlAdr" // XML element name
				, doLink("PstlAdr") // linking to parent
					? new PstlAdrSetter(this) // ON
					: null // OFF
				, doProcess("PstlAdr")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public FinancialInstitutionIdentification8 getData() {
		return (FinancialInstitutionIdentification8)super.getData();
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
		if (localName.equals("BICFI")) {
			getData().setBICFI(getValue());
			getContents().reset();
		} else if (localName.equals("Nm")) {
			getData().setNm(getValue());
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
