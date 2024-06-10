/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author A-11
 */
public class Mobil implements KendaraanBermotor{
    private String warna;
    private int kecepatan = 250;
    private double harga = 200000;
    private String merk;
    
    
    public Mobil(){
        System.out.println("ini construktor");
        this.harga = 300000.00;
        this.merk = "Mazda RX7";
        this.kecepatan = 300;
        this.warna = "Navy";
    }

    public Mobil(String warna, int kecepatan, double harga, String merk) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.merk = merk;
    }

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    
    

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }
    
    public void getInfo(){
        System.out.println("Merk = " + this.merk);
        System.out.println("Harga = " + getHarga());
        System.out.println("Kecepatan maksimal (km/jam = " + this.kecepatan);
        System.out.println("Warna = " + this.warna);
    }

    @Override
    public void gasPol() {
        System.out.println("Gas sampai batas maksimal");
    }

    @Override
    public void remSir() {
        System.out.println("sampai kendaraan berhenti");
    }

}
