package cours.apprentissage.gestionproduit.business.categorie;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CategorieImpl implements ICategorie {
    private final CategorieRepository categorieRepository;

    public CategorieImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public Categorie save(Categorie categorie) {
        return categorieRepository.save(categorie);
    }
    @Override
    public List<Categorie>allCategorie(){
        return categorieRepository.findAll();
    }
}
