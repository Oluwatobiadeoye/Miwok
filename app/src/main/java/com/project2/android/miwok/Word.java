package com.project2.android.miwok;

/**
 * Created by adeoye oluwatobi on 6/7/2017.
 */
public class Word {

    private  String mDefaultTranslation;
    private int mAudioResourceId;
    private  String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation,String miwokTarnslation,int audioResourceId)
                {
        mAudioResourceId =audioResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTarnslation;
    }

    public Word (String defaultTranslation,String miwokTarnslation,int imageResourceId,int audioResourceId)
    {
        mAudioResourceId = audioResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTarnslation;
        mImageResourceId = imageResourceId;
    }
    public String getDefaultTranslation (){
    return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
    return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
