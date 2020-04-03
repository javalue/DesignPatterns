package com.example.designpatterns.structural.adapter;

/**
 * @author tong.xu
 * @date 2020/4/3.
 * description：
 */
public class Mp4Player implements AdvancedMediaPlayer{

  @Override
  public void playVlc(String fileName) {
    //什么也不做
  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing mp4 file. Name: "+ fileName);
  }
}
