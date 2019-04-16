import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageLoader {
    public static Image getImage(String path) {
    	URL u=ImageLoader.class.getClassLoader().getResource(path);
    	BufferedImage img=null;
    	try {
			img=ImageIO.read(u);
		} catch (IOException e) {		
			e.printStackTrace();
		}    	
    	return img;
    }
	public static void main(String[] args) {
		
		ImageLoader id=new ImageLoader();
		id.getImage("G:\\ouyanghaifei\\doc");
		System.out.println("Õº∆¨º”‘ÿÕÍ±œ");
	}

}
