package com.example.android.miwok;

import android.content.Context;

/**
 * Created by ehte6848 on 29-09-2017.
 */

public class Word {
   private String miwok;
    private int imageResourceId;
   private String english;
    private int maudio;
   // private Context mcontext;

    public Word(String miwok1,String english1, int audio)
    {
        miwok = miwok1;
        english = english1;
        maudio = audio;
     //   mcontext = context;
    }

    public Word(String miwok1,String english1,int imageResourceId1, int audio)
    {
        miwok = miwok1;
        english = english1;
        imageResourceId = imageResourceId1;
         maudio = audio;
    }

    public String getMiwok()
    {
        return miwok;
    }
    public int getImageResourceId(){ return imageResourceId ;}
    public int getAudioId(){return maudio;}

    public String getEnglish()
    {
        return english;
    }
    public void setMiwok(String miwok1)
    {
        miwok = miwok1;
    }
    public void setEnglish(String english1)
    {
        english = english1;
    }
}
