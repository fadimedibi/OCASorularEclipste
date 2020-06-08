package certifica1_50;

public class q12 {

	// dosya adiyla ayni class da main method olmadigindan consola basmiyor
	
}

interface Exportable{
	void export();			// interface de method lar default olarak public abstract tir.
}

class Tool implements Exportable{
 public  void export() {				//line n1  // metodlar inheretance da child class tarafindan daraltilamaz genisletilebilir.
		System.out.println("Tool::export");
	}
}

class ReportTool extends Tool implements Exportable{
	public void export() {					// line n2
		System.out.println("RTool::export");
	}
	
	public static void callExport (Exportable ex) {
		ex.export();
	}
	public static void main(String[] args) {
		Tool aTool=new ReportTool();
		Tool bTool=new Tool();
		callExport(aTool);
		callExport(bTool);
	}
}