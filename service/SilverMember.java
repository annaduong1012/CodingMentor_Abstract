package casino.service;

public class SilverMember extends MembershipService {

	@Override
	public void displayMemberBenefits(String userID) {
		System.out.println("- Free 2 hot drinks");

	}

	@Override
	public boolean hasFreeParking(String userID) {
		return false;
	}

	@Override
	public double discountRateBookingHotel(String userID) {
		return 5;
	}

}
