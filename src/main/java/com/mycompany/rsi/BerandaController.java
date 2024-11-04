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
public class BerandaController {
    private List<Artikel> recentArticle = new ArrayList<>();
    private List<Video> recentVideo = new ArrayList<>();
        
    public void loadRecentArticle(){
        recentArticle = Aplikasi.article.getRecentArticles();
        showRecentArticle(recentArticle);
    }
    
    public void showRecentArticle(List<Artikel> recentArticles){
        Aplikasi.beranda.tampilkanArtikel(recentArticles);
    }    
    
    public void loadRecentVideo(){
        recentVideo = Aplikasi.video.getRecentVideos();
        showRecentVideo(recentVideo);
    }
    
    public void showRecentVideo(List<Video> recentVideos){
        Aplikasi.beranda.tampilkanVideo(recentVideos);
    }
    
    

}
