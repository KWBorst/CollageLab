public class Creator
{
    public static void main(String[] args)
    {
        Picture canvas = new Picture("images/Large Canvas.jpg");
        Picture picture1 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture2 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture3 = new Picture("images/tearingmeapartlisa.jpg");
        
        picture1.explore();
        
        picture2.nega();
        picture2.explore();
        //picture2.write("images/negatear.jpg");
        
        picture3.mirrorVertical("images/tearingmeapartlisa.jpg");
        picture3.explore();
        //picture3.write("images/verttear.jpg");
    }
}
