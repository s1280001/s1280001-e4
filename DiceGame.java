import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
class DiceGame{
    public static void main(String[] args){
	Random rand = new Random();
	int[] data = new int[2];
	int sum = 0;
	 InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        System.out.println("What is your name?");
 
        String str = null;
        try {
	    System.out.print(">");
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        System.out.println("Hello!" + str);

 
	for(int i = 0;i<2;i++){
	int num = rand.nextInt(6)+1;
	data[i] = num;
	sum = sum + data[i];
	}
      
	System.out.println("Rolling the dice...");

	System.out.println("Die 1:" + data[0]);
	System.out.println("Die 2:" + data[1]);

	System.out.println("Total value: " + sum);
 
    }
 
}
