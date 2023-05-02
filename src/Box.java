package src;

class Box {
    double width;
    double height;
    double depth;

    public Box() {
        System.out.println("Конструирование объекта box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
//    void setDim(double w, double h, double d){
//            width = w;
//            height = h;
//            depth = d;
//        }
    }
