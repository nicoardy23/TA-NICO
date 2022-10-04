package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	N001("Membuka halaman about"),
	N002("Menambah daftar trainer Active"),
	N003("Menambah daftar trainer No Active"),
//	N004("Menambah daftar trainer dengan banyak ekstensi gambar"),
	N012("Mencari data trainer"),
	N013("Berpindah halaman list trainer"),
	N014("Mengedit data trainer publish No Active"),
	N015("Mengedit data trainer publish Active"),
	N016("Mengubah foto trainer"),
	N017("Mengubah nama trainer"),
	N018("Mengubah jabatan trainer"),
	N019("Mengubah profile trainer"),
	N020("Negative : Mengubah foto trainer edit cari"),
	N021("Negative : Mengubah nama trainer edit cari"),
	N022("Negative : Mengubah jabatan trainer edit cari"),
	N023("Negative : Mengubah profile trainer edit cari"),
	N024("Negative : Mengedit data trainer publish No Active edit cari"),
	N025("Negative : Mengedit data trainer publish Active edit cari"),
	N026("Tambah trainer negative invalid input nama"),
	N029("Tambah trainer negative invalid input jabatan"),
	N032("Tambah trainer negative invalid input profile"),
	N035("Tambah trainer negative input nama500 karakter"),
	N038("Tambah trainer negative input jabatan500 karakter"),
	N041("Tambah trainer negative input profile500 karakter"),
	N069("Membuka halaman Contact Messages"),
	N072("Admin sorting data berdasarkan Nama"),
	N070("Admin sorting data berdasarkan Email"),
	N074("Admin sorting data berdasarkan Phone Number"),
	N076("Admin sorting data berdasarkan Subject"),
	N078("Admin sorting data berdasarkan Message"),
	N082("Admin cari data berdasarkan sorting Nama"),
	N080("Admin cari data berdasarkan sorting Email"),
	N084("Admin cari data berdasarkan sorting Phone Number"),
	N086("Admin cari data berdasarkan sorting Subject"),
	N088("Admin cari data berdasarkan sorting Message"),
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
