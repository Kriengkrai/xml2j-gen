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
 * PartyIdentification43 handler class.
 *
 * @see PartyIdentification43
 * 
 */
public class PartyIdentification43Handler extends XMLFragmentHandler<PartyIdentification43> {
	/**
	 * Proxy for PartyIdentification43Handler.
	 */
	static class Proxy extends HandlerProxy<PartyIdentification43> {
		/**
		 * Allocator for PartyIdentification43Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<PartyIdentification43> {			
			public XMLFragmentHandler<PartyIdentification43> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new PartyIdentification43Handler(
					task
					, reader
					, handler
					, elementName
					, PartyIdentification43.getAllocator()
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
	
	/** Data setter class for CtctDtls element. */
	private class CtctDtlsSetter implements DataSetter {
		/** data target. */
		private PartyIdentification43Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CtctDtlsSetter(PartyIdentification43Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCtctDtls((ContactDetails2) data);	
		}
	}	
	/** Data setter class for Id element. */
	private class IdSetter implements DataSetter {
		/** data target. */
		private PartyIdentification43Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public IdSetter(PartyIdentification43Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setId((Party11Choice) data);	
		}
	}	
	/** Data setter class for PstlAdr element. */
	private class PstlAdrSetter implements DataSetter {
		/** data target. */
		private PartyIdentification43Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public PstlAdrSetter(PartyIdentification43Handler pHandler) {
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
	public PartyIdentification43Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, PartyIdentification43.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ContactDetails2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ContactDetails2Handler
				, "CtctDtls" // XML element name
				, doLink("CtctDtls") // linking to parent
					? new CtctDtlsSetter(this) // ON
					: null // OFF
				, doProcess("CtctDtls")) // processing active or not
				);
  
		registerHandler(
			new Party11ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Party11ChoiceHandler
				, "Id" // XML element name
				, doLink("Id") // linking to parent
					? new IdSetter(this) // ON
					: null // OFF
				, doProcess("Id")) // processing active or not
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
	public PartyIdentification43 getData() {
		return (PartyIdentification43)super.getData();
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
		if (localName.equals("CtryOfRes")) {
			getData().setCtryOfRes(getValue());
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
