package com;

import java.util.ArrayList;
import java.util.List;

public class SquaresList {
    private final List<Square> squares;

    public SquaresList(){
        squares = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Squares "+ squares;
    }

    public boolean addSquares(Square square){
        return squares.add(square);
    }

    public void remove(int num){
        if (num< squares.size())
            squares.remove(num);
    }

    public void remove(Square square){
        squares.remove(square);
    }
}
