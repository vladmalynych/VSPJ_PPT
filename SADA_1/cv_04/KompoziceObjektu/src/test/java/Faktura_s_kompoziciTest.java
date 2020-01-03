import junit.framework.TestCase;

import java.time.LocalDateTime;

public class Faktura_s_kompoziciTest extends TestCase {

    public void testToString() {
        Prijemce prijemce = new Prijemce("Name", "Surname", "Street", "City", "PSC", "111", "email");
        Sazba sazba = new Sazba("czk",5000);
        CastkaDokladu castka_dokladu = new CastkaDokladu(3000,3450, sazba);
        Faktura_s_kompozici faktura = new Faktura_s_kompozici("123",
                LocalDateTime.of(2020,01,01,01,01),
                LocalDateTime.of(2020,01,01,01,01),
                prijemce, castka_dokladu);

        String expected = "Faktura_s_kompozici{cislo_dokladu='123', datum_vystaveni=2020-01-01T01:01," +
                " datum_splatnosti=2020-01-01T01:01, prijemce=Prijemce{jmeno='Name', prijmeni='Surname'," +
                " ulice='Street', Mesto='City', psc='PSC', telefon='111', email='email'}, " +
                "castka_dokladu=CastkaDokladu{castka_bez_dphl=3000.0, castka_s_dph=3450.0, " +
                "sazba=Sazba{zkratka='czk', hodnota=5000.0}}}";

        assertEquals(expected, faktura.toString());
    }
}