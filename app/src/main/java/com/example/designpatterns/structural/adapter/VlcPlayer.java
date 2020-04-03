package com.example.designpatterns.structural.adapter;

/**
 * @author tong.xu
 * @date 2020/4/3.
 * description：
 */
public class VlcPlayer implements AdvancedMediaPlayer{
  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file. Name: "+ fileName);
  }

  @Override
  public void playMp4(String fileName) {
    //什么也不做
  }
}
