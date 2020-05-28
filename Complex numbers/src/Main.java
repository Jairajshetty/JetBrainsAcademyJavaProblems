class Complex {

    double real;
    double image;


    // write methods here
    public void add(Complex number){
        this.real+=number.real;
        this.image+=number.image;
    }
    public void subtract(Complex number){
        this.image-=number.image;
        this.real-=number.real;
    }
}