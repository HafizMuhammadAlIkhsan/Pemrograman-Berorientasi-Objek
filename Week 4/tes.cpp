// 1. Entitas dan Atribut

// #### a. User
//    - Deskripsi: Mengelola informasi tentang pengguna sistem (donatur, admin, pemimpin panti).
//    - Atribut:
//      - User_ID (Primary Key)
//      - Nama
//      - Email
//      - Password
//      - Alamat
//      - No_Telepon
//      - Role (Donatur/Admin/Pemimpin Panti)
//      - Tanggal_Daftar

// #### b. Panti Asuhan
//    - Deskripsi: Menyimpan informasi mengenai panti asuhan.
//    - Atribut:
//      - Panti_ID (Primary Key)
//      - Nama_Panti
//      - Alamat
//      - No_Telepon
//      - Email
//      - Deskripsi_Panti
//      - Tanggal_Berdiri
//      - Jumlah_Anak_Asuh

// #### c. Anak Asuh
//    - Deskripsi: Menyimpan informasi tentang anak asuh yang ada di panti asuhan.
//    - Atribut:
//      - Anak_Asuh_ID (Primary Key)
//      - Nama
//      - Umur
//      - Status_Pendidikan
//      - Data_Pribadi (misalnya tanggal lahir, status kesehatan)
//      - Alamat
//      - Tanggal_Bergabung

// #### d. Donasi
//    - Deskripsi: Menyimpan informasi tentang donasi yang dilakukan oleh donatur.
//    - Atribut:
//      - Donasi_ID (Primary Key)
//      - User_ID (Foreign Key ke entitas User)
//      - Panti_ID (Foreign Key ke entitas Panti Asuhan)
//      - Tipe_Donasi (Uang, Barang, Jasa)
//      - Jumlah_Donasi
//      - Tanggal_Donasi
//      - Metode_Pembayaran
//      - Status_Donasi

// #### e. Riwayat Donasi
//    - Deskripsi: Menyimpan riwayat dari setiap donasi yang dilakukan.
//    - Atribut:
//      - Riwayat_ID (Primary Key)
//      - Donasi_ID (Foreign Key ke entitas Donasi)
//      - Tanggal_Riwayat
//      - Status_Donasi (Diterima, Terkirim)

// #### f. Artikel
//    - Deskripsi: Berisi artikel yang diterbitkan terkait dengan kegiatan di panti asuhan.
//    - Atribut:
//      - Artikel_ID (Primary Key)
//      - Panti_ID (Foreign Key ke entitas Panti Asuhan)
//      - Judul_Artikel
//      - Isi_Artikel
//      - Kategori_Artikel
//      - Tanggal_Terbit
//      - Penulis_ID (Foreign Key ke entitas User)

// #### g. Program Panti
//    - Deskripsi: Berisi program atau kegiatan yang dijalankan oleh panti asuhan.
//    - Atribut:
//      - Program_ID (Primary Key)
//      - Panti_ID (Foreign Key ke entitas Panti Asuhan)
//      - Nama_Program
//      - Deskripsi
//      - Tanggal_Mulai
//      - Tanggal_Selesai
//      - Status_Program (Aktif/Selesai)

// #### h. Laporan
//    - Deskripsi: Berisi laporan terkait anak asuh dan penggunaan donasi.
//    - Atribut:
//      - Laporan_ID (Primary Key)
//      - Panti_ID (Foreign Key ke entitas Panti Asuhan)
//      - Admin_ID (Foreign Key ke entitas User)
//      - Tanggal_Laporan
//      - Tipe_Laporan (Donasi, Pengelolaan Anak Asuh)
//      - Isi_Laporan
//      - Status_Laporan (Diproses, Selesai)

// #### i. Pemberitahuan
//    - Deskripsi: Mengelola pemberitahuan kepada pengguna (admin atau donatur).
//    - Atribut:
//      - Pemberitahuan_ID (Primary Key)
//      - User_ID (Foreign Key ke entitas User)
//      - Tanggal_Pemberitahuan
//      - Isi_Pemberitahuan
//      - Status_Pemberitahuan (Dibaca/Belum Dibaca)

// ---

// ### 2. Relasi antar Entitas

// 1. User - Donasi:
//    - Relasi: Seorang User (Donatur) dapat melakukan banyak Donasi.
//    - Relasi Tipe: One-to-Many (1 User dapat melakukan banyak Donasi).

// 2. User - Artikel:
//    - Relasi: Seorang User (Admin) menulis banyak Artikel terkait kegiatan di panti.
//    - Relasi Tipe: One-to-Many (1 User menulis banyak Artikel).

// 3. Donasi - Panti Asuhan:
//    - Relasi: Setiap Donasi yang dilakukan terkait dengan satu Panti Asuhan.
//    - Relasi Tipe: Many-to-One (Banyak Donasi terkait ke satu Panti Asuhan).

// 4. Donasi - Riwayat Donasi:
//    - Relasi: Setiap Donasi memiliki satu Riwayat Donasi untuk mencatat statusnya.
//    - Relasi Tipe: One-to-One (1 Donasi memiliki 1 Riwayat Donasi).

// 5. Panti Asuhan - Anak Asuh:
//    - Relasi: Satu Panti Asuhan menaungi banyak Anak Asuh.
//    - Relasi Tipe: One-to-Many (1 Panti menaungi banyak Anak Asuh).

// 6. Panti Asuhan - Program Panti:
//    - Relasi: Satu Panti Asuhan menjalankan banyak Program Panti.
//    - Relasi Tipe: One-to-Many (1 Panti memiliki banyak Program Panti).

// 7. Panti Asuhan - Laporan:
//    - Relasi: Laporan yang dibuat oleh admin terhubung dengan Panti Asuhan.
//    - Relasi Tipe: One-to-Many (1 Panti memiliki banyak Laporan).

// 8. User - Laporan:
//    - Relasi: Setiap Laporan dibuat oleh satu User (Admin).
//    - Relasi Tipe: One-to-Many (1 User membuat banyak Laporan).

// 9. User - Pemberitahuan:
//    - Relasi: Setiap User menerima banyak Pemberitahuan.
//    - Relasi Tipe: One-to-Many (1 User dapat menerima banyak Pemberitahuan).

// ---

// ### 3. Contoh ER Diagram (Secara Konseptual)

// - User terhubung dengan Donasi, Artikel, Laporan, dan Pemberitahuan.
// - Donasi terhubung dengan Panti Asuhan dan memiliki relasi ke Riwayat Donasi.
// - Panti Asuhan terhubung dengan Anak Asuh, Program Panti, Donasi, Artikel, dan Laporan.
  
// Setiap entitas terhubung sesuai dengan relasi yang relevan dan memenuhi kebutuhan aplikasi untuk mengelola anak asuh, donasi, dan informasi terkait panti asuhan.