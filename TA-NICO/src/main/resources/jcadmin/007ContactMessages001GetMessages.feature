#Author       : Nico Ardy Hermawan
#Modul        : Contact Message
#created_date : 3/10/2022
#update_date  : -

Feature: Melihat Data Contact Message Berdasarkan Sorting

	Scenario: Membuka halaman Contact Messages
		Given CO001P Admin login dan membuka halaman Contact Messages
		Then CO001P Halaman about terbuka
		
	Scenario Outline: Admin sorting data berdasarkan <sorting>
		When <kode> Admin membuka halaman Contact Messages
		And <kode> Admin memilih sorting berdasarkan <sorting>
		Then <kode> Admin mendapat data yang disorting berdasarkan <sorting>
	 Examples: 
	  |kode|sorting|
	  |CO002P|Nama|
	  |CO003P|Email|
	  |CO004P|Phone Number|
	  |CO005P|Subject|
	  |CO006P|Message|