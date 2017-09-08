package freitzzz.yourownsoundboard.core;

import java.io.File;

/**
 * Represents a button from the SoundBoard
 */

public class Button {
    /**
     * Description/Name of the button
     */
    private String description;
    /**
     * Sound of the buttion
     */
    private File media;
    /**
     * File path of the sound
     */
    private String filePath;
    /**
     * Builds new Button with the button description and media sound
     * @param description String with description of the button
     * @param media File with the media sound
     */
    public Button(String description,File media){
        this.description=description;
        this.media=media;
    }
    /**
     * Builds new Button with the button description and media sound
     * @param description String with description of the button
     * @param media String with the media sound
     */
    public Button(String description,String media){
        this.description=description;
        this.filePath=media;
    }
    /**
     * Hides default constructor
     */
    private Button(){};
}
