
/**
 * @author @author Frances E.A. Antwi-Donkor 
 */
public class WordPlay {
    public boolean isVowel(char ch){
        String vowels = "aeiou";
        for(int i=0; i< vowels.length(); i++){
            char value = vowels.charAt(i);
            if(value == ch){
                return true;
            }
        }
        return false;
    }
    
    
    public void testVowel(){
        System.out.println(isVowel('a'));
        System.out.println(isVowel('b'));
    }
    
    public String replaceVowels(String phrase, char ch){
        boolean output;
        StringBuilder alphabet = new StringBuilder(phrase);
        for(int i=0; i< phrase.length(); i++){
            char newAlphabet = phrase.charAt(i);
            output = isVowel(newAlphabet);
            if(output == true){
                alphabet.setCharAt(i, ch);
            }
        }
        return alphabet.toString();
    }
    
    public void testReplaceVowel(){
        System.out.println(replaceVowels("Hello World", '*'));
    }
    
    public String emphasize(String phrase, char ch){
        boolean output;
        StringBuilder newPhrase = new StringBuilder(phrase);
        ch = Character.toLowerCase(ch);
        phrase = phrase.toLowerCase();
        int index = 0;
        for(int i =0; i<phrase.length(); i++){
            char currChar = phrase.charAt(i); 
            index++;
            if(currChar == ch){
                if(index % 2 == 0){
                    newPhrase.setCharAt(i, '+');
                }
                else{
                    newPhrase.setCharAt(i, '*');
                }
                
            }
        }
        return newPhrase.toString();
    }
    
    public void testEmphasize(){
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
}
