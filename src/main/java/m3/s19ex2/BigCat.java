package m3.s19ex2;

public class BigCat extends Cat{
	public static final int DAILY_HOUSING_PRICE = 10;
	
	public BigCat(int days) {
		super(days);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int housing() {
//      return DAILY_HOUSING_PRICE * getDays();
//      return calculateDaily(DAILY_HOUSING_PRICE);
      return DAILY_HOUSING_PRICE * days;
  }
}
