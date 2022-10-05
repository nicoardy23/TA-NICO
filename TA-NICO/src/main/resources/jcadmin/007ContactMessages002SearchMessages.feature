#Author       : Nico Ardy Hermawan
#Modul        : Contact Message
#created_date : 3/10/2022
#update_date  : -

Feature: Mencari Data Contact Message Berdasarkan Sorting
		
	Scenario Outline: Admin cari data berdasarkan sorting <sorting>
		When <kode> Admin membuka halaman Contact Messages cari
		And <kode> Admin memilih sorting cari berdasarkan <sorting>
		And <kode> Admin mencari <data> trainer dan menekan enter pada keyboard cari
		Then <kode> Admin mendapat data <data> yang disorting dengan <sorting>
	 Examples: 
	  |kode|sorting|data|
	  |CO007P|Nama|zzzozooo|
	  |CO008P|Email|1@gm.com|
	  |CO009P|Phone Number|2147483647|
	  |CO010P|Subject|0000011111zzzozooo|
	  |CO011P|Message|00101111zzzozooo|