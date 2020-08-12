package pe.edu.upeu.Prueba_2.Entity;

public class Users {
	private int idusuario;
	private String nomuser;
	private String clave;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int idusuario, String nomuser, String clave) {
		super();
		this.idusuario = idusuario;
		this.nomuser = nomuser;
		this.clave = clave;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomuser() {
		return nomuser;
	}
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
