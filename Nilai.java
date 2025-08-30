public class Nilai {
    int absen, tugas, uts, uas;
    double nilaiakhir;  

    public Nilai(int absen,int tugas,int uts,int uas){
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public void nilai(){
        System.out.println(absen);
        System.out.println(tugas);
        System.out.println(uts);
        System.out.println(uas);
    }

    public double cetaknilai(){
        nilaiakhir = (absen * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40);
        return nilaiakhir;
    }

    public void info(){
        System.out.println("NIM              : 2410631170098");
        System.out.println("Nama             : Nugraha Adani");
        System.out.println("Nilai Absen[10%] : " + absen);
        System.out.println("Nilai Tugas[20%] : " + tugas);
        System.out.println("Nilai UTS[30%]   : " + uts);
        System.out.println("Nilai UAS[40%]   : " + uas);
        System.out.println("Nilai Akhir      : " + cetaknilai());
    }
}
