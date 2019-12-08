package com.ejs.soapWs.servicios.impl;

import java.util.Date;

import com.ejs.soapWs.dto.Bicicleta;
import com.ejs.soapWs.servicios.GestionServicio;

public class GestionServicioImpl implements GestionServicio{

	public Bicicleta getBicicleta() {
		Bicicleta bici = new Bicicleta();
		bici.setId(1);
		bici.setMarca("Orbea");
		bici.setModelo("Orca");
		bici.setFechaSalidaMercado(new Date());
		return bici;
	}

}
