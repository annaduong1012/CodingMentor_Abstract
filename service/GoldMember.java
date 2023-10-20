package casino.service;

public class GoldMember extends MembershipService {

	public void displayMemberBenefits(String userID) {
		System.out.println("- Unlimited hot drinks");
		System.out.println("- Discounts at selected restaurants");

	}

	@Override
	public boolean hasFreeParking(String userID) {
		return true;
	}

	@Override
	public double discountRateBookingHotel(String userID) {
		return 10;
	}

}
