package Jobsheet4.tugas;
import java.time.LocalDate;

public class Jual {
    private LocalDate tanggal;
    private Karyawan sales;

    public LocalDate getTanggal(){
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
    }

    public Karyawan getSales(){
        return sales;
    }

    public void setSales(Karyawan sales){
        this.sales = sales;
    }

    public String getInfo(){
        String info = "";
        info += "\tTanggal : " + tanggal;
        info += ", Dijual oleh : " + sales.getNama();
        info += "\n";

        return info;
    }
}