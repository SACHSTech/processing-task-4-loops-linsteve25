import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Description: creating patterns using for loops
   * Author: @linsteve25
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
  // set initial stroke

  stroke(0);

	// quadrant 1 

  for(int intLineVertical = 1; intLineVertical < 10; intLineVertical++) {

    fill(0);
    strokeWeight(2);
    line(intLineVertical * 20, 0, intLineVertical * 20, 200);

  }

  for (int intLineHorizontal = 1; intLineHorizontal < 10; intLineHorizontal++) {

    fill(0);
    strokeWeight(2);
    line(0, intLineHorizontal * 20, 200, intLineHorizontal * 20);

  }

  // quadrant 2

  for(int intCircleX = 1; intCircleX < 6; intCircleX++) {

    for(int intCircleY = 1; intCircleY < 6; intCircleY++) {

      fill(201, 26, 175);
      strokeWeight(1);
      ellipse(intCircleY * (200 / 6) + 200, intCircleX * (200 / 6), 20, 20);
      
    }
  }

  // quadrant 3

  for(int intHeight = 0; intHeight < 200; intHeight++) {

    for(int intWidth = 0; intWidth < 200; intWidth++) {

      int intGradient = (int)(1.19 * intWidth);

      point(intWidth, intHeight + 200); 
      stroke(intGradient);

    }
  } 
    
  // quadrant 4

  // print petals

    for(int intPetals = 0; intPetals < 8; intPetals++) {

      stroke(0);

      pushMatrix();
      translate(width * 0.75f, height * 0.75f);

      fill(194, 116, 48);

      rotate(intPetals * (PI / 4));
      translate((float) (width / 12), 0);
      ellipse(0, 0, (float) (width / 6), (float) (height / 22));

      popMatrix();
    
    }

    // print circular middle 

    fill(80, 115, 46);
    ellipse(width * 0.75f, height * 0.75f, 25, 25);
  
  }
}
  

