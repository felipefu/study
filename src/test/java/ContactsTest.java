import com.study.pratices.hakerank.Contacts;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ContactsTest {

  @Test
  public void testChallenge() {

    List<List<String>> list = new ArrayList<>();

    list.add(new ArrayList<>(List.of("add", "ed")));
    list.add(new ArrayList<>(List.of("add", "eddie")));
    list.add(new ArrayList<>(List.of("add", "edward")));

    list.add(new ArrayList<>(List.of("find", "ed")));
    list.add(new ArrayList<>(List.of("find", "eddie")));
    list.add(new ArrayList<>(List.of("find", "edward")));

    list.add(new ArrayList<>(List.of("add", "edwina")));
    list.add(new ArrayList<>(List.of("find", "edw")));
    list.add(new ArrayList<>(List.of("add", "aedwina")));
    list.add(new ArrayList<>(List.of("find", "a")));

    Contacts contacts = new Contacts();

    Assert.assertEquals(new ArrayList<Integer>(List.of(3, 1, 1, 2, 1)), contacts.contacts(list));
  }

  @Test
  public void testChallenge2() {

    List<List<String>> list = new ArrayList<>();

    list.add(new ArrayList<>(List.of("add", "hack")));
    list.add(new ArrayList<>(List.of("add", "hackerrank")));

    list.add(new ArrayList<>(List.of("find", "hac")));
    list.add(new ArrayList<>(List.of("find", "hak")));

    Contacts contacts = new Contacts();

    Assert.assertEquals(new ArrayList<Integer>(List.of(2, 0)), contacts.contacts(list));
  }
}
