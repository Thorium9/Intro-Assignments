//Purpose of Project: Generate a number, it's square and a random number in between
//Title: Squared
//Author: DJ Palmer
//Date: December 10th, 2017


import java.util.Random;
public class Squared{
  public static void main(String[] args){
  int sqrdNum = 0;
  Random rand = new Random();
  //  int off = 1;
  int normNum = 1;
  int randomNum = rand.nextInt(1); //(int) Math.random() * 10 + 1;
  //int i = 1;
  System.out.println("Number" + "\t" + "Number^2" + "\t" + "Random Number between");

    for (int i = 1; i <=10; i++){
      sqrdNum = i * i; //This squares the i value
      normNum = i; //This is the base I value that will be between 1-10
      randomNum = rand.nextInt((sqrdNum - normNum) + 1) + normNum;//Generates a random number
    //  off = 1;
    //  System.out.println("Is this working?");
      System.out.println(normNum + "\t" + sqrdNum + "\t" + "\t" +randomNum);
    }
  }
}
