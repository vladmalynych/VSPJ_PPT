import junit.framework.TestCase;

import java.time.LocalDateTime;

public class Faktura_bez_kompoziciTest extends TestCase {

    public void testToString() {
        Faktura_bez_kompozici faktura = new Faktura_bez_kompozici("123",
                LocalDateTime.of(2020,01,01,01,01),
                LocalDateTime.of(2020,01,01,01,01),
                "Name", "Surname", "Street", "City",
                "PSC", "111", "email",
                3000, 3450,
                "czk",5000);

        String expected = "Faktura_bez_kompozici{cislo_dokladu='123', datum_vystaveni=2020-01-01T01:01," +
                " datum_splatnosti=2020-01-01T01:01, prijemce_jmeno='Name', prijemce_prijmeni='Surname'," +
                " prijemce_ulice='Street', prijemce_mesto='City', prijemce_psc='PSC', prijemce_telefon='111', " +
                "prijemce_email='email', doklad_cena_bez_dph=3000.0, doklad_cena_s_dph=3450.0," +
                " doklad_sazba_zkratka='czk', docker_sazba_hodnota=5000.0}";

        assertEquals(expected, faktura.toString());
    }
}