package UTS.soal3;

public class User extends UserProfile{
    public boolean log_in(int user_id, String password) {
        //method login, digunakan untuk mengecek apakah user id dan password nya sudah sesuai
        System.out.println("Logged in with User ID : " + user_id);
        return true; //Return true jika login sukses
    }

    public void recover_password() {
        //method untuk mereset password
        System.out.println("Password recovery process initiated.");
    }

    public void log_out() {
        //method untuk logout
        System.out.println("Logged out successfully.");
    }
}