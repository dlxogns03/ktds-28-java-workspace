package com.ktdsuniversity.edu.oop.inheritence.zoo;

public class Zoo {
	public static void getBird(Animal animal) {
		
		if(animal instanceof Bird bird) {
			System.out.println("======");
			bird.birdPrintDisplay();
			bird.AnimalprintDisplay();
		}
		
	}
	
	public static void getFish(Animal animal) {
		
		
		if(animal instanceof Fish fish) {
			System.out.println("========");
			fish.fishPrintDisplay();
			fish.AnimalprintDisplay();
		}
	}
	
	
	public static void main(String[] args) {
		Animal[] birds = new Animal[1];
		birds[0] = new Bird("참새", 2, "암컷", 3.5f, 12.5f, "한국 토종", "곡식", "모름", "10cm",  
						"3cm미만", "2cm미만");
		
		Animal[] fishes = new Fish[1];
		fishes[0] = new Fish("참치", 2, "수컷", 3.5f, 17.5f, "한국 토종", "육식", "대서양", "5cm",  
				"무지개빛", true);
		
		for(int i = 0 ; i < birds.length; i ++	) {
			getBird(birds[i]);
			getFish(birds[i]);
			getBird(fishes[i]);
			getFish(fishes[i]);
		}
	}
	

}
