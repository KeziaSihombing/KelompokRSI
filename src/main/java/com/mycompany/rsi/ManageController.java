/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.rsi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class ManageController {
    private List<Artikel> Articles = new ArrayList<>();
    private List<Video> Videos = new ArrayList<>();
    private List<Content> allContent = new ArrayList<>();
   
    
     public List<Artikel> loadArticle(int page){
        return Articles = Aplikasi.article.getArticlesByPage(page);        
    }
    
    public void showArticle(List<Artikel> Articles){
        Aplikasi.manage.tampilkanArticle(Articles);
    }    
    
    public List<Video> loadVideo(int page){
        return Videos = Aplikasi.video.getVideosByPages(page);
    }
    
    public void showVideo(List<Video> Videos){
        Aplikasi.manage.tampilkanVideo(Videos);
    }
    
    private void loadAllContent() {
        allContent.clear();
        List<Artikel> listArtikel = Aplikasi.article.getAllArticles(); // Muat semua artikel
        List<Video> listVideo = Aplikasi.video.getAllVideos();       // Muat semua video

        // Gabungkan artikel dan video ke dalam satu list
        allContent.addAll(listArtikel);
        allContent.addAll(listVideo);

        // Urutkan berdasarkan tanggal publikasi terbaru
        allContent.sort((content1, content2) -> content2.getTanggalPublikasi().compareTo(content1.getTanggalPublikasi()));
    }

    // Muat konten berdasarkan halaman tertentu
    public List<Content> loadContentByPage(int page) {
        int offset = (page - 1) * 4;
       
        // Ambil subset konten untuk halaman saat ini
        return allContent.stream()
                .skip(offset)
                .limit(4)
                .collect(Collectors.toList());
    }

    // Tampilkan konten untuk halaman saat ini
    public void showAll(int page) {
        loadAllContent();
        List<Content> contentPage = loadContentByPage(page);
        Aplikasi.manage.tampilkanSemua(contentPage);
        
    }  
  


}
