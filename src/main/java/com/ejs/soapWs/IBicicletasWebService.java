package com.ejs.soapWs;

import java.util.List;

import com.ejs.soapWs.dto.Bicicleta;

public interface IBicicletasWebService {
	public String getBicicletasXML();
	public List<Bicicleta> getBicicletas();
	public Bicicleta getBicicleta();
}
