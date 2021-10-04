package com.sonata.q2;
import java.util.*;


public class LambdaComparatorExample {
    public static void main(String[] args) {
        Marks mark1 = new Marks("Java", 54);
        Marks mark2 = new Marks("Java", 84);
        Marks mark3 = new Marks("Java", 24);
        Marks mark4 = new Marks("Java", 94);
        
        List<Marks> listMarkss = Arrays.asList(mark1, mark2, mark3, mark4);
 
       
 
        Comparator<Marks> descPriceComp = (Marks b1, Marks b2) -> (int) (b2.getScore() - b1.getScore());
 
        Collections.sort(listMarkss, descPriceComp);
 
        System.out.println("\nAfter sorting by descending price:");
        System.out.println(listMarkss);
 
       
    }
}
 
class Marks {
	
	private String title;
    private float score;
    public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public float getScore() {
		return score;
	}



	public void setScore(float score) {
		this.score = score;
	}



	
 
    Marks(String title, float score) {
        this.title = title;
        this.score = score;
    }
 
   
 
    public String toString() {
        return this.title + "-" + this.score;
    }
}