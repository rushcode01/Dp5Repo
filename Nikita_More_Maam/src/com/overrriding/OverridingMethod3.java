//
//// rule 3 for return type 
////void - void
////primitive-primitive
//
//package com.overrriding;
//
//class Shapes {
//	public float draw() {
//		System.out.println("Shape");
//		return 0;
//	}
//}
//
//class Circle extends ShapeInfo {
//	public float draw() {
//		System.out.println("Circle");
//		return 0;
//	}
//}
//
//public class OverridingMethod3 {
//	public static void main(String[] args) {
//		ShapeInfo s1 = new ShapeInfo();
//		s1.draw();
//
//		Circle c1 = new Circle();
//		c1.draw();
//
//		ShapeInfo sc = new Circle();
//		sc.draw();
//	}
//}
