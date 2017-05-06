package com.example.android.miwok;

/**
 *{@link Word} represent a vocabulary word that user wants to learn.
 * It contains a default translation and an english translation for the word
 */

public class Word {

    /** Default translation for that word*/
    private String mDefaultTranslation;

    /**Miwok translation for that word*/
    private String mMiwokTranslation;

    public Word(String defaultTransaltion , String miwokTranslation){
        mDefaultTranslation=defaultTransaltion;
        mMiwokTranslation= miwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

}
