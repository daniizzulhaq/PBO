package uts;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int semester;
    private int usia;
    private String[] krs;
    
    public float hitungRataNilai(int[] nilai) {
        float total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }

    
    public void infoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
    }
    
    public void infoKrsMahasiswa() {
        System.out.println("KRS: ");
        for (String m : krs) {
            System.out.println("- " + m);
        }
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    public void setKrs(String[] krs) {
        this.krs = krs;
    }
}

class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;
    
    public boolean ikutOSPEK() {
        // kode untuk implementasi ikut OSPEK
        return true;
    }
    
    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
    }
    
    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }
}

class MahasiswaLulus extends Mahasiswa {
    private int tahunWisuda;
    private float ipk;
    
    public boolean ikutWisuda() {
        // kode untuk implementasi ikut wisuda
        return true;
    }
    
    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda: " + tahunWisuda);
        System.out.println("IPK: " + ipk);
    }
    
    @Override
    public void infoKrsMahasiswa() {
        System.out.println("KRS tidak tersedia karena sudah lulus.");
    }
    
    public void setTahunWisuda(int tahunWisuda) {
        this.tahunWisuda = tahunWisuda;
    }
    
    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}

class MahasiswaTransfer extends MahasiswaBaru {
    private String asalUniversitas;
    
    @Override
    public boolean ikutOSPEK() {
        // kode untuk implementasi ikut OSPEK untuk mahasiswa transfer
        return false;
    }
    
    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas: " + asalUniversitas);
    }
    
    public void setAsalUniversitas(String asalUniversitas) {
        this.asalUniversitas = asalUniversitas;
    }
}
