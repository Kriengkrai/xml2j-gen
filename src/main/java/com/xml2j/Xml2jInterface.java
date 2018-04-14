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

public class Xml2jInterface {
	public String name = null;
	public String message_handler_root = null;
	public String message_handler_name = null;
	public String root_type_rename = null;
	public String message_handler_processor = null;
	public String message_handler_runnable = null;
	public String message_handler_application_task = null;
	public String message_handler_application = null;

	public void print(final PrintStream s) {
		s.println("\nxml2j-interface" + "\n\tname: " + name + "\n\tmessage_handler_root: " + message_handler_root + "\n\tmessage_handler_name: "
				+ message_handler_name + "\n\troot_type_rename: " + root_type_rename + "\n\tmessage_handler_processor: " + message_handler_processor
				+ "\n\tmessage_handler_runnable: " + message_handler_runnable + "\n\tmessage_handler_application_task: " + message_handler_application_task
				+ "\n\tmessage_handler_application: " + message_handler_application);
	}
}
