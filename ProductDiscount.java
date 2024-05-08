package tp02Prog3;

public class ProductDiscount extends Modificador {
	itemProducto refProducto;

	public ProductDiscount(String nombreDescuento, float porcentaje, itemProducto refProducto) {
		super(nombreDescuento, porcentaje);
		this.refProducto = refProducto;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double applayProductDiscount() {
		float total = 0.00f;		
		float descuento = 0.00f;
		
		descuento = refProducto.getPrecio() * refProducto.getCantidad() * getPorcentaje();
		
		System.out.println(this.refProducto.Nombre);
		System.out.println("Monto total sin descuento: $" +refProducto.CalcularTotal());	
		System.out.println("Descuento por " + getNombreDescuento() + ": $" + (-descuento ));
		total = refProducto.CalcularTotal() - descuento;
        System.out.println("Total: " + total + "\n") ;
		return descuento;
	}

	@Override
	public double applayBillDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
