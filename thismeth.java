
package BCA.keyword;

public class thismeth {
    void m()
    {
        System.out.println("m method");
        
    }
    void n()
    {
        this.m();
        
    }
    public static void main(String[]  args)
    {
        thismeth t = new thismeth();
        t.m();
    }
    
}
