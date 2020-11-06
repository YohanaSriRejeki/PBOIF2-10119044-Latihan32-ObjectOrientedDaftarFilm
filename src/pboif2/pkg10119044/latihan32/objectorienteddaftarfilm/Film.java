/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan film yang sedang tayang
 * dengan metode object oriented
 */

public class Film {
    
    public String filmName;
    public String filmGenre;
    public Double filmRating;
    public int filmDuration;
       
    public void nowPlaying() {
        System.out.println("Judul Film : "+filmName);
        System.out.println("Genre Film : "+filmGenre);
        System.out.println("Rating Film : "+filmRating);
        System.out.println("Duration Film : "+filmDuration+" Menit");
        System.out.println();

    } 
}
