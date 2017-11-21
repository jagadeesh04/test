public class App {

	public static String middleThree(String str) {
		if(str.length()<=3 )
			return str;
		if(str.length()>0 && str.length()%2==1){
			int i=str.length()/2;
			return str.substring(i-1, i+2);
		}
		
		else
			return null;
	}

	
}
