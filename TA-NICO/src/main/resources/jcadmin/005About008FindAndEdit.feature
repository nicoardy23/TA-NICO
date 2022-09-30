#Author : Nico Ardy Hermawan
#Modul : About

Feature: Mencari dan Mengedit Trainer

	Scenario: Negative : Mengubah foto trainer edit cari
  	When Admin mencari nama trainer dan menekan enter foto cari edit
  	And Admin menekan kotak profile trainer foto cari edit
  	And Admin mengubah foto trainer cari edit
  	Then Admin menekan tombol simpan dan data trainer tersimpan foto cari edit
  
  Scenario: Negative : Mengubah nama trainer edit cari
  	When Admin mencari nama trainer dan menekan enter nama cari edit
  	And Admin menekan kotak profile trainer nama cari edit
  	And Admin mengubah nama trainer cari edit
  	Then Admin menekan tombol simpan dan data trainer tersimpan nama cari edit
  	
  Scenario: Negative : Mengubah jabatan trainer edit cari
  	When Admin mencari nama trainer dan menekan enter jabatan cari edit
  	And Admin menekan kotak profile trainer jabatan cari edit
  	And Admin mengubah jabatan trainer cari edit
  	Then Admin menekan tombol simpan dan data trainer tersimpan jabatan cari edit
  	
  Scenario: Negative : Mengubah profile trainer edit cari
  	When Admin mencari nama trainer dan menekan enter profile cari edit
  	And Admin menekan kotak profile trainer profile cari edit
  	And Admin mengubah profile trainer cari edit
  	Then Admin menekan tombol simpan dan data trainer tersimpan profile cari edit
  
  Scenario Outline: Negative : Mengedit data trainer publish edit cari
  	When Admin menekan kotak profile trainer publish cari edit
  	And Admin mengganti status publish trainer cari edit ke <status>
  	And Admin menekan tombol simpan publish trainer cari edit
  	Then Status publish cari edit trainer berubah menjadi <status>
  
   Examples:
   	|status|
   	|Active|
   	|No Active|
   	
   	