package yhan;

abstract class Orang implements Biodata {

    protected String nama;
    protected String alamat;

    @Override
    public String getnama() {
        return this.nama;
    }

    @Override
    public String getAlamat() {
        return this.alamat;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
