package modelo;

import java.util.List;

public class Gastos {
	private int idGasto;
	private String tipoGasto;
	private List<String> tiposGastos;
	private double valorGasto;
	private String descricaoGasto; 
	public Gastos(String tipoGasto,List<String> tiposGastos, double valorGasto, String descricaoGasto ) {
		this.setTipoGasto(tipoGasto);
		this.setTiposGastos(tiposGastos);
		this.setDescricaoGasto(descricaoGasto);
		this.setValorGasto(valorGasto);
		
	}
	public int getIdGasto() {
		return idGasto;
	}
	public void setIdGasto(int idGasto) {
		this.idGasto = idGasto;
	}
	public String getTipoGasto() {
		return tipoGasto;
	}
	public void setTipoGasto(String tipoGasto) {
		this.tipoGasto = tipoGasto;
	}
	public List<String> getTiposGastos() {
		return tiposGastos;
	}
	public void setTiposGastos(List<String> tiposGastos) {
		this.tiposGastos = tiposGastos;
	}
	public double getValorGasto() {
		return valorGasto;
	}
	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}
	public String getDescricaoGasto() {
		return descricaoGasto;
	}
	public void setDescricaoGasto(String descricaoGasto) {
		this.descricaoGasto = descricaoGasto;
	}
	
}
