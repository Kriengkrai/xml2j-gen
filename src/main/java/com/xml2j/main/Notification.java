package com.xml2j.main;

import org.slf4j.Logger;

/********************************************************************************
 * Copyright 2016, 2017 Lolke B. Dijkstra
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * Project root: https://sourceforge.net/projects/xml2j/
 ********************************************************************************/

public class Notification {

	public Notification(Logger logger) {
		this.logger = logger;
	}

	Logger logger;

	public void fatal(final String err) {
		logger.error(err);
		System.exit(-1);
	}

	public void error(final String err) {
		logger.error(err);
	}

	public void info(final String msg) {
		logger.info(msg);
	}

	public void warn(final String msg) {
		logger.warn(msg);
	}

	public void message(final String msg) {
		System.out.println(msg);
	}
}
