package trabajo1;

public class filo2 {
	public static void main(String[] args){
		control c=new control(5);
		filo1 f[]  = new filo1[5];
		for (int cont=0;cont<5; cont++){
		f[cont]=new filo1(cont,c);
		f[cont].start();

		}

		try{

		Thread.sleep((int)(10000));
		}
		catch (Exception  ex1){
		System.out.println(ex1);
		}

		System.exit(0);
		}


}
