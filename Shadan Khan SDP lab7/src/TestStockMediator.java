
public class TestStockMediator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StockMediator nyse = new StockMediator();

		GoormanSlacks broker = new GoormanSlacks(nyse);

		JTPoorMan broker2 = new JTPoorMan(nyse);

		///write code to sale and get offer through mediator
		
		broker.buyOffer("stock1", 3000);
		broker2.saleOffer("stock2", 9000);

		nyse.getstockOfferings();
	}

}

