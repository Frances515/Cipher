
/**
 * @author @author Frances E.A. Antwi-Donkor 
 */
public class test {
    public boolean isAorE(char ch){
        if (ch == 'a' || ch == 'e'){
            return true;
        }
        
        return false;
    }

    public void test(){
        System.out.println(isAorE('e'));
    }
}
