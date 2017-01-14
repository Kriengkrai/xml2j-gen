package com.xml2j.sepa2016.pain;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:46 CET 2017 

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
 * OriginalGroupHeader1 handler class.
 *
 * @see OriginalGroupHeader1
 * 
 */
public class OriginalGroupHeader1Handler extends XMLFragmentHandler<OriginalGroupHeader1> {
	/**
	 * Proxy for OriginalGroupHeader1Handler.
	 */
	static class Proxy extends HandlerProxy<OriginalGroupHeader1> {
		/**
		 * Allocator for OriginalGroupHeader1Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<OriginalGroupHeader1> {			
			public XMLFragmentHandler<OriginalGroupHeader1> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new OriginalGroupHeader1Handler(
					task
					, reader
					, handler
					, elementName
					, OriginalGroupHeader1.getAllocator()
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
	
	/** Data setter class for NbOfTxsPerSts element. */
	private class NbOfTxsPerStsSetter implements DataSetter {
		/** data target. */
		private OriginalGroupHeader1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public NbOfTxsPerStsSetter(OriginalGroupHeader1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setNbOfTxsPerSts((NumberOfTransactionsPerStatus3) data);	
		}
	}	
	/** Data setter class for StsRsnInf element. */
	private class StsRsnInfSetter implements DataSetter {
		/** data target. */
		private OriginalGroupHeader1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public StsRsnInfSetter(OriginalGroupHeader1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setStsRsnInf((StatusReasonInformation9) data);	
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
	public OriginalGroupHeader1Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, OriginalGroupHeader1.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new NumberOfTransactionsPerStatus3Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of NumberOfTransactionsPerStatus3Handler
				, "NbOfTxsPerSts" // XML element name
				, doLink("NbOfTxsPerSts") // linking to parent
					? new NbOfTxsPerStsSetter(this) // ON
					: null // OFF
				, doProcess("NbOfTxsPerSts")) // processing active or not
				);
  
		registerHandler(
			new StatusReasonInformation9Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of StatusReasonInformation9Handler
				, "StsRsnInf" // XML element name
				, doLink("StsRsnInf") // linking to parent
					? new StsRsnInfSetter(this) // ON
					: null // OFF
				, doProcess("StsRsnInf")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public OriginalGroupHeader1 getData() {
		return (OriginalGroupHeader1)super.getData();
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
		if (localName.equals("GrpSts")) {
			getData().setGrpSts(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlCreDtTm")) {
			getData().setOrgnlCreDtTm(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlCtrlSum")) {
			getData().setOrgnlCtrlSum(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlMsgId")) {
			getData().setOrgnlMsgId(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlMsgNmId")) {
			getData().setOrgnlMsgNmId(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlNbOfTxs")) {
			getData().setOrgnlNbOfTxs(getValue());
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
