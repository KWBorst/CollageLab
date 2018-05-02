import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; 

public class Picture extends SimplePicture
{
  ///////////////////// constructors //////////////////////////////////
  /**
   * Constructor that takes a file name and creates the picture
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }

  ////////////////////// methods ///////////////////////////////////////

  public void gray()
  {
      Pixel[] pixelArray  = this.getPixels();
      int avg, val, val2, val3;

      for (Pixel pixelObj : pixelArray)
      {
         //gets the color value for the current pixel
         val = pixelObj.getRed();
         val2 = pixelObj.getBlue();
         val3 = pixelObj.getGreen();

         //gets the average of the values
         avg = ((val + val2 + val3) / 3);

         //makes all the colors the average value, creating a grayscale
         pixelObj.setRed(avg);
         pixelObj.setBlue(avg);
         pixelObj.setGreen(avg);
       }
   }
   
   public void colorSwap()
   {
    Pixel[] pixelArray  = this.getPixels();
    int val, val2, val3;  
       
    for (Pixel pixelObj : pixelArray)
    {
        //gets the color value for the current pixel
        val = pixelObj.getRed();
        val2 = pixelObj.getBlue();
        val3 = pixelObj.getGreen();
        
        //swaps the green and red values
        pixelObj.setRed(val3);
        pixelObj.setGreen(val2);
        pixelObj.setBlue(val);
    }
   }

   public void nega()
   {
     int val, val2, val3;
     Pixel[] pixelArray = this.getPixels();
     
     for (Pixel pixelObj : pixelArray)
     {
        //gets the color value for the current pixel
        val = pixelObj.getRed();
        val2 = pixelObj.getBlue();
        val3 = pixelObj.getGreen();
        
        //makes each color its reverse
        pixelObj.setRed(255 - val);
        pixelObj.setBlue(255 - val2);
        pixelObj.setGreen(255 - val3);
     }  
   }

   public void copy(int xOff, int yOff, String sourceFile)
   {
       Picture sourcePicture = new Picture(sourceFile);

       Pixel sourcePixel = null;
       Pixel targetPixel = null;

       //width of source must be = or < the canvas I am copying to
       //loop through the columns
       for(int sourceX = 0, targetX = xOff; sourceX < sourcePicture.getWidth(); sourceX++, targetX++)
       {
           //loop through the rows
           for (int sourceY = 0, targetY = yOff; sourceY < sourcePicture.getHeight(); sourceY++, targetY++)
           {
               //set the target pixel color to the source pixel color
               sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
               targetPixel = this.getPixel(targetX, targetY);
               targetPixel.setColor(sourcePixel.getColor());
           }
       }
   }
   
   public void mirrorVertical(String sourceFile)
   {
       Picture sourcePicture = new Picture(sourceFile);
       
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       for(int sourceX = 0, targetX = 0; sourceX < sourcePicture.getWidth() / 2; sourceX++, targetX++)
       {
           //loop through the rows
           for (int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY++, targetY++)
           {
               //set the target pixel color to the source pixel color
               sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
               targetPixel = this.getPixel(sourcePicture.getWidth() - 1 - targetX, targetY);
               targetPixel.setColor(sourcePixel.getColor());
           }
       }
   } 
   
   public void mirrorHorizontal(String sourceFile)
   {
       Picture sourcePicture = new Picture(sourceFile);
       
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       for(int sourceX = 0, targetX = 0; sourceX < sourcePicture.getWidth(); sourceX++, targetX++)
       {
           //loop through the rows
           for (int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight() / 2; sourceY++, targetY++)
           {
               //set the target pixel color to the source pixel color
               sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
               targetPixel = this.getPixel(targetX, sourcePicture.getHeight() - 1 - targetY);
               targetPixel.setColor(sourcePixel.getColor());
           }
       }
   } 
   
   public void copySmaller(String sourceFile)
   {
       Picture sourcePicture = new Picture(sourceFile);
       
       Pixel sourcePixel = null;
       Pixel targetPixel = null;
       
       //loop through the columns
       for(int sourceX = 0, targetX = 0; sourceX < sourcePicture.getWidth(); sourceX= sourceX + 2, targetX++)
       {
           //loop through the rows
           for (int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY= sourceY + 2, targetY++)
           {
               //set the target pixel color to the source pixel color
               sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
               targetPixel = this.getPixel(targetX, targetY);
               targetPixel.setColor(sourcePixel.getColor());
           }
       }
   }
   
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() +
      " height " + getHeight()
      + " width " + getWidth();
    return output;

  }
}
