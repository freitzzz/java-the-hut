package freitzzz.yourownsoundboard.utils;

import android.media.MediaPlayer;

import java.io.IOException;

/**
 * Utility class that plays sounds
 */

public class SoundPlayer{
    /**
     * MediaPlayer being used on this object instace
     */
    private MediaPlayer mp;
    /**
     * File path of the sound path being used
     */
    private String filePath;

    /**
     * Builds new SoundPlayer instance with the file path of the file being reproduced
     * @param filePath String with the file path
     */
    public SoundPlayer(String filePath){
        this.filePath=filePath;
    }
    /**
     * Plays the sound defined on the file path
     * @throws IOException IOException if file can't be read or doesn't exist
     */
    public void play() throws IOException {
        initializePlayer();
        initializeListeners();
        preparePlayer();
    }
    /**
     * Checks if the player is playing
     * @return boolean true if playing, false if not
     */
    public boolean isPlaying(){
        return mp.isPlaying();
    }
    /**
     * Checks if the player is active
     * @return boolean true if active, false if not
     */
    public boolean isActive(){
        return mp!=null;
    }
    private void startPlayer(){
        mp.start();
    }
    private void stopPlayer(){
        mp.stop();
    }
    private void closePlayer(){
        mp.release();
    }
    private void nullifyPlayer(){
        mp=null;
    }
    private void preparePlayer() throws IOException {
        mp.prepare();
    }
    private void initializePlayer() throws IOException {
        mp=new MediaPlayer();
        mp.setDataSource(filePath);
    }
    private void initializeListeners(){
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                startPlayer();
            }
        });
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stopPlayer();
                closePlayer();
                nullifyPlayer();
            }
        });
    }
}
