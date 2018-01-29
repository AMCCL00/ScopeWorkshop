package com.company;

public class Main {

    private String memberVariable = "I am a member Variable, I have class level scope. ";
    private int memberInt = 10;
    private int count = 0;

    public static void main(String[] args) {

        Main main = new Main();
        main.aMethod();
        main.anotherMethod();
        main.methodForLoopVariables();
    }
    private void aMethod() {
        String localVariable = "I am a local variable, I can only be used in this method. ";

        System.out.print("Inside first method: \n");

        System.out.print(memberVariable + "\n");
        System.out.println(localVariable);
    }
    private void anotherMethod() {
        System.out.println("Inside second method: ");
        System.out.println(memberVariable);
    }

    private void methodForLoopVariables() {

        String localVariable = " Just another member variable outside our do while loop. ";

        System.out.println(localVariable);

        boolean runDoLoop = true;
        String loopVariable = "I am a loop variable inside our do while loop";
        do {
            System.out.println(localVariable);
            runDoLoop = false;
        }while(runDoLoop);

        System.out.println("Inside third method, just outside do while loop: ");
        System.out.println(localVariable);
        System.out.println(loopVariable);
    }
    private void memberVsLocalVariable{
        int LocalInt = 7;

        LocalInt *= 2;
        memberInt *= 2;
    }

    private void getMemberVsLocalVariables (boolean runDoLoop, String name){
        int localInt = 10;
        System.out.println(runDoLoop);
        System.out.println(name);
        System.out.println(localInt);
    }

}
