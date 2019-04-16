
public class ToLowerID {
	public static boolean isAdmin(String userId) {
		return userId.toLowerCase() == "admin";
	}

	public static void main(String[] args) {
		System.out.println(isAdmin("Admin"));
	}
}
