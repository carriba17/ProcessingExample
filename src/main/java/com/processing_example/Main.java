//Carter Arribas
//CRCPIII
//Processing Heloo

//Importing processing
package com.processing_example;

import processing.core.*;


public class Main extends PApplet{

    int green = 400;
    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
        System.out.println("Hello world!");
    }

    //Setting sizes of canvas
    public void settings()
    {
        size(500,500);
    }

    //Setting size of canvas
    public void setup()
    {
        background(234);
    }

    //Drawing my canvas 
    //Decided to draw olympic rings
    public void draw()
    {
        //Drawing Ring #1
        fill(174,226,230);
        ellipse(130, 150, 75, 75);
        
        //Drawing Ring #2
        fill(255,255,0);
        ellipse(180, 175, 75, 75);

        //Drawing Ring #3
        fill(0);
        ellipse(230, 150, 75, 75);
        
        //Drawing Ring #4
        fill(0,255,0);
        ellipse(280, 175, 75, 75);

        //Drawing Ring #5
        fill(255,0,0);
        ellipse(330, 150, 75, 75);



    //    rectMode(CENTER);
    //    fill(200,green,200);
    //    rect(width/2,height/2,300,300);
    //    fill(200,green/10,200);
    //    rect(width/2,height/2,150,150);
    }

    public void mousePressed(){
        if(green == 400){
            green = 200;
        }
        else{
            green = 400;
        }
    }
}