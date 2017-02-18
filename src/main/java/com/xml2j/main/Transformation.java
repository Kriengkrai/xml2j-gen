package com.xml2j.main;
/********************************************************************************
Copyright 2016, 2017 Lolke B. Dijkstra

Permission is hereby granted, free of charge, to any person obtaining a copy of 
this software and associated documentation files (the "Software"), to deal in the
Software without restriction, including without limitation the rights to use, 
copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
Software, and to permit persons to whom the Software is furnished to do so, 
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all 
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Project root: https://sourceforge.net/projects/xml2j/
********************************************************************************/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Transformation {
	String styleSheet;
	byte[] xb = null;
	private final Map<String, String> param;

	ByteArrayOutputStream executeStep(final InputStream input, final String inSystemId) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		InputStream currentXsl = new ByteArrayInputStream(this.xb);
		Transformation.execute(input, output, currentXsl, param, inSystemId);
		return output;
	}

	static ByteArrayOutputStream raw(final String input) throws IOException {
		InputStream is = new FileInputStream(Xml2jGenerator.HOME + "/xslt/" + input + ".xsl");

		ByteArrayOutputStream bos = null;
		try {
			bos = new ByteArrayOutputStream();

			byte[] buf = new byte[1024];
			int n;
			while ((n = is.read(buf)) >= 0) {
				bos.write(buf, 0, n);
			}
			return bos;

		} catch (Exception e) {
			// swallow: return null in case of failure
		} finally {
			try {
				is.close();
			} catch (IOException e) {
			}
		}
		return bos;
	}

	Transformation(final String xsl, final Map<String, String> param) {
		this.styleSheet = xsl;
		this.param = param;

		try {
			xb = raw(xsl).toByteArray();
		} catch (IOException e1) {
			Notification.error(e1.getMessage());
		}

	}

	/**
	 * Set runtime parameters in the XSLT transformer
	 * 
	 * @param t
	 *            transformer
	 * @param p
	 *            parameters
	 */
	static void setParameters(final Transformer t, final Map<String, String> p) {
		if (p != null && !p.isEmpty()) {
			Set<?> keys = p.keySet();
			for (Iterator<?> i = keys.iterator(); i.hasNext();) {
				String key = (String) i.next();
				t.setParameter(key, p.get(key));
			}
		}
	}

	static void execute(final InputStream input, final OutputStream output, final InputStream style, final Map<String, String> p, final String inSystemId) {
		try {
			TransformerFactory f = TransformerFactory.newInstance();
			Transformer t = f.newTransformer(new StreamSource(style));
			t.reset();

			setParameters(t, p);

			Source source = new StreamSource(input);
			if (inSystemId != null)
				source.setSystemId(inSystemId);

			t.transform(source, new StreamResult(output));
		} catch (TransformerException e) {
			Notification.error("Configuration error. Possible cause: typo in 'input-path'");
		}
	}

}