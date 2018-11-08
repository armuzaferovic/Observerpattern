import java.util.Random;

public class Klassenraum {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Random r = new Random();
		int x = r.nextInt(80);
		Prof Herwig = new Prof();
		Prof2 pM = new Prof2();
		HeizungS102 h = new HeizungS102(34);
		h.register(Herwig);
		h.register(pM);
		Thread.sleep(1000);
		h.setTemp(x);
		System.out.println(x);
			h.ntify();
		
		
		
		}
	}


