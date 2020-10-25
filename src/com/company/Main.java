package com.company;
import java.util.Scanner;
public class Main {
	public static final Line L = new Line(1.33, 0, 0.6);
	public static final Line ZXC = new Line(1.33, -2.5, 0.6);
	public static final HorizantalParabola GH= new HorizantalParabola(-3, 2, 0.5);
	public static final HorizantalParabola P = new HorizantalParabola(-5, -6, 0.5);
	public static final HorizantalParabola QW = new HorizantalParabola(-1, 4, 0.125);

	public static SimpleColor getColor (double x, double y) {
		if (QW.isPointRightOfHorizantalParabola(x, y) && L.isPointBelowLine(x, y) && GH.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.YELLOW;
		}
		if (L.isPointBelowLine(x, y) && QW.isPointRightOfHorizantalParabola(x, y) && !GH.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.GRAY;
		}
		if (L.isPointBelowLine(x, y) && GH.isPointRightOfHorizantalParabola(x, y) && !QW.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.BLUE;
		}
		if (L.isPointBelowLine(x, y) && !QW.isPointRightOfHorizantalParabola(x, y) && !GH.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.WHITE;
		}
		if (!L.isPointBelowLine(x, y) && GH.isPointRightOfHorizantalParabola(x, y) && !QW.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.YELLOW;
		}
		if (ZXC.isPointBelowLine(x, y) && P.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.YELLOW;
		}
		if (!L.isPointBelowLine(x, y) && ZXC.isPointBelowLine(x, y) && QW.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.WHITE;
		}
		if (!ZXC.isPointBelowLine(x, y) && GH.isPointRightOfHorizantalParabola(x, y) && !P.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.ORANGE;
		}
		if (!P.isPointRightOfHorizantalParabola(x, y) && !GH.isPointRightOfHorizantalParabola(x, y) && !L.isPointBelowLine(x, y) && ZXC.isPointBelowLine(x, y)) {
			return SimpleColor.WHITE;
		}
		if (QW.isPointRightOfHorizantalParabola(x, y) && GH.isPointRightOfHorizantalParabola(x, y) && P.isPointRightOfHorizantalParabola(x, y)) {
			return SimpleColor.YELLOW;
		}
		if (!GH.isPointRightOfHorizantalParabola(x, y) && !ZXC.isPointBelowLine(x, y)) {
			return SimpleColor.WHITE;
		}
		return SimpleColor.WHITE;
	}

	public static void main(String[] args) {
		System.out.print("8; 0 = ");
		printColorForPoint(8, 0);
		System.out.print("2; 3 = ");
		printColorForPoint(2, 3);
		System.out.print("2; -1 = ");
		printColorForPoint(2, -1);
		System.out.print("0; 0 = ");
		printColorForPoint(0, 0);
		System.out.print("-4; -5 = ");
		printColorForPoint(-4, -5);
		System.out.print("3; 8 = ");
		printColorForPoint(3, 8);
        Scanner scanner = new Scanner(System.in);
        System.out.print("x=");
        double x = scanner.nextDouble();
        System.out.print("y=");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
	}

	public static void printColorForPoint(double x, double y) {
		if (getColor(x, y) == SimpleColor.WHITE) {
			System.out.println("White");
		}
		if (getColor(x, y) == SimpleColor.BLUE) {
			System.out.println("Blue");
		}
		if (getColor(x, y) == SimpleColor.GRAY) {
			System.out.println("Gray");
		}
		if (getColor(x, y) == SimpleColor.ORANGE) {
			System.out.println("Orange");
		}
		if (getColor(x, y) == SimpleColor.YELLOW) {
			System.out.println("Yellow");
		}
	}
}