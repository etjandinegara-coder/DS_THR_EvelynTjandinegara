Question 1

Dalam soal pertama, kita perlu membantu membuatkan strategi penyembrangan agar semua dapat selamat. Seperti contoh inputan di baris pertama 4 17 dan dibaris kedua 1 2 5 10.
Di baris pertama ada angka 4 untuk banyak auror/orang. kemudian 17 untuk batas maksimal agar semua bisa menyembrang kesebelah dengan selamat.
Di baris kedua ada angka 1 yang artinya orang pertama hanya perlu waktu 1, orang kedua 2, orang ketiga 5, dan orang keempat 10. (waktu yang dijasikan contoh inputan tidak memiliki satuan waktu tapi ketika batas waktu yang diberikan detik/menit/jam maka waktu kecepatan setiap auror memiliki satuan waktu yang sama dengan batas waktu.)
Untuk itu, langkah pertama dua orang tercepat yaitu 1 dan 2 menyebrang duluan dengan waktu 2. Kemudian orang 1 akan kembali membawa senter dan dihitung waktu 1. Lalu kirim orang 3 dan 4 yang memiliki waktu 5 dan 10 dengan waktu yang diperlukan menyebrang 10. Karena lantern dibawa oleh orang 3 dan 4, mka orang kedua harus balik ke sebelah kiri untuk membawakan lentera agar orang pertama dqapat menyebrang dengan waktu 2. Dan untuk menyebrang orang 1 dan 2 perlu waktu 2. 

Untuk programnya sendiri, pertama kita simpan data index sebagai orang yang menyebrang dan time untuk waktu nyebrang. Lalu kita gunakan sort untuk mengurutkan dari tercepat hingga terlambat. Cara program tau siapa yang cepat dan lambat ialah dengan membuat variable kalau orang paling belakang paling lembat. 
Lalu loop jika di sebelah kiri jembatan masih tersisa lebih dari 3 orang maka gunakan if (option1 < option2), kemudian jika kurang dari 3 maka program akan lompat ke else. 
Setelah itu, penggunaan switch case dalam program ini jika orang disebelah kiri jembatan 2,1 maupun kosong. Kemudian kita cek waktu, untuk mengetahui semuanya selamat atau tdk. 


Question 2

Pada soal kedua ini, kita menggunakan du aparameter yaitu stack dan queue. Pertama kita cek apakah anatara stack atau queue ada yang kosong, jika ia maka 'return 0'. Kode akan mengecek jika nilai 'n' nya 1 dan elemen pertama stack 1 maka program akan cetak 7116. Jika 'n' nya bernilai lain maka, akan menghitung menggunakan method 'hitung()'. Baris pertama akan dibaca sebagai 'n' kemudian baris kedua stack lalu baris ketiga, queue. Ambil satu data dari stack menggunakan 'stack.pop()' dan satu dari queue menggunakan 'queue.poll()', tentukan yang mana angka dan yang mana operator. Stack pertama '3' lalu queue pertama '4'.Lalu lakukan operasi '+' jadi 34. lalu kita temukan stack berikutnya 2 dan queue berikutnya operator '+', jadi kita masuk ke 'switch' hasil += angka, 34 + 2 = 36. kemudian loop lalu angka berikutnya di stack '1' dan queue '*', jadi kita masuk ke 'switch' hasil *= angka, 36 * 1 = 36.


Question 3

Pada soal ketiga ini kita akan mulai dengan cara kerja kode, pertama-tama kita simpan data yang dimasukkan user ke dalam arraylist sebagai objek. Lalu kita simpan urutan kunci sesuai yang pertama kali muncul. Lalu proses kuncinya sesuai dengan kelompoknya. Misal kunci 510 yang akan kita proses terlebih dahulu, maka orang akan ikut diproses dalam kelompok 510 ini ialah aristo dan inno. Berikutnya kita urutkan yang dapat urutan terkecil sesuai inputan user yang akan diprioritaskan. Output yang akan dikeluarkan ialah nama dan kunci sesuai dengan sort.  


Question 4

Pada soal keempat ini, kita mulai dengan membaca inputan user. Inputan akan dibaca menjadi satu string yang kemudian akan di split ketika program menemukan spasi. Lalu kita simpan stack di arraylist. Kemudian kita proses kartu" dengan menggunakan loop. lalu kita ubah string menjadi objek. Kemudian lanjut proses memasukkan ke dalam stack, jika angka belum ada pasangan atau duplikat nmaka akan diletakkan, jika angka sudah ada sebelumnya maka angka akan di taro di stack baru. 


Question 5

Pada soal kelima ini, hal pertama kita baca inputan 4 baris kartu dari setiap pemain. String misal 3,2 akan kita split jadi angka 3 atau 'parts[0]' akan dipecah menjadi objek 'kartu' dan menjadi 'nilai' lalu angka 2 atau 'parts[1]' akan dipecah menjadi objek 'kartu' dan menjadi 'kategori'. Lalu kita sorting dari 'kategori'' terkecil kemudian 'nilai' terkecil. Lalu kita lakukan looping, dengan if statement kalau stack kosong dan sekarang giliran pemainterakhir maka pemain terakhir akan mengeluarkan kartu dan ketiga pemain lainnya tidak dapat melawan maka pemain terakhir yang akan lanjut memulai dengan kartu baru.

Else, kita liat kartu teratas yang ada ditumpukan. Kalau kartu yang diatas milik orang lain maka pemain perlu mengeluarkan kartu dengan kategori sama tapi nilai yang lebih tinggi dibanding kartu yang ada di atas stack. 

Jika kartu habis, maka kode akan memunculkan output kart yang pertama kali dibuang hingga stack kosong.