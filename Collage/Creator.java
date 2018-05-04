public class Creator
{
    public static void main(String[] args)
    {
        Picture canvas = new Picture("images/Large Canvas.jpg");
        Picture picture1 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture2 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture3 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture4 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture5 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture6 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture7 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture8 = new Picture("images/tearingmeapartlisa.jpg");
        Picture picture9 = new Picture("images/tearingmeapartlisa.jpg");
        
        //picture1.explore();
        //canvas.copy(35, 40, "images/tearingmeapartlisa.jpg"); //41 should be height of border on border
        
        //picture2.nega();
        //picture2.explore();
        //picture2.write("images/negatear.jpg");
        //canvas.copy(1345, 40, "images/negatear.jpg");

        //picture3.mirrorVertical("images/tearingmeapartlisa.jpg");
        //picture3.explore();
        //picture3.write("images/verttear.jpg");
        //canvas.copy(2655, 40, "images/verttear.jpg");
        
        //picture4.mirrorHorizontal("images/tearingmeapartlisa.jpg");
        //picture4.colorSwap();
        //picture4.explore();
        //picture4.write("images/horcoltear.jpg");
        //canvas.copy(35, 913, "images/horcoltear.jpg");
        
        //picture5.recursion("images/tearingmeapartlisa.jpg", 2);
        //picture5.explore();
        //picture5.write("images/infinitetear.jpg");
        //canvas.copy(1345, 913, "images/infinitetear.jpg");
        
        //picture6.blend("images/Ohhaimark.jpg");
        //picture6.explore();
        //picture6.write("images/Marktear.jpg");
        //canvas.copy(2655, 913, "images/Marktear.jpg");
        
        picture7.flip("images/tearingmeapartlisa.jpg"); //Not done
        //picture7.gray();
        picture7.explore();
        //picture7.write("images/flipgraytear.jpg");
        //canvas.copy(35, 1786, "images/flipgraytear.jpg")
        
        //picture8.quad("images/tearingmeapartlisa.jpg");
        //picture8.myColor();
        //picture8.explore();
        //picture8.write("images/myquadtear.jpg");
        //canvas.copy(1345, 1786, "images/myquadtear.jpg");
        
        //picture9.shep();
        //picture9.explore();
        //picture9.write("images/sheptear.jpg");
        //canvas.copy(2655, 1786, "images/sheptear.jpg");
        
        canvas.explore();
        
        //canvas.write("images/Final Canvas.jpg");
    }
}
