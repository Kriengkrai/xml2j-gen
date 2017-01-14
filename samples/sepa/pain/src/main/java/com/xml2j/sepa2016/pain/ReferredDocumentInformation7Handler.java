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
 * ReferredDocumentInformation7 handler class.
 *
 * @see ReferredDocumentInformation7
 * 
 */
public class ReferredDocumentInformation7Handler extends XMLFragmentHandler<ReferredDocumentInformation7> {
	/**
	 * Proxy for ReferredDocumentInformation7Handler.
	 */
	static class Proxy extends HandlerProxy<ReferredDocumentInformation7> {
		/**
		 * Allocator for ReferredDocumentInformation7Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ReferredDocumentInformation7> {			
			public XMLFragmentHandler<ReferredDocumentInformation7> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ReferredDocumentInformation7Handler(
					task
					, reader
					, handler
					, elementName
					, ReferredDocumentInformation7.getAllocator()
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
	
	/** Data setter class for LineDtls element. */
	private class LineDtlsSetter implements DataSetter {
		/** data target. */
		private ReferredDocumentInformation7Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public LineDtlsSetter(ReferredDocumentInformation7Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setLineDtls((DocumentLineInformation1) data);	
		}
	}	
	/** Data setter class for Tp element. */
	private class TpSetter implements DataSetter {
		/** data target. */
		private ReferredDocumentInformation7Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TpSetter(ReferredDocumentInformation7Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTp((ReferredDocumentType4) data);	
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
	public ReferredDocumentInformation7Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ReferredDocumentInformation7.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new DocumentLineInformation1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DocumentLineInformation1Handler
				, "LineDtls" // XML element name
				, doLink("LineDtls") // linking to parent
					? new LineDtlsSetter(this) // ON
					: null // OFF
				, doProcess("LineDtls")) // processing active or not
				);
  
		registerHandler(
			new ReferredDocumentType4Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ReferredDocumentType4Handler
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
	public ReferredDocumentInformation7 getData() {
		return (ReferredDocumentInformation7)super.getData();
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
		if (localName.equals("Nb")) {
			getData().setNb(getValue());
			getContents().reset();
		} else if (localName.equals("RltdDt")) {
			getData().setRltdDt(getValue());
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
