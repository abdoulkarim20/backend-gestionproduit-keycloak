package cours.apprentissage.gestionproduit.business.categorie;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin("*")
public class CategorieController {
    private final ICategorie iCategorie;

    public CategorieController(ICategorie iCategorie) {
        this.iCategorie = iCategorie;
    }
    @PostMapping("")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Categorie save(@RequestBody Categorie categorie){
        return iCategorie.save(categorie);
    }
    @GetMapping("")
    @PreAuthorize("hasAuthority('USER')")
    public List<Categorie>all(){
        return iCategorie.allCategorie();
    }
}
