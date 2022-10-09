#Author : Nico Ardy Hermawan
#Modul : About

Feature: Menambah About 

	Scenario: Membuka halaman about
		Given AB001P Admin login dan membuka halaman about
		Then AB001P Halaman about terbuka
		
  Scenario Outline: Menambah daftar trainer <status>
    When <kode> Admin klik tombol tambah trainer
    And <kode> Admin mengisi data foto nama jabatan dan profile trainer
    And <kode> Admin memberi publish <status>
    And <kode> Admin menekan tombol simpan trainer
    Then <kode> Data trainer ditambahkan
   Examples:
   	|status|kode|
   	|Active|AB002P|
   	|No Active|AB003P|
  
  Scenario Outline: Menambah daftar trainer dengan banyak ekstensi gambar <eks>
  	When <kode> Admin klik tombol tambah trainer berbagai foto
  	And <kode> Admin memasukkan file <foto> trainer
  	And <kode> Admin mengisi data trainer dengan status status no active
  	And <kode> Admin menekan tombol simpan trainer berbagai foto
  	Then <kode> Data trainer ditambahkan berbagai gambar
   Examples:
   		|kode|foto|eks|
   		|AB004P|.\\src\\main\\resources\\gambarnico\\maung.jpg|JPG|
   		|AB005P|.\\src\\main\\resources\\gambarnico\\mnk.png|PNG|
   		|AB006P|.\\src\\main\\resources\\gambarnico\\maung_1664337134914.raw|RAW|
   		|AB007P|.\\src\\main\\resources\\gambarnico\\error-wait.gif|GIF|
   		|AB008P|.\\src\\main\\resources\\gambarnico\\maung_1664337283539.bmp|BMP|
   		|AB009P|.\\src\\main\\resources\\gambarnico\\maung.webp|WEBP|
   		|AB010P|.\\src\\main\\resources\\gambarnico\\maung_1.tiff|TIFF|
   		|AB011P|.\\src\\main\\resources\\gambarnico\\maung.psd|PSD|