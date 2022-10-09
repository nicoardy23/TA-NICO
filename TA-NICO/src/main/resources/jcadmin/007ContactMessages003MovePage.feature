#Author       : Nico Ardy Hermawan
#Modul        : Contact Message
#created_date : 4/10/2022
#update_date  : -

Feature: Berpindah Halaman Messages

	Scenario Outline: Berpindah halaman list Messages dengan angka <angka>
  	When <kode> Admin menekan tombol angka <angka> halaman Messages
   	Then <kode> Halaman Messages berpindah ke <angka>
   Examples:
   	|kode|angka|
   	|CO012P|2|
   	|CO013P|3|
   
  Scenario: Berpindah halaman list Messages dengan panah
  	When CO022N Admin menekan tombol panah untuk pindah
  	Then CO022N Halaman Messages berpindah tiga halaman setelahnya