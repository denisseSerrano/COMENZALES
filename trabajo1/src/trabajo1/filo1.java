package trabajo1;


	public class filo1 extends Thread {
		private int id;
		private control control;
		private int nComidas;

		public filo1(int id,control  c){
		this.id=id;
		control = c;
		nComidas = 0;



		}

		public void pensando(){

		System.out.println("filo1"+id+"pensando");
		try {
		Thread.sleep((int)Math.random()*400);
		}
		catch (Exception  e){
		System.out.println(e);}
		}



		public void comer(){
		nComidas++;
		System.out.println("filo1 "+id+" comiendo -> Numero comidas:"+nComidas);
		try{
		Thread.sleep((int)(Math.random()*500));

		}
		catch(Exception  e){
		System.out.println(e);}
		}
		public void run(){
		do{

		pensando();
		control.tomarTenedores(id);
		comer();
		control.soltarTenedores(id);
		}
		while(true);
		}
		}


