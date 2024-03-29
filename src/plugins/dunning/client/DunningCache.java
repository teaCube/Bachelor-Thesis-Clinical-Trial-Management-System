/* 
 * Copyright (C) 2013 Torsten Dietl <Torsten.Dietl@gmx.de>
 *
 * This source code is released under the Microsoft Reference Source License 
 * (MS-RSL).
 *
 * MICROSOFT REFERENCE SOURCE LICENSE (MS-RSL)
 *
 * This license governs use of the accompanying software. 
 * If you use the software, you accept this license. 
 * If you do not accept the license, do not use the software.
 *
 *
 * 1. Definitions
 *
 * The terms "reproduce," "reproduction," and "distribution" have the same 
 * meaning here as under U.S. copyright law.
 * "You" means the licensee of the software.
 * "Your company" means the company you worked for when you downloaded the 
 * software.
 * "Reference use" means use of the software within your company as a reference,
 * in read only form, for the sole purposes of debugging your products, 
 * maintaining your products, or enhancing the interoperability of your products
 * with the software, and specifically excludes the right to distribute the 
 * software outside of your company.
 * "Licensed patents" means any Licensor patent claims which read directly on 
 * the software as distributed by the Licensor under this license.
 * 
 *
 * 2. Grant of Rights
 * 
 * (A) Copyright Grant- Subject to the terms of this license, the Licensor 
 * grants you a non-transferable, non-exclusive, worldwide, royalty-free 
 * copyright license to reproduce the software for reference use.
 * (B) Patent Grant- Subject to the terms of this license, the Licensor grants 
 * you a non-transferable, non-exclusive, worldwide, royalty-free patent license
 * under licensed patents for reference use.
 * 
 *
 * 3. Limitations
 *
 * (A) No Trademark License- This license does not grant you any rights to use 
 * the Licensorís name, logo, or trademarks.
 * (B) If you begin patent litigation against the Licensor over patents that you
 * think may apply to the software (including a cross-claim or counterclaim in a
 * lawsuit), your license to the software ends automatically.
 * (C) The software is licensed "as-is." You bear the risk of using it. 
 * The Licensor gives no express warranties, guarantees or conditions. You may 
 * have additional consumer rights under your local laws which this license 
 * cannot change. To the extent permitted under your local laws, the Licensor 
 * excludes the implied warranties of merchantability, fitness for a particular 
 * purpose and non-infringement. 
 *
 */

package plugins.dunning.client;

import shared.util.RecordSet;

/**
 * @author torstend
 *
 */
public class DunningCache {
	private RecordSet invoiceData;
	private RecordSet invoiceContactData;
	private RecordSet dunningTextData;
	
	/**
	 * @return the invoiceData
	 */
	public RecordSet getInvoiceData() {
		return invoiceData;
	}
	/**
	 * @return the invoiceContactData
	 */
	public RecordSet getInvoiceContactData() {
		return invoiceContactData;
	}
	/**
	 * @return the dunningTextData
	 */
	public RecordSet getDunningTextData() {
		return dunningTextData;
	}
	
	
	/**
	 * @param invoiceData the invoiceData to set
	 */
	public void setInvoiceData(RecordSet invoiceData) {
		this.invoiceData = invoiceData;
	}
	/**
	 * @param invoiceContactData the invoiceContactData to set
	 */
	public void setInvoiceContactData(RecordSet invoiceContactData) {
		this.invoiceContactData = invoiceContactData;
	}
	/**
	 * @param dunningTextData the dunningTextData to set
	 */
	public void setDunningTextData(RecordSet dunningTextData) {
		this.dunningTextData = dunningTextData;
	}
	
}
