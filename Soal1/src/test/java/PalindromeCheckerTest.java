//package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.PalindromeChecker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

class PalindromeCheckerTest {

    private static int totalSkor = 0;

    @BeforeAll
    static void setup() {
        totalSkor = 0;
        System.out.println("=== Memulai Penilaian Otomatis Palindrome ===\n");
    }

    @Test
    @DisplayName("Test 1: Palindrome Standar (Skor: 30)")
    void testStandardPalindrome() {
        try {
            assertTrue(PalindromeChecker.isPalindrome("malam"));
            assertTrue(PalindromeChecker.isPalindrome("radar"));
            totalSkor += 30;
            System.out.println("[LULUS] Test 1: Palindrome Standar (+30)");
        } catch (AssertionError e) {
            System.out.println("[GAGAL] Test 1: Palindrome Standar (+0)");
            throw e;
        }
    }

    @Test
    @DisplayName("Test 2: Kasus Kompleks - Spasi & Kapital (Skor: 40)")
    void testComplexPalindrome() {
        try {
            assertTrue(PalindromeChecker.isPalindrome("Kasur ini rusak"));
            assertTrue(PalindromeChecker.isPalindrome("Step on no pets"));
            totalSkor += 40;
            System.out.println("[LULUS] Test 2: Kasus Kompleks (+40)");
        } catch (AssertionError e) {
            System.out.println("[GAGAL] Test 2: Kasus Kompleks (+0)");
            throw e;
        }
    }

    @Test
    @DisplayName("Test 3: Bukan Palindrome (Skor: 30)")
    void testNotPalindrome() {
        try {
            assertFalse(PalindromeChecker.isPalindrome("kenzieAsdosGeram"));
            assertFalse(PalindromeChecker.isPalindrome("Javaprogramming"));
            assertFalse(PalindromeChecker.isPalindrome("PakAntonCikguBesar"));
            totalSkor += 30;
            System.out.println("[LULUS] Test 3: Bukan Palindrome (+30)");
        } catch (AssertionError e) {
            System.out.println("[GAGAL] Test 3: Bukan Palindrome (+0)");
            throw e;
        }
    }

    @AfterAll
    static void cetakNilai() {
        System.out.println("TOTAL NILAI : " + totalSkor + " / 100");
    }
}