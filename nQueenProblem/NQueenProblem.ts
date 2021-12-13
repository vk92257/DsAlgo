const NQueenProblem = (boardSize: number) => {
  let board: string[][] = [[],[]];
  for (let i = 0; i < boardSize; i++) {
    for (let j = 0; j <= i; j++) {
       
       if(i == 0 || j == 0 )
       board[i][j] = "hello";
        board[i][j] = "hi";
        
    } 
  }



  for (let i = 0; i < boardSize; i++) {
    for (let j = 0; j <= i; j++) {
        console.log(board[i][j]);
        
    } 
  }
};

const helper = () => {};

NQueenProblem(4);
