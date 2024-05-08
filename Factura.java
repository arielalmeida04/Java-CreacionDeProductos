package tp02Prog3;

import java.util.ArrayList;
import java.util.List;

public class Factura<T> {
	private double montoTotal = 0.0;
	private List<T> listamodificadores = new ArrayList<T>();
	private List<itemProducto> ListaProducto = new ArrayList<itemProducto>();

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public List<itemProducto> getListaProducto() {
		return ListaProducto;
	}

	public void setListaProducto(List<itemProducto> listaProducto) {
		ListaProducto = listaProducto;
	}

	public List<T> getListamodificadores() {
		return listamodificadores;
	}

	
	}


