/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motion;

/**
 *
 * @author ariza_000
 */
public class cakap {
    
    public static void cakap(String ayat){
        
         TextToSpeechConvertor ttsc = new TextToSpeechConvertor();
         String inputText;
          inputText = ayat;
 ttsc.speak(inputText);
    }
    
}
