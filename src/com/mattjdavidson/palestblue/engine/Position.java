package com.mattjdavidson.palestblue.engine;

import static com.mattjdavidson.palestblue.engine.Castling.ALL_CASTLING;
import static com.mattjdavidson.palestblue.engine.Color.WHITE;
import static com.mattjdavidson.palestblue.engine.Square.NO_SQUARE;

public class Position{

  private int[][] board;
  private int turn;
  private int castling;
  private int halveMoves; // used for 50 move rule (100 halves)
  private int enPassant;

  public Position() {
    board = new int[16][8];
    turn = WHITE;
    castling = ALL_CASTLING;
    halveMoves = 0;
    enPassant = NO_SQUARE;
  }

  public void move(){
  }

  public void unmove(){
  }

  public void genMoves(){
  }

  public void inFEN(){
    //TODO
  }

  public void outFEN(){
    //TODO
  }

  public boolean inspectMate(){
    //TODO
    return false;
  }

  public boolean inspectDraw(){
    //TODO
    return false;
  }
}
