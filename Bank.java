public class Bank {
    int Saldo;
    int jumlah; 

    public Bank(int Saldo){
        this.Saldo = Saldo;
    }

    public int SimpanUang(int jumlah){
        Saldo = Saldo + jumlah;
        return Saldo;
    }

    public int AmbilUang(int jumlah){
        Saldo  = Saldo - jumlah;
        return Saldo;
    }

    public int GetSaldo(){
        return Saldo;  
    }
}