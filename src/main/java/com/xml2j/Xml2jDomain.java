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

public class Xml2jDomain {
	public String base = null;
	public String name = null;
	private int currModule = -1;

	private List<Xml2jModule> modules = new ArrayList<Xml2jModule>();

	public List<Xml2jModule> modules() {
		return modules;
	}

	public Xml2jModule current() {
		return modules.get(currModule);
	}

	public void add(final Xml2jModule mod) {
		currModule++;
		// System.err.println("setting module");
		modules.add(mod);
	}

	public void print(final PrintStream s) {
		s.println("\nxml2j-domain" + "\nname: " + name + "\nbase: " + base);

		for (Xml2jModule m : modules) {
			m.print(s);
		}
	}

}
