package com.mycompany.latihan3.exception;

public class Penyimpanan {
    String namaPenyimpanan;
    File listFile[] = {};

    // Memberikan nama penyimpanan
    public Penyimpanan(String namaPenyimpanan) {
        this.namaPenyimpanan = namaPenyimpanan;
    }

    // Tambahkan file kedalam penyimpanan
    public void tambahFile(File file) throws ProgramException {
        try{
            if(file == null){
                throw new ProgramException("Error! File tidak dimasukkan!");
            }

            int i;

            File newListFile[] = new File[this.listFile.length + 1];
    
            for (i = 0; i < this.listFile.length; i++)
                newListFile[i] = this.listFile[i];
    
            newListFile[this.listFile.length] = file;
            listFile = newListFile;
        }
        catch(ProgramException e){
            System.out.println(e.getMessage());
        }
    }

    // Cari dan baca file dalam penyimpanan
    public void bacaFile(String namaFile) throws FileNotFoundException{
        try{
            int i;
            Boolean fileDitemukan = false;

            for (i = 0; i < this.listFile.length; i++){
                if(this.listFile[i].namaFile.equals(namaFile)){
                    this.listFile[i].buka();
                    
                    fileDitemukan = true;
                    break;
                }
            }

            if(!fileDitemukan){
                throw new FileNotFoundException("Error! File tidak dapat ditemukan.");
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
