import static org.junit.Assert.*;

public class LoenKontoTest {
    @org.junit.Test
    public void setSaldo() throws Exception {

        LoenKonto konto = new LoenKonto();

        konto.setSaldo(99.9995);

        double resultat = konto.getSaldo();
        assertEquals(100.0, resultat, 0.001);
    }
}