package tp02Prog3;

import java.util.List;

public class Calculador<M extends Modificador> {
	
	public double CalcularMontoTotal(Factura<M> factura) {
		factura = CacularTotalFactura(factura);
		factura = CalcularDescuentoTotalPorProductos(factura);
		factura = calcularDescuentoTotalPorFactura(factura);
		
		
		return factura.getMontoTotal();
	}
	
	public Factura<M> CacularTotalFactura(Factura<M> factura){
		float total= 0.00f;
		for(itemProducto item: factura.getListaProducto()) {
			
					total+=item.CalcularTotal();
		}
		factura.setMontoTotal(total);
			
		return factura;	
		
	}
	
	public Factura<M> CalcularDescuentoTotalPorProductos(Factura<M> fac){
		float totalDescuento=0;
		for(M modificador: fac.getListamodificadores()) {
			totalDescuento += modificador.applayProductDiscount();
		}
		fac.setMontoTotal(totalDescuento);
		return fac;
	}
	
	public Factura<M> calcularDescuentoTotalPorFactura(Factura<M> fac){
		float totalDescuento=0;
		for(M modificador: fac.getListamodificadores()) {
			totalDescuento += modificador.applayBillDiscount();
		}
		fac.setMontoTotal(fac.getMontoTotal()-totalDescuento);
		return fac;
	}
	
	
    public double calcularMontoTotales(List<itemProducto> lista) {
    	double total = 0;
    	for(itemProducto p : lista) {
    		total += p.CalcularTotal();
    	}
    	
    	return total;
    }
}
