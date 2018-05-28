package trabajo1;

public class control {
	

	private  static final int pensando = 0;
	private  static final int comiendo = 1;
	private  static final int hambre = 2;
	private int n;
	private int estado[];
	
	public control(int n){
	this.n = n;
	estado = new int [ n];


	}

	public synchronized void tomarTenedores(int id){
	estado[id]= hambre;
	prueba (id);
	while (estado[id] !=comiendo)
	try{
		wait();
	}
	catch (Exception e ) {
	System.out.println(e);
	}
	}
	public synchronized void soltarTenedores(int id){
	int der, izq;
	der=(id+1) % n;
	izq=id-1;
	if(izq<0)
	izq=n-1;
	estado[id]=pensando;
	prueba(izq);
	prueba(der);
	}
	public void prueba(int id){
	int der, izq;
	der=(id+1) % n;
	izq=id-1;
	if(izq<0)
	izq=n-1;
	if(estado [id]== hambre&& estado [izq]!=comiendo
	&& estado [der]!=comiendo){
	estado[id]=comiendo;
	notifyAll();
	}}
	}




