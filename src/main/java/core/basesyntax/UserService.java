package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String[] users = record.split(":");
            if (users.length == 2 && users[0].equals(email)) {
                return Integer.parseInt(users[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
