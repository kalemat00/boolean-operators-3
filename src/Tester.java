public class Tester {
    public static void main(String[] args) {
        System.out.println(  !( !( !(false ^ false) || (true && true) ) )  );    //true
        int x =3, y = 2;
        System.out.println(!((x * y) <= 6) && (x - y != 1));   //false
    }
}
