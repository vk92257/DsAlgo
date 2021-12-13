var NQueenProblem = function (boardSize) {
    var board = [[], []];
    for (var i = 0; i < boardSize; i++) {
        for (var j = 0; j <= i; j++) {
            if (i == 0 || j == 0)
                board[i][j] = "hello";
            board[i][j] = "hi";
        }
    }
    for (var i = 0; i < boardSize; i++) {
        for (var j = 0; j <= i; j++) {
            console.log(board[i][j]);
        }
    }
};
var helper = function () { };
NQueenProblem(4);
