package tp02Prog3;

public class BillDiscount extends Modificador {


protected float montoFijo;


Factura<Modificador> factura;
	
	
	
public BillDiscount(String nombreDescuento, float porcentaje, float montoFijo,Factura<Modificador> factura) {
	super(nombreDescuento, porcentaje);
	this.montoFijo=montoFijo;
	this.factura=factura;
}


	@Override
	public double applayProductDiscount() {
		
		return 0;
	}

	@Override
	public double applayBillDiscount() {
		double porcentaje = factura.getMontoTotal()*this.porcentaje;
		double descuento = montoFijo+porcentaje;
		System.out.println(this.getNombreDescuento()+" monto fijo: "+(-montoFijo)+"\n"+this.porcentaje*100+"% de descuento: "+porcentaje);
		return descuento;
	}

}
