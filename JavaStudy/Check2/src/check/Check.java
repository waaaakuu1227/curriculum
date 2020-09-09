package check;

import constants.Constants;

public class Check {



    private static void printName (String  Fn , String Ln) {

        System.out.println("printNameメソッド → " + (Fn + Ln) );

    }



    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        String  firstName, lastName;

        firstName = "waku";
        lastName = "yuudai";
        printName(firstName,lastName);

        Pet pet = new Pet (Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);

        pet.introduce();

        RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);

        robotpet.introduce();


    }

}
