import java.util.Scanner;

public class Test {

	public static boolean canWin(int leap, int[] game) {
        
		for(int i=0; i<game.length-1; i++){
			if(game[i+1]!=0 && game[i+leap]!=0){
				i=i-2;
			}
			if(i==game.length-1 || i+leap>=game.length){
				return true;
			}
		}
		
		return false;
		
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
	
}
