import java.util.List;

public class VotingSystem {

	private List users;
	private Voting currentVoting;
	private User currentUser;

	private User addUser(String name, String login, String password, String repeation) {

	}

	private User findUser(String login, String password) {

	}

	private void save() {

	}

	private void load() {

	}

	private List saveResults() {

	}

	public static void main(String[] args) {

	}
}

class Voting {
	private String title;
	private List candidats;

	public Voting(String title, List candidats) {
		this.title = title;
		this.candidats = candidats;
	}

}

class Candidate {
	private String name;
	private int voices = 0;

	public Candidate(String name) {
		super();
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

	public void setVoices(int voices) {
		this.voices = voices;
	}

}