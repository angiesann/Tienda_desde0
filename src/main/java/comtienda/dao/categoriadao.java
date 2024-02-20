
package comtienda.dao;

import comtienda.dominio.categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface categoriadao extends JpaRepository<categoria, Long> {
    
}
