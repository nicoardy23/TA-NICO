package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	N001("Membuka halaman about"),
	N002("Menambah daftar trainer"),
	N004("Menambah daftar trainer dengan banyak ekstensi gambar"),
	N012("Mencari data trainer"),
	N013("Berpindah halaman list trainer"),
	N014("Mengedit data trainer publish"),
	N016("Mengubah foto trainer"),
	N017("Mengubah nama trainer"),
	N018("Mengubah jabatan trainer"),
	N019("Mengubah profile trainer"),
	N020("Negative : Mengubah foto trainer edit cari"),
	N021("Negative : Mengubah nama trainer edit cari"),
	N022("Negative : Mengubah jabatan trainer edit cari"),
	N023("Negative : Mengubah profile trainer edit cari"),
	N034("Negative : Mengedit data trainer publish edit cari")
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
