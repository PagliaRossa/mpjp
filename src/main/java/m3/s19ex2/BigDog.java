package m3.s19ex2;

public class BigDog extends Dog{
	public static final int DAILY_HOUSING_PRICE = 18;

	public BigDog(int days) {
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
