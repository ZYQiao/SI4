/**
 * Copyright (c) 2016 itemis AG - All rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * 
 * Contributors:
 * 	Andreas Muelder - itemis AG
 * 
 */
package com.yakindu.sctpro.product.intro.mail

import java.net.URLEncoder
import java.io.UnsupportedEncodingException

public class MailTemplate {

	public def String content() {
		'''
			<< 
			   Please enter your request here.
			   After sending the request you will automatically receive a confirmation with a ticket number.
			>>
			
			YAKINDU Statechart Tools Professional, release «PluginVersion.version»
		'''
	}

	public def String sctProVersion() {
		'''«PluginVersion.version»'''
	}

	public def String subject() {
		'''YAKINDU Statechart Tools Professional «PluginVersion.simpleVersion» Support Request
		'''
	}

	public def String receiver() {
		'''sct-pro@itemis.de'''
	}

	public def String asMailTo() {
		'''mailto:«enc(receiver())»?subject=«enc(subject())»&body=«enc(content())»'''
	}

	public def String asMailToForLinuxWithGtk() {
		'''mailto:?to=«enc(receiver())»&subject=«enc(subject())»&body=«enc(content())»'''
	}

	def String enc(String p) {
		if (p === null)
			return "";
		try {
			return URLEncoder.encode(p, "UTF-8").replaceAll("\\+", "%20");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException();
		}
	}

}
