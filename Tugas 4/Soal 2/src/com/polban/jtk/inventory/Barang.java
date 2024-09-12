package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public String getKodeBarang() {
        return kode_barang;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int tambahan) {
        if (tambahan > 0) {
            stok += tambahan;
        }
    }
}

