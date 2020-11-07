/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan32.daftarfilm;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Daftar Film
 */
class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println();
        System.out.println("Judul Film\t: ".concat(filmName));
        System.out.println("Genre Film\t: ".concat(filmGenre));
        System.out.println("Rating Film\t: "+ Double.toString(filmRating));
        System.out.println("Duration Film\t: "+ Integer.toString(filmDuration) 
                           + " Menit");
    }
    
}