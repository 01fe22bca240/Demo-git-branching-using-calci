class ExtendedCalci extends arith_calci{
    public void square(float a,float b){
        int pow = 2;
        double res = Math.pow(a, pow);
        System.out.println("Square : "+ res);
    }

    public void cube(float a, float b){
        int pow = 3;
        double res = Math.pow(a, pow); 
        System.out.println("Cube : "+ res);
    }

    public void modulo(float a, float b){
        double res = a % b;;
        System.out.println("Remainder : "+ res);
    }

    public void areaOfTriangle(float a, float b){
        double res = 0.5 * a * b; 
        System.out.println("Area of triangle : "+ res);
    }
    

}