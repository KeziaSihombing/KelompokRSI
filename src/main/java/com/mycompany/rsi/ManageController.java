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
    
     public List<Artikel> loadArticle(){
        return Articles = Aplikasi.article.getArticlesByPage(1);        
    }
    
    public void showArticle(List<Artikel> recentArticles){
        Aplikasi.manage.tampilkanArticle(recentArticles);
    }    
    
    public List<Video> loadVideo(){
        return Videos = Aplikasi.video.getVideosByPages(1);
    }
    
    public void showVideo(List<Video> Videos){
        Aplikasi.manage.tampilkanVideo(Videos);
    }
    
    
  


}
