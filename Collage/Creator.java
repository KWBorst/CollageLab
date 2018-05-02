public class Creator
{
    public static void main(String[] args)
    {
        Picture canvas = new Picture("images/Large Canvas.jpg");
        Picture picture1 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture2 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture3 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture4 = new Picture("images/tearingmeapartlisa.jpg");
        
        //picture1.explore();
        canvas.copy(35, 40, "images/tearingmeapartlisa.jpg"); //41 should be height of border on border
        
        //picture2.nega();
        //picture2.explore();
        //picture2.write("images/negatear.jpg");
        canvas.copy(1345, 40, "images/negatear.jpg");

        //picture3.mirrorVertical("images/tearingmeapartlisa.jpg");
        //picture3.explore();
        //picture3.write("images/verttear.jpg");
        canvas.copy(2655, 40, "images/verttear.jpg");
        
        //picture4.mirrorHorizontal("images/tearingmeapartlisa.jpg");
        //picture4.colorSwap();
        //picture4.explore();
        //picture4.write("images/horcoltear.jpg");
        canvas.copy(35, 913, "images/horcoltear.jpg");
        
        canvas.explore();
        
        //canvas.write("images/Final Canvas.jpg");
    }
}
