import java.util.*;
class Profit_Loss
{
 public static void main(String args[])
 {
	int profit, loss, buying_price,sell_price;
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the buying price:");
	buying_price = sc.nextInt();
	System.out.println(" enter the sell_price:");
	sell_price = sc.nextInt();
	if(buying_price > sell_price)
	{
	
	loss = buying_price - sell_price;
	System.out.println(" loss is "+loss);
	}
	else
	{
	profit = sell_price - buying_price;
	System.out.println(" profit is "+profit);
	}

 }
}
