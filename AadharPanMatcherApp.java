package project1;

import java.util.Scanner;

public class AadharPanMatcherApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AadharService aadharService = new AadharService();
        PanService panService = new PanService();
        System.out.println("Enter the Aadhar Number : ");
        String aadharNumber = sc.nextLine();

        Aadhaar aadhaar = aadharService.getAadharByNumber(aadharNumber);
        Pan pan = panService.getPanByAadharNumber(aadharNumber);
        if (aadhaar!=null && pan != null) {
            System.out.println("Aadhar Details = " + aadhaar);
            System.out.println("Pan Details =" + pan);
        }
        else {
            System.out.println("No Match Found....");
        }
    }
}
