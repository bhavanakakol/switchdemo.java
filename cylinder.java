package feb12;

public class cylinder {
	final  float pi= 3.142f;
	double radius;
	double height;
	
	
	void volume() {
  double vol;
  vol=pi*radius*radius*height;
  System.out.println("volume of cylinder:"+vol);
	}
	
	public static void main(String[] args) {
		cylinder vol=new cylinder();
		vol.radius=1.2;
		vol.height=2.1;
		vol.volume();
		
		
	}

}
