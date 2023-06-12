package cours.apprentissage.gestionproduit.business.categorie;

import java.util.List;

public interface ICategorie {
    Categorie save(Categorie categorie);

    List<Categorie> allCategorie();
}
