package problem_set_1_b;

public class Shape{
        int height,length,base,radius;
        public Shape(int height,int length,int base,int radius)
        {
            this.height=height;
            this.length=length;
            this.base=base;
            this.radius=radius;
        }
        public double Area_of_rectangle(){
            double vol1=height*length;
            return vol1;
        }
        public double Area_of_square()
        {
            double vol2=length*length;
            return vol2;
        }
        public double Area_of_triangle()
        {
            double vol3=base*height*0.5;
            return vol3;
        }
        public double Area_of_circle()
        {
            double vol4=3.1416*(radius*radius);
            return vol4;
        }
    }
