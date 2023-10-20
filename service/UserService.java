package casino.service;

import casino.db.Database;

public class UserService {
	public static String getMemberRank(String userID, String userPass) {
		for (int i = 0; i < Database.MEMBERS_DB.size(); i++) {
			if (userID == Database.MEMBERS_DB.get(i).getUserID()
					&& userPass == Database.MEMBERS_DB.get(i).getUserPass()) {
				System.out.println("Welcome " + Database.MEMBERS_DB.get(i).getName() + ". Your membership is: "
						+ Database.MEMBERS_DB.get(i).getMembershipType());
				return Database.MEMBERS_DB.get(i).getMembershipType();
			}

		}
		return null;
	}

}
