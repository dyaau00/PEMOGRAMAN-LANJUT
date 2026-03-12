public class AtmMain {
    public static void main(String[] args) {
        Atm atm_dya = new Atm();
        Atm atm_budi = new Atm();

        atm_dya.setNama("dya");
        atm_dya.setNorek("2222-9999");
        atm_dya.setPassword("IniPasswordDya");
        atm_dya.setSaldo(250000000);
//        transaksi valid
        atm_dya.transaksi("IniPasswordDya", 15000000L);
//        transaksi invalid (password)
        atm_dya.transaksi("passwordSalah", 12345678L);
//        transaksi invalid (saldo)
        atm_budi.transaksi("BudiBanyakDuit", 10000000);

        System.out.println("================Separator================");

        atm_budi.setNama("budi");
        atm_budi.setNorek("8888-5555");
        atm_budi.setPassword("BudiBanyakDuit");
        atm_budi.setSaldo(45000000);
    }
}
