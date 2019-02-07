package com.example.test10;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;

public class Travel implements Serializable {
    public static int STATIC_FIELD = 4;
    private int imageID;
    public String baslik;
    public String tanim;

    public Travel() {


    }




    public int getImageID() {
        return imageID;
    }

    public String getBaslik() {
        return baslik;
    }

    public String getTanim() {
        return tanim;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }








}
