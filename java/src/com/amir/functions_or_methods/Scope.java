package com.amir.functions_or_methods;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String name = "amir";
        //System.out.println(marks);//wrong scope
        //System.out.println(num);//wrong scope

        System.out.println(a);//correct scope
        System.out.println(b);//correct scope

        //Scoping in Block=====
        {
            //int a = 7; //already initialised outside the block in the same method , hence you can not initialised again
            a =100; //But you can change the value or we say Reassign the original ref variable to some other value
            System.out.println(a);
            name = "afjal";

            int c = 99; //value initialised in this block , will remain in the block.
        }
        System.out.println(a);
        System.out.println(name);//not created or initialised original new name so it will execute updated.
       // System.out.println(c); Here created and initialised so not working // wrong because we can't use outside of block , it should be remain in the block to be executable.

        //Scoping in for loops=======
        for (int i =0;i <=4; i++){
            System.out.println(i);
            int num = 90;
            a =3; //we can not initialised the var already created but we can update it in the for loop scope.
            System.out.println(a);
            //int a =9;wrong scope
        }
       // System.out.println(i); wrong scope-> outside the for loop not accessible.




    }
    static void random(int marks){
        int num = 68;
        System.out.println(num);//correct scope
        System.out.println(marks);//correct scope

        //System.out.println(a);//wrong scopping
        //System.out.println(b);//wrong scope
    }
}
