package com.iiitm.android.zaika_e_gwalior;

/**
 * Created by rohit on 16/9/17.
 */

public class Adapter {
    public  String name;
       public int image;
    Adapter(String name,int image)
    {
        this.name= name;
        this.image= image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
