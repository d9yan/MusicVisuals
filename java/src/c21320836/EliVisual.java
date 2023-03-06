package c21320836;

import example.*;

import ie.tudublin.*;

public class EliVisual extends Visual {

    WaveForm wf;
    AudioBandsVisual abv;

    public void settings() {
        size(1024, 500);

        // Use this to make fullscreen
        // fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        // fullScreen(P3D, SPAN);
    }

    public void setup() {
        startMinim();
        noStroke(); // Remove stroke from circle
        smooth(); // Enable anti-aliasing

        // Call loadAudio to load an audio file to process
        loadAudio("01.Ditto.mp3");

        // Call this instead to read audio from the microphone
        // startListening();
        // wf = new WaveForm(this);
        // abv = new AudioBandsVisual(this);

    }

    public void keyPressed() {
        if (key == ' ') {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw() 
    {
        background(0);
        int diameter = 150; // Set diameter of circle
        int radius = diameter / 2; // Calculate radius of circle
        int centerX = width / 2; // Calculate X coordinate of center of circle
        int centerY = height / 2; // Calculate Y coordinate of center of circle
        
        // Define the color palette
        color[] palette = {

        color(0, 0, 0), // Black
        color(255, 255, 255), // White
        color(255, 0, 0), // Red
        color(255, 255, 0), // Yellow
        color(0, 255, 0), // Green
        color(0, 255, 255), // Cyan
        color(0, 0, 255), // Blue
        color(255, 0, 255) // Magenta
        };
        
        // Draw the circle using the color palette
        for (int y = 0; y < diameter; y++) 
        {
            for (int x = 0; x < diameter; x++) {
            int distance = int(dist(x, y, radius, radius)); // Calculate distance from center
            int index = int(map(distance, 0, radius, 0, palette.length-1)); // Map distance to color index
            fill(palette[index]); // Set fill color based on distance
            rect(centerX - radius + x, centerY - radius + y, 1, 1); // Draw pixel at (x, y)
        }
        // try
        // {
        // // Call this if you want to use FFT data
        // calculateFFT();
        // }
        // catch(VisualException e)
        // {
        // e.printStackTrace();
        // }
        // // Call this is you want to use frequency bands
        // calculateFrequencyBands();

        // // Call this is you want to get the average amplitude
        // calculateAverageAmplitude();

    }
}