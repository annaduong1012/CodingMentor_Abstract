package casino.data;

public class Member {
	private String name;
	private String userID;
	private String userPass;
	private String membershipType;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String userID, String userPass, String membershipType) {
		super();
		this.name = name;
		this.userID = userID;
		this.userPass = userPass;
		this.membershipType = membershipType;
	}

	public Member(String name, String userID, String userPass) {
		super();
		this.name = name;
		this.userID = userID;
		this.userPass = userPass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

}
