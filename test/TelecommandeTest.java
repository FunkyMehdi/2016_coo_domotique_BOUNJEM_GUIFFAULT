import fr.ul.Lampe;
import fr.ul.Telecommande;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {
    @Test
    /**
     * test ajout lampe avec telecommande vide
     */
    public void test_ajoutlampe_televide(){
        // preparation des donnees
        Lampe l = new Lampe("Lampe");
        Telecommande telecommande = new Telecommande();

        //methode testee
        telecommande.ajouterLampe(new Lampe("Lampe"));

        // verification
        assertEquals(l, telecommande.getLampes().get(0), "Il devrait y avoir une lampe");
    }

    @Test
    /**
     * test ajout lampe avec un element
     */
    public void test_ajoutLampe_teleavecunelement(){
        // preparation des donnees
        Lampe l = new Lampe("Lampe1");
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterLampe(l);

        //methode testee
        Lampe ll = new Lampe("Lampe2");
        telecommande.ajouterLampe(new Lampe("Lampe2"));

        // verification
        assertEquals(ll, telecommande.getLampes().get(1), "Il devrait y avoir une lampe");
    }

    @Test
    /**
     * test activer premiere lampe
     */
    public void test_activer_Lampe_existante_P0(){
        // preparation des donnees
        Lampe l = new Lampe("Lampe");
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterLampe(l);

        //methode testee
        telecommande.activerLampe(0);

        // verification
        assertTrue(telecommande.getLampes().get(0).isAllume(), "La lampe devrait etre allumé");
    }

    @Test
    /**
     * test activer deuxieme lampe
     */
    public void test_activer_Lampe_existante_P1(){
        // preparation des donnees
        Lampe l = new Lampe("lampe");
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterLampe(l);
        telecommande.activerLampe(0);

        //methode testee
        Lampe ll = new Lampe("lampe2");
        telecommande.ajouterLampe(ll);
        telecommande.activerLampe(1);

        // verification
        assertTrue(telecommande.getLampes().get(1).isAllume(), "La lampe devrait etre allumé");
    }

    @Test
    /**
     * test activer lampe inexistante
     */
    public void testLampeinnexistante(){
        // preparation des donnees
        Telecommande telecommande = new Telecommande();


        // verification
        assertThrows(IndexOutOfBoundsException.class, ()->telecommande.activerLampe(0), "La lampe ne doit pas exister");
    }

}
