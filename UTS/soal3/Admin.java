package UTS.soal3;

public class Admin extends User{
    public void update_vehicle_details(int vehicle_id) {
        //membuat constructor kendaraan
        System.out.println("Vehicle details updated for Vehicle ID : " + vehicle_id);
    }

    public void add_vehicle() {
        //method untuk menambah kendaraan
        System.out.println("New vehicle added.");
    }

    public void retrieve_complains() {
        //method untuk menerima complain
        System.out.println("Complaints retrieved.");
    }

    public void verify_user(int user_id) {
        //method untuk verifikasi user
        System.out.println("User with ID " + user_id + " verified.");
    }
}