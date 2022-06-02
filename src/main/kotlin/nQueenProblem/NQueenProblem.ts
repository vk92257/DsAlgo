const Queen = (boardSize: number) => {
  let board: string[][] = [
    ["0", "0", "0", "0"],
    ["0", "0", "0", "0"],
    ["0", "0", "0", "0"],
    ["0", "0", "0", "0"],
  ];

  let newBoard: string[][] = [
    ["0", "0", "0", "0"],
    ["0", "0", "0", "0"],
    ["0", "0", "0", "0"],
    ["0", "0", "0", "0"],
  ];

  for (let i: number = 0; i < 4; i++) {
    QueenHelper(board, newBoard, i);
    console.log("loop iteration "+i);
    
  }
};


//  saving the queen  state
const saveBoard = (board: string[][], newBoard: string[][]) => {};


const QueenHelper = (
  board: string[][],
  newBoard: string[][],
  positon: number
) => {
  // base condtion
  if (positon <= board.length) {

    console.log("this is the board that i made "+board);
    
    // saveBoard(board, newBoard);
    return;
  }
  // loop threw the whole row

  for (let j = 0; j < 4; j++) {

  // check for isSafeToPlace queen using a  methodu
    if (isSafeToPlace(board, positon, j)) {

      
      board[positon][j] = "Q";
      QueenHelper(board, newBoard, positon + 1);
      board[positon][j] = "0";
    }

    console.log(`its safe to place the qeen  ${positon}`);
  }

  // if safe pace than palce the queen  and save the list
};

//  helper method for checking is the queen is safe to palce
const isSafeToPlace = (board: string[][], row: number, col: number) => {

  // horizontal check
  for (let h = 0; h < board.length; h++) {
    if (board[row][h] == "Q") {
      return false;
    }
  }


  // vertical check
 for (let v = 0; v < board.length; v++) {
    if (board[v][col] == "Q") {
      return false;
    }
  }

  // top left
  let tempRow = row;
  for (let tempCol = col; tempCol >= 0 && tempRow >= 0; tempCol--) {
    if (board[tempRow][tempCol] == "Q") {
      return false;
    }
    tempRow--;
  }

  //  top right
  tempRow = row;
  for (let tempCol = col; tempCol < board.length && tempRow >= 0; tempCol++) {
    if (board[tempRow][tempCol] == "Q") {
      return false;
    }
    tempRow--;
  }
 
  // bottom left
  tempRow = row;
  for (
    let tempCol = col;
    tempCol >= 0 && tempRow < board.length;
    tempCol--
  ) {
    if (board[tempRow][tempCol] == "Q") {
      return false;
    }
    tempRow++;
  }
 
  //  bottom right
  tempRow  = row
  for (let tempCol = col; tempCol < board.length  && tempRow < board.length; tempCol++) {
    if (board[tempRow][tempCol] == "Q") {
      return false;
    }
    tempRow++;
  }
};
//  calling the function 

Queen(4);
