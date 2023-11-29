package com.mycompany.latihan3.exception;

public class File {
    String namaFile;
    String isi;

    // Memasukkan nama file dan isi file
    public File(String namaFile, String isi){
        this.namaFile = namaFile;
        this.isi = isi;
    }

    // Membuka dan menampilkan isi file
    public void buka(){
        System.out.println("\n=========================================");
        System.out.println("Nama File : " + this.namaFile);
        System.out.println("=========================================");
        System.out.println(this.isi);
        System.out.println("=========================================");
    }
}
