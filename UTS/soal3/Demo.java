package UTS.soal3;

public class Demo {
    public static void main(String[] args) {
        // Create a Customer and Admin instance
        Customer customer = new Customer();
        customer.edit_profile(1, "titan123", "Titania", 19, "titania@example.com", "jpg");
        customer.log_in(1, "titan123");

        //Test with valid file extension
        customer.apply_verification("image.jpg");

        //Test with invalid file extension
        customer.apply_verification("document.txt");

        customer.log_out();

        //Create Admin and perform admin tasks
        Admin admin = new Admin();
        admin.add_vehicle();
        admin.update_vehicle_details(101);
        admin.verify_user(1);
        admin.retrieve_complains();
    }
}