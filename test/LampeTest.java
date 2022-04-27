import fr.ul.Lampe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Lampe
 */
public class LampeTest {

	/**
	 * test du constructeur de lampe
	 */
	@Test
	public void testLampe() {
		// methode testee
		Lampe l = new Lampe("lampe1");

		// verification
		boolean res = l.isAllume();
		assertFalse(res, "Une nouvelle lampe devrait être eteinte.");
	}



	/**
	 * test allumer une lampe éteinte
	 */
	@Test
	public void testAllumer() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertTrue(res, "Après allumer, la lampe devrait être allumée.");
	}

	@Test
	/**
	 * test allumer une lampe allumée
	 */
	public void testAllumer_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertTrue(res,"Après allumer, la lampe devrait être allumée");
	}

	@Test
	/**
	 * test éteindre une lampe allumée
	 */
	public void testeteindre_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		l.eteindre();

		// verification
		boolean res = l.isAllume();
		assertFalse(res,"Après éteindre, la lampe devrait être éteinte.");
	}

	@Test
	/**
	 * test to String lampe éteinte
	 */
	public void testToString_eteinte() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1: Off",r,"L'affichage devrait être off.");
	}

	@Test
	/**
	 * test to String lampe allumée
	 */
	public void testToString_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1: On",r,"L'affichage devrait être off.");

	}

}
