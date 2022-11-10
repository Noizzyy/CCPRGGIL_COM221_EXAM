public class App {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' },
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' },
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' },
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        // =============================================================
        // BANANAQUE - (10 points)
        System.out.println(" ");
        System.out.println("1. BANANAQUE ");
      

        for (int barow = 0; barow < array.length; barow++){
            System.out.println();
            for(int barcom = 0; barcom < array.length; barcom++ ){
                if( barow == 2 && barcom <=8){
                    System.out.print(array[barow][barcom] + " ");
                }
            }
        }
      

        // =============================================================
        // FRAPPUCCINO - (10 points)
        System.out.println(" ");
        System.out.println("2. FRAPPUCCINO ");
        // String frap = "";

        for( int frarow = 0; frarow < array.length; frarow++){
            System.out.println();
            for(int fracom= 0; fracom < array.length; fracom++ ){
                if( frarow == 13 && fracom <=12 && fracom >= 2){
                    System.out.print(array[frarow][fracom]);
                }
                else{
                    System.out.print("");
                }
            }
        }

        // =============================================================
        // NOVEMBER - (10 points)
        System.out.println(" ");
        System.out.println("3. NOVEMBER ");

        
        for (int novrow = 0; novrow < array.length; novrow++){
            System.out.println();
            for(int novcom = 0; novcom < array.length; novcom++ ){
                if( novcom == 9 && novrow >= 2 && novrow <= 9){
                    System.out.print(array[novrow][novcom] + " ");
                } else{
                    System.out.print(" ");
                }
            }
        }
        

        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("4. TIKTOK ");

            for (int tikrow = 0; tikrow < array.length; tikrow++) {
            System.out.println();
            for (int tikcom = 0; tikcom < array.length; tikcom++) {
                if (tikrow == 7 && tikcom == 0 || tikrow == 8 && tikcom == 1 || tikrow == 9 && tikcom == 2 || tikrow == 10 && tikcom == 3 || tikrow == 11 && tikcom == 4 || tikrow == 12 && tikcom == 5) {
                    System.out.print( array[tikrow][tikcom] + " ");
                } else {
                    System.out.print(" ");
                }
            }
        }
    

        // =============================================================
        // BARBEQUE - (10 points)
        System.out.println(" ");
        System.out.println("5. BARBEQUE ");

        for (int barrow = 0; barrow < array.length; barrow++) {
            System.out.println();
            for (int barcom = 0; barcom < array.length; barcom++) {
                if (barrow == 12 && barcom == 0 || barrow == 11 && barcom == 1 || barrow == 10 && barcom == 2 || barrow == 9 && barcom == 3 || barrow == 8 && barcom == 4 || barrow == 7 && barcom == 5 || barrow == 6 && barcom == 6 || barrow == 5 && barcom == 7) {
                    System.out.print( array[barrow][barcom] + " ");
                } else {
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // HUWEBES - (10 points)
        System.out.println(" ");
        System.out.println("6. HUWEBES ");

        for( int herow = 0; herow < array.length; herow++){
            System.out.println();
            for(int hecom= 0; hecom < array.length; hecom++ ){
                if( herow == 1 && hecom <= 10 && hecom >= 4){
                    // frap += array[frarow][fracom] + " ";
                    System.out.print(array[herow][hecom]);
                }
                else{
                    System.out.print("");
                }
            }
        }

        // =============================================================
        // SANMIGLIGHT - (10 points)
        System.out.println(" ");
        System.out.println("7. SANMIGLIGHT ");

        for (int sanrow = 0; sanrow < array.length; sanrow++) {
            System.out.println();
            for (int sancom = 0; sancom < array.length; sancom++) {
                if (sancom == array.length - 1 && sanrow >= 1 && sanrow <= 11) {
                    System.out.print(array[sanrow][sancom] + " ");
                } else {
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // FINALEXAM - (10 points)
        System.out.println(" ");
        System.out.println("8. FINALEXAM ");

        for (int firow = 0; firow < array.length; firow++) {
            System.out.println();
            for (int ficom = 0; ficom < array.length; ficom++) {
                if (firow == 0 && ficom == 14 || firow == 1 && ficom == 13 || firow == 2 && ficom == 12 || firow == 3 && ficom == 11 || firow == 4 && ficom == 10 || firow == 5 && ficom == 9 || firow == 6 && ficom == 8 || firow == 7 && ficom == 7 || firow == 8 && ficom == 6) {
                    System.out.print( array[firow][ficom] + " ");
                } else {
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // LUNES - (10 points)
        System.out.println(" ");
        System.out.println("9. LUNES ");

        for (int lurow = 0; lurow < array.length; lurow++) {
            System.out.println();
            for (int lucom = 0; lucom < array.length; lucom++) {
                if (lurow == 4 && lucom == 0 || lurow == 3 && lucom == 1 || lurow == 2 && lucom == 2 || lurow == 1 && lucom == 3 || lurow == 0 && lucom == 4 ) {
                    System.out.print( array[lurow][lucom] + " ");
                } else {
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // SIOMAI - (10 points)
        System.out.println(" ");
        System.out.println("10. SIOMAI ");

        for (int siorow = 0; siorow < array.length; siorow++) {
            System.out.println();
            for (int siocom = 0; siocom < array.length; siocom++) {
                if (siorow == 3 && siocom == 6 || siorow == 4 && siocom == 7 || siorow == 5 && siocom == 8 || siorow == 6 && siocom == 9 || siorow == 7 && siocom == 10 || siorow == 8 && siocom == 11) {
                    System.out.print(array[siorow][siocom] + " ");
                } else {
                    System.out.print(" ");
                }
            }
        }

        // =============================================================

        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("11. Elizer needs your help!");

        // Elizer loves to watch professional basketball. He is an avid fan of a certain
        // team which he follows on social media.
        // One day, he saw a post where his favorite team revealed their brand new home
        // and guest uniforms for the upcoming season.

        // The home and guest uniform are of different color.
        // All basketball teams have a home uniform which they wear if they are on their
        // home arena. On the other hand, the guest uniform is worn by teams who are
        // visiting their opponent's arena.

        // Sometimes, the color of the guest uniform of the visiting team can be the
        // same color with the uniform of the home team. If this happens, the home
        // team will put on their guest uniform so that they would be different.

        // There are n teams taking part in the regular season. Elizer asked himself how
        // many times a home team will have to wear their guest uniform?

        // The regular season consists of n * ( n - 1) games. Each team will have a home
        // game and away game.
        // The color of the uniforms are represented by integers. No two distinct colors
        // can have the same number.
        // Help Elizer find the answer to his question!

        // Requirements
        // 1. Ask for the number of n teams participating.
        // 2. Ask for a pair of numbers, the home and away colors for each
        // participating team.
        // 3. The answer should be the number of times a home team will wear their away
        // uniform.

        // =============================================================
        // Example:
        // Input:
        // 3
        // 1 2
        // 2 4
        // 3 4

        // Answer
        // 1

        // Note: In this example, the season will have a total of six games.
        // There is game where team 2 will have to wear their guest uniform if team 1
        // visits their arena.
        
        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("12. Everybody has a price!");
        
        // Create a program and find out the condition to prove the following statements below.
        // ELIZER == ZOPHIA is TRUE
        // TONI > MARC is FALSE.
        
        // Input:
        // The first line is any name in UPPERCASE which only consists of characters from A-Z;
        // The second line is any name in UPPERCASE which only consists of characters from A-Z;
        
        // Output:
        // TRUE or FALSE
    }
}
