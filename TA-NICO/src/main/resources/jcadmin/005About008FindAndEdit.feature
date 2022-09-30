#Author : Nico Ardy Hermawan
#Modul : About

Feature: Mencari dan Mengedit Trainer

	Scenario: Mengubah foto trainer edit cari
  	When Admin mencari nama trainer dan menekan enter foto cari edit
  	And Admin menekan kotak profile trainer foto cari edit
  	And Admin mengubah foto trainer cari edit
  	Then Admin menekan tombol simpan dan data tersimpan foto cari edit
  
  Scenario: Mengubah nama trainer edit cari
  	When Admin mencari nama trainer dan menekan enter nama cari edit
  	And Admin menekan kotak profile trainer nama cari edit
  	And Admin mengubah nama trainer cari edit
  	Then Admin menekan tombol simpan dan data tersimpan nama cari edit
  	
  Scenario: Mengubah jabatan trainer edit cari
  	When Admin mencari nama trainer dan menekan enter jabatan cari edit
  	And Admin menekan kotak profile trainer jabatan cari edit
  	And Admin mengubah jabatan trainer cari edit
  	Then Admin menekan tombol simpan dan data tersimpan jabatan cari edit
  	
  Scenario: Mengubah profile trainer edit cari
  	When Admin mencari nama trainer dan menekan enter profile cari edit
  	And Admin menekan kotak profile trainer profile cari edit
  	And Admin mengubah profile trainer cari edit
  	Then Admin menekan tombol simpan dan data tersimpan profile cari edit
  
  #Scenario Outline: Mengedit data trainer publish cari edit
  #	When Admin menekan kotak profile trainer publish cari edit
  #	And Admin mengganti status publish ke <status> cari edit
  #	And Admin menekan tombol simpan publish cari edit
  #	Then Status publish trainer berubah menjadi <status> cari edit
  #
   #Examples:
   #	|status|
   #	|Active|
   #	|No Active|