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
 * PersonIdentification5 handler class.
 *
 * @see PersonIdentification5
 * 
 */
public class PersonIdentification5Handler extends XMLFragmentHandler<PersonIdentification5> {
	/**
	 * Proxy for PersonIdentification5Handler.
	 */
	static class Proxy extends HandlerProxy<PersonIdentification5> {
		/**
		 * Allocator for PersonIdentification5Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<PersonIdentification5> {			
			public XMLFragmentHandler<PersonIdentification5> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new PersonIdentification5Handler(
					task
					, reader
					, handler
					, elementName
					, PersonIdentification5.getAllocator()
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
	
	/** Data setter class for DtAndPlcOfBirth element. */
	private class DtAndPlcOfBirthSetter implements DataSetter {
		/** data target. */
		private PersonIdentification5Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DtAndPlcOfBirthSetter(PersonIdentification5Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDtAndPlcOfBirth((DateAndPlaceOfBirth) data);	
		}
	}	
	/** Data setter class for Othr element. */
	private class OthrSetter implements DataSetter {
		/** data target. */
		private PersonIdentification5Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OthrSetter(PersonIdentification5Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOthr((GenericPersonIdentification1) data);	
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
	public PersonIdentification5Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, PersonIdentification5.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new DateAndPlaceOfBirthHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DateAndPlaceOfBirthHandler
				, "DtAndPlcOfBirth" // XML element name
				, doLink("DtAndPlcOfBirth") // linking to parent
					? new DtAndPlcOfBirthSetter(this) // ON
					: null // OFF
				, doProcess("DtAndPlcOfBirth")) // processing active or not
				);
  
		registerHandler(
			new GenericPersonIdentification1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of GenericPersonIdentification1Handler
				, "Othr" // XML element name
				, doLink("Othr") // linking to parent
					? new OthrSetter(this) // ON
					: null // OFF
				, doProcess("Othr")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public PersonIdentification5 getData() {
		return (PersonIdentification5)super.getData();
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
		
		if (localName.equals(getXMLElementName())) {
				
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
