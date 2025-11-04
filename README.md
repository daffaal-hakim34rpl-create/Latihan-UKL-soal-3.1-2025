Program Java: Penghitung Nilai Rata-rata Ujian RPL

Proyek ini bertujuan membantu pendidik (guru) dalam merekapitulasi nilai ujian Produktif RPL. Program ini bersifat dinamis, memungkinkan guru untuk menentukan sendiri jumlah siswa yang nilainya akan dimasukkan.

 Konsep Dasar Program

1.  **Input Dinamis**: Program menggunakan `Scanner` untuk meminta input **jumlah siswa** terlebih dahulu, yang kemudian menentukan berapa kali perulangan input nilai akan dilakukan.
2.  **Perulangan (`for` loop)**: Digunakan untuk mengulang proses input nilai satu per satu sesuai jumlah siswa yang telah ditentukan.
3.  **Akumulasi Total**: Semua nilai yang dimasukkan dijumlahkan dan disimpan dalam variabel `totalNilai` (menggunakan tipe `double` untuk akurasi desimal).
4.  **Validasi Nilai**: Terdapat perulangan `while` bersarang yang memastikan nilai yang dimasukkan oleh pengguna adalah angka (`double`) dan berada dalam rentang yang wajar (0 hingga 100), sehingga data yang dihitung akurat.
5.  **Perhitungan Rata-rata**: Dilakukan dengan rumus sederhana: $\text{Rata-rata} = \text{Total Nilai} / \text{Jumlah Siswa}$.

Berikut untuk hasil output/terminalnya mohon maaf masih trouble.
