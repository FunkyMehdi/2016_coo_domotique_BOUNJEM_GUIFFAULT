import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelecommandeTest {
    @Test
    public void test_ajoutlampe_televide(){
        Lampe l = new Lampe("firstLampe");
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterLampe(l);

        assertEquals("La lampe doit etre ajouter dans la nouvelle telecommande", telecommande, );
    }
}
