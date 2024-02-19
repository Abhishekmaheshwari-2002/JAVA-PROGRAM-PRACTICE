package com.example;

//class complex_number {
//    int real, image;
//
//    public complex_number(int i, int j) {
//        this.real = i;
//        this.image = j;
//    }
//
//    public void show() {
//        System.out.println("complex number : "+this.real + "+" + this.image+"i");
//    }
//
//    public complex_number add_complex(complex_number re, complex_number ima) {
//        complex_number res = new complex_number(0, 0);
//        res.real = re.real + ima.real;
//        res.image = re.image + ima.image;
//        return res;
//    }
//}
public class JAVA_05_add_complex_number {
    //    variable to use for creating complex number
    int real, image;

    //    Constructor which will be used while creating complex  number
    public JAVA_05_add_complex_number(int i, int j) {
        this.real = i;
        this.image = j;
    }

    //    using addition for complex number using class method it takes object as a parameter
    public static JAVA_05_add_complex_number add_complex(JAVA_05_add_complex_number re, JAVA_05_add_complex_number ima) {
//         creating blank complex number to store result
        JAVA_05_add_complex_number res = new JAVA_05_add_complex_number(0, 0);
        res.real = re.real + ima.real;//add real path of both complex number
        res.image = re.image + ima.image;//add image path of both complex number
        return res;
    }

    public static void main(String[] args) {
        JAVA_05_add_complex_number c1 = new JAVA_05_add_complex_number(8, 6);
        JAVA_05_add_complex_number c2 = new JAVA_05_add_complex_number(1, 4);
        System.out.println("First complex number ");
        c1.show();
        System.out.println("second complex number ");
        c2.show();
        System.out.println("Addition complex");
        //result contains add_complex method
        JAVA_05_add_complex_number result = add_complex(c1, c2);
        result.show();

    }

    //    print the complex number
    public void show() {
        System.out.println("complex number : " + this.real + "+" + this.image + "i");
    }
}
