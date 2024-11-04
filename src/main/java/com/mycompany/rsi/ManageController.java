/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ManageController {
    private List<Artikel> Articles = new ArrayList<>();
    private List<Video> Videos = new ArrayList<>();
    

    public void Articles() {
        Articles = Aplikasi.article.getRecentArticles();
        showArticles(Articles);
    }

    public void showArticles(List<Artikel> Articles) {
        Aplikasi.beranda.tampilkanArtikel(Articles);
    }

    public void loadVideos() {
        Videos = Aplikasi.video.getRecentVideos();
        showVideos(Videos);
    }

    public void showVideos(List<Video> Videos) {
        Aplikasi.beranda.tampilkanVideo(Videos);
    }


}
