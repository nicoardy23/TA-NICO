#Author : Nico Ardy Hermawan
#Modul : About

Feature: Menambah About 

	Scenario Outline: Membuka halaman about
		Given Admin login dan membuka halaman about
		Then Halaman about terbuka
		
  Scenario Outline: Menambah daftar trainer
    When Admin klik tombol tambah
    And Admin mengisi data foto nama jabatan dan profile
    And  Admin memberi publish <status>
    And Admin menekan tombol simpan
    Then Data trainer ditambahkan
    
   Examples:
   	|status|
   	|Active|
   	|No Active|
   	
  Scenario: Mencari data trainer
  	When Admin memasukkan nama trainer yang ingin dicari
  	And Admin menekan tombol enter pada keyboard
  	Then Admin dapat menemukan data trainer
  
  Scenario: Berpindah halaman list trainer
   When Admin menekan tombol halaman
   Then Halaman berpindah
  