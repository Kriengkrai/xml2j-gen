package com.xml2j;
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

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Xml2jModule {
	final static String module = "xml2j-module";

	public String name = null;
	public String description = null;
	public String input_path = null;
	public String output_path = null;

	int currInterface = -1;

	List<Xml2jInterface> intl = new ArrayList<Xml2jInterface>();

	public List<Xml2jInterface> interfaces() {
		return intl;
	}

	public void add(final Xml2jInterface iface) {
		currInterface++;
		intl.add(iface);
	}

	public void print(final PrintStream s) {
		s.println("\nxml2j-module" + "\nname: " + name + "\ninput_path: " + input_path + "\noutput_path: " + output_path);

		for (Xml2jInterface i : intl) {
			i.print(s);
		}
	}
}
