package core.basesyntax;

public class UserService {
    public int getUserScore(String[] records, String email) {
        int score = -1;
        for (String record : records) {
            if (record.contains(email)) {
                String userScore = record.substring(record.indexOf(":"));
                score = Integer.parseInt(userScore);
            }
        }
        if (score == -1) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return score;
    }
}
