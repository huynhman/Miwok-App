package com.example.android.miwok;

import android.content.Context;
import android.media.Image;

/**
 * Created by Tin on 2017-05-09.
 */

//Declaration of the class
public class Word {

//    State of the class
    private String mDefaultLanguage;
    private String mMiwokLanguage;
    private int mImageResourceId = NO_IMAGE;
    private int mSoundResourceId;

//Constructor for Word instance
    public Word (String defaultTranslation, String miwokTranslation, int SoundResourceId){
        mDefaultLanguage = defaultTranslation;
        mMiwokLanguage = miwokTranslation;
        mSoundResourceId = SoundResourceId;
    }

//  Constructor for Word instance with 1 imageview and 2 textviews, and sound ID
//
    public Word (String defaultTranslation, String miwokTranslation, int ImageResourceId, int SoundResourceId){
        mDefaultLanguage = defaultTranslation;
        mMiwokLanguage = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mSoundResourceId = SoundResourceId;

}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultLanguage='" + mDefaultLanguage + '\'' +
                ", mMiwokLanguage='" + mMiwokLanguage + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }

    //Constant for checking if word has image or not
    private static final int NO_IMAGE = -1;

//Get Default translation of the word
    public String getDefaultLanguage(){
        return mDefaultLanguage;
    }

//Get Miwok Translation of the word
    public String getMiwokLanguage(){
        return mMiwokLanguage;
    }

//Get Image Resource ID

    public int getImageResourceId() {
        return mImageResourceId;
    }
//    Checks to see if word has an image or not
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
//    Get Sound resource ID of word
    public int getSoundResourceId() {return mSoundResourceId;}

}
