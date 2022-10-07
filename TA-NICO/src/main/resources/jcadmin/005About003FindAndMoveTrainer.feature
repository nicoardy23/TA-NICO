
#Author       : Nico Ardy Hermawan
#Modul        : About
#created_date : 4/10/2022
#update_date  : -

Feature: Cari Trainer dan Berpindah Halaman

	Scenario: Mencari data trainer
  	When AB012P Admin memasukkan nama trainer yang ingin dicari
  	And AB012P Admin menekan tombol enter pada keyboard 
  	Then AB012P Admin dapat menemukan data trainer
  
  Scenario: Berpindah halaman list trainer
   When AB013P Admin menekan tombol halaman trainer
   Then AB013P Halaman trainer berpindah