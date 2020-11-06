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

public class PBOIF210119044Latihan32ObjectOrientedDaftarFilm {
    public static void main(String[] args) {
        Film f1 = new Film();
        f1.filmName = "Venom";
        f1.filmGenre = "Action, Horror, Scifi";
        f1.filmRating = 8.5;
        f1.filmDuration = 120;
        
        Film f2 = new Film();
        f2.filmName = "Small Foot";
        f2.filmGenre = "Animation";
        f2.filmRating = 9.0;
        f2.filmDuration = 96;
        
        Film f3 = new Film();
        f3.filmName = "Crazy Rich Asian";
        f3.filmGenre = "Comedy";
        f3.filmRating = 7.8;
        f3.filmDuration = 119;
        
        Film f4 = new Film();
        f4.filmName = "Asih";
        f4.filmGenre = "Horror";
        f4.filmRating = 6.0;
        f4.filmDuration = 100;
        
        System.out.println("===Daftar Film Sedang Tayang==="+"\n");
        f1.nowPlaying();
        f2.nowPlaying();
        f3.nowPlaying();
        f4.nowPlaying();
                
        
        
    }
    
}
