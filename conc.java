package BCA.keyword;

public class conc {
     
    double width;
    double height;
    double depth;
    
   conc()
    {
        System.out.println("This is defult constuctor");
        width = 1;
        height = 1;
        depth = 2;
        
    }

    double vloume()
    {
        return width*height*depth;
    }
    
}
class boxdemo {     public static void main(String args[])
    {
        conc b1= new conc();
        conc b2= new conc();
        double vol;
        vol = b1.vloume();
        vol = b2.vloume();
        System.out.println("Volume = " + vol);
        
    }
}
