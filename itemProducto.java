package tp02Prog3;

public class itemProducto {
String Nombre;
float Precio;
float Impuesto;
int Cantidad;
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public float getPrecio() {
	return Precio;
}
public void setPrecio(float precio) {
	Precio = precio;
}
public float getImpuesto() {
	return Impuesto;
}
public void setImpuesto(float impuesto) {
	Impuesto = impuesto;
}
public int getCantidad() {
	return Cantidad;
}
public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}
public itemProducto(String nombre, float precio, float impuesto, int cantidad) {
	super();
	Nombre = nombre;
	Precio = precio;
	Impuesto = impuesto;
	Cantidad = cantidad;
}
public float CalcularTotal() {
	return (Cantidad*Precio)+((Cantidad*Precio)*(Impuesto/100));
}


}
