class Doctor {
    void consultationFee(){ System.out.println("General Doctor Fee: ₹300"); }
}

class Dentist extends Doctor {
    void consultationFee(){ System.out.println("Dentist Fee: ₹500"); }
}
class Cardiologist extends Doctor {
    void consultationFee(){ System.out.println("Cardiologist Fee: ₹800"); }
}
class Surgeon extends Doctor {
    void consultationFee(){ System.out.println("Surgeon Fee: ₹1000"); }
}

public class doctor {
    public static void main(String[] args) {
        new Doctor().consultationFee();
        new Dentist().consultationFee();
        new Cardiologist().consultationFee();
        new Surgeon().consultationFee();
    }
}
