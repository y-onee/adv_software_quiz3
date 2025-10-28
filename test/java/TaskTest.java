package test.java;
import main.java.UserDB;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.mock.MockName;
import org.mockito.Mock;

public class TaskTest {

    @Test
    public void assignToTest(String team_member) {
        UserDB userDB = new UserDB();

        String member = userDB.getUser(1);

        assert(assignTo(member));

    }
 
}
