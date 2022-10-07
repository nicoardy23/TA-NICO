#Author : Nico Ardy Hermawan
#Modul : About

Feature: Mengedit Trainer

	Scenario Outline: Mengedit data trainer publish <status>
  	When <kode> Admin menekan kotak profile trainer publish
  	And <kode> Admin mengganti status publish trainer ke <status>
  	And <kode> Admin menekan tombol simpan publish trainer
  	Then <kode> Status publish trainer berubah menjadi <status>
   Examples:
   	|status|kode|
   	|No Active|AB014P|
   	|Active|AB015P|
  
  Scenario: Mengubah foto trainer
  	When AB016P Admin menekan kotak profile trainer foto
  	And AB016P Admin mengubah foto trainer
  	Then AB016P Admin menekan tombol simpan dan data trainer tersimpan foto
  
  Scenario: Mengubah nama trainer
  	When AB017P Admin menekan kotak profile trainer nama
  	And AB017P Admin mengubah nama trainer
  	Then AB017P Admin menekan tombol simpan dan data trainer tersimpan nama
  	
  Scenario: Mengubah jabatan trainer
  	When AB018P Admin menekan kotak profile trainer jabatan
  	And AB018P Admin mengubah jabatan trainer
  	Then AB018P Admin menekan tombol simpan dan data trainer tersimpan jabatan
  	
  Scenario: Mengubah profile trainer
  	When AB019P Admin menekan kotak profile trainer profile
  	And AB019P Admin mengubah profile trainer
  	Then AB019P Admin menekan tombol simpan dan data trainer tersimpan profile