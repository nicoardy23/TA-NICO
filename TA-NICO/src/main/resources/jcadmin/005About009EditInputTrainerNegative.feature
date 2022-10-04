#Author       : Nico Ardy Hermawan
#Modul        : About
#created_date : 4/10/2022
#update_date  : -

Feature: Edit Input Data Trainer Negative

	Scenario Outline: Mengedit <case> trainer negative
  	When <kode> Admin menekan kotak profile trainer inputan negative <case>
  	And <kode> Admin mengubah inputan <case> trainer negative menjadi <input>
  	Then <kode> Admin menekan tombol simpan data trainer inputan negative <case>
  	
   Examples: 
   	|kode|case|input|
   	|AB018N|Nama|GantiNama<>|
   	|AB019N|Jabatan|GantiJabatan<>|
   	|AB020N|Profile|GantiProfile<>|