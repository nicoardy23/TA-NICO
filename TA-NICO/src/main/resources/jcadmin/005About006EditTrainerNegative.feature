#Author       : Nico Ardy Hermawan
#Modul        : About
#created_date : 4/10/2022
#update_date  : -

Feature: Edit Foto Trainer Negative

	Scenario Outline: Mengedit foto trainer negative dengan <case>
  	When <kode> Admin menekan kotak profile trainer negative <case>
  	And <kode> Admin mengganti foto trainer negative dengan <foto>
  	Then <kode> Admin menekan tombol simpan trainer negative <case>
   Examples:
   	|kode|case|foto|
   	|AB015N|ekstensi video|.\\src\\main\\resources\\gambarnico\\testFotoInvalid.mp4|
   	|AB016N|ekstensi document|.\\src\\main\\resources\\gambarnico\\testFotoInvalid.pdf|
   	|AB017N|ekstensi mp3|.\\src\\main\\resources\\gambarnico\\testFotoInvalid.mp3|