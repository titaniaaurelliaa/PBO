package UTS.soal3;

public class Customer extends User{
    private boolean verification_status = false;

    public boolean get_verification_status() {
        return verification_status;
    }

    //validasi dokumen sebelum verifikasi
    public void apply_verification(String doc) {
        if (isValidExtension(doc)) {
            this.verification_status = true;
            System.out.println("Verification applied with document : " + doc);
        } else {
            System.out.println("Invalid file extension. Only .jpg, .png, .pdf are allowed.");
        }
    }

    //cek apakah ekstensi file valid
    private boolean isValidExtension(String doc) {
        String[] validExtensions = { ".jpg", ".png", ".pdf" };
        for (String ext : validExtensions) {
            if (doc.toLowerCase().endsWith(ext)) {
                return true;
            }
        }
        return false;
    }
}