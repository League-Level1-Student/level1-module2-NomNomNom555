package extra;

public class PixelPartyRunner {
public static void main(String[] args) {
	PixelParty lame = new PixelParty();
	
	lame.setColor(184, 225, 252);
	lame.setRainbow(true);
	int uno= 75;
	int dos= 461;
	int tres = 189;
	for(int i=0; i<6; i++) {
		lame.drawCircle(uno, dos , tres);
		uno+= 30;
		dos-= 69;
		tres+= 15;
	}
	int g = 50;
	int t = 367;
	dos=500;
	uno= 175;
	for(int i =0; i<6; i++) {
		lame.drawRectangle(dos, t, g, uno);
		dos-=59;
		t-=32;
		g+=53;
		uno+=44;
	}
	int yay = 370;
	int nay = 299;
	int boo = 510;
	int woo = 321;
	int hee = 329;
	int haw = 67;
	for(int i=0;i<6;i++) {
		lame.drawTriangle(yay, nay, boo, woo, hee, haw);
		yay+=28;
		nay+=29;
		boo-=21;
		woo-=19;
		hee+=9;
		haw+=8;
	}
	lame.saveImage();
	lame.displayImage();
	
}
}
