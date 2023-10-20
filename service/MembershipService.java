package casino.service;

import casino.db.Database;

public abstract class MembershipService {

	public abstract void displayMemberBenefits(String userID);

	public abstract boolean hasFreeParking(String userID);

	public abstract double discountRateBookingHotel(String userID);

	public static MembershipService getMemberService(String membershipType) {

		switch (membershipType) {
		case "Silver":
			return new SilverMember();
		case "Gold":
			return new GoldMember();
		case "Diamond":
			return new DiamondMember();
		default:
			return null;

		}

	}
}
