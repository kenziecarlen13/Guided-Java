# Praktikum RPLBO: Sistem Kantin Digital

Selesaikan logika perhitungan kasir pada file `KantinSystem.java` berdasarkan aturan bisnis yang telah ditentukan di bawah ini.

## Aturan

1. **Daftar Harga**:

    - "Ayam Geprek" : 15.000

    - "Mie Instan"  : 10.000

    - "Es Jeruk"    : 5.000

    - Menu lain     : 0

2. **Logika Diskon**:

   Jika total akumulasi belanja mencapai **30.000 atau lebih**, berikan potongan harga sebesar **5.000**.

## Panduan Sintaks

Gunakan referensi berikut untuk memproses data:

* **Akses Array**: `for (String item : pesanan) { ... }`

* **Perbandingan String**: `switch (item) { ... }` atau `if (item.equals("..."))`

* **Operasi Pengurangan**: `total -= 5000;`

## Prosedur Penilaian

Sistem penilaian dilakukan secara otomatis menggunakan JUnit. Ikuti langkah berikut:

1. Buka file **`KantinTest.java`**.

2. Klik kanan pada editor dan pilih **Run 'KantinTest'**.

3. Skor akhir dalam format $n/100$ akan ditampilkan pada bagian **Console** IntelliJ IDEA.



> **Peringatan**: Java bersifat *Case-Sensitive*. Ketidaksesuaian penulisan huruf kapital pada nama menu akan menyebabkan kegagalan pada unit test.
