#Author : Nico Ardy Hermawan
#Modul : About

Feature: Mencari Trainer dan Berpindah Halaman Negative

	Scenario Outline: Mencari data trainer dengan <case>
		When <kode> Admin mencari <cari> pada kolom pencarian <case>
  	And <kode> Admin menekan tombol enter pada keyboard <case>
  	Then <kode> Admin menemukan <cari> atau tidak <case>
   Examples:
   	|kode|case|cari|
   	|AB010N|nama500 karakter|NicoArdyTestPanjangggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg|
   	|AB011N|sebagian nama500 karakter|NicoArdyTestPanjangggggggggggggggggggggggggggggggg|
   	|AB012N|Jabatan|Trainer Magang|
   	|AB013N|Profile|Cuma buat testing|
   	|AB014N|nomor data|133|