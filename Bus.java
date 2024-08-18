public class Bus {
private int busno;
private boolean ac;
private int capacity;
Bus(int no,boolean ac,int cap){
	this.busno=no;
	this.ac =ac;
	this.capacity=cap;
}

public int getBusNo() {
	return busno;
}
public boolean isAc() {
	return ac;
}
public int getcapacity() {
	return capacity;
}
public void setAc(boolean val) {
	ac =val; 
}
public void setcapacity(int cap) {
	capacity = cap; 
}
public void displayBusinfo(){
	System.out.println("Bus No"+busno +"Ac:"+ac+ " Total Capacity:"+capacity);
}
}
