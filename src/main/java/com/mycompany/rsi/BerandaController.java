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
        
    public List<Artikel> loadRecentArticle(){
        return recentArticle = Aplikasi.article.getRecentArticles();        
    }
    
    public void showRecentArticle(List<Artikel> recentArticles){
        Aplikasi.beranda.tampilkanArtikel(recentArticles);
    }    
    
    public List<Video> loadRecentVideo(){
        return recentVideo = Aplikasi.video.getRecentVideos();
    }
    
    public void showRecentVideo(List<Video> recentVideos){
        Aplikasi.beranda.tampilkanVideo(recentVideos);
    }
    
    

}
