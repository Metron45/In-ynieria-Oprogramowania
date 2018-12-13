package baza_klientow;

public class Wypozyczenie {

	private String data_Wypozyczenia;
	private int kaseta_Id;
        

	public String getData_Wypozyczenia() {
		return data_Wypozyczenia;
	}

	/**
	 * 
	 * @param Data_wypozyczenia
	 */
	public void setData_Wypozyczenia(String Data_wypozyczenia) {
		data_Wypozyczenia = Data_wypozyczenia;
	}

	public int getKaseta_Id() {
		return kaseta_Id;
	}

	/**
	 * 
	 * @param Kaseta_Id
	 */
	public void setKaseta_Id(int Kaseta_Id) {
		kaseta_Id = Kaseta_Id;
	}

}