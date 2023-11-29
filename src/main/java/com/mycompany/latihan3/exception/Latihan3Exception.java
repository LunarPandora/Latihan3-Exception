/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class Latihan3Exception {

    public static void main(String[] args) throws FileNotFoundException, ProgramException, InputMismatchException {
        try{
            Penyimpanan disk1 = new Penyimpanan("disk1");

            Scanner dialogue = new Scanner(System.in);
            System.out.println("Masukkan jumlah file yang ingin ditambahkan : ");

            int jlhFile = dialogue.nextInt();
            for(int i = 0; i < jlhFile; i++) {
                String tempNamaFile;
                String tempIsiFile;

                System.out.println("Masukkan nama file " + Integer.toString(i + 1) + " : ");
                tempNamaFile = dialogue.next();

                if(tempNamaFile != "" | tempNamaFile != null){
                    dialogue.nextLine();
                    System.out.println("Masukkan isi file " + Integer.toString(i + 1) + " : ");
                    tempIsiFile = dialogue.next();

                    if(tempIsiFile != "" | tempIsiFile != null){
                        File newFile = new File(tempNamaFile, tempIsiFile);
                        disk1.tambahFile(newFile);
                    }
                    else{
                        throw new InputMismatchException("InputMismatchError : Nama file tidak boleh kosong!");
                    }
                }
                else{
                    throw new InputMismatchException("InputMismatchError : Nama file tidak boleh kosong!");
                }
            }

            System.out.println("Masukkan nama file yang ingin dibaca : ");
            String namaFile = dialogue.next();

            disk1.bacaFile(namaFile);
        }
        catch(FileNotFoundException FNFe){
            System.out.println(FNFe.getMessage());
        }
        catch(ProgramException Pe){
            System.out.println(Pe.getMessage());
        }
        catch(InputMismatchException IMe){
            System.out.println("InputMismatchError : Input tidak valid. Silahkan masukkan format nama file yang benar.");
        }
    }
}
