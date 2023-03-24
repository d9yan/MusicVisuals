package C21385263;

import ie.tudublin.Visual;

public class yanVisual extends Visual
{
    public void setup() {
        size(800, 800);
        background(255); // set background color to white
      }
      
    public void draw() {
        // draw camera body
        stroke(0); // set stroke color to black
        strokeWeight(2); // set stroke weight to 2 pixels
        noFill(); // disable fill color
        rectMode(CENTER);
        rect(width/2, height/2, 120, 80, 10);
        
        // draw lens
        stroke(100); // set stroke color to gray
        strokeWeight(1); // set stroke weight to 1 pixel
        fill(150); // set fill color to light gray
        ellipse(width/2, height/2, 60, 60);
        
        // draw viewfinder
        stroke(0); // set stroke color to black
        strokeWeight(1); // set stroke weight to 1 pixel
        fill(255); // set fill color to white
        rect(width/2, height/2-10, 40, 20, 5);
        
        // draw flash
        stroke(255, 200, 0); // set stroke color to yellow
        strokeWeight(2); // set stroke weight to 2 pixels
        line(width/2, height/2-40, width/2, height/2-80);
      }
      
}

