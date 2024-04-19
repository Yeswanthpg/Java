class except{
    public static void main(String[] args){
        System.out.println("Program start");
        try{
            System.out.println(0/1);
        }
        catch(Exception exception){
            System.out.println(exception.());
        }
        System.out.println("Program end");
    }
}