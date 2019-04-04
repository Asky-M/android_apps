# LEARN MOBILE PROGRAMING | ANDROID STUDIO

## Intent

### dialup

1. buat project activity 1 dan activity 2
    
2. pada activity 1 dibagian activity_main.xml masukkan 
	* 1 textView
	* 2 edittext
	* 2 button
	konfigurasi bebas sesuai kenyamanan
3. di activity 2 pada bagian activity_second.xml saya menggunakan 3 textview. buat gaya2an aja.

ada beberapa baris yang perlu diperhatikan
    android:orientation="vertical"
    android:gravity="center"
    android:padding="16dp"
    android:inputType="number"
    android:hint="Masukkan Kata"

ingat bahwa, pada button pertama, inputtext ke activity 2 dan ini disebut explicit sedangkan pada button 2, textinput di forward ke aplikasi activity contact number yang sudah ada di android.

selanjutnya di tahap penulisan script java agar aplikasi kita dapat berjalan.

terdapat perbedaan yang sangat jelas dari explicit dan implicit yaitu pada baris 29 dan baris 40.

- Intent intent = new Intent(MainActivity.this, SecondActivity.class);


- Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + nomor));

Kode pada baris ke 40, parameter Intent Implicit tidak membutuhkan class utama/awal dan class halaman selanjutnya/tujuan tapi membutuhkan aksi apa yang harus dilakukan ketika object Intent terbuat, kemudian parameter selanjutnya datanya yang akan dikirimkan ke aksi tersebut. Pada baris ke 40 tersebut, parameter pertamanya yaitu melakukan aksi membuka dial up, parameter keduanya mengirimkan data nomor telepon dan harus diawali dengan “tel:” kemudian dilanjut dengan nomor telepon.

sekian penjelasan tentang intent.

