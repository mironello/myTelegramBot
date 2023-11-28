package stateless;

public class HumanService {
    GoogleRegisterService grs= new GoogleRegisterService();
    public void validateAndRegister(Human human){
        //validation
        grs.register(human);


    }
}
