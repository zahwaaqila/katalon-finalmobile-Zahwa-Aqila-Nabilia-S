# katalon-finalmobile-Zahwa-Aqila-Nabilia-S
final project testing mobile with katalon studio and android studio

# Testing Mobile dengan Katalon Studio

## Test Case Collection: Login dan Register

### Test Case: Login

#### Test Case 1: Login-Berhasil
- Deskripsi: Memastikan pengguna dapat login dengan sukses menggunakan kredensial yang valid.
- Data Driven Testing:
  - Data internal dengan dua set kredensial:
    - Username: user1, Password: pass123
    - Username: user2, Password: pass456
- Langkah-langkah:
  1. Buka aplikasi.
  2. Masukkan username dan password dari dataset.
  3. Klik tombol login.
- Hasil yang diharapkan: Pengguna harus berhasil login.

#### Test Case 2: Login-Gagal
- Deskripsi: Memastikan aplikasi menampilkan pesan kesalahan saat login dengan kredensial yang salah.
- Langkah-langkah:
  1. Buka aplikasi.
  2. Masukkan username dan password yang salah.
  3. Klik tombol login.
- Hasil yang diharapkan: Aplikasi harus menampilkan pesan kesalahan untuk login yang gagal.

### Test Case: Register

#### Test Case 3: Register-Berhasil
- Deskripsi: Memastikan pengguna dapat mendaftar dengan sukses menggunakan kredensial unik.
- Pengujian Kondisional:
  - Menggunakan kondisi IF-ELSE untuk menangani skenario ketika pendaftaran berhasil.
- Pengulangan:
  - Menggunakan loop untuk mengiterasi melalui daftar username untuk registrasi.
- Langkah-langkah:
  1. Buka aplikasi.
  2. Beralih ke layar registrasi.
  3. Masukkan username unik dan detail registrasi valid.
  4. Klik tombol registrasi.
- Hasil yang diharapkan: Pengguna harus berhasil terdaftar.

#### Test Case 4: Register-Username Already Exist
- Deskripsi: Memastikan aplikasi menangani skenario ketika mencoba mendaftar dengan username yang sudah ada.
- Pengujian Kondisional:
  - Menggunakan kondisi IF-ELSE untuk menangani skenario ketika username sudah ada.
- Pengulangan:
  - Menggunakan loop untuk mengiterasi melalui daftar username yang sudah ada untuk registrasi.
- Langkah-langkah:
  1. Buka aplikasi.
  2. Beralih ke layar registrasi.
  3. Masukkan username yang sudah ada.
  4. Masukkan detail registrasi valid.
  5. Klik tombol registrasi.
- Hasil yang diharapkan: Aplikasi harus menampilkan pesan kesalahan untuk username yang sudah ada.

### Testing Environment Details

- **Perangkat yang Digunakan:** Emulator Android di Android Studio
- **Data Driven Testing:** Data internal digunakan untuk pengujian.
- **Pengujian Kondisional:** Kondisi IF-ELSE digunakan untuk menangani skenario berbeda.
- **Pengulangan:** Loop digunakan untuk mengiterasi melalui beberapa kasus pengujian.

### Report 

- **Video Laporan:** [Video Eksekusi Tes](https://github.com/zahwaaqila/katalon-finalmobile-Zahwa-Aqila-Nabilia-S.git)
- **Repositori Git:** [Repositori GitHub](https://github.com/zahwaaqila/katalon-finalmobile-Zahwa-Aqila-Nabilia-S.git)

