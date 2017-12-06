
package motion;
 
import java.io.IOException;
 
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamMotionDetector;
import com.github.sarxos.webcam.WebcamMotionEvent;
import com.github.sarxos.webcam.WebcamMotionListener;
import java.awt.Dimension;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 * Detect motion.
 * 
 * @author Bartosz Firyn (SarXos)
 */
public class Motion implements WebcamMotionListener {
 
	public Motion() {
             Webcam webcam = Webcam.getDefault();
      
       
        Dimension mydimension= new Dimension();
                mydimension.height=768;
                mydimension.width=1024; 
                webcam.setViewSize(mydimension);
            
            
		WebcamMotionDetector detector = new WebcamMotionDetector(webcam);
		detector.setInterval(100); // one check per 100 ms
		detector.addMotionListener(this);
		detector.start();
	}
static int count=0;
	@Override
	public void motionDetected(WebcamMotionEvent wme) {
		
                                        
                System.out.println("Detected motion I, alarm turn on you have"+count);
               cakap();
            try {
                capture.capture();
            } catch (IOException ex) {
                Logger.getLogger(Motion.class.getName()).log(Level.SEVERE, null, ex);
            }
              
	}
        public static void cakap(){
            
            String ayatArray[]= new String[6];
            
            ayatArray[0]="Hai awak";
            ayatArray[1]="Awak, jap laa, naak pergi manaa tuu?";
            ayatArray[2]="Awak dari manaa?";
            ayatArray[3]="Hello there";
            ayatArray[4]="Awak da makaan?";
            ayatArray[5]="Awak nak pergi manaa?";
            
            
                Random rand = new Random(); 
int value = rand.nextInt(6); 
            
             if(count%6==0){
                String ayat=ayatArray[value];
               cakap.cakap(ayat);
                }
                count++;
            
        }
        
 
	public static void Main(String[] args) throws IOException {
            
            /*
		new Motion();
		System.in.read(); // keep program open
                NewJFrame myFrame= new NewJFrame();
                myFrame.setVisible(true);
                
              */  
                
	}
}