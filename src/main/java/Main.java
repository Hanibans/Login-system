import controllers.UserController;
import entities.User;
import factories.UserFactory;
import io.javalin.rendering.template.JavalinThymeleaf;
import services.UserService;
import io.javalin.Javalin;
import io.javalin.http.Context;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            UserController.setRoutes(config);
            config.staticFiles.add("/public");
            config.fileRenderer(new JavalinThymeleaf());
        }).start(7070);
    }










        /*private static void login(Context ctx) {
            String username = ctx.formParam("username");
            String password = ctx.formParam("password");

            ctx.result("Username: " + username + ", Password: " + password);
        }

void main() {
    try {
        User u = new User("Hanibans", "8642");
        System.out.println("Oprettet bruger: " + u.getUsername());


        List<User> users = UserFactory.createUsers();
        System.out.println("Antal brugere fra factory: " + users.size());


        UserService userService = new UserService();


        User found = userService.getUser("Hanibans");
        System.out.println("Fundet bruger: " + found.getUsername());


        User loggedIn = userService.login("Hanibans", "Kode8642");
        System.out.println("Login korrekt: " + loggedIn);


        User failedLogin = userService.login("Hanibans", "Kode3211");
        System.out.println("Login forkert password: " + failedLogin);


        User newUser = userService.createUser("dumle", "Kode1123");
        System.out.println("Ny bruger oprettet: " + newUser);

        User dupUsername = userService.createUser("pablo", "Kode4321");
        System.out.println("Duplikat brugernavn: " + dupUsername);
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        throw new RuntimeException(e);
    }

}

 */
}
