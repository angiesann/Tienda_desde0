
package com.tienda.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    
    private Long idCategoria;
    private String descripcion;
    private String rutaimagen;
    private boolean activo;
    
    
    public Categoria(){
    
        
    } 
     public Categoria( String descripcion,String rutaimagen , boolean activo){
    this.descripcion =  descripcion ;
    this.rutaimagen =  rutaimagen ;
    this.activo =  activo ;
    
 
        
    } 

    public void setrutaimagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getIdCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    }
         

    
