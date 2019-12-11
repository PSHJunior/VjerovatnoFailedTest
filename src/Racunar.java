
public class Racunar {
     private int ram;
     private int kapacitetHD;
     private double brzinaProcesora;
     private int dijagonalaMonitora;
     private double nabavnaCijena;
     
Racunar(int ram,int kapacitetHD,double brzinaProcesora, 
		int dijagonalaMonitora,double nabavnaCijena){
	this.ram=ram;
	this.brzinaProcesora=brzinaProcesora;
	this.dijagonalaMonitora=dijagonalaMonitora;
	this.nabavnaCijena=nabavnaCijena;
     
}
public double cijenaRacunara(double nabavnaCijena) {
	double cijena= ((nabavnaCijena*10)/100)+ nabavnaCijena;
	return cijena;
}

}
