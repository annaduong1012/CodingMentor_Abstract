package casino.db;

import java.util.ArrayList;

import casino.data.Member;

public class Database {
	public static ArrayList<Member> MEMBERS_DB = new ArrayList<>();

	public static void initDB() {
		MEMBERS_DB.add(new Member("Anna", "boba", "1234", "Gold"));
		MEMBERS_DB.add(new Member("Alpha", "AP", "2345", "Silver"));
		MEMBERS_DB.add(new Member("Delta", "DE", "5678", "Diamond"));
	}
}
