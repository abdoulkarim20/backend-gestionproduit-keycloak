package cours.apprentissage.gestionproduit.business.categorie;

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
    public Categorie save(@RequestBody Categorie categorie){
        return iCategorie.save(categorie);
    }
    @GetMapping("")
    public List<Categorie>all(){
        return iCategorie.allCategorie();
    }
}
