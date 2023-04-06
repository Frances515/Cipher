
/**
 * @author @author Frances E.A. Antwi-Donkor 
 */

import edu.duke.*;
public class CaesarCipher2 {
    private String alphabet;
    private String shiftedAlphabet;
    private int mainKey;
    
    public CaesarCipher2(int key){
        alphabet = "ABCDEFGHIJKLMNOPAQRSTUVWXYZ";
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        mainKey = key;
    }
    
    public String encrypt(String input){
        String newInput = input.toUpperCase();
        StringBuilder encrypted = new StringBuilder(newInput);
        StringBuilder encryptedNew = new StringBuilder(input);
        
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
    
    public String decrypt(String input){
        CaesarCipher2 cc = new CaesarCipher2(26-mainKey);
        cc.encrypt(input);
        return cc.toString();
    }
    
    
   
}
