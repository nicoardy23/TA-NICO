Feature: About 

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
   	
  #Scenario: Mencari data trainer
  #	When Admin memasukkan nama trainer yang ingin dicari
  #	And Admin menekan tombol enter pada keyboard
  #	Then Admin dapat menemukan data trainer
  #	
  #Scenario: Mengedit data trainer publish
  #	When Admin menekan kotak profile trainer publish
  #	And Admin mengganti status publish ke <status>
  #	And Admin menekan tombol simpan publish
  #	Then Status publish trainer berubah menjadi <status>
  #
   #Examples:
   #	|status|
   #	|Active|
   #	|No Active|
  #
  #Scenario: Mengubah foto trainer
  #	When Admin menekan kotak profile trainer foto
  #	And Admin mengubah foto trainer
  #	Then Admin menekan tombol simpan dan data tersimpan foto
  #
  #Scenario: Mengubah nama trainer
  #	When Admin menekan kotak profile trainer nama
  #	And Admin mengubah nama trainer
  #	Then Admin menekan tombol simpan dan data tersimpan nama
  #	
  #Scenario: Mengubah jabatan trainer
  #	When Admin menekan kotak profile trainer jabatan
  #	And Admin mengubah jabatan trainer
  #	Then Admin menekan tombol simpan dan data tersimpan jabatan
  #	
  #Scenario: Mengubah profile trainer
  #	When Admin menekan kotak profile trainer profile
  #	And Admin mengubah profile trainer
  #	Then Admin menekan tombol simpan dan data tersimpan profile
  
  	
   