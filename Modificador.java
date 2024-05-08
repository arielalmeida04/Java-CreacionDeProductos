package tp02Prog3;

public abstract class Modificador {
	protected String nombreDescuento;
	protected float porcentaje;

	public String getNombreDescuento() {
		return nombreDescuento;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public Modificador(String nombreDescuento, float porcentaje) {
		super();
		this.nombreDescuento = nombreDescuento;
		this.porcentaje = porcentaje;
	}

	public abstract double applayProductDiscount();

	public abstract double applayBillDiscount();
}
