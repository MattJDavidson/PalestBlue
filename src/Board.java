public class Board{

  private int[][] board;

  /**
  *
  */
  public Board() {
  }

  public void move(){
  }

  public void unmove(){
  }

  public void genMoves(){
  }

  public void inFEN(){
  }

  public void outFEN(){
  }

  public boolean inspectMate(){
    return true;
  }

  public boolean inspectDraw(){
    return true;
  }

  /**
   * @return the board
   */
  public int[][] getBoard() {
    return board;
  }

  /**
   * @param board the board to set
   */
  public void setBoard(int[][] board) {
    this.board = board;
  }

}
