package com.cursoceat.modell;

public class Libros {

	private static int idGeneral;
	private int idL;
	private String nombreL;
	private String autorL;
	private String isbnL;
	private String sinopsisL;
	private int cantidadL;
	
	public Libros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libros(String nombreL, String autorL, int cantidadL, String isbnL, String sinopsisL) {
		this.idL = ++idGeneral;
		this.nombreL = nombreL;
		this.autorL = autorL;
		this.cantidadL = cantidadL;
		this.isbnL = isbnL;
		this.sinopsisL = sinopsisL;
	}
	public int getIdL() {
		return idL;
	}
	public void setIdL(int idL) {
		this.idL = idL;
	}
	public String getNombreL() {
		return nombreL;
	}
	public void setNombreL(String nombreL) {
		this.nombreL = nombreL;
	}
	public String getAutorL() {
		return autorL;
	}
	public void setAutorL(String autorL) {
		this.autorL = autorL;
	}
	public String getIsbnL() {
		return isbnL;
	}
	public void setIsbnL(String isbnL) {
		this.isbnL = isbnL;
	}
	public int getCantidadL() {
		return cantidadL;
	}
	public void setCantidadL(int cantidadL) {
		this.cantidadL = cantidadL;
	}
	public String getSinopsisL() {
		return sinopsisL;
	}
	public void setSinopsisL(String sinonpsisL) {
		this.sinopsisL = sinonpsisL;
	}
	@Override
	public String toString() {
		return "Libros [nombreL=" + nombreL + ", autorL=" + autorL + ", isbnL=" + isbnL + ", cantidadL=" + cantidadL
				+ "]";
	}
	
}
