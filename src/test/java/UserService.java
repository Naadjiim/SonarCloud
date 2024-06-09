import org.example.User;


public class UserService {

    // Méthode pour obtenir les détails de l'utilisateur
    public User getUserDetails(String userId) {

        if (userId.equals("john")) {
            return new User("John", "Doe");
        } else {
            return null; // ou lever une exception si l'utilisateur n'est pas trouvé
        }
    }

    public String createUser (User user){

        return user.firstname + " " + user.lastname;
    }
}
