package StudentDB;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;

// JFrame을 이미지로 저장하는 함수(?)
public class ScreenShot {
    public ScreenShot(JFrame argFrame, int i) {
        Rectangle rec = argFrame.getBounds(); // JFrame 의 크기 저장을 위한 Ractangle
        BufferedImage bufferedImage = new BufferedImage(rec.width, rec.height, BufferedImage.TYPE_INT_ARGB); // JFrmae 크기에 맞춰 Bufferdiamge 생성
        argFrame.paint(bufferedImage.createGraphics());// Jframe을 bufferedImage에 그린다
        bufferedImage.setRGB(0, 0, 100);
        try {
            // Create test file
            File test = new File("C:\\Users\\home\\Desktop\\JFrame캡쳐\\test"+i+".png");

            // Use the ImageIO API to write the bufferedImage to a temporary file
            ImageIO.write(bufferedImage, "png", test);


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

