#Author       : Nico Ardy Hermawan
#Modul        : Contact Message
#created_date : 4/10/2022
#update_date  : -

Feature: Cari Data Messages Negative

	Scenario Outline: Admin mencari data <data> berdasarkan Nama
		When <kode> Admin memilih opsi sorting berdasarkan Nama negative
		When <kode> Admin mencari <cari> pada kolom cari berdasar Nama negative
		Then <kode> Admin menekan enter pada keyboard cari <data> berdasar Nama negative
	 Examples: 
	 	|kode|data|cari|
	 	|CO001N|Email|1@gm.com|
	 	|CO002N|Phone Number|081|
	 	|CO003N|Subject|00011111zzzozooo|
	 	|CO004N|Messages|00101111zzzozooo|
		
	Scenario Outline: Admin mencari data <data> berdasarkan Email
		When <kode> Admin memilih opsi sorting berdasarkan Email negative
		When <kode> Admin mencari <cari> pada kolom cari berdasar Email negative
		Then <kode> Admin menekan enter pada keyboard cari <data> berdasar Email negative
	 Examples: 
	 	|kode|data|cari|
	 	|CO005N|Nama|zzzozooo|
	 	|CO006N|Phone Number|081|
	 	|CO007N|Subject|00011111zzzozooo|
	 	|CO008N|Messages|00101111zzzozooo|
	 	
	Scenario Outline: Admin mencari data <data> berdasarkan Phone Number
		When <kode> Admin memilih opsi sorting berdasarkan Phone Number negative
		When <kode> Admin mencari <cari> pada kolom cari berdasar Phone Number negative
		Then <kode> Admin menekan enter pada keyboard cari <data> berdasar Phone Number negative
	 Examples: 
	 	|kode|data|cari|
	 	|CO009N|Nama|zzzozooo|
	 	|CO010N|Email|1@gm.com|
	 	|CO011N|Subject|00011111zzzozooo|
	 	|CO012N|Messages|00101111zzzozooo|
	 	
	Scenario Outline: Admin mencari data <data> berdasarkan Subject
		When <kode> Admin memilih opsi sorting berdasarkan Subject negative
		When <kode> Admin mencari <cari> pada kolom cari berdasar Subject negative
		Then <kode> Admin menekan enter pada keyboard cari <data> berdasar Subject negative
	 Examples: 
	 	|kode|data|cari|
	 	|CO013N|Nama|MasNico|
	 	|CO014N|Email|1@gm.com|
	 	|CO015N|Phone Number|081|
	 	|CO016N|Messages|Oke Oke|
	 	
	Scenario Outline: Admin mencari data <sorting> dengan tekan tombol cari
		When <kode> Admin membuka halaman admin dengan tombol cari
		And <kode> Admin memilih obsional sorting berdasarkan <sorting>
		And <kode> Admin memasukkan <sorting> berupa <input> tekan tombol cari
		Then <kode> Admin menekan tombol cari <input> pada kolom pencarian berdasar <sorting>
	 Examples:
	 	|kode|sorting|input|
	 	|CO017P|Nama|zzzozooo|
	  |CO018P|Email|1@gm.com|
	  |CO019P|Phone Number|2147483647|
	  |CO020P|Subject|0000011111zzzozooo|
	  |CO021P|Message|00101111zzzozooo|