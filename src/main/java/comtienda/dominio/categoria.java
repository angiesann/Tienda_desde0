
package comtienda.dominio;

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
public class categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    
    private Long idCtegoria;
    private String descripcion;
    private String rutaimagen;
    private boolean activo;
    
    
    public categoria(){
    
        
    } 
     public categoria( String descripcion,String rutaimagen, boolean activo){
    this.descripcion =  descripcion ;
    this.rutaimagen =  rutaimagen ;
    this.activo =  activo ;
    
 
        
    } 
    
    
    }
         
