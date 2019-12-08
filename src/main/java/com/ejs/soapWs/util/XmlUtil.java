package com.ejs.soapWs.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.parsers.ParserConfigurationException;

public class XmlUtil {
	
	public static String serializarConJAXB(Object objeto)
			throws ParserConfigurationException, JAXBException, PropertyException {

		JAXBContext jaxbContext = JAXBContext.newInstance(objeto.getClass());
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		StringWriter sw = new StringWriter();
		m.marshal(objeto, sw);

		return sw.toString();
	}
}
