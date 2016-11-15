import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {

	private List<User> users;
	private Voting currentVoting;
	private User currentUser;

	public VotingSystem() {
		this.users = new ArrayList<User>();
		this.currentVoting = currentVoting;
		this.currentUser = currentUser;
	}

	public void addUser(String name, String login, String password) {
		User user = new User(name, login, password);
		if(user instanceof Elector){
			Elector e = (Elector) user;
			users.add(e);
		}
	}

	private User findUser(String login, String password) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(password)) {
				if(currentUser instanceof Elector){
					currentUser = (Elector) users.get(i);
				return currentUser;
				}
			}
		}
		return null; // выход из цикла , если пользователь не найден
	}

	/*
	 * private void save() {
	 * 
	 * }
	 * 
	 * private void load() {
	 * 
	 * }
	 */
	private List<Candidate> getResults() {
		List<Candidate> candidatesList = currentVoting.getCandidates();
		if (currentUser instanceof Elector) {
			if (((Elector) currentUser).isVoted() == true) {
				return candidatesList;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Voting votig = new Voting("Гoлосование за меры города");

		votig.addCandidates(new Candidate("Павлик Виктор "));
		votig.addCandidates(new Candidate("Зибров Павел"));
		votig.addCandidates(new Candidate("Писанка Руслана"));
		votig.addCandidates(new Candidate("Кличко Владимир"));
		votig.addCandidates(new Candidate("Карпа Ірена"));
		Collections.sort(votig.getCandidates());

		
		System.out.println("Введите имя: ");
		String userRegistrationName = scanner.nextLine();
		System.out.println("Введите логин: ");
		String userRegistrationLogin = scanner.nextLine();
		System.out.println("Введите пароль: ");
		String userRegistrationPassword = scanner.nextLine();

		VotingSystem votingSystem = new VotingSystem();
		votingSystem.addUser(userRegistrationName, userRegistrationLogin, userRegistrationPassword); //добавил в список нового пользователя
		
		System.out.println("Введите логин, чтобы войти в систему: ");
		String userLogin = scanner.nextLine();
		System.out.println("Введите пароль, чтобы войти в систему: ");
		String userPassword = scanner.nextLine();
		
		
		
	//	System.out.println("Неверный логин или пароль, введите еще раз: ");

		
		System.out.println("Список кандидатов: ");
		for(Candidate a: votig.getCandidates()) {
			System.out.println(a.getName());
		}

		System.out.println("Введите имя кандидата: ");
		String candidateName = scanner.nextLine();

		Elector currentUser = (Elector) votingSystem.findUser(userLogin, userPassword);
		
		currentUser.setVoting(votig);
		currentUser.vote(candidateName); 
		
		System.out.println("Результат голосования: ");

		votingSystem.getResults();
		
		 Collections.sort(votig.getCandidates(), new Candidate(candidateName));
	      System.out.println(" ");
	      
	      for(Candidate a: votig.getCandidates())  { // printing the sorted list of ages
	         System.out.print(a.getName() +"  : "+ a.getVoices() + ", ");
	      }
	      
	      scanner.close();
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

class Candidate implements Comparable<Candidate>, Comparator<Candidate> {
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

	@Override
	public int compareTo(Candidate c) { // сортировка по имени
		return (this.name).compareTo(c.name);
	}

	@Override
	public int compare(Candidate c1, Candidate c2) { // сортировка по голосам
		return c1.voices - c2.voices;
	}
}