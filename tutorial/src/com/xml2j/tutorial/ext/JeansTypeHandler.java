package com.xml2j.tutorial.ext;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: EXT 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * JeansType handler class.
 *
 * @see JeansType
 * 
 */
public class JeansTypeHandler extends ProductTypeHandler {
	/**
	 * Proxy for JeansTypeHandler.
	 */
	static class Proxy extends HandlerProxy<ProductType> {
		/**
		 * Allocator for JeansTypeHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ProductType> {			
			public XMLFragmentHandler<ProductType> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new JeansTypeHandler(
					task
					, reader
					, handler
					, elementName
					, JeansType.getAllocator()
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
	
	/** Data setter class for length element. */
	private class LengthSetter implements DataSetter {
		/** data target. */
		private JeansTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public LengthSetter(JeansTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setLength((SizeType) data);	
		}
	}	
	/** Data setter class for width element. */
	private class WidthSetter implements DataSetter {
		/** data target. */
		private JeansTypeHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public WidthSetter(JeansTypeHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setWidth((SizeType) data);	
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
	public JeansTypeHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, JeansType.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new SizeTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of SizeTypeHandler
				, "length" // XML element name
				, doLink("length") // linking to parent
					? new LengthSetter(this) // ON
					: null // OFF
				, doProcess("length")) // processing active or not
				);
  
		registerHandler(
			new SizeTypeHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of SizeTypeHandler
				, "width" // XML element name
				, doLink("width") // linking to parent
					? new WidthSetter(this) // ON
					: null // OFF
				, doProcess("width")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public JeansType getData() {
		return (JeansType)super.getData();
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
		
		super.endElement(uri, localName, name);
			
	}	
}
