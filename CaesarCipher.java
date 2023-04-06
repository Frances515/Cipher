
/**
 * @author @author Frances E.A. Antwi-Donkor 
 */
import edu.duke.*;
public class CaesarCipher {
    public String encrypt(String input, int key){
        String newInput = input.toUpperCase();
        StringBuilder encrypted = new StringBuilder(newInput);
        StringBuilder encryptedNew = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        for(int i=0; i<encrypted.length(); i++){
            char currChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currChar);
            int oldIndex = input.indexOf(currChar);
            char currCharN = encryptedNew.charAt(i);
            boolean letter = Character.isLowerCase(currCharN);
            
            if(index != -1){
                char newChar = shiftedAlphabet.charAt(index);
                if(currChar != currCharN && letter == true){
                    newChar = Character.toLowerCase(newChar);
                }
                encrypted.setCharAt(i,newChar);
            }
        }
        return encrypted.toString();
    }
    
    public void testEncrypt(){
       System.out.println(encrypt("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!", 17));
       /*int key = 23;
       FileResource fr = new FileResource();
       String message = fr.asString();
       String encrypted = encrypt(message, key);
       System.out.println("key is " + key + "\n" + encrypted);*/
    }
    
    public String encryptTwoKeys(String input, int key1, int key2){
        String newInput = input.toUpperCase();
        StringBuilder encrypted = new StringBuilder(newInput);
        StringBuilder encryptedNew = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String shiftedAlphabet = alphabet.substring(key1) + alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0,key2);
        int pos =0;
        for(int i=0; i<encrypted.length(); i++){
            char currChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currChar);
            int oldIndex = input.indexOf(currChar);
            char currCharN = encryptedNew.charAt(i);
            boolean letter = Character.isLowerCase(currCharN);
            pos++;
            //System.out.println(pos);
            if(index != -1){
                char newChar = shiftedAlphabet.charAt(index);
                if(pos%2 == 0){
                   newChar = shiftedAlphabet2.charAt(index);
                        
                }
                if(currChar != currCharN && letter == true){
                    newChar = Character.toLowerCase(newChar);
                }
                encrypted.setCharAt(i,newChar);
            }
        }
        return encrypted.toString();
        
    }
    
    public void testEncryptTwoKeys(){
       System.out.println(encryptTwoKeys("Can you imagine life WITHOUT the internet AND computers in your pocket",21, 8));
       /*int key = 23;
       FileResource fr = new FileResource();
       String message = fr.asString();
       String encrypted = encrypt(message, key);
       System.out.println("key is " + key + "\n" + encrypted);*/
    }
}
