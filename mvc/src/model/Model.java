package model;

public class Model {
    private int uno;
    private int dos;
    private int res;

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int Result(){
        this.res = this.uno * this.dos;
        return this.res;
    }
}
