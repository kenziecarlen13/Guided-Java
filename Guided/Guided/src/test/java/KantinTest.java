import org.example.KantinSystem;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class KantinTest {
    KantinSystem kantin = new KantinSystem();
    private static int totalScore = 0;

    @BeforeAll
    static void setup() {
        totalScore = 0;
    }

    @Test
    @Order(1)
    void testPesananGoib() {
        String[] order = {"Sate Ayam", "Es Jeruk"};
        int result = kantin.hitungTotal(order);

        if (result == 5000) {
            totalScore += 20;
            System.out.println("Test (Pesanan Goib): PASSED (+20)");
        } else {
            System.out.println("Test (Pesanan Goib): FAILED (Expected 5000, but got " + result + ")");
        }
        assertEquals(5000, result);
    }

    @Test
    @Order(2)
    void testSatuPesanan() {
        String[] order = {"Es Jeruk"};
        int result = kantin.hitungTotal(order);

        if (result == 5000) {
            totalScore += 20;
            System.out.println("Test (Satu Pesanan): PASSED (+20)");
        } else {
            System.out.println("Test (Satu Pesanan): FAILED");
        }
        assertEquals(5000, result);
    }

    @Test
    @Order(3)
    void testDuaPesanan() {
        String[] order = {"Ayam Geprek", "Ayam Geprek"};
        int result = kantin.hitungTotal(order);

        if (result == 25000) {
            totalScore += 20;
            System.out.println("Test (Dua Pesanan): PASSED (+20)");
        } else {
            System.out.println("Test (Dua Pesanan): FAILED");
        }
        assertEquals(25000, result);
    }

    @Test
    @Order(4)
    void testTigaPesananTanpaDiskon() {
        String[] order = {"Ayam Geprek", "Es Jeruk", "Es Jeruk"};
        int result = kantin.hitungTotal(order);

        if (result == 25000) {
            totalScore += 20;
            System.out.println("Test (Tiga Pesanan): PASSED (+20)");
        } else {
            System.out.println("Test (Tiga Pesanan): FAILED");
        }
        assertEquals(25000, result);
    }

    @Test
    @Order(5)
    void testPesananDapatDiskon() {
        String[] order = {"Ayam Geprek", "Ayam Geprek", "Mie Instan"};
        int result = kantin.hitungTotal(order);

        if (result == 35000) {
            totalScore += 20;
            System.out.println("Test (Pesanan Kompleks): PASSED (+20)");
        } else {
            System.out.println("Test (Pesanan Kompleks): FAILED");
        }
        assertEquals(35000, result);
    }

    @AfterAll
    static void tearDown() {
        System.out.println("-----------------------------------");
        System.out.println("TOTAL SKOR AKHIR: " + totalScore + "/100");
        System.out.println("-----------------------------------");
    }
}