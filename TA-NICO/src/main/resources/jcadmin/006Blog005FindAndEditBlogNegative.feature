#Author       : Nico Ardy Hermawan
#Modul        : Blog
#created_date : 5/10/2022
#update_date  : -

Feature: Mencari dan Mengedit Blog Negative

	Scenario: Admin mengubah foto blog
		When BL001N Admin mencari judul blog dan menekan tombol enter edit foto
		And BL001N Admin menekan kotak blog edit foto
		And BL001N Admin mengubah foto blog edit foto
		Then BL001N Admin menekan button simpan blog edit foto
		
	Scenario: Admin mengubah judul blog
		When BL002N Admin mencari judul blog dan menekan tombol enter edit judul
		And BL002N Admin menekan kotak blog edit judul
		Then BL002N Admin mengubah judul blog edit judul
		
	Scenario Outline: Admin mengubah status blog <status> ke <ubah>
		When <kode> Admin mencari judul blog lalu menekan tombol enter edit <status>
		And <kode> Admin menekan kotak blog edit status 
		And <kode> Admin mengubah status <status> menjadi <ubah>
		Then <kode> Admin menekan tombol simpan edit status <status> menjadi <ubah>
	 Examples:
	 	|kode|status|ubah|
	 	|BL003N|publish Active|No Active|
	 	|BL004N|publish Active|pilih|
	 	|BL005N|publish No Active|Active|
	 	|BL006N|publish No Active|pilih|
	 	|BL007N|set to home No|Yes|
	 	|BL008N|set to home Yes|No|
	 	
	Scenario Outline: Mengubah nilai value dari <case>
		When <kode> Admin mencari judul blog dan menekan enter edit <case>
		And <kode> Admin menekan kotak blog edit isi <case>
		And <kode> Admin mengubah value <case> menjadi <ubah>
		And <kode> Admin menekan tombol simpan blog edit <case>
		And <kode> Admin menekan menu Blog
		And <kode> Admin mencari judul blog dan menekan enter edit <case>
		Then <kode> Admin menekan kotak blog untuk validasi <case> bernilai <ubah>
	 Examples:
	 |kode|case|ubah|
	 |BL009N|Content Preview|Cek Content Preview|
	 |BL010N|Content|Cek Isi Content|

	Scenario Outline: Mengubah nilai dari Content Preview invalid
		When <kode> Admin mencari judul blog dan menekan enter invalid Content Preview
		And <kode> Admin menekan kotak blog invalid Content Preview
		And <kode> Admin mengubah isi Content Preview <ubah>
		Then <kode> Admin menekan tombol simpan blog invalid Content Preview
	 Examples:
	 |kode|ubah|
	 |BL011N|Content Invalid <>|
	 |BL012N| |