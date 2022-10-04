#Author : Nico Ardy Hermawan
#Modul : About

Feature: Mencari Trainer dan Berpindah Halaman Negative

	Scenario: Mencari data trainer dengan nama500 karakter
		When AB010N Admin mencari nama trainer pada kolom pencarian full500 karakter
  	And AB010N Admin menekan tombol enter pada keyboard full500 karakter
  	Then AB010N Admin menemukan data atau tidak full500 karakter