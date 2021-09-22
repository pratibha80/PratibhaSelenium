package com.crm.practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataXML {

	@Test
	public void ReadDataFromXML(XmlTest xmlob) {
		System.out.println(xmlob.getParameter("browser"));
		
		
	}
	
}
