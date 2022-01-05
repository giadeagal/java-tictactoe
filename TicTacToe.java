import javax.swing.text.Position;

public class TicTacToe {

/*    
        _ | _ | _
        _ | _ | _
        _ | _ | _

        indexes:
        [0][0], [0][2], [0][4]
        [1][0], [1][2], [1][4]
        [2][0], [2][2], [2][4]

        players:
        user = 1
        computer = 2
*/

public static void main(String[] args) {
    
    char[][] gameBoard = {
        {'_', '|', '_', '|', '_'},
        {'_', '|', '_', '|', '_'},
        {' ', '|', ' ', '|', ' '}
    };

    printBoard(gameBoard);
    updateBoard(1, 2, gameBoard );

}

public static void printBoard(char[][] gameBoard) {

    for(char[] row : gameBoard) {
        
        for(char c : row) {
            System.out.print(c);
        }
        System.out.println();
    }
}

public static void updateBoard(int position, int player, char[][] gameBoard) {

    char character;

    if (player == 1) {
        character = 'X';
    } else {
        character= 'O';
    }

    switch (position) {
        
        case 1: 
            gameBoard[0][0] = character;
            printBoard(gameBoard);
            break;

        case 2:
            gameBoard[0][2] = character;
            printBoard(gameBoard);
            break;

        case 3:
            gameBoard[0][4] = character;
            printBoard(gameBoard);
            break;

        case 4:
            gameBoard[1][0] = character;
            printBoard(gameBoard);
            break;

        case 5:
            gameBoard[1][2] = character;
            printBoard(gameBoard);
            break;

        case 6:
            gameBoard[1][4] = character;
            printBoard(gameBoard);
            break;

        case 7:
            gameBoard[2][0] = character;
            printBoard(gameBoard);
            break;

        case 8:
            gameBoard[2][2] = character;
            printBoard(gameBoard);
            break;

        case 9:
            gameBoard[2][4] = character;
            printBoard(gameBoard);
            break;
                        
        default: 
            break;
    }

}
}