/*******************************************************************************
 * Copyright (c) 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.core.operations;

import static melnorme.utilbox.core.Assert.AssertNamespace.assertTrue;

import melnorme.utilbox.core.CommonException;
import melnorme.utilbox.process.ExternalProcessNotifyingHelper;

public class ProcessStartInfo {
	
	public final OperationInfo opInfo;
	
	public final ProcessBuilder pb;
	public final String prefixText;
	public final ExternalProcessNotifyingHelper processHelper;
	public final CommonException ce;
	
	public ProcessStartInfo(OperationInfo opInfo, ProcessBuilder pb, String prefixText, 
			ExternalProcessNotifyingHelper processHelper, CommonException ce) {
		this.opInfo = opInfo;
		this.pb = pb;
		this.prefixText = prefixText;
		this.processHelper = processHelper;
		this.ce = ce;
		
		assertTrue(opInfo == null || opInfo.isStarted());
	}
	
}