#Author : Nico Ardy Hermawan
#Modul : About

Feature: Menambah About Negative

	Scenario Outline: Tambah trainer negative masukkan foto dengan <eks>
		When <kode> Admin klik tombol tambah trainer foto selain ekstensi gambar
  	And <kode> Admin memasukkan <foto> trainer selain ekstensi gambar
  	And <kode> Admin mengisi nama jabatan profile dan publish no active trainer selain ekstensi gambar
  	Then <kode> Admin menekan tombol simpan trainer foto selain ekstensi gambar
   Examples:
   |kode|eks|foto|
   |AB001N|mp4|.\\src\\main\\resources\\gambarnico\\testFotoInvalid.mp4|
   |AB002N|pdf|.\\src\\main\\resources\\gambarnico\\testFotoInvalid.pdf|
   |AB003N|mp3|.\\src\\main\\resources\\gambarnico\\testFotoInvalid.mp3|
  
	Scenario: Tambah trainer negative invalid input nama
		When AB004N Admin klik tombol tambah trainer invalid input nama
  	And AB004N Admin memasukkan foto trainer invalid input nama
  	And AB004N Admin mengisi nama trainer invalid input nama
  	And AB004N Admin mengisi jabatan profile dan publish no active trainer invalid input nama
  	Then AB004N Admin menekan tombol simpan trainer invalid input nama
  	
  Scenario: Tambah trainer negative invalid input jabatan
		When AB005N Admin klik tombol tambah trainer invalid input jabatan
  	And AB005N Admin memasukkan foto dan nama trainer invalid input jabatan
   	And AB005N Admin mengisi jabatan trainer invalid input jabatan
  	And AB005N Admin mengisi profile dan publish no active trainer invalid input jabatan
  	Then AB005N Admin menekan tombol simpan trainer invalid input jabatan
  
  Scenario: Tambah trainer negative invalid input profile
		When AB006N Admin klik tombol tambah trainer invalid input profile
  	And AB006N Admin memasukkan foto nama dan jabatan trainer invalid input profile
   	And AB006N Admin mengisi profile trainer invalid input profile
  	And AB006N Admin mengisi publish no active trainer invalid input profile
  	Then AB006N Admin menekan tombol simpan trainer invalid input profile
  	
 Scenario: Tambah trainer negative input nama500 karakter
		When AB007N Admin klik tombol tambah trainer input nama500 karakter
  	And AB007N Admin memasukkan foto trainer input nama500 karakter
   	And AB007N Admin mengisi nama trainer dengan input500 karakter
  	And AB007N Admin mengisi jabatan profile dan publish no active trainer input nama500 karakter
  	Then AB007N Admin menekan tombol simpan dan cari trainer input nama500 karakter
  	
 Scenario: Tambah trainer negative input jabatan500 karakter
		When AB008N Admin klik tombol tambah trainer input jabatan500 karakter
  	And AB008N Admin memasukkan foto dan nama trainer input jabatan500 karakter
   	And AB008N Admin mengisi jabatan trainer dengan input jabatan500 karakter
  	And AB008N Admin mengisi profile dan publish no active trainer input jabatan500 karakter
  	Then AB008N Admin menekan tombol simpan dan cari trainer input jabatan500 karakter
  
 Scenario: Tambah trainer negative input profile500 karakter
		When AB009N Admin klik tombol tambah trainer input profile500 karakter
  	And AB009N Admin memasukkan foto nama dan jabatan trainer input profile500 karakter
   	And AB009N Admin mengisi profile trainer dengan input profile500 karakter
  	And AB009N Admin memilih publish no active trainer input profile500 karakter
  	Then AB009N Admin menekan tombol simpan dan cari trainer input profile500 karakter