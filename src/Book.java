
public class Book { 
	private String name;
	private double price;
	private int qtyInStock;
	Author autor1 = new Author("Emir", "emir_hatuni@chotmail.com", 'M');
	
Book(String name, double price,int qtyInStock){
	this.name=name;
	this.price=price;
	this.qtyInStock=qtyInStock;
}

public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}

public void getAuthor() {
     autor1.toString();
}
public double getprice() {
	return price;
}
public void setprice(double price) {
	this.price=price;
}
public int getqtyInStock() {
	return qtyInStock;
}
public void setqtyInStock(int qtyInStock) {
	this.qtyInStock=qtyInStock;
}
public void tostring() {
	System.out.println("Ime knjige je : " + name);
	autor1.tostring();
	System.out.println("Cijena knjige je :" + price + "$");
	System.out.println("U stocku se nalazi jos : " + qtyInStock + " primjeraka");
}

}
