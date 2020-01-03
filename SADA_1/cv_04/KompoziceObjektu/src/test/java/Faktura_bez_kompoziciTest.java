import junit.framework.TestCase;

import java.time.LocalDateTime;

public class Faktura_bez_kompoziciTest extends TestCase {

    public void testToString() {
        Prijemce prijemce = new Prijemce("Name", "Surname", "Street", "City", "PSC", "111", "email");
        Sazba sazba = new Sazba("czk",5000);
        CastkaDokladu castka_dokladu = new CastkaDokladu(3000,3450, sazba);
        Faktura_s_kompozici faktura = new Faktura_s_kompozici("123", LocalDateTime.now(), LocalDateTime.now(), prijemce, castka_dokladu);

        System.out.println(faktura.toString());
    }
}