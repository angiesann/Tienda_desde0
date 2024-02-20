
package comtienda.server;

import comtienda.dominio.categoria;
import java.util.List;

public interface categoriaserver {
   
    public List<categoria> getCategoria(boolean activos);
}
