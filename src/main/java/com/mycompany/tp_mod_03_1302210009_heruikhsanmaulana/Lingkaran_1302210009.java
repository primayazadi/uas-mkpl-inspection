package com.mycompany.tp_mod_03_1302210009_heruikhsanmaulana;

public class Lingkaran_1302210009 {
    public String warna;
    public double jari;

    public void printWarna_1302210009() {
        System.out.println("Warna lingkaran adalah " + warna); // Error: Variable "warna" might not be initialized
    }

    public void setWarna_1302210009(String WarnaLingkaran) {
        warna = WarnaLingkaran; // Error: Misspelled variable name "WarnaLingkaran"
    }

    public double calculateKeliling() {
        return (22.0 / 7.0 * 2.0) * jari; // Error: Incorrect formula for circumference
    }

    public void printkeliling_1302210009() {
        double keliling = calculateKeliling();
        System.out.println("Keliling objek lingkaran adalah " + keliling);
    }

    public double calculateLuas() {
        return (22.0 / 7.0 * jari) * jari; // Error: Incorrect formula for area
    }

    public void printLuas_1302210009() {
        double luas = calculateLuas();
        System.out.println("Luas objek lingkaran adalah " + luas);
    }
}
