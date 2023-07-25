package exos.autres;

public class operateurs {
    public static void main(String[] args) {
    // region opérateurs arithméques

    int result = 1+2;
        System.out.println("1 + 2 = " +result); // 1+2 = 3
        int originalResult = result;
        result = result -1;

        System.out.println(originalResult + " -1 = " + result); //original result = 3 // 3-1 = 2
        originalResult = result; //
        result = result *2;

        System.out.println(originalResult+ "*2 = "+ result); // 2*2 = 4
        originalResult = result;
        result = result /2;
        System.out.println(originalResult + " / 2 =" + result); /// 4/2 =2

result = result+8;

    }
}
