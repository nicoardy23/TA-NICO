package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	N001("Membuka halaman about"),
	N002("Menambah daftar trainer Active"),
	N003("Menambah daftar trainer No Active"),
	N004("Menambah daftar trainer dengan banyak ekstensi gambar JPG"),
	N005("Menambah daftar trainer dengan banyak ekstensi gambar PNG"),
	N006("Menambah daftar trainer dengan banyak ekstensi gambar RAW"),
	N007("Menambah daftar trainer dengan banyak ekstensi gambar GIF"),
	N008("Menambah daftar trainer dengan banyak ekstensi gambar BMP"),
	N009("Menambah daftar trainer dengan banyak ekstensi gambar WEBP"),
	N010("Menambah daftar trainer dengan banyak ekstensi gambar TIFF"),
	N011("Menambah daftar trainer dengan banyak ekstensi gambar PSD"),
	
	N022("Tambah trainer negative masukkan foto dengan mp4"),
	N023("Tambah trainer negative masukkan foto dengan pdf"),
	N024("Tambah trainer negative masukkan foto dengan mp3"),
	N025("Tambah trainer negative invalid input nama"),
	N026("Tambah trainer negative invalid input jabatan"),
	N027("Tambah trainer negative invalid input profile"),
	N028("Tambah trainer negative input nama500 karakter"),
	N029("Tambah trainer negative input jabatan500 karakter"),
	N030("Tambah trainer negative input profile500 karakter"),
	
	N041("Mencari data trainer"),
	N042("Berpindah halaman list trainer"),
	
	N043("Mencari data trainer dengan nama500 karakter"),
	N044("Mencari data trainer dengan sebagian nama500 karakter"),
	N045("Mencari data trainer dengan Jabatan"),
	N046("Mencari data trainer dengan Profile"),
	N047("Mencari data trainer dengan nomor data"),
	
	N051("Mengedit data trainer publish No Active"),
	N052("Mengedit data trainer publish Active"),
	N053("Mengubah foto trainer"),
	N054("Mengubah nama trainer"),
	N055("Mengubah jabatan trainer"),
	N056("Mengubah profile trainer"),
	
	N060("Mengedit foto trainer negative dengan ekstensi video"),
	N061("Mengedit foto trainer negative dengan ekstensi document"),
	N062("Mengedit foto trainer negative dengan ekstensi mp3"),
		
	N063("Mengedit Nama trainer negative"),
	N064("Mengedit Jabatan trainer negative"),
	N065("Mengedit Profile trainer negative"),
	
	N070("Negative : Mengubah foto trainer edit cari"),
	N071("Negative : Mengubah nama trainer edit cari"),
	N072("Negative : Mengubah jabatan trainer edit cari"),
	N073("Negative : Mengubah profile trainer edit cari"),
	N074("Negative : Mengedit data trainer publish No Active edit cari"),
	N075("Negative : Mengedit data trainer publish Active edit cari"),
	
	
	N100("Membuka halaman Contact Messages"),
	N101("Admin sorting data berdasarkan Nama"),
	N102("Admin sorting data berdasarkan Email"),
	N103("Admin sorting data berdasarkan Phone Number"),
	N104("Admin sorting data berdasarkan Subject"),
	N105("Admin sorting data berdasarkan Message"),
	
	N110("Admin cari data berdasarkan sorting Nama"),
	N111("Admin cari data berdasarkan sorting Email"),
	N112("Admin cari data berdasarkan sorting Phone Number"),
	N113("Admin cari data berdasarkan sorting Subject"),
	N114("Admin cari data berdasarkan sorting Message"),
	
	N118("Berpindah halaman list Messages dengan angka 2"),
	N119("Berpindah halaman list Messages dengan angka 3")
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
