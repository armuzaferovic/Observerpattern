import java.util.ArrayList;

public class HeizungS102 extends Subject{
private ArrayList<IObserver> oblist = new ArrayList<IObserver>();
private int temperatur;
public HeizungS102(int i){
	this.temperatur= i;
}


public void register(IObserver ob){
	oblist.add(ob);
}
public void ntify(){
	for(IObserver x: oblist){
		x.update(temperatur);
	}
}
public int getTemp(){
	return this.temperatur;
}
public void setTemp(int i ){
	this.temperatur = i;
}
}
