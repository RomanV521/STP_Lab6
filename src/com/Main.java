package com;

import java.util.Scanner;

/**
 * Vykhodets Roman, #1
 */
public class Main {

    private static void Start() {
        System.out.println("\nCompleted by student AT-212 \nOdessa Polytechnic University \nVykhodets Roman \n\nVariant 1 \n\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Start();

//        System.out.println("Создать класс квадрат, члены класса – длина стороны.\nПредусмотреть в классе методы вычисления и вывода сведений о фигуре – диагональ, периметр, площадь.\nСоздать производный класс – правильная квадратная призма с высотой H,\nдобавить в класс метод определения объема фигуры, перегрузить методы расчета площади и вывода сведений о фигуре.\nНаписать программу, демонстрирующую работу с этими классами:\n\tдано N квадратов и M призм, найти квадрат с максимальной площадью и призму с максимальной диагональю.\n\n");

        Square square = new Square();
        Squares squares;
        SquaresList squaresList = new SquaresList();
        RightPrism prism = new RightPrism();
        Prisms prisms;
        PrismsList prismsList = new PrismsList();

        System.out.print("Введите количество квадратов:");
        int numSquares = scan.nextInt();
        squares = new Squares(numSquares);

        System.out.print("Введите количество призм:");
        int numPrisms = scan.nextInt();
        prisms = new Prisms(numPrisms);


//        part1(square, squares, prism, prisms, numSquares, numPrisms);
        part2(square, squares, squaresList, prism, prisms, numSquares, numPrisms, prismsList);
    }

    private static void part1(Square square, Squares squares, RightPrism prism, Prisms prisms, int numSquares, int numPrisms) {
        int side;
//        System.out.println("\n\nКвадраты:");
        for (int i = 0; i < numSquares; i++) {
            side = -1;
            while (square.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0) {//-5...5
//                System.out.println(side);
            }
            square = new Square(side);
            squares.setSquareAt(i, square);
//            System.out.println(square + "\n");
        }

        int height;
//        System.out.println("\n\nПризмы:");
        for (int i = 0; i < numPrisms; i++) {
            side = -1;
            height = -1;
            while (prism.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0 || prism.CheckCorrectHeight("" + (height = (int) (Math.random() * 11 + 5))) < 0) {
//                System.out.println("\n"+side +"\n"+ height+"\n");
            }
            prism = new RightPrism(side, height);
            prisms.setPrismAt(i, prism);
//            System.out.println(prism + "\n");
        }

        System.out.println(squares +"\n\n"+ prisms);
        System.out.println("\n Квадрат с максимальной площадью: " + squares.getSquares()[squares.maxSquare()]);
        System.out.println("\n Призма с максимальной диагональю: " + prisms.getPrisms()[prisms.maxDiagonal()]);
    }

    private static void part2(Square square, Squares squares, SquaresList squaresList, RightPrism prism, Prisms prisms, int numSquares, int numPrisms, PrismsList prismsList) {
        int side;
//        System.out.println("\n\nКвадраты:");
        for (int i = 0; i < numSquares; i++) {
            side = -1;
            while (square.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0) {//-5...5
            }
            square = new Square(side);
            squaresList.addSquares(square);
        }

        int height;
//        System.out.println("\n\nПризмы:");
        for (int i = 0; i < numPrisms; i++) {
            side = -1;
            height = -1;
            while (prism.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0 || prism.CheckCorrectHeight("" + (height = (int) (Math.random() * 11 + 5))) < 0) {
            }
            prism = new RightPrism(side, height);
            prismsList.addPrisms(prism);
        }

        System.out.println(squaresList +"\n\n"+ prismsList);
        System.out.println("\n Квадрат с максимальной площадью: " + squaresList.maxSquare());
        System.out.println("\n Призма с максимальной диагональю: " + Formatter.toDouble(prismsList.maxDiagonal()));
    }
}

