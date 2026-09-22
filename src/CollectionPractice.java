import oldpackage.practiceLambda.User;

import java.util.ArrayList;
import java.util.List;

/**
list.add("A");
list.get(0);
list.set(0, "B");
list.remove(0);
list.size();
list.isEmpty();
list.contains("A");
list.indexOf("A");
list.clear();
list.forEach(System.out::println);
list.sort(Comparator.naturalOrder());
 **/
public class CollectionPractice {
    public static void main(String[] args) {

        User user = new User(10, "blabla");

        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "a"));
        userList.add(new User(2, "b"));
        userList.add(new User(3, "c"));
        userList.add(new User(4, "d"));
        userList.add(new User(5, "f"));
        userList.add(new User(6, "g"));
        userList.add(new User(7, "h"));
        userList.add(new User(8, "aj"));
        userList.add(new User(9, "ak"));
        userList.add(new User(10, "al"));
        userList.add(new User(11, "az"));
        userList.add(user);

        System.out.println(userList.indexOf(user));
        userList.set(1 , new User(2, "bbb"));
        for (var users : userList) {
            System.out.println(users);
        }
        userList.remove(1);
        for (var users : userList) {
            System.out.println(users);
        }
        System.out.println(userList.contains(new User(6,"g")));
        for (var users : userList) {
            System.out.println(users);
        }
        System.out.println("===================");
        userList.get(3);
        System.out.println(userList);
        System.out.println("===================");
        userList.remove(0);
        for (var users : userList) {
            System.out.println(users);
        }
        System.out.println("==================");
        System.out.println(userList.size());

        System.out.println("==================");
        if (userList.isEmpty()) {
            System.out.println("true");
        }
        System.out.println("false");

    }
}
