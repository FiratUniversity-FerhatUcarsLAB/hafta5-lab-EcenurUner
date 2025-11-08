/*
 * Ad Soyad: [Ecenur Üner]
 * Ogrenci No: [250541078]
 * Tarih: [8.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;
  public class GeometriHesap {
      //Kare Alanı
      public static double calculateSquareArea(double side) {
          return side * side;
      }

      //Kare Çevresi
      public static double calculateSquarePerimeter(double side) {
          return 4 * side;
      }

        //Dikdörtgen Alanı
      public static double calculateRectangleArea(double width, double height) {
          return width * height;
      }

         //Dikdörtgen Çevresi
      public static double calculateRectanglePerimeter(double width, double height){
          return 2 * (width + height);
      }

        //Daire Alanı
      public static double calculateCircleArea(double radius){
          return Math.PI * radius * radius;
      }

       //Daire Çevresi
      public static double calculateCircleCircumference(double radius) {
          return 2 * Math.PI * radius ;
      }

      //Üçgen Alanı
      public static double calculateTriangleArea(double base, double height){
          return (base * height) / 2;
      }

      //Üçgen Çevresi
      public static double calculateTrianglePerimeter(double a, double b, double c){
          return a + b + c;
      }

      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.println("===GEOMETRİK HESAPLAYICI===");
          System.out.println();

          //Kare Bilgileri
          System.out.println("\nKARE:");
          System.out.print("Kenar uzunluğu (cm): ");
          double squareSide = input.nextDouble();

          //Dikdörtgen Bilgileri
          System.out.println("\nDİKDÖRTGEN:");
          System.out.print("Kısa kenar (cm): ");
          double rectWidth = input.nextDouble();
          System.out.print("Uzun Kenar (cm): ");
          double rectHeight = input.nextDouble();

          //Daire Bilgileri
          System.out.println("\nDAİRE:");
          System.out.print("Yarıçap (cm): ");
          double radius = input.nextDouble();

          //Üçgen Bilgileri
          System.out.println("\nÜÇGEN:");
          System.out.print("Taban (cm): ");
          double base = input.nextDouble();
          System.out.print("Yükseklik: ");
          double height = input.nextDouble();
          System.out.print("1.kenar: ");
          double side1 = input.nextDouble();
          System.out.print("2.kenar: ");
          double side2 = input.nextDouble();
          System.out.print("3.kenar: ");
          double side3 = input.nextDouble();

          //Hesaplamaları Yap
          double squareArea = calculateSquareArea(squareSide);
          double squarePerimeter = calculateSquarePerimeter(squareSide);
          double rectArea = calculateRectangleArea(rectWidth, rectHeight);
          double rectPerimeter = calculateRectanglePerimeter(rectWidth, rectHeight);
          double circleArea = calculateCircleArea(radius);
          double circleCircumference = calculateCircleCircumference(radius);
          double triangleArea = calculateTriangleArea(base, height);
          double trianglePerimeter = calculateTrianglePerimeter(side1, side2, side3);

          //Sonuçları Yazdır
          System.out.println("\n=== SONUÇLAR ===");
          System.out.printf("Kare -> Alan: %.2f cm², Cevre: %.2f cm%n", squareArea, squarePerimeter);
          System.out.printf("Dikdortgen -> Alan: %.2f cm², Cevre: %.2f cm%n", rectArea, rectPerimeter);
          System.out.printf("Daire -> Alan: %.2f cm², Cevre: %.2f cm%n", circleArea, circleCircumference);
          System.out.printf("Ucgen -> Alan: %.2f cm², Cevre: %.2f cm%n", triangleArea, trianglePerimeter);

        input.close();
      
      }
}
