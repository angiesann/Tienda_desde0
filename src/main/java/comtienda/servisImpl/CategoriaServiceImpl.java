

package comtienda.servisImpl;
import com.tienda.service.CategoriaService;
import comtienda.dao.categoriadao;
import comtienda.dominio.categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class CategoriaServiceImpl extends CategoriaService{
    @Autowired
    private categoriadao categoriaDao;

    @Transactional(readOnly = true) 
    public List<categoria> getcategorias(boolean activos) {
        List <categoria> lista = categoriaDao.findAll();
        
        if (activos) {
            //Remover los elementos inactivos
            lista.removeIf(c -> !c.isActivo());
        }
        
        
        return lista;
    }
    
}