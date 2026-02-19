# Latihan 01: Algoritma Deteksi Palindrome

Repositori ini berisi tugas praktikum untuk mengasah logika manipulasi `String`, penggunaan perulangan, dan pemahaman struktur kontrol dasar di Java.

## Deskripsi Masalah

Tugas Anda adalah melengkapi logika di dalam metode `isPalindrome` pada class `PalindromeChecker.java`. Metode ini bertujuan untuk menentukan apakah sebuah teks merupakan **Palindrome** atau bukan.

> **Definisi:** Palindrome adalah kata, frasa, atau angka yang dibaca sama baik dari depan maupun dari belakang (contoh: *radar*, *malam*, *level*).

---

## Spesifikasi Implementasi

Isilah blok `//TO DO:` pada metode `isPalindrome` dengan memenuhi kriteria berikut:

1.  **Validasi Input:**
    * Tangani kondisi jika input bernilai `null`. Jika `null`, kembalikan nilai `false`.
2.  **Normalisasi String:**
    * Pengecekan harus bersifat **Case Insensitive** (tidak membedakan huruf besar dan kecil).
    * Abaikan semua karakter non-alfanumerik (termasuk spasi dan tanda baca). Contoh: `"Kasur ini rusak"` harus dideteksi sebagai palindrome yang valid.
3.  **Algoritma:**
    * Gunakan struktur perulangan (`for` atau `while`).
    * Sangat disarankan menggunakan teknik **Two Pointers** (membandingkan karakter dari kedua ujung ke arah tengah) untuk efisiensi performa.



---

## Batasan (Constraints)

Untuk melatih logika algoritma murni, Anda **DILARANG** menggunakan fitur berikut:
* `StringBuilder.reverse()` atau `StringBuffer.reverse()`.
* Library eksternal di luar JUnit untuk keperluan logika utama.
* Konversi otomatis yang terlalu instan (sangat disarankan menggunakan manipulasi karakter manual/ASCII).

---

## Cara Menjalankan Tes & Penilaian

Proyek ini telah dikonfigurasi dengan sistem penilaian otomatis menggunakan JUnit 5. Untuk melihat skor Anda:

1.  Buka file `src/test/java/org/example/PalindromeCheckerTest.java`.
2.  Klik kanan pada file atau metode tes, lalu pilih **Run 'PalindromeCheckerTest'**.
3.  Lihat tab **Console** di IntelliJ IDEA untuk melihat rincian nilai Anda.

### Tabel Skor Penilaian

| Kategori | Skenario Uji | Bobot Skor |
| :--- | :--- | :--- |
| **Basic** | Kata palindrome sederhana (malam, radar) | 30 |
| **Complex** | Kalimat dengan spasi & kapital (Kasur ini rusak) | 40 |
| **Accuracy** | Deteksi kata yang bukan palindrome | 30 |
| **Total** | | **100** |

---

## Struktur Proyek
```text
Soal1/
├── src/
│   ├── main/java/org/example/PalindromeChecker.java  <-- [Kerjakan di sini]
│   └── test/java/org/example/PalindromeCheckerTest.java <-- [Jangan diubah]
└── pom.xml