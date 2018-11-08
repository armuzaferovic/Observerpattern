
public class Klassenraum {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Prof Herwig = new Prof();
		Prof2 pM = new Prof2();
		HeizungS102 h = new HeizungS102(34);
		Thread.sleep(1000);
		h.setTemp(35);
		if(h.getTemp() == 35){
			Herwig.update();
			pM.update();
		}
		
		
		}
	}


