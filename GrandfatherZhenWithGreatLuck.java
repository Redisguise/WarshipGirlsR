/**Version 1.0
2017.9.13
*/

import java.util.Scanner;
import java.util.Random;

public class GrandfatherZhenWithGreatLuck {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enput the total money:");
		double Money = input.nextDouble();
		int totalMoney = (int)Money * 100;//total money that can be devided(unit: cent)
		System.out.print("Enput the number of Bonus:");
		int numberOfBonus = input.nextInt();//number of bonus that need to set money
		
		if(totalMoney < numberOfBonus * 1){//if not all bonus could get money
			System.out.println("The total money is not enough.");
			System.exit(1);
		}
		
		Random rand = new Random();
		int i = 1;
		int Luckiest = 0;//the luckiest number
		int Lmoney = 0;//luckiest's money
		while(numberOfBonus != 1){
			int money = rand.nextInt(totalMoney - (numberOfBonus - 1)) + 1;//set money and ensure that the left money is enough
			System.out.println("Bonus" + i + ", Money = " + money/100.0 + "yuan");
			if(money > Lmoney){
				Luckiest = i;
				Lmoney = money;
			}
			i++;
			totalMoney -= money;
			numberOfBonus--;
		}
		System.out.println("Bonus" + i + ", Money = " + totalMoney/100.0 + "yuan");
		if(totalMoney > Lmoney)
			Luckiest = i;
		System.out.println("NO." + Luckiest + " is the luckiest!");
	}
}