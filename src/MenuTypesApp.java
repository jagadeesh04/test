import java.util.ArrayList;
import java.util.List;

public class MenuTypesApp {
	
	List<String> list = new ArrayList<>();
	String menuType = "polygon";
	
	public MenuTypesApp(){
		 list.add("pdf");
		 list.add("abc");
		 list.add("pdf");
		 list.add("abc");
		
	}
	
	public void checkIt(String menuType){
		if(menuType.equalsIgnoreCase(this.menuType)){
			System.out.println("hi");
		}
		
		
	}
	

	public static void main(String[] args) {
		
		 MenuTypesApp app = new MenuTypesApp();
		 app.checkIt("polygon");
		 
		 
		
	}
	
}
