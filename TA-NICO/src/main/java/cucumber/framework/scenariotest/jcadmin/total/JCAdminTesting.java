package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	N001("Membuka halaman about"),
	N002("Menambah daftar trainer"),
	N004("Mencari data trainer"),
	N005("Berpindah halaman list trainer"),
	N006("Mengedit data trainer publish"),
	N008("Mengubah foto trainer"),
	N009("Mengubah nama trainer"),
	N010("Mengubah jabatan trainer"),
	N011("Mengubah profile trainer"),
	N012("Negative : Mengubah foto trainer edit cari"),
	N013("Negative : Mengubah nama trainer edit cari"),
	N014("Negative : Mengubah jabatan trainer edit cari"),
	N015("Negative : Mengubah profile trainer edit cari"),
	N016("Negative : Mengedit data trainer publish edit cari")
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
