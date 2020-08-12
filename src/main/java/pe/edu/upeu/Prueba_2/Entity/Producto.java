package pe.edu.upeu.Prueba_2.Entity;

public class Producto {
	private int idProd;
	private String codprod;
	private String nomProducto;
	private int precio;
	private String familia;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(int idProd, String codprod, String nomProducto, int precio, String familia) {
		super();
		this.idProd = idProd;
		this.codprod = codprod;
		this.nomProducto = nomProducto;
		this.precio = precio;
		this.familia = familia;
	}
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	public String getCodprod() {
		return codprod;
	}
	public void setCodprod(String codprod) {
		this.codprod = codprod;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	

}
