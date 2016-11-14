import java.util.ArrayList;
import java.util.List;

public class VotingSystem {

	private List<User> users;
	private Voting currentVoting;
	private User currentUser;

	public VotingSystem() {
		this.users = new ArrayList<User>();
		// this.currentVoting = currentVoting;
		// this.currentUser = currentUser;
	}

	public User addUser(String name, String login, String password) {
		User user = new User(name, login, password);
		users.add(user);
		return user;
	}

	private User findUser(String login, String password) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(password)) {
				return users.get(i); 
			}
		} 
		return null; //выход из цикла , если пользователь не найден
	}

	/*
	 * private void save() {
	 * 
	 * }
	 * 
	 * private void load() {
	 * 
	 * }
	 * 
	 * private List getResults() {
	 * 
	 * }
	 */

	public static void main(String[] args) {

	}
}

class Voting {
	private String title;
	private List<Candidate> candidates;

	public Voting(String title) {
		this.title = title;
		this.candidates = new ArrayList<Candidate>();
	}

	public void addCandidates(Candidate cnd) {
		candidates.add(cnd);
	}

	public String getTitle() {
		return title;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

}

class Candidate {
	private String name;
	private int voices = 0;

	public Candidate(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVoices() {
		return voices;
	}

	public void addVoice() {
		voices++;
	}
}