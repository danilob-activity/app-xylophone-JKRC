package com.profdanilo.activity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.profdanilo.activity.R;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,2);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,3);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,4);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,5);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,6);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,7);

    }



    // TODO: Add the play methods triggered by the buttons

    public void playC(View view) {
        Log.d("Xylophone", "Red button");
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY
                ,NO_LOOP,NORMAL_PLAY_RATE);

    }

    public void playD(View view) {
        Log.d("Xylophone", "Orange button");
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY
                ,NO_LOOP,NORMAL_PLAY_RATE);

    }

    public void playB(View view) {
        Log.d("Xylophone", " Purple button");
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY
                ,NO_LOOP,NORMAL_PLAY_RATE);

    }

    public void playA(View view) {
        Log.d("Xylophone", "Blue button");
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY
                ,NO_LOOP,NORMAL_PLAY_RATE);

    }

    public void playG(View view) {
        Log.d("Xylophone", "Turquoise button");
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY
                ,NO_LOOP,NORMAL_PLAY_RATE);

    }

    public void playF(View view) {
        Log.d("Xylophone", "Green button");
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY
                ,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        Log.d("Xylophone", "Yellow button");
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY
                ,NO_LOOP,NORMAL_PLAY_RATE);
    }



}
