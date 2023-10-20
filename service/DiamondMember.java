package casino.service;

public class DiamondMember extends MembershipService {

	public void displayMemberBenefits(String userID) {
		System.out.println("- Unlimited hot drinks & selected spirits");
		System.out.println("- Discounts at selected restaurants");
		System.out.println("- Access to VIP lounge");

	}

	@Override
	public boolean hasFreeParking(String userID) {
		return true;
	}

	@Override
	public double discountRateBookingHotel(String userID) {
		return 20;
	}

}
