
public class Cotxe {
	String marca;
	String model;
	int cilindrada;
	int cilindres;
	double potenciaFiscal;

	public Cotxe(String marca, String model, int cilindrada, int cilindres) {
		this.marca = marca;
		this.model = model;
		this.cilindrada = cilindrada;
		this.cilindres = cilindres;
		this.potenciaFiscal = calculaPotFis();
	}

	public Cotxe() {
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCilindres() {
		return cilindres;
	}

	public void setCilindres(int cilindres) {
		this.cilindres = cilindrada;
	}

	public double getPotenciaFiscal() {
		return potenciaFiscal;
	}

	public void setPotenciaFiscal(double potenciaFiscal) {
		this.potenciaFiscal = this.calculaPotFis();
	}

	public double calculaPotFis() {
		return (0.08 * this.cilindres * Math.pow((this.cilindrada / this.cilindres), 0.6));
	}
}
