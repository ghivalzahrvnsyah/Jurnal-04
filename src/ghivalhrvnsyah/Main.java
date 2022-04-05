package ghivalhrvnsyah;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedList<Pegawai> listPegawai = new SinglyLinkedList<>();
        int pilihan;
        do{
        printMenu();
        System.out.println("Masukkan Pilihan Anda :");
        pilihan = input.nextInt();
            switch (pilihan){
                case 1 :
                printAddMenu();
                int tambah = input.nextInt();
                if(tambah == 1){
                    System.out.println("NIP :");
                    String nip = input.next();
                    System.out.println("Nama :");
                    String nama = input.next();
                    System.out.println("Divisi :");
                    String divisi = input.next();
                    Pegawai pegawai = new Pegawai(nip, nama, divisi);
                    listPegawai.insertAtFront(pegawai);
                    break;
                }else if(tambah == 2){
                    System.out.println("NIP :");
                    String nip = input.next();
                    System.out.println("Nama :");
                    String nama = input.next();
                    System.out.println("Divisi :");
                    String divisi = input.next();
                    Pegawai pegawai = new Pegawai(nip, nama, divisi);
                    listPegawai.insertAtBehind(pegawai);
                    break;
                }
                case 2:
                   printDeleteMenu();
                   int hapus = input.nextInt();
                   if(hapus == 1 ){
                       listPegawai.romoveFromFront();
                       break;
                   }else if (hapus == 2) {
                       listPegawai.removeFromBehind();
                       break;
                   }


                case 3:
                    System.out.println("List data pegawai yang tersimpan");
                    listPegawai.printData();
                    break;


            }

        }while(pilihan !=0);


    }
    public static void printMenu(){
        System.out.println("Silahkan Pilih Menu Dibawah!");
        System.out.println("1. Add data Pegawai");
        System.out.println("2. Hapus data Pegawai");
        System.out.println("3. Cetak data Pegawai");
        System.out.println("0. Keluar");
    }
    public static void printAddMenu(){
        System.out.println("Letak data akan Disimpan");
        System.out.println("1. Di depan");
        System.out.println("2. Di belakang");

    }
    public static void printDeleteMenu(){
        System.out.println("Letak data yang ingin dihapus");
        System.out.println("1. Di depan");
        System.out.println("2. Di belakang");

    }

}



