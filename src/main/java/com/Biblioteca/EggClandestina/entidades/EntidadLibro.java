
package com.Biblioteca.EggClandestina.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class EntidadLibro {
   @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private Long isbn;
    private String titulo;
    private Integer anio;
    private Integer emplares;
    private Integer emplaresPrestados;
    private Integer emplaresRestantes;
    private Boolean alta;
    
    private EntidadAutor autor;
    
     private EntidadEditorial editorial;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEmplares() {
        return emplares;
    }

    public void setEmplares(Integer emplares) {
        this.emplares = emplares;
    }

    public Integer getEmplaresPrestados() {
        return emplaresPrestados;
    }

    public void setEmplaresPrestados(Integer emplaresPrestados) {
        this.emplaresPrestados = emplaresPrestados;
    }

    public Integer getEmplaresRestantes() {
        return emplaresRestantes;
    }

    public void setEmplaresRestantes(Integer emplaresRestantes) {
        this.emplaresRestantes = emplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public EntidadAutor getAutor() {
        return autor;
    }

    public void setAutor(EntidadAutor autor) {
        this.autor = autor;
    }

    public EntidadEditorial getEditorial() {
        return editorial;
    }

    public void setEditorial(EntidadEditorial editorial) {
        this.editorial = editorial;
    }
}
