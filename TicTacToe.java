public class TicTacToe {

/*    
        _ | _ | _
        _ | _ | _
        _ | _ | _

        indici:
        
        [0][0], [0][2], [0][4]
        [1][0], [1][2], [1][4]
        [2][0], [2][2], [2][4]
*/

public static void main(String[] args) {
    
    char[][] gameBoard = {
        {'_', '|', '_', '|', '_'},
        {'_', '|', '_', '|', '_'},
        {' ', '|', ' ', '|', ' '}
    };

    printBoard(gameBoard);
}

public static void printBoard(char[][] gameBoard) {

    for(char[] row : gameBoard) {
        
        for(char c : row) {
            System.out.print(c);
        }
        System.out.println();
    }
}
}