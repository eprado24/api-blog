package com.articulo.model;
import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class Post {

	@Entity
	public class articulo {
	   
		@Id
		private Integer id;
		
		@Column
		private String titulo;
		
		@Column
		private String contenido;
		
		@Column
		private Date fecha;
		
		@Column
		private Integer estatus;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getContenido() {
			return contenido;
		}

		public void setContenido(String contenido) {
			this.contenido = contenido;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public Integer getEstatus() {
			return estatus;
		}

		public void setEstatus(Integer estatus) {
			this.estatus = estatus;
		}	
	
		
	
	
	
	}
	
	
}
