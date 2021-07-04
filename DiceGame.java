import java.util.Random;
class DiceGame{
    public static void main(String[] args){
	Random rand = new Random();
	int[] data = new int[2];
	int sum = 0;

 
	for(int i = 0;i<2;i++){
	int num = rand.nextInt(6)+1;
	data[i] = num;
	sum = sum + data[i];
	}
      
	System.out.println("Rolling the dice...");

	System.out.println("Die 1:" + data[0]);
	System.out.println("Die 2:" + data[1]);

	System.out.println("Total value: " + sum);

	if(sum > 7) System.out.println("You won");
	else System.out.println("You lost");
 
    }
 
}
