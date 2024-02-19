public class HelpIsa {

    public static void main(String[] args) {
        //short numberSmall = 65536; // 2 byte
        int numberALittleBitBig = -43;
        long numberBig = -34;

        // 0000 0000 BITE = 256 = 2 ^ 8 = 0, 1, 2, 3 , 4... 255
        // 0 elevado 0 = 0
        // 0 elevado 1 = 1
        // [] = 0 | 1 -> 2 ^ 1 = 2 IS HERE
        // [][] = 00, 01, 10, 11 = 2 ^ 2 = 4
        // [][][] = 000, 001, 010, 011, 100, 101, 110, 111 = 2 ^ 3 = 8  = 2*2*2
        // [][][][][][] = 2*6 = 2 * 2 * 2 * 2 * 2 * 2 = 64
        // 7 = 0000 0111
        // 11 10 9  8    7  6  5  4   3  2  1  0 == POSITION
        //[0][1][1][0]  [0][1][0][0] [0][1][0][1]
        // 0 + 1024 + 512 + 64 + 4 + 1
        // [0] = 0 ^ n = 0
        // [1] = 2 ^ n = x != 0
        // [1][1][1][1]  [1][1][1][1] [1][1][1][1] 2 ^ 12 = 4096
        // 8 + 8 + 8 + 8
        //  7  6  5  4   3  2  1  0 <--
        // [1][1][1][1] [1][0][0][1] = 7
        // [0] = positive
        // [1] = negative
        byte biteX = 7;
        // 11111001 = -7
        // 00000111 = 7
        System.out.println(Integer.toBinaryString(biteX));


        byte nbyte = -128;
        byte sbyte = 127;

        short numberSmall = 0;

        short infLimit = -32768;
        short superiorLimit = 32767;

        int intLimit = -2147483648;
        int supLimit = 2147483647;

        long infLimitLong = -9223372036854775808L;
        long superLimitLong = 9223372036854775807L;

        long other = 2147483648L;
    }
}