
package comtienda.controler;

import com.tienda.service.CategoriaService;
import comtienda.dominio.categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class categoriaController {
    
    @Autowired
    CategoriaService categoriaService;
    
    @GetMapping("/Listado")
    public String page(Model model) {
        List<categoria>lista = categoriaService=getCategorias(false);
        model.addAttribute("categoria"lista);
        return "/categoria/Listad";
    }
    
}
