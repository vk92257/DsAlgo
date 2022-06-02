var Queen = function (boardSize) {
    var board = [
        ["0", "0", "0", "0"],
        ["0", "0", "0", "0"],
        ["0", "0", "0", "0"],
        ["0", "0", "0", "0"],
    ];
    var newBoard = [
        ["0", "0", "0", "0"],
        ["0", "0", "0", "0"],
        ["0", "0", "0", "0"],
        ["0", "0", "0", "0"],
    ];
    for (var i = 0; i < 4; i++) {
        QueenHelper(board, newBoard, i);
        console.log("loop iteration " + i);
    }
};
//  saving the queen  state
var saveBoard = function (board, newBoard) { };
var QueenHelper = function (board, newBoard, positon) {
    // base condtion
    if (positon <= board.length) {
        console.log("this is the board that i made " + board);
        // saveBoard(board, newBoard);
        return;
    }
    // loop threw the whole row
    for (var j = 0; j < 4; j++) {
        // check for isSafeToPlace queen using a  methodu
        if (isSafeToPlace(board, positon, j)) {
            board[positon][j] = "Q";
            QueenHelper(board, newBoard, positon + 1);
            board[positon][j] = "0";
        }
        console.log("its safe to place the qeen  ".concat(positon));
    }
    // if safe pace than palce the queen  and save the list
};
//  helper method for checking is the queen is safe to palce
var isSafeToPlace = function (board, row, col) {
    // horizontal check
    for (var h = 0; h < board.length; h++) {
        if (board[row][h] == "Q") {
            return false;
        }
    }
    // vertical check
    for (var v = 0; v < board.length; v++) {
        if (board[v][col] == "Q") {
            return false;
        }
    }
    // top left
    var tempRow = row;
    for (var tempCol = col; tempCol >= 0 && tempRow >= 0; tempCol--) {
        if (board[tempRow][tempCol] == "Q") {
            return false;
        }
        tempRow--;
    }
    //  top right
    tempRow = row;
    for (var tempCol = col; tempCol < board.length && tempRow >= 0; tempCol++) {
        if (board[tempRow][tempCol] == "Q") {
            return false;
        }
        tempRow--;
    }
    // bottom left
    tempRow = row;
    for (var tempCol = col; tempCol >= 0 && tempRow < board.length; tempCol--) {
        if (board[tempRow][tempCol] == "Q") {
            return false;
        }
        tempRow++;
    }
    //  bottom right
    tempRow = row;
    for (var tempCol = col; tempCol < board.length && tempRow < board.length; tempCol++) {
        if (board[tempRow][tempCol] == "Q") {
            return false;
        }
        tempRow++;
    }
};
//  calling the function 
Queen(4);
