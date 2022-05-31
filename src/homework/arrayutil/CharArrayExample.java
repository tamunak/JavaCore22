package homework.arrayutil;

public class CharArrayExample {

    public static void main(String[] args) {

// 1
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        char c = 'o';

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Count = " + count);

// 2
        int middleIndex = chars.length / 2;
        System.out.print(chars[middleIndex-1]);
        System.out.println(chars[middleIndex]);

// 3
        char[] chars3 = {'j','a','v','a','l','o','l','y'};
        char x = chars3[chars3.length - 2];
        char y = chars3[chars3.length - 1];

        if(x == 'l' && y == 'y'){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

// 4
        char[] bobArray = {'b','a','b','o','l','a'};
        boolean bobResult = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i+2]=='b'){
                bobResult=true;
                break;
            }
        }
        System.out.println("bobResult = " + bobResult);

// 5
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (char c1 : text) {
            if (c1 != ' '){
                System.out.print(c1);
            }
        }
    }
}
