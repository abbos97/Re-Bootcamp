package Code.day3;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {
        /*

         */
        //               0123456789012345
        String fullName="aBbOs sHiRiNbOeV";
        System.out.println(fullName);
        String firstName=fullName.substring(0,5);
        String lastName=fullName.substring(6);

        String firstNameCorrected=firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorrected);
        String lastNameCorrected=lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);
        fullName=firstNameCorrected +" " +lastNameCorrected;
        System.out.println(fullName);
    }
}
