package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	N001("Membuka halaman about"),
	N002("Menambah daftar trainer status"),
	N003("Menambah daftar trainer dengan banyak ekstensi gambar eks"),
	N004("Tambah trainer negative masukkan foto dengan eks"),
	N005("Tambah trainer negative invalid input nama"),
	N006("Tambah trainer negative invalid input jabatan"),
	N007("Tambah trainer negative invalid input profile"),
	N008("Tambah trainer negative input nama500 karakter"),
	N009("Tambah trainer negative input jabatan500 karakter"),
	N010("Tambah trainer negative input profile500 karakter"),
	N011("Mencari data trainer"),
	N012("Berpindah halaman list trainer"),
	N013("Mencari data trainer dengan case"),
	N014("Mengedit data trainer publish status"),
	N015("Mengubah foto trainer"),
	N016("Mengubah nama trainer"),
	N017("Mengubah jabatan trainer"),
	N018("Mengubah profile trainer"),
	N019("Mengedit foto trainer negative dengan case"),
	N020("Mengedit case trainer negative"),
	N021("Mengedit case trainer negative dengan500 karakter"),
	N022("Negative : Mengubah foto trainer edit cari"),
	N023("Negative : Mengubah nama trainer edit cari"),
	N024("Negative : Mengubah jabatan trainer edit cari"),
	N025("Negative : Mengubah profile trainer edit cari"),
	N026("Negative : Mengedit data trainer publish status edit cari"),
	N027("Admin mengubah foto blog"),
	N028("Admin mengubah judul blog"),
	N029("Admin mengubah status blog status ke ubah"),
	N030("Mengubah nilai value dari case"),
	N031("Mengubah nilai dari Content Preview invalid"),
	N032("Membuka halaman Contact Messages"),
	N033("Admin sorting data berdasarkan sorting"),
	N034("Admin cari data berdasarkan sorting sorting"),
	N035("Berpindah halaman list Messages dengan angka angka"),
	N036("Berpindah halaman list Messages dengan panah"),
	N037("Admin mencari data data berdasarkan Nama"),
	N038("Admin mencari data data berdasarkan Email"),
	N039("Admin mencari data data berdasarkan Phone Number"),
	N040("Admin mencari data data berdasarkan Subject"),
	N041("Admin mencari data sorting dengan tekan tombol cari")
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
