/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motion;

import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.util.Date;
/**
 *
 * @author ariza_000
 */
public class capture {
    /*
}
    public static void main(String[] args) throws IOException {

		// get default webcam and open it
		
        Webcam webcam = Webcam.getDefault();
        Dimension mydimension= new Dimension();
                mydimension.height=768;
                mydimension.width=1024; 
                webcam.setViewSize(mydimension);
		webcam.open();
                
                
               

		// get image
		BufferedImage image = webcam.getImage();

		// save image to PNG file
                Date mydate = new Date();
                
		ImageIO.write(image, "PNG", new File("../h/"+mydate.getTime()+"test.png"));
	}
*/
static int count=0;
    public static void capture() throws IOException{
         Webcam webcam = Webcam.getDefault();
        if(count==0){
       
     		webcam.open();
                count++;
        }
               

		// get image
		BufferedImage image = webcam.getImage();

		// save image to PNG file
                Date mydate = new Date();
                
		ImageIO.write(image, "PNG", new File("../h/"+mydate.getTime()+"test.png"));
        
    }
}
