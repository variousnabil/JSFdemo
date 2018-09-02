package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Mahasiswa {
	
	private String nama,alamat,email;
	
	public String getNama() {
		return nama;
	}



	public void setNama(String nama) {
		this.nama = nama;
	}



	public String getAlamat() {
		return alamat;
	}



	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Mahasiswa() {
		
	}
	
}
