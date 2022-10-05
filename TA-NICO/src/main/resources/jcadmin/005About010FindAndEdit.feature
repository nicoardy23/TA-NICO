#Author : Nico Ardy Hermawan
#Modul : About

Feature: Mencari dan Mengedit Trainer

	Scenario: Negative : Mengubah foto trainer edit cari
  	When AB024N Admin mencari nama trainer dan menekan enter foto cari edit
  	And AB024N Admin menekan kotak profile trainer foto cari edit
  	And AB024N Admin mengubah foto trainer cari edit
  	Then AB024N Admin menekan tombol simpan dan data trainer tersimpan foto cari edit
  
  Scenario: Negative : Mengubah nama trainer edit cari
  	When AB025N Admin mencari nama trainer dan menekan enter nama cari edit
  	And AB025N Admin menekan kotak profile trainer nama cari edit
  	And AB025N Admin mengubah nama trainer cari edit
  	Then AB025N Admin menekan tombol simpan dan data trainer tersimpan nama cari edit
  	
  Scenario: Negative : Mengubah jabatan trainer edit cari
  	When AB026N Admin mencari nama trainer dan menekan enter jabatan cari edit
  	And AB026N Admin menekan kotak profile trainer jabatan cari edit
  	And AB026N Admin mengubah jabatan trainer cari edit
  	Then AB026N Admin menekan tombol simpan dan data trainer tersimpan jabatan cari edit
  	
  Scenario: Negative : Mengubah profile trainer edit cari
  	When AB027N Admin mencari nama trainer dan menekan enter profile cari edit
  	And AB027N Admin menekan kotak profile trainer profile cari edit
  	And AB027N Admin mengubah profile trainer cari edit
  	Then AB027N Admin menekan tombol simpan dan data trainer tersimpan profile cari edit
  
  Scenario Outline: Negative : Mengedit data trainer publish <status> edit cari
  	When <kode> Admin menekan kotak profile trainer publish cari edit
  	And <kode> Admin mengganti status publish trainer cari edit ke <status>
  	And <kode> Admin menekan tombol simpan publish trainer cari edit
  	Then <kode> Status publish cari edit trainer berubah menjadi <status>
   Examples:
   	|status|kode|
   	|No Active|AB028N|
   	|Active|AB029N|