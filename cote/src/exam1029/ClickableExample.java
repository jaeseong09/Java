package exam1029;

public class ClickableExample {
  public static void main(String[] args) {
	Clickable c1 = new Button("OK");
	Clickable c2 = new Image("a.jspg");
	
	c1.click();	
	c2.click();
	
	if(c2 instanceof Image) {
		Image i = (Image) c2;
		System.out.println(i.url);
		Drawable d = i;
		d.draw();
	}
	
	if(c1 instanceof Button) {
		Button b = (Button) c1;
		System.out.println(b.label);
		Drawable d = b;
		d.draw();
	}
	
	
  }
}
