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
 * RegulatoryReporting3 handler class.
 *
 * @see RegulatoryReporting3
 * 
 */
public class RegulatoryReporting3Handler extends XMLFragmentHandler<RegulatoryReporting3> {
	/**
	 * Proxy for RegulatoryReporting3Handler.
	 */
	static class Proxy extends HandlerProxy<RegulatoryReporting3> {
		/**
		 * Allocator for RegulatoryReporting3Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<RegulatoryReporting3> {			
			public XMLFragmentHandler<RegulatoryReporting3> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new RegulatoryReporting3Handler(
					task
					, reader
					, handler
					, elementName
					, RegulatoryReporting3.getAllocator()
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
	
	/** Data setter class for Authrty element. */
	private class AuthrtySetter implements DataSetter {
		/** data target. */
		private RegulatoryReporting3Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AuthrtySetter(RegulatoryReporting3Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAuthrty((RegulatoryAuthority2) data);	
		}
	}	
	/** Data setter class for Dtls element. */
	private class DtlsSetter implements DataSetter {
		/** data target. */
		private RegulatoryReporting3Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DtlsSetter(RegulatoryReporting3Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDtls((StructuredRegulatoryReporting3) data);	
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
	public RegulatoryReporting3Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, RegulatoryReporting3.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new RegulatoryAuthority2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of RegulatoryAuthority2Handler
				, "Authrty" // XML element name
				, doLink("Authrty") // linking to parent
					? new AuthrtySetter(this) // ON
					: null // OFF
				, doProcess("Authrty")) // processing active or not
				);
  
		registerHandler(
			new StructuredRegulatoryReporting3Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of StructuredRegulatoryReporting3Handler
				, "Dtls" // XML element name
				, doLink("Dtls") // linking to parent
					? new DtlsSetter(this) // ON
					: null // OFF
				, doProcess("Dtls")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public RegulatoryReporting3 getData() {
		return (RegulatoryReporting3)super.getData();
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
		if (localName.equals("DbtCdtRptgInd")) {
			getData().setDbtCdtRptgInd(getValue());
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
