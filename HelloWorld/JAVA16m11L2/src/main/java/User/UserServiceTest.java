package User;

import java.util.Optional;

public class UserServiceTest {
    public static void main(String[] args) {
        UserService us = new UserService();

        User ivan = us.search("Ivan");
        Optional<User> ivan1 = us.searchFunctionalStyle("Ivan");

        User ivan2 = us.search("Ivan2");
        Optional<User> ivan02 = us.searchFunctionalStyle("Ivan2");

        if(ivan2!=null){
            //send to the doctor
        }{
            //request Ivan data from file
        }

        ivan02.ifPresentOrElse((u)->{/*send to the doxtor*/}, ()->{/*request data from file*/});
    }
}
