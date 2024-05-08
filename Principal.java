package tp02Prog3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caso01();
		Caso02();
		Caso03();
		Caso04();
	}

	public static void Caso01() {
		Factura<Modificador> factura = new Factura<>();

	    itemProducto producto1 = new itemProducto("Bicicleta", 780000, 0.21f, 1); 
	    itemProducto producto2 = new itemProducto("Vaporera", 94000, 0.105F, 3);
	    
	    ProductDiscount descuento1 = new ProductDiscount("Samsung", 0.05f, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("Noblex", 0.03F, producto2);
	    BillDiscount descuento3 = new BillDiscount("Black Friday", 0, 10000f, factura);
	    
	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListamodificadores().add(descuento1); 
	    factura.getListamodificadores().add(descuento2);
	    factura.getListamodificadores().add(descuento3);

	    double total = new Calculador<Modificador>().CalcularMontoTotal(factura);
	    
	    JOptionPane.showMessageDialog(null, "Total caso 1: $" + String.format("%.2f", total));
	}

	public static void Caso02() {
	    Factura<Modificador> factura = new Factura<>();

	    itemProducto producto1 = new itemProducto("Teléfono", 1200000, 0.15f, 2); 
	    itemProducto producto2 = new itemProducto("Laptop", 2500000, 0.1F, 1);
	    
	    ProductDiscount descuento1 = new ProductDiscount("Apple", 0.1f, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("Lenovo", 0.05F, producto2);
	    BillDiscount descuento3 = new BillDiscount("Cyber Monday", 0, 50000f, factura);
	    
	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListamodificadores().add(descuento1); 
	    factura.getListamodificadores().add(descuento2);
	    factura.getListamodificadores().add(descuento3);

	    double total = new Calculador<Modificador>().CalcularMontoTotal(factura);
	    
	    JOptionPane.showMessageDialog(null, "Total caso 2: $" + String.format("%.2f", total));
	}


	public static void Caso03() {
	    Factura<Modificador> factura = new Factura<>();

	    itemProducto producto1 = new itemProducto("Refrigeradora", 1500000, 0.18f, 1); 
	    itemProducto producto2 = new itemProducto("Microondas", 800000, 0.12F, 2);
	    
	    ProductDiscount descuento1 = new ProductDiscount("LG", 0.07f, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("Samsung", 0.05F, producto2);
	    BillDiscount descuento3 = new BillDiscount("Fin de Mes", 0.02F, 30000f, factura);
	    
	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListamodificadores().add(descuento1); 
	    factura.getListamodificadores().add(descuento2);
	    factura.getListamodificadores().add(descuento3);

	    double total = new Calculador<Modificador>().CalcularMontoTotal(factura);
	    
	    JOptionPane.showMessageDialog(null, "Total caso 3: $" + String.format("%.2f", total));
	}

	public static void Caso04() {
	    Factura<Modificador> factura = new Factura<>();

	    itemProducto producto1 = new itemProducto("TV LED", 2000000, 0.2f, 1); 
	    itemProducto producto2 = new itemProducto("DVD Player", 120000, 0.1F, 1);
	    
	    ProductDiscount descuento1 = new ProductDiscount("Sony", 0.1f, producto1);
	    ProductDiscount descuento2 = new ProductDiscount("Panasonic", 0.05F, producto2);
	    BillDiscount descuento3 = new BillDiscount("Oferta Especial", 0, 15000f, factura);
	    
	    factura.getListaProducto().add(producto1);
	    factura.getListaProducto().add(producto2);
	    factura.getListamodificadores().add(descuento1); 
	    factura.getListamodificadores().add(descuento2);
	    factura.getListamodificadores().add(descuento3);

	    double total = new Calculador<Modificador>().CalcularMontoTotal(factura);
	    
	    JOptionPane.showMessageDialog(null, "Total caso 4: $" + String.format("%.2f", total));
	}
}

