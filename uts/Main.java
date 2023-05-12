package uts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        // input data mahasiswa
        System.out.print("Jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // consume newline
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            
            // input data umum
            System.out.print("NIM: ");
            String nim = input.nextLine();
            
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Semester: ");
            int semester = input.nextInt();
            input.nextLine(); // consume newline
            
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine(); // consume newline
            
            System.out.print("Jumlah mata kuliah: ");
            int jumlahMatkul = input.nextInt();
            input.nextLine(); // consume newline
            
            String[] krs = new String[jumlahMatkul];
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Mata Kuliah ke-" + (j+1) + ": ");
                krs[j] = input.nextLine();
            }
            
            // input data khusus mahasiswa baru
            System.out.print("Apakah mahasiswa baru (y/n)? ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("y")) {
                MahasiswaBaru m = new MahasiswaBaru();
                m.setNim(nim);
                m.setNama(nama);
                m.setSemester(semester);
                m.setUsia(usia);
                m.setKrs(krs);
                
                System.out.print("Asal Sekolah: ");
                String asalSekolah = input.nextLine();
                m.setAsalSekolah(asalSekolah);
                
                daftarMahasiswa.add(m);
            }
            
            // input data khusus mahasiswa transfer
            System.out.print("Apakah mahasiswa transfer (y/n)? ");
            jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("y")) {
                MahasiswaTransfer m = new MahasiswaTransfer();
                m.setNim(nim);
                m.setNama(nama);
                m.setSemester(semester);
                m.setUsia(usia);
                m.setKrs(krs);
                
                System.out.print("Asal Universitas: ");
                String asalUniversitas = input.nextLine();
                m.setAsalUniversitas(asalUniversitas);
                
                daftarMahasiswa.add(m);
            }
            
            // input data khusus mahasiswa lulus
            System.out.print("Apakah mahasiswa lulus (y/n)? ");
            jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("y")) {
                MahasiswaLulus m = new MahasiswaLulus();
                m.setNim(nim);
                m.setNama(nama);
                m.setSemester(semester);
                m.setUsia(usia);
                m.setTahunWisuda(2022); // contoh tahun wisuda
                m.setKrs(krs);
                
                System.out.print("IPK: ");
                float ipk = input.nextFloat();
                m.setIpk(ipk);
                input.nextLine(); // consume newline
                
                daftarMahasiswa.add(m);
            }
            
            // input data khusus mahasiswa yang bukan baru, transfer, atau lulus
            if (!jawaban.equalsIgnoreCase("y")) {
                Mahasiswa m = new Mahasiswa();
                m.setNim(nim);
                m.setNama(nama);
                m.setSemester(semester);
                m.setUsia(usia);
                m.setKrs(krs);
                
                daftarMahasiswa.add(m);
            }
        }
        
        // output informasi mahasiswa
        System.out.println("\nInformasi mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            m.infoMahasiswa();
            m.infoKrsMahasiswa();
            System.out.println();
        }
    }
}
