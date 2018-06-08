package com.iiitm.android.zaika_e_gwalior;

public class Adaptergharana {

    public int image;
    String name1,name2;
      Adaptergharana(int image,String name1,String name2)
      {
          this.image=image;
          this.name1=name1;
          this.name2=name2;
      }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
