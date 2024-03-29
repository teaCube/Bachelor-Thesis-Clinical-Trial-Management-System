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

package plugins.base;

/**
 * The names of the tables used by the plug-in.
 * 
 * TBL_PLUGIN - Table containing names of installed plug-ins
 * TBL_PLUGIN_FUNCTION - Table containing IDs of plug-ins and functions to create
 * 						 a relation between them. The given functions belonging
 * 						 to the given plug-ins.
 * TBL_USER - Table containing user data such as name, login name, etc.
 * TBL_USERGROUP - Table containing names of user groups.
 * TBL_USER_USERGROUP - Table containing IDs of users, who are in user groups. 
 * 						Models the relation between users and user groups.
 * TBL_USER_RIGHTS - Containing IDs of users and the associated right value.
 * TBL_USERGROUP_RIGHTS - Containing IDs of user groups and the associated right
 * 						  value.  
 * 
 * @author Torsten Dietl
 * @version 1.0.0a
 */
public enum BASE_TABLES 
{
	
	/* Constants ----------------------------------------------------------------*/
	
	TBL_PLUGIN("base_tbl_plugin"),
	TBL_PLUGIN_FUNCTION("base_tbl_plugin_function"),
	TBL_USER("base_tbl_user"),
	TBL_USERGROUP("base_tbl_usergroup"),
	TBL_USER_USERGROUP("base_tbl_user_usergroup"),
	TBL_USER_RIGHTS("base_tbl_user_rights"),
	TBL_USERGROUP_RIGHTS("base_tbl_usergroup_rights");
	
	/* Variables ----------------------------------------------------------------*/	

	// Name of the table.
	private String tableName;
	
	/* Constructor --------------------------------------------------------------*/
	
	/**
	 * The constructor of the enumeration. Accepting a string.
	 * 
	 * @param s The name of the table, mapped by the enumeration literal.
	 */
	BASE_TABLES(String s)
	{
		this.tableName = s;
	}
	
	/* Getter -------------------------------------------------------------------*/
	

	/* Setter -------------------------------------------------------------------*/
		
	
	/* Private ------------------------------------------------------------------*/
	
	
	/* Public -------------------------------------------------------------------*/
	
	/**
	 * Returns the name of the table mapped by this enumeration literal.
	 * 
	 * @return String containing the name of the table.
	 */
	public String get()
	{
		return this.tableName;
	}
}
