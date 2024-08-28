package project1;

public class Aadhaar {

        private String aadharNumber;
        private String name;
        private String fatherName;
        private String address;

    public Aadhaar(String aadharNumber, String name, String fatherName, String address) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
    }

    public String getAadharNumber() {
            return aadharNumber;
        }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "aadharNumber='" + aadharNumber + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
