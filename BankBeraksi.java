public class BankBeraksi{
    public static void main(String[] args){
        
        Bank bankabc = new Bank(100000);

        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo Saat Ini: Rp." + bankabc.GetSaldo());
        System.out.println();


        System.out.println("Simpan Uang: Rp.500000");  
        bankabc.SimpanUang(500000);  
        System.out.println("Saldo Saat Ini: Rp." + bankabc.GetSaldo());
        System.out.println();


        System.out.println("Ambil Uang : Rp.150000");
        bankabc.AmbilUang(150000);
        System.out.println("Saldo Saat Ini: Rp." + bankabc.GetSaldo());
    }
    
}
