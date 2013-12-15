/*
 * Copyright  2000-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package org.apache.bcel.generic;

/**
 * NOP - Do nothing
 * 
 * @version $Id: NOP.java 386056 2006-03-15 11:31:56Z tcurdt $
 * @author <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A>
 */
public class NOP extends Instruction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NOP() {
		super(org.apache.bcel.Constants.NOP, (short) 1);
	}

	/**
	 * Call corresponding visitor method(s). The order is: Call visitor methods
	 * of implemented interfaces first, then call methods according to the class
	 * hierarchy in descending order, i.e., the most specific visitXXX() call
	 * comes last.
	 * 
	 * @param v
	 *            Visitor object
	 */
	@Override
	public void accept(Visitor v) {
		v.visitNOP(this);
	}
}
