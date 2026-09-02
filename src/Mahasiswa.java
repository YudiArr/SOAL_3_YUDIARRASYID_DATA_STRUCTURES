public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    //Constructor untuk data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    //methode untuk tampilkan info mahasiswa
    public void tampilkanInfo(){
        System.out.println("Nama             : " + nama);
        System.out.println("NIM              : " + nim);
        System.out.println("Jurusan          : " + jurusan);
        System.out.println("IPK              : " + ipk);
    }
    //getter untuk ambil nilai ipk
    public double getIpk() {
        return ipk;
    }
    //setter untuk ubah nilai ipk
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    //Method untuk pengecekan status kelulusan
    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status Mahasiswa : Lulus");
        } else {
            System.out.println("Status Mahasiswa : Belum Lulus");
        }
    }

    //method untuk menentukan kecocokan predikat dengan ipk
    public void hitungPredikat() {
        if (ipk >= 3.75) {
            System.out.println("Predikat         : Dengan Pujian");
        }
        else if (ipk >= 3.50 && ipk < 3.75) {
            System.out.println("Predikat         : Sangat Memuaskan");
        }
        else if (ipk >= 3.00 && ipk < 3.50) {
            System.out.println("Predikat         : Memuaskan");
        }
        else {
            System.out.println("Predikat         : Perlu Perbaikan");
        }
    }
    //method untuk melakukan pembaruan atau update ipk
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }
    //getter untuk mengambil input nim
    public String getNim() {
        return nim;
    }

}