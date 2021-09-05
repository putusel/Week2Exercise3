package fi.syksy2021.Week2Exercise3.domain;

public class Friend {
	
	private long id;

	private String friend;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", friend=" + friend + "]";
	}

}
