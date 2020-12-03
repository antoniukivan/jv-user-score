package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public static int getUserScore(String[] records, String email) {
        for (String record : records) {
            if (record.contains(email) && !email.contains(":")) {
                String userScore = record.substring(record.indexOf(":") + 1);
                return Integer.parseInt(userScore);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
