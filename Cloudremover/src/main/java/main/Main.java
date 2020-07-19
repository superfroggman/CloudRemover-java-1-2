package main;

import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.model.Picture;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, JCodecException {

        File videoFile = new File("/home/anton/Videos/blur.mp4");
        Picture frame = FrameGrab.getFrameFromFile(videoFile, 0);
        System.out.println("w: " + frame.getWidth());

        int i = 0;

        try {
            while (null != FrameGrab.getFrameFromFile(videoFile, i)){
                i++;
            }
        }catch (Exception e){
            System.out.println("crash");
            e.printStackTrace();
        }


        System.out.println("frame count: " + i);


    }
}
