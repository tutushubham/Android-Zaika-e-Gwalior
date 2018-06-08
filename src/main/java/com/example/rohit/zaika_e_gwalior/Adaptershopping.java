package com.iiitm.android.zaika_e_gwalior;

/**
 * Created by rohit on 18/9/17.
 */

public class Adaptershopping {


    public int image;
    public String name1, name2, name3, name4, name5;
    Adaptershopping(int image,String name1,String name2,String name3,String name4,String name5)
    {
        this.image= image;
        this.name1=name1;
        this.name2=name2;
        this.name3=name3;
        this.name4=name4;
        this.name5=name5;

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

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }
}                                                                                             