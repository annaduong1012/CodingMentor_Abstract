package casino;

import casino.data.Member;
import casino.db.Database;
import casino.service.DiamondMember;
import casino.service.GoldMember;
import casino.service.MembershipService;
import casino.service.SilverMember;
import casino.service.UserService;

public class Main {

	public static void main(String[] args) {
		Database.initDB();

		String loginUserName = "Delta";
		String loginuserID = "DE";
		String loginPass = "5678";

		Member currentUser = new Member(loginUserName, loginuserID, loginPass);
		String currentUserMemberType = UserService.getMemberRank(loginuserID, loginPass);

		MembershipService memberRank = MembershipService.getMemberService(currentUserMemberType);

		// Benefits
		System.out.println("Below are your member benefits:");
		memberRank.displayMemberBenefits(loginuserID);

		// Free parking or not
		if (memberRank.hasFreeParking(loginuserID)) {
			System.out.println("You are entitled to FreeParking");
		} else {
			System.out.println("Flat rate parking is A$50");
		}

		// Discount at hotels
		System.out.println(
				"You can book our accommodation at " + memberRank.discountRateBookingHotel(loginuserID) + "% discount");

	}
}
