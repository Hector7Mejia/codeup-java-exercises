package study_hall;

public class User extends Person{
   private boolean admin;



   public void setAdmin(boolean admin) {
      this.admin = admin;
   }

   public User(String firstName, String lastName, boolean admin) {
      super(firstName, lastName);
      this.admin = admin;
   }

   public boolean isAdmin() {
      return admin;
   }

   @Override
   public String toString() {
      return super.toString() + "User{" +
              "admin=" + admin +
              '}';
   }
}
