package com.ejs.soapWs;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ejs.soapWs.dto.Bicicleta;
import com.ejs.soapWs.servicios.GestionServicio;
import com.ejs.soapWs.util.XmlUtil;

@WebService
public class BicicletasWebService implements IBicicletasWebService {

	// DI via Spring
	GestionServicio gestionServicio;

	@WebMethod(operationName = "getBicicleta")
	public Bicicleta getBicicleta() {

		try {
			return gestionServicio.getBicicleta();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	@WebMethod(operationName = "getBicicletas")
	public List<Bicicleta> getBicicletas() {

		try {
			List<Bicicleta> bicis = new ArrayList<Bicicleta>();
			bicis.add(gestionServicio.getBicicleta());
			bicis.add(gestionServicio.getBicicleta());
			bicis.add(gestionServicio.getBicicleta());
			return bicis;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	@WebMethod(operationName = "getBicicletasXML")
	public String getBicicletasXML() {

		try {
			return XmlUtil.serializarConJAXB(gestionServicio.getBicicleta());

		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR";
		}

	}



	@WebMethod(exclude = true)
	public void setGestionServicio(GestionServicio gestionServicio) {
		this.gestionServicio = gestionServicio;
	}

}
