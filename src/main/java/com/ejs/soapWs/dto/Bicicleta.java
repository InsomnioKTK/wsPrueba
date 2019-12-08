package com.ejs.soapWs.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="bicicleta")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bicicleta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name="idBicicleta")
	private int id;

	@XmlElement
	private String marca = "";

	@XmlElement
	private String modelo = "";

	@XmlElement(name="fecha")
	private Date fechaSalidaMercado;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFechaSalidaMercado() {
		return fechaSalidaMercado;
	}

	public void setFechaSalidaMercado(Date fechaSalidaMercado) {
		this.fechaSalidaMercado = fechaSalidaMercado;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", modelo=" + modelo + ", fechaSalidaMercado=" + fechaSalidaMercado + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
