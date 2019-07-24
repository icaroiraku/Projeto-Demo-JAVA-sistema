/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = "Usuario")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Usuario {
	@Expose
	private String matricula;
	private String senha;
	@Expose
	private String nome;
	@Expose
	private List<String> gruposAd = new ArrayList<String>();
	@Expose
	private String lotacao;
	@Expose
	private String ip;
	private int numProcessos;
	private String Especializada;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getGruposAd() {
		return gruposAd;
	}
	public void setGruposAd(List<String> gruposAd) {
		this.gruposAd = gruposAd;
	}
	public String getLotacao() {
		return lotacao;
	}
	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = new String("Matricula: "+ getMatricula() + "\n"+ "Senha: "+ getSenha());
		return string;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Usuario){
			Usuario usuario = (Usuario) obj;
			if(this.matricula.equalsIgnoreCase(usuario.getMatricula()) )
				return true;
			else
				return false;
		
		}else{
			return false;
		}
		
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getNumProcessos() {
		return numProcessos;
	}
	public void setNumProcessos(int numProcessos) {
		this.numProcessos = numProcessos;
	}
	public String getEspecializada() {
		return Especializada;
	}
	public void setEspecializada(String especializada) {
		Especializada = especializada;
	}
	
	
	
}
